package com.example;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

public class Menu {
    
    public int exibeMenuPrinciapal() {
        List<Integer> opcao = new ArrayList<>();
        for (int i = 1; i < 4; i++) {
            opcao.add(i);
        }
        Object[] optionsArray = opcao.toArray();
        int opcaoSelecionad = JOptionPane.showOptionDialog(null,
        " 1. Cadastrar Usuário\n 2. Fazer Loguin \n 3. Sair\n",
        "Seja Bem Vindo, Ao Nosso Bibliotecário !",
        JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE, null,
        optionsArray, null);
        System.out.println(opcaoSelecionad);
                return opcaoSelecionad;
    }
}
