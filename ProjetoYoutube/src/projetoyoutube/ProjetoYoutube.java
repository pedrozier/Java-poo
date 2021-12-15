/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package projetoyoutube;

/**
 *
 * @author zier
 */
public class ProjetoYoutube {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Video v[] = new Video[3];
        v[0] = new Video("Aula 1");
        v[1] = new Video("Aula 2");
        v[2] = new Video("Aula 3");
        
        Usuario u[] = new Usuario[2];
        u[0] = new Usuario("Pessoa1",22,"M","User1");
        u[1] = new Usuario("Pessoa2",12,"F","User2");
        
        System.out.println(v[0].toString());
        System.out.println(u[0].toString());
        
        Visualizacao vis[] = new Visualizacao[5];
        vis[0] = new Visualizacao(u[0], v[2]);
        vis[0].avaliar(4);
        System.out.println(vis[0].toString());
        vis[1] = new Visualizacao(u[0], v[1]);
        vis[1].avaliar(87f);
        System.out.println(vis[1].toString());
        
    }
    
}
