package com.taskflow.api.repository;

import com.taskflow.api.model.Funcionario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FuncionarioRepository
        extends JpaRepository<Funcionario, Long> {
}