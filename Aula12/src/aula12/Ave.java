/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula12;

/**
 *
 * @author zier
 */
public class Ave extends Animal{

    @Override
    public void locomover() {
        System.out.println("Voando");
    }

    @Override
    public void alimentar() {
        System.out.println("Comendo Frutas");
    }

    @Override
    public void emitirSom() {
        System.out.println("Som de Ave");
    }
    public void fazerNinho(){
        System.out.println("Construindo Ninho");
    }
}
