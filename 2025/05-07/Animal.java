/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.primeiroprojeto;

/**
 *
 * @author RodrigoBoehme
 */
public class Animal {
   private String name;
   private String species;
   private double weight;
   
   /*
   construtor em TypeScript
   constructor(name:string,species:string,weight:number){
   this.name=name
   this.species=species
   this.weight=weight
   }
   */

    public Animal(String name, String species, double weight) {
        this.name = name;
        this.species = species;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public String getSpecies() {
        return species;
    }

    public double getWeight() {
        return weight;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
   public void emitirSom(){
       System.out.println("Barulho");
   }
}
