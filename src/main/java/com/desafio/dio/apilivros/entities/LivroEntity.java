package com.desafio.dio.apilivros.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.util.Date;

@Entity
public class LivroEntity {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Integer id;

    private String nome;

    private Date dataLancamento;

    private Integer quantPaginas;

    public LivroEntity(Integer id, String nome, Date dataLancamento, Integer quantPaginas) {
        this.id = id;
        this.nome = nome;
        this.dataLancamento = dataLancamento;
        this.quantPaginas = quantPaginas;
    }
    public LivroEntity() {
    }

    public Integer getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public Date getDataLancamento() {
        return dataLancamento;
    }

    public Integer getQuantPaginas() {
        return quantPaginas;
    }
}
