/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.arrayss;

import java.util.ArrayList;

/**
 *
 * @author RodrigoBoehme
 */
public class Arrayss {

    public static void main(String[] args) {

        ArrayList<String> nomes = new ArrayList<>();
        //Adicionar elementos
        nomes.add("Nome1");
        nomes.add("3fsv");
        nomes.add("asdsad");
        //para remover 
        nomes.remove(0);

        //assim acessamos o valor de um elemnto no ArrayList
        System.out.println(nomes.get(1));
        System.out.println(nomes);

        //para trocar um valor
        nomes.set(0, "Josiue");

        //nomes[0]="nao funfa"; nao funciona pois não é array
        // acessar a primeira ocorrencia de um valor
        System.out.println(nomes.indexOf("Josiue"));

        //para mostrar a ultima ocorrencia de um valor
        
        System.out.println(nomes.lastIndexOf("Nome1"));
        //ambos indexOf e lastIndexOf retornam -1 se não houver nenhuma ocorrencia
        
        //para olhar o tamanho
        System.out.println(nomes.size());

        //booleana perguntando se esta vazio
        System.out.println(nomes.isEmpty());
        
        //verificação de contem
        boolean contem=nomes.contains("Josiue");
        
        /*usando java e scanner elabore um sistema simples de compras
        com pelo menos 3 classes de tipos dde produtos diferentes 
        
        para fazer as compras, deve haver um menu com switch onde vode deve poder 
        adiciona e remover  itens do carrinho
        */
    
    
    }

}
