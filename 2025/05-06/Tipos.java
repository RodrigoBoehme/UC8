/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.primeiroprojeto;

/**
 *
 * @author RodrigoBoehme
 */
public class Tipos {
    String meuNome = "Rodrigo";
    char minhaInicial = 'R' ;
    int minhaIdade=22;
    double minhaAltura=1.87;
    boolean verdadeiroOuFalso=false;
    
    public void verificaIdade(int idade){
        if(idade>=18){
            System.out.println("Voce é maior de idade pois tem "+idade+" anos.");
        }else{
            System.out.println("Voce é menor de idade pois tem "+idade+" anos.");
        }
    }
    
    // primeiro dizemos se o metodo é public private ou protected
    //depois devemos especificar so tipo returno do metodo
    //depois colocamos o nome do metodo 
    //e depois os parametros se houverem
    public int calculaSome(int num1, int num2){
        int soma= num1+num2;
        return soma;
    }
    public void nacionalidade(String pais){
    switch(pais){
        case"Brasil":
            System.out.println("Voceé Brasiloco");
            break;
        case"Argentina":
            System.out.println("Voce é argentcholo");
        break;
        default:
            System.out.println("Nacionalidadenao encontrada");
        break;
    }
    }
    
 }
