package com.taskflow.api.controller;

import com.taskflow.api.model.Mercadoria;
import com.taskflow.api.repository.MercadoriaRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/mercadorias")
@CrossOrigin("*")
public class MercadoriaController {

    @Autowired
    private MercadoriaRepository repository;

    @GetMapping
    public List<Mercadoria> listar() {

        return repository.findAll();

    }

    @PostMapping
    public Mercadoria cadastrar(
            @RequestBody Mercadoria mercadoria
    ) {

        return repository.save(mercadoria);

    }

    @DeleteMapping("/{id}")
    public void excluir(
            @PathVariable Long id
    ) {

        repository.deleteById(id);

    }

}