/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.abstractclans;

/**
 *
 * @author RodrigoBoehme
 */
public class ClaUchiha extends cla{

    public ClaUchiha(String nomeDoClan, String lider) {
        super("Uchiha", "Sasuke");
    }

    @Override
    public void habilidadeEspecial() {
        System.out.println("Habilidade Especial: Sharingan");
    }
    
}
