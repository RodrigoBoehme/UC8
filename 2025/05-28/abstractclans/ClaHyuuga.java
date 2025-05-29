/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.abstractclans;

/**
 *
 * @author RodrigoBoehme
 */
public class ClaHyuuga extends cla{

    public ClaHyuuga(String nomeDoClan, String lider) {
        super("Hyuuga", "Hiashi");
    }

    @Override
    public void habilidadeEspecial() {
        System.out.println("Habilidade Especial: Byakugan");
    }

    @Override
    public void ataqueEspecial() {
        System.out.println("Punho dos oito trigramas");
    }
    
    
}
