package com.example;

public class Endereco {
    
    private String rua;
    private String bairro;
    private int cep;
    private int numeroDaCasa;
    
    public Endereco(String rua, String bairro, int cep, int numeroDaCasa) {
        this.rua = rua;
        this.bairro = bairro;
        this.cep = cep;
        this.numeroDaCasa = numeroDaCasa;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public int getCep() {
        return cep;
    }

    public void setCep(int cep) {
        this.cep = cep;
    }

    public int getNumeroDaCasa() {
        return numeroDaCasa;
    }

    public void setNumeroDaCasa(int numeroDaCasa) {
        this.numeroDaCasa = numeroDaCasa;
    }
    
    

    
}
