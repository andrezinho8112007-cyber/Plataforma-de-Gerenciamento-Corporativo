package com.taskflow.api.model;

public class Colaborador extends Usuario {

    @Override
    public String gerarRelatorio() {

        return "Relatório de produtividade individual";

    }

}