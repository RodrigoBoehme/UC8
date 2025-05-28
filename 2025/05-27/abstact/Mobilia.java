/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.abstact;

/**
 *
 * @author RodrigoBoehme
 */
abstract class Mobilia {
    protected String cor;
    protected String material;

    public Mobilia(String cor, String material) {
        this.cor = cor;
        this.material = material;
    }
    //metodo abstracto (sem implementacao de logica)
    public abstract void montar();
    
    //metodo concreto (possui logica implementada)
    public void desmontar(){
        System.out.println("A mobalia foi desmontida");
    }
    
}
