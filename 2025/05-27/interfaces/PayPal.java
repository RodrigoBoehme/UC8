/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.interdaces;

/**
 *
 * @author RodrigoBoehme
 */
public class PayPal implements Pagamento {
    private String email;

    public PayPal(String email) {
        this.email = email;
    }
    
    @Override
    public void processarPagamento(double valor) {
        System.out.println("o Valor de "+valor+"R$ foi processado na sua conta PAYPAL");
    }

    @Override
    public String obterDetalhes() {
    return email;
    }
    
}
