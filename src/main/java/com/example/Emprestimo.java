package com.example;

import java.util.Date;

public class Emprestimo {
    private Date dataDeemprestimo;
    private Livro livro;
    private Usuario usuario;


    public Emprestimo(Date dataDeemprestimo, Livro livro, Usuario usuario) {
        this.dataDeemprestimo = dataDeemprestimo;
        this.livro = livro;
        this.usuario = usuario;
    }

    public Date getDataDeemprestimo() {
        return dataDeemprestimo;
    }

    public Livro getLivro() {
        return livro;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    

}
