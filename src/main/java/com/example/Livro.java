package com.example;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;

public class Livro {
    
    private int cod;
    private String titulo; 
    private String autor;
    private String areDeConhecimento;
    private Date dataDePubicacao;
    private int quantidadeDeCopias;
    
    public Livro(int cod, String titulo, String autor, String areDeConhecimento, Date dataDePubicacao,
        int quantidadeDeCopias) {
        this.cod = cod;
        this.titulo = titulo;
        this.autor = autor;
        this.areDeConhecimento = areDeConhecimento;
        this.dataDePubicacao = dataDePubicacao;
        this.quantidadeDeCopias = quantidadeDeCopias;
    }

    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getAreDeConhecimento() {
        return areDeConhecimento;
    }

    public void setAreDeConhecimento(String areDeConhecimento) {
        this.areDeConhecimento = areDeConhecimento;
    }

    public Date getDataDePubicacao() {
        return dataDePubicacao;
    }

    public void setDataDePubicacao(Date dataDePubicacao) {
        this.dataDePubicacao = dataDePubicacao;
    }

    public int getQuantidadeDeCopias() {
        return quantidadeDeCopias;
    }
    
    public void setQuantidadeDeCopias(int quantidadeDeCopias) {
        this.quantidadeDeCopias = quantidadeDeCopias;
    }

    public void  cadastrarlivros(int cod, String titulo, String autor,String areDeConhecimento,Date dataDePubicacao,int quantidadeDeCopias,List<Livro> livros){
        for(int i = 0;i<livros.size();i++){
            if(livros.get(i).getCod()==cod){
                JOptionPane.showMessageDialog(null, "Esse livro já foi cadastrado no sistema !");                
            }
            else{
                Livro livro = new Livro(cod, titulo, autor, areDeConhecimento, dataDePubicacao, quantidadeDeCopias);
                livros.add(livro); 
            }
        }
    }
    public void alterarLivro(int cod, String titulo, String autor,String areDeConhecimento,Date dataDePubicacao,int quantidadeDeCopias, List<Livro> livros){
        for (int i = 0; i<livros.size();i++){
            if(livros.get(i).getCod()==cod){
                livros.remove(i);
                cadastrarlivros(cod, titulo, autor, areDeConhecimento, dataDePubicacao, cod, livros);                               
            }
            else{
                JOptionPane.showMessageDialog(null, "Não existe esse livro no nosso sistema !"); 
            }
        }
    }    

    public void removerLivro(List<Livro>livros){
        for (int i = 0; i<livros.size();i++){
            if(livros.get(i).getCod()==cod){
                livros.remove(i);                               
            }
            else{
                JOptionPane.showMessageDialog(null, "Não existe esse livro no nosso sistema !"); 
            }
        }
    }
}
