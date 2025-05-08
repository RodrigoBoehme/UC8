/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.primeiroprojeto;

/**
 *
 * @author RodrigoBoehme
 */
public class Catchorro extends Animal{
    private String breed;

    public Catchorro(String name, String species, double weight,String breed) {
        super(name, species, weight);
        this.breed=breed;
    }
    //Sobrescrever
    @Override
    public void emitirSom(){
        System.out.println("O Catchorro latiu");
    }
    
}
