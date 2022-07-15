/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Mauro B H Jr
 */
public class Cliente {
    private int idCliente;
    private String nomeCliente;
    private String cpfCliente;
    private String cnpjCliente;
    private String enderecoCliente;
    private String telefoneCliente;

    public Cliente() {
    }
    public Cliente(int idCliente, String nomeCliente, String cpfCliente, String cnpjCliente, String enderecoCliente, String telefoneCliente) {
        this.idCliente = idCliente;
        this.nomeCliente = nomeCliente;
        this.cpfCliente = cpfCliente;
        this.cnpjCliente = cnpjCliente;
        this.enderecoCliente = enderecoCliente;
        this.telefoneCliente = telefoneCliente;
    }

    public int getIdCliente() {
        return idCliente;
    }
    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }
    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public String getCpfCliente() {
        return cpfCliente;
    }
    public void setCpfCliente(String cpfCliente) {
        this.cpfCliente = cpfCliente;
    }

    public String getCnpjCliente() {
        return cnpjCliente;
    }
    public void setCnpjCliente(String cnpjCliente) {
        this.cnpjCliente = cnpjCliente;
    }

    public String getEnderecoCliente() {
        return enderecoCliente;
    }
    public void setEnderecoCliente(String enderecoCliente) {
        this.enderecoCliente = enderecoCliente;
    }

    public String getTelefoneCliente() {
        return telefoneCliente;
    }
    public void setTelefoneCliente(String telefoneCliente) {
        this.telefoneCliente = telefoneCliente;
    }

    @Override
    public String toString() {
        return "Cliente{" + "idCliente=" + idCliente + ", nomeCliente=" + nomeCliente + ", cpfCliente=" + cpfCliente + ", cnpjCliente=" + cnpjCliente + ", enderecoCliente=" + enderecoCliente + ", telefoneCliente=" + telefoneCliente + '}';
    }
}
