/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.abstractclans;

/**
 *
 * @author RodrigoBoehme
 */
public class ClaAkimichi extends cla{

    public ClaAkimichi(String nomeDoClan, String lider) {
        super("Akimichi", "Chouza");
    }

    
    @Override
    public void habilidadeEspecial() {
        System.out.println("Habilidade especial: Ampliação Corporal");
    }
    
}
