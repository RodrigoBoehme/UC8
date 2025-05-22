/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.arraycompras;

/**
 *
 * @author RodrigoBoehme
 */
public class Produto {
    private String Nome;
    private double preco;
    protected String tipo;

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Produto(String Nome, double preco) {
        this.Nome = Nome;
        this.preco = preco;
    }

    public String getNome() {
        return Nome;
    }

    public double getPreco() {
        return preco;
    }
    
    
}
