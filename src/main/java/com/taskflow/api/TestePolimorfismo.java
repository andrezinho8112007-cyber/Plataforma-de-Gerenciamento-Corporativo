package com.taskflow.api;

import com.taskflow.api.model.Usuario;
import com.taskflow.api.model.Gerente;
import com.taskflow.api.model.Colaborador;

public class TestePolimorfismo {

    public static void main(String[] args) {

        Usuario gerente =
            new Gerente();

        Usuario colaborador =
            new Colaborador();

        System.out.println(
            gerente.gerarRelatorio()
        );

        System.out.println(
            colaborador.gerarRelatorio()
        );

    }

}