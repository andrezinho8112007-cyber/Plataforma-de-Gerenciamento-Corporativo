package com.taskflow.api.model;

public class Admin extends Usuario {

    @Override
    public String gerarRelatorio() {

        return "Relatório estratégico completo da empresa: " + getEmpresa();

    }

}