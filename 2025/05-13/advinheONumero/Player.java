/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.guessinggame;

import java.util.Scanner;
import javax.sound.midi.Soundbank;


/**
 *
 * @author RodrigoBoehme
 */
public class Player {
    private String name;
    private int turns=0;
    /*
    Criar um atributo Jogadas para o player 
    criar um metodo que incrementa as jogadas e outro que mostra o numero de jogadas
    mudar a logica do jogo para mostrar quantas jogadas o player precisou fazer para acerta
    */
    
    public Player(){
    Scanner scanner=new Scanner(System.in);
    System.out.println("Digite seu Nome: ");
    this.name=scanner.nextLine();
    }
    public String getName(){return this.name;}
    public void IncrementTurns(){
    this.turns+=1;
    }
    public int turns(){
    return this.turns;}
}
