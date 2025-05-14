/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.guessinggame;

import java.util.Scanner;

/**
 *
 * @author RodrigoBoehme
 */
public class Game {
    private int numberToGuess;//Numero Aleatorio
    
    private Player player;
    private GuessValidator guessValidator;
    private Scanner scanner;
    
    public Game(){
    this.numberToGuess=(int)(Math.random()*100)+1;//Gera um numero aleatorio entre 1 e 100
    this.player=new Player();
    this.guessValidator=new GuessValidator();
    this.scanner=new Scanner(System.in);
    
    }
    public void start(){
    //Logica do Jogo sera adicionada aki
        System.out.println("Bem vindo ao jogo de adivinhação "+player.getName()+"!");
        boolean hasWon=false;
        
        while(!hasWon){
            player.IncrementTurns();
            System.out.println("Digite seu palpite: ");
            int guess=scanner.nextInt();
            hasWon=guessValidator.validateGuess(guess, this.numberToGuess);
        }
        System.out.println("Parabainx, " +player.getName()+"! Você adivinhou o numero. Voce precisou de "+player.turns()+" Jogadas para terminar");
    }
}
