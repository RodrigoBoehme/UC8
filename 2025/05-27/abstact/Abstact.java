/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.abstact;

/**
 *
 * @author RodrigoBoehme
 */
public class Abstact {

    public static void main(String[] args) {
    //    System.out.println("Hello World!");
    
    Sofa sofis=new Sofa("Dark","Heavy Metal");
    
    sofis.montar();
    sofis.desmontar();
    
    Cama cama=new Cama("Azul", "Algodão");
    
    cama.desmontar();
    cama.montar();
    }
    
}
