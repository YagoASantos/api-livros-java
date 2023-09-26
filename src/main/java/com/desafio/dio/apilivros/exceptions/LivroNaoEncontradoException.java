package com.desafio.dio.apilivros.exceptions;

public class LivroNaoEncontradoException extends Exception {
    public LivroNaoEncontradoException (Integer idLivro) {
        super("O livro de id " + idLivro + " não foi encontrado.");
    }
}
