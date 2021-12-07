/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aula09;

/**
 *
 * @author zier
 */
public class Aula09 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Pessoa[] p = new Pessoa[2];
        Livro[] l = new Livro[3];
        
        p[0] = new Pessoa("Pessoa1", 22, "M");
        p[1] = new Pessoa("Pessoa2", 25, "F");
        
        l[0] = new Livro("Livro1","Autor1",300,p[0]);
        l[1] = new Livro("Livro2","Autor2",500,p[1]);
        l[2] = new Livro("Livro3","Autor3",800,p[0]);
        
        l[2].folhear(100);
        l[2].fechar();
        System.out.println(l[2].detalhes());
    }
    
}
