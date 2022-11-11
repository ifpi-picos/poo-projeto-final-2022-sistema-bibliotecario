package com.example;
import java.util.Date;

public class Usuario {
    
    private String nome;
    private String email; 
    private Date dataDeNacimento; 
    private Endereco endereco;
    private int quantidadeDeEmprestimo;

    public Usuario(String nome, String email, Date dataDeNacimento, Endereco endereco, int quantidadeDeEmprestimo) {
        this.nome = nome;
        this.email = email;
        this.dataDeNacimento = dataDeNacimento;
        this.endereco = endereco;
        this.quantidadeDeEmprestimo = quantidadeDeEmprestimo;
    }

    //public pegar(String livro){
    //}

    public void devolver(){

    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getDataDeNacimento() {
        return dataDeNacimento;
    }

    public void setDataDeNacimento(Date dataDeNacimento) {
        this.dataDeNacimento = dataDeNacimento;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public int getQuantidadeDeEmprestimo() {
        return quantidadeDeEmprestimo;
    }

    public void setQuantidadeDeEmprestimo(int quantidadeDeEmprestimo) {
        this.quantidadeDeEmprestimo = quantidadeDeEmprestimo;
    }

}
