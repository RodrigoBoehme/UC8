/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.primeiroprojeto;

/**
 *
 * @author RodrigoBoehme
 */
public class PrimeiroProjeto {

    public static void main(String[] args) {
        Frase minhaFrase=new Frase();
        minhaFrase.mensagem();
        Tipos tipo=new Tipos();
        tipo.verificaIdade(tipo.calculaSome(20, -2));
        tipo.nacionalidade("Brasil");
    }
}


