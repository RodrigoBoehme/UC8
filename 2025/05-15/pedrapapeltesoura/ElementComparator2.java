/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pedrapapeltesoura;

/**
 *
 * @author RodrigoBoehme
 */
public class ElementComparator2 {

    public String validate(int oponentHand, int yourHand) {
        if (oponentHand == 1) {
            System.out.println("O Oponente Jogou Pedra");
        } else if (oponentHand == 2) {
            System.out.println("O Oponente Jogou Tesoura");
        } else {
            System.out.println("O Oponente Jogou Papel");
        }
        if (yourHand == 1) {
            System.out.println("Voce Jogou Pedra");
        } else if (yourHand == 2) {
            System.out.println("Voce Jogou Tesoura");
        } else {
            System.out.println("Voce Jogou Papel");
        }

        if (yourHand > 3 || yourHand < 1) {
            System.out.println("Sem trapaçear");
            return "d";
        } else if (oponentHand == yourHand) {
            System.out.println("Empate");
            return "e";
        } else if (oponentHand == 1 && yourHand == 2) {
            System.out.println("Perdeu");
            return "d";
        } else if (oponentHand == 3 && yourHand == 1) {
            System.out.println("Perdeu");
            return "d";
        } else if (oponentHand == 2 && yourHand == 3) {
            System.out.println("Perdeu");
            return "d";
        } else {
            System.out.println("Ganhou");
            return "v";
        }
    }

}
