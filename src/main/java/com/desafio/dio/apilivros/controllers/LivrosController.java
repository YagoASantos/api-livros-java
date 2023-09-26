package com.desafio.dio.apilivros.controllers;

import com.desafio.dio.apilivros.entities.LivroEntity;
import com.desafio.dio.apilivros.exceptions.LivroNaoEncontradoException;
import com.desafio.dio.apilivros.services.LivroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/livros")
public class LivrosController {
    @Autowired
    LivroService livroService;
    @PostMapping
    public void saveLivro(@RequestBody LivroEntity livro) {
        livroService.save(livro);
    }
    @PutMapping
    public void updateLivro(LivroEntity livro) {

    }
    @GetMapping
    public List<LivroEntity> getLivros() {
        return livroService.findAll();
    }
    @GetMapping("/{id}")
    public LivroEntity getLivro(@PathVariable Integer id) {
        try {
            return livroService.findById(id);
        } catch(LivroNaoEncontradoException ex) {
            return null;
        }

    }
    @DeleteMapping("/{id}")
    public void deleteLivro(@PathVariable("id") Integer id) {
        livroService.deleteById(id);
    }
}
