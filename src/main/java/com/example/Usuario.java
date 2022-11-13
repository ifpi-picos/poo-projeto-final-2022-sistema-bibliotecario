package com.example;
import java.util.Date;
import javax.swing.JOptionPane;

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

    public void fazerEmprestimo(Emprestimo emprestimo){
        if(this.emprestimo == null){
            if(emprestimo.getLivro().getQuantidadeDeCopias()!=0){
                this.emprestimo = emprestimo;
                JOptionPane.showConfirmDialog(null, "Emprestimo confirmado !", "Solicitação de Emprestimo", 2);
            }
            else{
                JOptionPane.showConfirmDialog(null, "Infelizmente não temos mais copias desse livro !", "Solicitação de Emprestimo", 0);    
            }    
        }
        else{
            JOptionPane.showConfirmDialog(null, "Você já possui um emprestimo ativo !", "Solicitação de Emprestimo", 0);
        }
    }

}
