/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.arrays;

/**
 *
 * @author RodrigoBoehme
 */
public class Arrays {

    public static void main(String[] args) {
        int[] numeros=new int[5];
  
        
        System.out.println(numeros[0]+" "+numeros[1]+" "+numeros[2]+" "+numeros[3]+" "+numeros[4]);
        numeros[1]=3;
        numeros[4]=12213;
        System.out.println(numeros[0]+" "+numeros[1]+" "+numeros[2]+" "+numeros[3]+" "+numeros[4]);
        
        int[] numeross={1,2,3,4,5};
        System.out.println(numeross[0]+" "+numeross[1]+" "+numeross[2]+" "+numeross[3]+" "+numeross[4]);
                
        System.out.println(numeross.length);
        String[] nomes=new String[3];
        nomes[0]="Josue";
        nomes[1]="Batata";
        nomes[2]="Tacos";
        System.out.println(nomes[0]+" "+nomes[1]+" "+nomes[2]);
        
        for(int i=0;i<numeros.length;i++){
            System.out.println(numeros[i]);
        }
        
        for(int numero : numeros){
            System.out.println(numero);
        }
    }
}
