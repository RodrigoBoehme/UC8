/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pedrapapeltesoura;

import java.util.Scanner;
import javax.sound.midi.Soundbank;

/**
 *
 * @author RodrigoBoehme
 */
public class Game {
    private Player player;
    private ElementComparator comparar;
    private Scanner scanner;
    
    
    public Game(){
        this.player=new Player();
        this.scanner=new Scanner(System.in);
        this.comparar=new ElementComparator();
    }
    void Start(){
        
        int hasWon=0;
        System.out.println("Bem Vindo ao melhor de 3 do pedra papel tesoura "+player.getName());
        for(int i=0;i<3;i++){
        int oponentHand=(int)(Math.random()*3)+1;
            System.out.println("1- Pedra");
            System.out.println("2- Tesoura");
            System.out.println("3- Papel");
        int yourHand=scanner.nextInt();
        hasWon+=comparar.validate(oponentHand, yourHand);
        if(hasWon>3){i=3;}
        }
        if(hasWon>3){
        System.out.println("Voce Ganhou "+player.getName());
        }
        else if(hasWon==3){
            System.out.println("Voce Empatou "+player.getName());
        }
        else{
            System.out.println("Voce perde "+player.getName());
        }
    }
}
