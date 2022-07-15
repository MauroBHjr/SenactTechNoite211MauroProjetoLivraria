/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Mauro B H Jr
 */
public class Editora {
    private int idEditora;
    private String nomeEditora;
    private String enderecoEditora;
    private String telefoneEditora;
    private String gerenteEditora;

    public Editora() {
    }
    public Editora(int idEditora, String nomeEditora, String enderecoEditora, String telefoneEditora, String gerenteEditora) {
        this.idEditora = idEditora;
        this.nomeEditora = nomeEditora;
        this.enderecoEditora = enderecoEditora;
        this.telefoneEditora = telefoneEditora;
        this.gerenteEditora = gerenteEditora;
    }

    public int getIdEditora() {
        return idEditora;
    }
    public void setIdEditora(int idEditora) {
        this.idEditora = idEditora;
    }

    public String getNomeEditora() {
        return nomeEditora;
    }
    public void setNomeEditora(String nomeEditora) {
        this.nomeEditora = nomeEditora;
    }

    public String getEnderecoEditora() {
        return enderecoEditora;
    }
    public void setEnderecoEditora(String enderecoEditora) {
        this.enderecoEditora = enderecoEditora;
    }

    public String getTelefoneEditora() {
        return telefoneEditora;
    }
    public void setTelefoneEditora(String telefoneEditora) {
        this.telefoneEditora = telefoneEditora;
    }

    public String getGerenteEditora() {
        return gerenteEditora;
    }
    public void setGerenteEditora(String gerenteEditora) {
        this.gerenteEditora = gerenteEditora;
    }

    @Override
    public String toString() {
        return "Editora{" + "idEditora=" + idEditora + ", nomeEditora=" + nomeEditora + ", enderecoEditora=" + enderecoEditora + ", telefoneEditora=" + telefoneEditora + ", gerenteEditora=" + gerenteEditora + '}';
    }
}
