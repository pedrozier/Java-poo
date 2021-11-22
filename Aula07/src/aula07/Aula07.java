/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aula07;

/**
 *
 * @author zier
 */
public class Aula07 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Lutador l[] = new Lutador[6]; 
        l[0] = new Lutador("Lutador1", "Franca", 31, 1.75f, 68.9f, 11, 2, 1);
        l[0].apresentar();
        l[0].status();
        
        l[1] = new Lutador("Lutador2", "EUA", 35, 1.65f, 70f, 5, 2, 1);
        l[1].apresentar();
        l[1].status();
        
        l[2] = new Lutador("Lutador3", "Brasil", 32, 1.75f, 110.2f, 3, 1, 0);
        l[2].apresentar();
        l[2].status();
        
    }
    
}
