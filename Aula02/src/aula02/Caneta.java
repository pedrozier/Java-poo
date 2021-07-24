/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula02;

/**
 *
 * @author zier
 */
public class Caneta {
    String modelo;
    String cor;
    float ponta;
    int carga;
    boolean tampada;
    
    void status(){
        System.out.println("Modelo " + this.modelo);
        System.out.println("Uma caneta " + this.cor);
        System.out.println("Ponta " + this.ponta);
        System.out.println("Carga " + this.carga);
        System.out.println("esta tampada? " + this.tampada);
        
    }
    void rabiscar(){
        if(this.tampada==true){
            System.out.println("Nao foi possivel 'rabiscar' a caneta esta tampada");
        } else {
            System.out.println("estou 'rabiscando'");
        }
    }
    void tampar(){
        this.tampada = true;
        
    }
    void destampar(){
        this.tampada = false;
    }
    
}
