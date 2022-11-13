package com.example;
import java.util.Date;

public class Usuario {
    
    private String nome;
    private String email; 
    private Date dataDeNacimento; 
    private Endereco endereco;
    private Emprestimo emprestimo;

    public Usuario(String nome, String email, Date dataDeNacimento, Endereco endereco, Emprestimo quantidadeDeEmprestimo) {
        this.nome = nome;
        this.email = email;
        this.dataDeNacimento = dataDeNacimento;
        this.endereco = endereco;
        this.emprestimo = quantidadeDeEmprestimo;
    }

    public void pegar(Emprestimo emprestimo){
        this.emprestimo = emprestimo;
    }

    public void devolver(){
     this.emprestimo = null;   
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

    public Emprestimo getemprestimo() {
        return emprestimo;
    }

    public void setemprestimo(Emprestimo emprestimo) {
        this.emprestimo = emprestimo;
    }


}
