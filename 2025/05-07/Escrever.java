/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.primeiroprojeto;

import java.util.Scanner;
import javax.sound.midi.Soundbank;

/**
 *
 * @author RodrigoBoehme
 */
public class Escrever {
    public static void escrever(){
        //cria um objeto scanner para ler a entrada do usuario
        Scanner sc=new Scanner(System.in);
        
        //declara duas variaveis inteiras para armazenar os numeros digitados pelo usuario
        int num1,num2;
        String nome;
        
        System.out.println("Insira seu nome: ");
        nome=sc.nextLine();
        
        //solicita ao usuario que digite o primeiro numero 
        //le o proximointeriro digitado peço usuario em numero1
        System.out.println("Digite o primerio numero: ");
        num1=sc.nextInt();
        System.out.println("o Numero digitado foi "+num1);
        
        System.out.println("Digite o Proximo numero: ");
        num2=sc.nextInt();
        System.out.println("o Numero digitado foi "+num2);

        System.out.println("O resultado da soma "+num1+" e "+num2+" é "+(num1+num2));
        
        System.out.println("o nome da pessoa é "+nome);
        
        
        
        
        sc.close();
    }
}
