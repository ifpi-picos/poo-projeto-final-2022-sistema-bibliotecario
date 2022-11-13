package com.example;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

public class Teste {    
    public static void main( String[] args ){
        List<Usuario>usuarios = new ArrayList<>();
        Usuario usuario1 = new Usuario("samuel", null, null, null, null);
        Usuario usuario2 = new Usuario("sofia", null, null, null, null);
        usuarios.add(usuario2);
        usuarios.add(usuario1);
        String nomes= ""; 
        for(int i = 0 ;i<usuarios.size();i++){
            nomes =usuarios.get(i).getNome()+" ,"+nomes;
        }
        JOptionPane.showMessageDialog(null, nomes, "Usuários Cadastrados", 1);
    }
}
