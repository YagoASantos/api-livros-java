package com.desafio.dio.apilivros.services;

import com.desafio.dio.apilivros.entities.LivroEntity;
import com.desafio.dio.apilivros.exceptions.LivroNaoEncontradoException;
import com.desafio.dio.apilivros.repositories.LivroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LivroService {
    @Autowired
    private LivroRepository livroRepository;
    public void save(LivroEntity livro) {
        livroRepository.save(livro);
    }
    public List<LivroEntity> findAll() {
        return livroRepository.findAll();
    }
    public LivroEntity findById(Integer id) throws LivroNaoEncontradoException{
        Optional<LivroEntity> result = livroRepository.findById(id);
        if(result.isPresent()) {
            return result.get();
        }
        throw new LivroNaoEncontradoException(id);
    }
    public void deleteById(Integer id) {
        livroRepository.deleteById(id);
    }
}
