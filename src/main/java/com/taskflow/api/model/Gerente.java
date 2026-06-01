package com.taskflow.api.model;

public class Gerente extends Usuario {

    public String aprovarProjeto() {

        return "Projeto aprovado pelo gerente";

    }

    @Override
    public String gerarRelatorio() {

        return "Relatório Gerencial";

    }

}