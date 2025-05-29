/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.abstractclans;

/**
 *
 * @author RodrigoBoehme
 */
public class Konoha {

    public static void main(String[] args) {
        System.out.println("Hello Konoha!");
        
        cla narara=new ClaNara("", "");
        cla uchiha=new ClaUchiha("Uzumaki","Naruto");
        cla amikichi=new ClaAkimichi("SemNomeRealOficial", "Alguem?");
        cla hyuuga=new ClaHyuuga("Huge", "Hinata");
        cla hatake=new ClaHatake("Hatake","Kakashi");
                
        narara.exibirDetalhes();
        uchiha.exibirDetalhes();
        amikichi.exibirDetalhes();
        hyuuga.exibirDetalhes();
        hatake.exibirDetalhes();
        
        
        hatake.habilidadeEspecial();
        narara.habilidadeEspecial();
        uchiha.habilidadeEspecial();
        amikichi.habilidadeEspecial();
        hyuuga.habilidadeEspecial();
    }
}
