/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.abstractclans;

/**
 *
 * @author RodrigoBoehme
 */
public class ClaHatake extends cla {

    public ClaHatake(String nomeDoClan, String lider) {
        super(nomeDoClan, lider);
    }
    
    

    @Override
    public void habilidadeEspecial() {
        System.out.println("Sem Habilidades especiais");
    }

    @Override
    public void ataqueEspecial() {
        System.out.println("Muita habilidade");
    }
    
}
