package com.example;

import java.util.ArrayList;
import java.util.List;

public class Teste {    
    public static void main( String[] args ){
        
        List<Livro> livros = new ArrayList<>();
        Usuario usuario = new Usuario("samuel", null, null, null, null);
        
        Livro livro = new Livro(0, "Amor para Amar", "Samuel", "romance", null, 2);
        livros.add(livro);

        Emprestimo emprestimo = new Emprestimo(null, livro, usuario);
        System.out.println(livros.size());
        usuario.fazerEmprestimo(emprestimo);

        System.out.println(usuario.getemprestimo().getLivro().getTitulo());
        
        usuario.getemprestimo().getLivro().removerLivro(livros);
        System.out.println(livros.size());
    }
}
