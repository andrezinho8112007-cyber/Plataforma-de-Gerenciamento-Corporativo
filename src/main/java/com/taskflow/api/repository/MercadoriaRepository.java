package com.taskflow.api.repository;

import com.taskflow.api.model.Mercadoria;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MercadoriaRepository
        extends JpaRepository<Mercadoria, Long> {
}