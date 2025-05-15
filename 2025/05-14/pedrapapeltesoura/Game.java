/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pedrapapeltesoura;

import java.util.Scanner;

/**
 *
 * @author RodrigoBoehme
 */
public class Game {

    private Player player;
    private ElementComparator comparar;
    private Scanner scanner;
    private ElementComparator1 comparar2;
    private ElementComparator2 comparar3;

    public Game() {
        this.player = new Player();
        this.scanner = new Scanner(System.in);
        this.comparar = new ElementComparator();
        this.comparar2 = new ElementComparator1();
        this.comparar3 = new ElementComparator2();
    }

    void Start() {
        boolean waswonn1 = false;
        boolean waswonn2 = false;
        boolean waswonn3 = false;
        String wasHon = "";
        int mode = 0;
        int hasWon = 0;
        System.out.println("Bem Vindo ao melhor de 3 do pedra papel tesoura " + player.getName());
        while (mode != 1 && mode != 2 && mode != 3) {
            System.out.println("Escolha a configuração do jogo");
            System.out.println("1- Boolean");
            System.out.println("2- Numeric");
            System.out.println("3- String");
            mode = scanner.nextInt();
        }
        for (int i = 0; i < 3; i++) {

            int oponentHand = (int) (Math.random() * 3) + 1;
            System.out.println("1- Pedra");
            System.out.println("2- Tesoura");
            System.out.println("3- Papel");
            int yourHand = scanner.nextInt();
            if (mode == 2) {
                hasWon += comparar.validate(oponentHand, yourHand);
            }
            if (hasWon > 3 && mode == 2) {
                i = 3;
            }
            if (mode == 3) {
                wasHon += comparar3.validate(oponentHand, yourHand);
            }

            if (i == 0 && mode == 1) {
                waswonn1 = comparar2.validate(oponentHand, yourHand);
            }
            if (i == 2 && mode == 1) {
                waswonn3 = comparar2.validate(oponentHand, yourHand);
            }
            if (i == 1 && mode == 1) {
                waswonn2 = comparar2.validate(oponentHand, yourHand);
            }
            if ((waswonn1 && waswonn2) || (!waswonn1 && !waswonn2 && i > 0) && mode == 1) {
                i = 5;
            }
            if (wasHon.equals("vv") || wasHon.equals("dd")) {
                i = 645234;
            }

        }
        if (mode == 2) {
            if (hasWon > 3) {
                System.out.println("Voce Ganhou " + player.getName());
            } else if (hasWon == 3) {
                System.out.println("Voce Empatou " + player.getName());
            } else {
                System.out.println("Voce perde " + player.getName());
            }
        }

        boolean winCondition = (waswonn1 && waswonn2) || (waswonn1 && waswonn3) || (waswonn2 && waswonn3) || (waswonn1 && waswonn2 && waswonn3);
        if (mode == 1 && winCondition) {
            System.out.println("Voce Ganhou " + player.getName());
        } else if (mode == 1) {
            System.out.println("Voce perdeu ou empatou " + player.getName() + " sim, um metodo que da false para empate pode dar perda para 2 empates");
        }
        System.out.println(wasHon);
        boolean winCondString = (wasHon.equals("vvd")||wasHon.equals("vee") || wasHon.equals( "vdv") || wasHon.equals("dvv") || wasHon.equals("vv") || wasHon.equals("evv") || wasHon.equals("vev") || wasHon.equals("eve")||wasHon.equals("eev"));
        System.out.println(winCondString);
        boolean drawCondString = (wasHon.equals("vde") ||wasHon.equals("dve") || wasHon.equals("ved") || wasHon.equals("dev") || wasHon.equals( "evd") || wasHon.equals("edv") || wasHon.equals("eee"));
        System.out.println(drawCondString);
        if (mode == 3) {
            if (winCondString==true) {
                System.out.println("Voce Ganhou " + player.getName());
            } else if (drawCondString) {
                System.out.println("Voce empatou " + player.getName());
            } else {
                System.out.println("Voce Perdeu " + player.getName());
            }
        }
    }
}
