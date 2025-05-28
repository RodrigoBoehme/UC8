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
        
        ClaNara narara=new ClaNara("", "");
        ClaUchiha uchiha=new ClaUchiha("Uzumaki","Naruto");
        ClaAkimichi amikichi=new ClaAkimichi("SemNomeRealOficial", "Alguem?");
        ClaHyuuga hyuuga=new ClaHyuuga("Huge", "Hinata");
        
        narara.exibirDetalhes();
        uchiha.exibirDetalhes();
        amikichi.exibirDetalhes();
        hyuuga.exibirDetalhes();
        
        narara.habilidadeEspecial();
        uchiha.habilidadeEspecial();
        amikichi.habilidadeEspecial();
        hyuuga.habilidadeEspecial();
    }
}
