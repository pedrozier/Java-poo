/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula09;

/**
 *
 * @author zier
 */
public class Livro implements Publicacao{
    private String titulo;
    private String autor;
    private int totPaginas;
    private int paginaAberta;
    private boolean aberto;
    private Pessoa leitor;

    public Livro(String titulo, String autor, int totPaginas, Pessoa leitor) {
        this.titulo = titulo;
        this.autor = autor;
        this.totPaginas = totPaginas;
        this.paginaAberta = 0;
        this.aberto = false;
        this.leitor = leitor;
        
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getTotPaginas() {
       
        return totPaginas;

    }

    public void setTotPaginas(int totPaginas) {
        this.totPaginas = totPaginas;
    }

    public int getPaginaAberta() {
       
        return paginaAberta;
        
    }

    public void setPaginaAberta(int pA) {
        
        this.paginaAberta = pA;
        
    }

    public boolean isAberto() {
        return aberto;
    }

    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }

    
    public String detalhes() {
        return "Livro{" + "titulo=" + titulo + "\n, autor=" + autor + "\n, totPaginas=" + totPaginas + "\n, paginaAberta=" + paginaAberta + "\n, aberto=" + aberto + "\n, leitor=" + leitor.getNome() + ", idade=" + leitor.getIdade() + ", sexo=" + leitor.getSexo() + '}';
    }

    @Override
    public void abrir() {
        this.aberto = true;
    }

    @Override
    public void fechar() {
        this.aberto = false;
        this.paginaAberta = 0;
    }

    @Override
    public void folhear(int p) {
        if(p > this.getTotPaginas()){
         this.paginaAberta = 0;
        } else {
        this.paginaAberta = p;
        }
        }
        

    @Override
    public void avancarPag() {
        this.paginaAberta++;
    }

    @Override
    public void voltarPag() {
        this.paginaAberta--;
    }
    
        
    
}
