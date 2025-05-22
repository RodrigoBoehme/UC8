/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.arraycompras;

/**
 *
 * @author RodrigoBoehme
 */
public class Alimento extends Produto {
    
    public Alimento(String Nome, double preco) {
        super(Nome, preco);
        this.setTipo("Alimento");
    }
    
}
