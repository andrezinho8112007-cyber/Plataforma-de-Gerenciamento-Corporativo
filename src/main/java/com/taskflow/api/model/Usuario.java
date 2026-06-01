package com.taskflow.api.model;

import jakarta.persistence.*;

@Entity
@Table(name = "usuarios")
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String empresa;

    private String email;

    private String senha;

    public Usuario() {

    }

    public Long getId() {

        return id;

    }

    public void setId(Long id) {

        this.id = id;

    }

    public String getEmpresa() {

        return empresa;

    }

    public void setEmpresa(String empresa) {

        this.empresa = empresa;

    }

    public String getEmail() {

        return email;

    }

    public void setEmail(String email) {

        this.email = email;

    }

    public String getSenha() {

        return senha;

    }

    public void setSenha(String senha) {

        this.senha = senha;

    }

    // POLIMORFISMO
    public String gerarRelatorio() {

        return "Relatório geral da empresa: " + empresa;

    }

}