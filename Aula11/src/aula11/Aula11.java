/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aula11;

/**
 *
 * @author zier
 */
public class Aula11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Visitante v1 = new Visitante();
        v1.setNome("Visitante1");
        v1.setIdade(22);
        v1.setSexo("M");
        System.out.println(v1.toString());
        
        Aluno a1 = new Aluno();
        a1.setNome("Aluno1");
        a1.setIdade(20);
        a1.setMatricula(1111);
        a1.setCurso("Informatica");
        a1.setSexo("M");
        Bolsista b1 = new Bolsista();
        b1.setNome("Bolsista1");
        b1.setBolsa(12.5f);
        b1.setSexo("M");
        b1.pagarMensalidade();
        
        Professor p1 = new Professor();
        p1.setNome("Professor1");
        p1.setIdade(27);
        p1.setSalario(100);
        p1.setEspecialidade("Informatica");
        p1.receberAumento();
        System.out.println(p1.toString());
        
    }
    
}
