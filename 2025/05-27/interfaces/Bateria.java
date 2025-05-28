/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.interdaces;

/**
 *
 * @author RodrigoBoehme
 */
public class Bateria implements InstrumentoMusical {

    @Override
    public void tocar() {
        System.out.println("Ba Dun ts");
    }

    @Override
    public void afinar() {
        System.out.println("How to tune a battery for Dummies 101");
    }
    
}
