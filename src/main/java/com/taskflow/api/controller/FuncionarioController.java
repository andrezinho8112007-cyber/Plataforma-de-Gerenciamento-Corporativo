package com.taskflow.api.controller;

import com.taskflow.api.model.Funcionario;
import com.taskflow.api.repository.FuncionarioRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/funcionarios")
@CrossOrigin("*")
public class FuncionarioController {

    @Autowired
    private FuncionarioRepository repository;

    @GetMapping
    public List<Funcionario> listar() {

        return repository.findAll();

    }

    @PostMapping
    public Funcionario cadastrar(
            @RequestBody Funcionario funcionario
    ) {

        return repository.save(funcionario);

    }

    @DeleteMapping("/{id}")
    public void excluir(
            @PathVariable Long id
    ) {

        repository.deleteById(id);

    }

}