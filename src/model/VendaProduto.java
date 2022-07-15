/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.time.LocalDate;

/**
 *
 * @author Mauro B H Jr
 */
public class VendaProduto {
    private int idCliente;
    private int idLivro;
    private int QuantidadeProduto;
    private float subTotal;
    private LocalDate dataVenda;

    public VendaProduto() {
    }
    public VendaProduto(int idCliente, int idLivro, int QuantidadeProduto, float subTotal, LocalDate dataVenda) {
        this.idCliente = idCliente;
        this.idLivro = idLivro;
        this.QuantidadeProduto = QuantidadeProduto;
        this.subTotal = subTotal;
        this.dataVenda = dataVenda;
    }

    public int getIdCliente() {
        return idCliente;
    }
    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }
    
    public int getIdLivro() {
        return idLivro;
    }
    public void setIdLivro(int idLivro) {
        this.idLivro = idLivro;
    }
    
    public int getQuantidadeProduto() {
        return QuantidadeProduto;
    }
    public void setQuantidadeProduto(int QuantidadeProduto) {
        this.QuantidadeProduto = QuantidadeProduto;
    }

    public float getSubTotal() {
        return subTotal;
    }
    public void setSubTotal(float subTotal) {
        this.subTotal = subTotal;
    }

    public LocalDate getDataVenda() {
        return dataVenda;
    }
    public void setDataVenda(LocalDate dataVenda) {
        this.dataVenda = dataVenda;
    }

    @Override
    public String toString() {
        return "VendaProduto{" + "idCliente=" + idCliente + ", idLivro=" + idLivro + ", QuantidadeProduto=" + QuantidadeProduto + ", subTotal=" + subTotal + ", dataVenda=" + dataVenda + '}';
    }
}
