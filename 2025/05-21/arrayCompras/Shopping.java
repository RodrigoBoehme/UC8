/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.arraycompras;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author RodrigoBoehme
 */
public class Shopping {

    ArrayList<Produto> Carrinho;
    Scanner sc;

    public Shopping() {
        Carrinho = new ArrayList<>();
        sc = new Scanner(System.in);

    }

    public void meunu() {

        while (true) {
            System.out.println("Sistema de compras v1.0");

            System.out.println("1- Adicionar produto \n"
                    + "2- Remover produto \n"
                    + "3- Ver Carrinho \n"
                    + "4- Finalizar o Carrinho \n"
                    + "5- Sair \n"
                    + "Digite a opção desejada: ");
            int opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    adicionar();
                    break;
                case 2:
                    // System.out.println("produto removido");
                    if(!Carrinho.isEmpty()){
                    remover();
                    }else{
                        System.out.println("O carrinho esta vazio, Não há itens para remover");
                    }
                    break;
                case 3:
                    if(Carrinho.isEmpty()){
                        System.out.println("O Carrinho esta vazio, adicione algo para ver aqui!");
                    }
                    else{
                    verCarrinho();
                    //System.out.println("carrinho vizualizado");
                    }
                    break;
                case 4:
                    System.out.println("Finalizando Compra");
                    finalizarCompra();
                    return;
                case 5:
                    System.out.println("Saindo...");
                    return;
                default:
                    System.out.println("Opcao invalida!");
                    break;

                case 27092002:
                    System.out.println("Essa opção é um easter egg");
                    break;

            }

        }

    }

    private void adicionar() {
        while (true) {

            System.out.println("Escolha um produto para adicionar\n"
                    + "1- Tevelisão\n"
                    + "2- Camiseta\n"
                    + "3- Batata Frita Congelada\n"
                    + "4- Voltar\n"
                    + "Selecione uma opção: ");

            int opcaoAdd = sc.nextInt();

            switch (opcaoAdd) {
                case 1:
                    Produto produto = new Eletronico("Televisao", 1999.98);
                    Carrinho.add(produto);
                    System.out.println(produto.getNome() + " foi adicionado ao seu carrinho");
                    return;
                case 2:
                    Produto p2 = new Vestuario("Camiseta", 65.98);
                    Carrinho.add(p2);
                    System.out.println(p2.getNome() + " foi adicionado ao seu carrinho");
                    return;
                case 3:
                    Produto p3 = new Alimento("Batata Congelada Frita", 19.98);
                    Carrinho.add(p3);
                    System.out.println(p3.getNome() + " foi adicionado ao seu carrinho");
                    return;
                case 4:
                    System.out.println("Voltando a tela inicial...");
                    return;
                default:
                    System.out.println("Opcao Invalida");
                    break;
            }
        }

    }

    private void remover() {
        System.out.println("Escolha o produto a ser removido");
        exibir();
        
        int opcaoRem=sc.nextInt();
        
        while(opcaoRem<1||opcaoRem>Carrinho.size()){
            System.out.println("opcão Invalida, tente novamente...");
            System.out.println("Qual item gostaria de remover ?");
            exibir();
            opcaoRem=sc.nextInt();
        }
        System.out.println("o Item "+Carrinho.get(opcaoRem-1).getNome() +" foi removido do carrinho");
        Carrinho.remove(opcaoRem-1);
        
        
        return;
    }

    private void verCarrinho() {

        System.out.println("Seu carrinho tem estes itens: ");

        //for (Produto item : Carrinho) {
        //    System.out.println(item.getNome());
        //}
        exibir();
    }
    
    private void finalizarCompra(){
        System.out.println("Seu carrinho tem estes itens: ");
        double total=0;
        for (Produto item : Carrinho) {
            total+=item.getPreco();
            System.out.println(item.getNome()+" "+item.getPreco()+"R$");
        }
        System.out.println("Totalizando em um total de "+total+"R$");
    
        System.out.println("Como Gostaria de Pagar\n"
                + "Tudo foi pago, até a proxima! ");
        
    }
    private void exibir(){
        for (int i=0;i<Carrinho.size();i++){
            System.out.println(i+1+" - "+Carrinho.get(i).getNome());
        }
    }
}
