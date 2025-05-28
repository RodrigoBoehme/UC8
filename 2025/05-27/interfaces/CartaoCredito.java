/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.interdaces;

/**
 *
 * @author RodrigoBoehme
 */
public class CartaoCredito implements Pagamento {
    private String numeroCartao;
    private int codigoSeguranca;

    public CartaoCredito(String numeroCartao, int codigoSeguranca) {
        this.numeroCartao = numeroCartao;
        this.codigoSeguranca = codigoSeguranca;
    }

    
    @Override
    public void processarPagamento(double valor) {
        System.out.println("o Valor de "+valor+"R$ foi desacreditado da sua conta do banco");
    }

    @Override
    public String obterDetalhes() {
        return numeroCartao.substring(numeroCartao.length()-4);
    }
    
}
