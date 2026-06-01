package com.taskflow.api.controller;

import com.taskflow.api.model.Usuario;
import com.taskflow.api.repository.UsuarioRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/usuarios")
@CrossOrigin("*")
public class UsuarioController {

    @Autowired
    private UsuarioRepository repository;

    // ==========================
    // CADASTRO
    // ==========================

    @PostMapping("/cadastro")
    public String cadastrar(
            @RequestBody Usuario usuario
    ) {

        Usuario usuarioExistente =
                repository.findByEmail(
                        usuario.getEmail()
                );

        if (usuarioExistente != null) {

            return "Usuário já cadastrado";

        }

        repository.save(usuario);

        return "Usuário cadastrado com sucesso";
    }

    // ==========================
    // LOGIN
    // ==========================

    @PostMapping("/login")
    public Object login(
            @RequestBody Usuario usuario
    ) {

        Usuario usuarioExistente =
                repository.findByEmail(
                        usuario.getEmail()
                );

        if (usuarioExistente == null) {

            return "Usuário não encontrado";

        }

        if (!usuarioExistente.getSenha()
                .equals(usuario.getSenha())) {

            return "Senha incorreta";

        }

        return usuarioExistente;
    }
}