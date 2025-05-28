/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.interdaces;

/**
 *
 * @author RodrigoBoehme
 */
public class Interface {

    public static void main(String[] args) {
        //    System.out.println("Hello World!");
        Guitarra guitar = new Guitarra();
        Bateria battery = new Bateria();

        guitar.afinar();
        battery.tocar();
        guitar.tocar();

        CartaoCredito credito = new CartaoCredito("123321456", 000);
        PayPal pay = new PayPal("email@email.com");

        credito.processarPagamento(20);
        System.out.println(credito.obterDetalhes());
        
        pay.processarPagamento(16.54);
        System.out.println(pay.obterDetalhes());
    }

}
