/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.sql.Connection;
import java.sql.Statement;
import java.sql.SQLException;
import java.sql.ResultSet;
import conexao.Conexao;
import java.util.ArrayList;
import model.Cliente;
/**
 *
 * @author Mauro B H Jr
 */
public class ClienteDAO {
    public void cadastrarClienteDAO(Cliente cVO) throws SQLException{
        Connection con = Conexao.getConexao();
        Statement state = con.createStatement();
        
        try {
            String sql;
            sql = "insert into cliente values "
                    + "(null, '" 
                    + cVO.getNomeCliente() + "', '"
                    + cVO.getCpfCliente() + "', '"
                    + cVO.getCnpjCliente() + "', '"
                    + cVO.getEnderecoCliente() + "', '"
                    + cVO.getTelefoneCliente() + "');";
                state.execute(sql);
        } catch (SQLException e) {
            throw new SQLException("Erro ao cadastrar cliente.\n" + e.getMessage());
        } finally {
            con.close();
            state.close();
        }
    }
    
    public ArrayList<Cliente> listarClientesDAO() throws SQLException{
        Connection con = Conexao.getConexao();
        Statement state = con.createStatement();
        
        try {
            String sql;
            sql = "select * from cliente";
            
            ResultSet rSet = state.executeQuery(sql);
            ArrayList<Cliente> clientes = new ArrayList<>();
            while (rSet.next()){
                Cliente c = new Cliente();
                c.setIdCliente(rSet.getInt("idCliente"));
                c.setNomeCliente(rSet.getString("nomeCliente"));
                c.setCpfCliente(rSet.getString("cpfCliente"));
                c.setCnpjCliente(rSet.getString("cnpjCliente"));
                c.setEnderecoCliente(rSet.getString("enderecoCliente"));
                c.setTelefoneCliente(rSet.getString("telefoneCliente"));
                clientes.add(c);
            }
            return clientes;
        } catch (SQLException e) {
            throw new SQLException("erro ao realizar busca por clientes.\n" + e.getMessage());
        } finally {
            con.close();
            state.close();
        }
    }
    
    public void atualizarClienteDAO(Cliente cVO) throws SQLException{
        Connection con = Conexao.getConexao();
        Statement state = con.createStatement();
        
        try {
            String sql;
            sql = "update cliente set "
                    + "nomeCliente = '" + cVO.getNomeCliente() + "', '"
                    + "cpfCliente = '" + cVO.getCpfCliente() + "', '"
                    + "cnpjCliente = '" + cVO.getCnpjCliente() + "', '"
                    + "enderecoCliente = '"+ cVO.getEnderecoCliente() + "', '"
                    + "telefoneCliente = '"+ cVO.getTelefoneCliente() + "');";
            state.executeUpdate(sql);
        } catch (SQLException e) {
            throw new SQLException("Não foi possível Atualizar dados do cliente. \n" + e.getMessage());
        } finally {
            con.close();
            state.close();
        }
        
    }
    
    public void removerClienteDAO(int id) throws SQLException{
        Connection con = Conexao.getConexao();
        Statement state = con.createStatement();
        
        try {
            String sql;
            sql = "Delete from cliente where idCliente = " + id;
            state.execute(sql);
        } catch (SQLException e) {
            throw new SQLException("Não foi possível remover cliente.\n" + e.getMessage());
        } finally {
            con.close();
            state.close();
        }
    }
    
    
    
    
    
    
    
    
}
