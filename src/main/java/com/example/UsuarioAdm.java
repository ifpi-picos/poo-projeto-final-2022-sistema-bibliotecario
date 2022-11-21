package com.example;

import java.util.Date;
import java.util.List;

import javax.swing.JOptionPane;

public class UsuarioAdm  extends Usuario{
    
    
    public UsuarioAdm(String nome, String email, Date dataDeNacimento, Endereco endereco, Emprestimo quantidadeDeEmprestimo) {
        super(nome, email, dataDeNacimento, endereco, quantidadeDeEmprestimo);
    }

    public void  cadastrarUsuario(String nome, String email, Date dataDeNacimento, Endereco endereco, Emprestimo quantidadeDeEmprestimo, List<Usuario>usuarios){
        for(int i = 0; i<usuarios.size();i++){
            if(usuarios.get(i).getNome()==nome){
                JOptionPane.showMessageDialog(null, "Esse usuário já foi cadastrado no sistema !");
            }
            else{
                Usuario usuario = new Usuario(nome, email, dataDeNacimento, endereco, quantidadeDeEmprestimo);
                usuarios.add(usuario);
                JOptionPane.showMessageDialog(null, "Sue usuário foi cadastrado com sucesso !");
            }
        }
    }
    public void  alterarUsuario(String nome, String email, Date dataDeNacimento, Endereco endereco, Emprestimo quantidadeDeEmprestimo, List<Usuario>usuarios){
        for(int i = 0; i<usuarios.size();i++){
            if(usuarios.get(i).getNome()==nome){
                usuarios.remove(i);
                cadastrarUsuario(nome, email, dataDeNacimento, endereco, quantidadeDeEmprestimo, usuarios);
            }
            else{
                JOptionPane.showMessageDialog(null, "Esse usuário não existe !");
            }
        }
    }

    public void  removerUsuario(String nome, String email, Date dataDeNacimento, Endereco endereco, int quantidadeDeEmprestimo, List<Usuario>usuarios){
        for(int i = 0; i<usuarios.size();i++){
            if(usuarios.get(i).getNome()==nome){
                usuarios.remove(i);
            }
            else{
                JOptionPane.showMessageDialog(null, "Esse usuário não existe !");
            }
        }
    }

    public void  listarUsuario(List<Usuario>usuarios){
        String nomes= ""; 
        for(int i = 0 ;i<usuarios.size();i++){
            nomes =usuarios.get(i).getNome()+", "+nomes;    
        }
        JOptionPane.showMessageDialog(null, nomes, "Usuários Cadastrados", 1);
    }
}
