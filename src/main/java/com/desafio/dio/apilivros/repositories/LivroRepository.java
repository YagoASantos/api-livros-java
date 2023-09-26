package com.desafio.dio.apilivros.repositories;

import com.desafio.dio.apilivros.entities.LivroEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LivroRepository extends JpaRepository<LivroEntity, Integer> {
}
