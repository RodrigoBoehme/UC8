/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.abstractclans;

/**
 *
 * @author RodrigoBoehme
 */
public abstract class cla {
    String nomeDoClan;
    String lider;//Nome do lider atual

    public cla(String nomeDoClan, String lider) {
        this.nomeDoClan = nomeDoClan;
        this.lider = lider;
    }
    
    
    
    public abstract void habilidadeEspecial();
    
    public void exibirDetalhes(){
        System.out.println("O lider do Clan "+nomeDoClan+"é o "+lider);
    }
}
