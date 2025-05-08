/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.primeiroprojeto;

import java.util.Scanner;

/**
 *
 * @author RodrigoBoehme
 */
public class Exercicio1 {
    public static void parOuImpar(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Qual numero voce gostaria de saber se é par ou não: ");
        int num=sc.nextInt();
        
        if(num%2==1){
            System.out.println("è impar");
        }else{
            System.out.println(""+num+" é par");
        }
        
        sc.close();
            
    }
}
