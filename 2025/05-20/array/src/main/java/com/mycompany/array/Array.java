/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.array;

import java.util.ArrayList;

/**
 *
 * @author RodrigoBoehme
 */
public class Array {

    public static void main(String[] args) {
        //System.out.println("Hello World!");
        /* 
        int[] numeros = new int[5];

        System.out.println(numeros[0] + " " + numeros[1] + " " + numeros[2] + " " + numeros[3] + " " + numeros[4]);
        numeros[1] = 3;
        numeros[4] = 12213;
        System.out.println(numeros[0] + " " + numeros[1] + " " + numeros[2] + " " + numeros[3] + " " + numeros[4]);

        int[] numeross = {1, 2, 3, 4, 5};
        System.out.println(numeross[0] + " " + numeross[1] + " " + numeross[2] + " " + numeross[3] + " " + numeross[4]);

        System.out.println(numeross.length);
        String[] nomes = new String[3];
        nomes[0] = "Josue";
        nomes[1] = "Batata";
        nomes[2] = "Tacos";
        System.out.println(nomes[0] + " " + nomes[1] + " " + nomes[2]);

        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i]);
        }

        for (int numero : numeros) {
            System.out.println(numero);
        }*/
        //crie um metodo que recebe email e senha
        //dentro do metodo, adicione estas duas strings dentro de um array
        //no fim o metodo deve retornar o array
        
        //String[] array=arraydeConta("b","a");
        //System.out.println(array[0]+" "+array[1]);
        
        Usuario user=new Usuario("jajateconto","jaaj@jamail.com");
        
        String[] slaToComSono=dados(user);
        
        System.out.println(slaToComSono[0]+" "+slaToComSono[1]);
    }
    public static String[] dados(Usuario userr){
        return new String[]{userr.getEmail(),userr.getSenha()};
    }

    public static String[] arraydeConta(String password, String email) {
        /*String[] conta = new String[2];
        conta[0] = email;
        conta[1] = password;
        System.out.println(conta);
        return conta;*/
        
        return new String[]{email, password};
    }
    /*
    refaça o metodo anterior, mas agora ele retorna um array de String
    e tambem, ele aceita como parametro um objeto do tipo Usuario
    */
    ArrayList<Integer> array;
}

