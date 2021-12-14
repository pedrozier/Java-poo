/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aula13;

/**
 *
 * @author zier
 */
public class Aula13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Mamifero x = new Lobo();
        x.emitirSom();
        Cachorro c = new Cachorro();
        c.reagir("Olá");
        c.reagir(11,45);
        c.reagir(19,00);
        c.reagir(true);
        c.reagir(false);
        c.reagir(17,4.5f);
    }
    
}
