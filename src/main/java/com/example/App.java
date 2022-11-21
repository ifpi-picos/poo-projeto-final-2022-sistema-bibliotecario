package com.example;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;


public class App {
    
private static Usuario getUsuario() throws ParseException{
    String nome = JOptionPane.showInputDialog("Digite seu nome: ");
    String retorno = JOptionPane.showInputDialog(null, "Data de Nascimento: ","Data",JOptionPane.OK_OPTION);
	Date data = new SimpleDateFormat("dd/MM/yyyy").parse(retorno);
    String email = JOptionPane.showInputDialog("Digite seu email: ");
    String rua = JOptionPane.showInputDialog("Digite o nome da sua rua: ");
    String bairro    = JOptionPane.showInputDialog("Digite o nome do Bairro: ");
    int numCasa  = Integer.parseInt(JOptionPane.showInputDialog("Digite o numero da sua casa: "));
    int cep  = Integer.parseInt(JOptionPane.showInputDialog("Digite o cep da sua casa: "));

    Endereco endereco = new Endereco(rua, bairro,cep, numCasa);
    Usuario usuario1 = new Usuario(nome, email,data,endereco,null);
    return usuario1;

    }
    public static void main( String[] args ){
        Conexao c = new Conexao();
        c.inicioConexao();

    }
}   