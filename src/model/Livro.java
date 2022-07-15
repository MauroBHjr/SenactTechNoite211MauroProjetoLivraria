/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Mauro B H Jr
 */
public class Livro {
    private int idLivro;
    private String tituloLivro;
    private String autorLivro;
    private String assuntoLivro;
    private String isbn;
    private int estoqueLivro;
    private float precoLivro;
    private int idEditora;

    public Livro() {
    }
    public Livro(int idLivro, String tituloLivro, String autorLivro, String assuntoLivro, String isbn, int estoqueLivro, float precoLivro, int idEditora) {
        this.idLivro = idLivro;
        this.tituloLivro = tituloLivro;
        this.autorLivro = autorLivro;
        this.assuntoLivro = assuntoLivro;
        this.isbn = isbn;
        this.estoqueLivro = estoqueLivro;
        this.precoLivro = precoLivro;
        this.idEditora = idEditora;
    }

    public int getIdLivro() {
        return idLivro;
    }
    public void setIdLivro(int idLivro) {
        this.idLivro = idLivro;
    }

    public String getTituloLivro() {
        return tituloLivro;
    }
    public void setTituloLivro(String tituloLivro) {
        this.tituloLivro = tituloLivro;
    }

    public String getAutorLivro() {
        return autorLivro;
    }
    public void setAutorLivro(String autorLivro) {
        this.autorLivro = autorLivro;
    }

    public String getAssuntoLivro() {
        return assuntoLivro;
    }
    public void setAssuntoLivro(String assuntoLivro) {
        this.assuntoLivro = assuntoLivro;
    }

    public String getIsbn() {
        return isbn;
    }
    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public int getEstoqueLivro() {
        return estoqueLivro;
    }
    public void setEstoqueLivro(int estoqueLivro) {
        this.estoqueLivro = estoqueLivro;
    }

    public float getPrecoLivro() {
        return precoLivro;
    }
    public void setPrecoLivro(float precoLivro) {
        this.precoLivro = precoLivro;
    }

    public int getIdEditora() {
        return idEditora;
    }
    public void setIdEditora(int idEditora) {
        this.idEditora = idEditora;
    }

    @Override
    public String toString() {
        return "Livro{" + "idLivro=" + idLivro + ", tituloLivro=" + tituloLivro + ", autorLivro=" + autorLivro + ", assuntoLivro=" + assuntoLivro + ", isbn=" + isbn + ", estoqueLivro=" + estoqueLivro + ", precoLivro=" + precoLivro + ", idEditora=" + idEditora + '}';
    }
}
