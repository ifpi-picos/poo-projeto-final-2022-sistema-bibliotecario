package com.example;

import java.util.Date;

public class UsuarioAdm  extends Usuario{
    private String cargo;

    public UsuarioAdm(String nome, String email, Date dataDeNacimento, Endereco endereco, int quantidadeDeEmprestimo) {
        super(nome, email, dataDeNacimento, endereco, quantidadeDeEmprestimo);
    }
    
    
}
