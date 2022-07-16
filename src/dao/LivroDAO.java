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
import model.Livro;

/**
 *
 * @author Mauro B H Jr
 */
public class LivroDAO {
    public void cadastrarLivroDAO(Livro lVO) throws SQLException{
        Connection con = Conexao.getConexao();
        Statement state = con.createStatement();
        
        try {
            String sql;
            sql = "insert into livro values "
                    + "(null, '" 
                    + lVO.getTituloLivro() + "', '"
                    + lVO.getAutorLivro() + "', '"
                    + lVO.getAssuntoLivro() + "', '"
                    + lVO.getIsbn() + "', "
                    //atenção para sintaxe, não sei se vou acertar nisso
                    + lVO.getEstoqueLivro() + ", "
                    + lVO.getPrecoLivro() + ", "
                    + lVO.getIdEditora() + "');";
                state.execute(sql);
        } catch (SQLException e) {
            throw new SQLException("Erro ao cadastrar livro.\n" + e.getMessage());
        } finally {
            con.close();
            state.close();
        }
    }
    
    public ArrayList<Livro> listarLivrosDAO() throws SQLException{
        Connection con = Conexao.getConexao();
        Statement state = con.createStatement();
        
        try {
            String sql;
            sql = "select * from livro";
            
            ResultSet rSet = state.executeQuery(sql);
            ArrayList<Livro> livros = new ArrayList<>();
            while (rSet.next()){
                Livro l = new Livro();
                l.setIdLivro(rSet.getInt("idLivro"));
                l.setTituloLivro(rSet.getString("tituloLivro"));
                l.setAutorLivro(rSet.getString("autorLivro"));
                l.setAssuntoLivro(rSet.getString("assuntoLivro"));
                l.setIsbn(rSet.getString("isbn"));
                l.setEstoqueLivro(rSet.getInt("estoqueLivro"));
                l.setPrecoLivro(rSet.getFloat("precoLivro"));
                l.setIdEditora(rSet.getInt("idEditora"));
                livros.add(l);
            }
            return livros;
        } catch (SQLException e) {
            throw new SQLException("erro ao realizar busca por livros.\n" + e.getMessage());
        } finally {
            con.close();
            state.close();
        }
    }
    
    public void atualizarLivroDAO(Livro lVO) throws SQLException{
        Connection con = Conexao.getConexao();
        Statement state = con.createStatement();
        
        try {
            String sql;
            sql = "update livro set "
                    + "tituloLivro = '" + lVO.getTituloLivro() + "', '"
                    + "autorLivro = '" + lVO.getAutorLivro() + "', '"
                    + "assuntoLivro = '" + lVO.getAssuntoLivro() + "', '"
                    + "isbn = '" + lVO.getIsbn() + "', "
                    + "estoqueLivro = " + lVO.getEstoqueLivro() + ", "
                    + "precoLivro = " + lVO.getPrecoLivro() + ", "
                    + "idEditora = "+ lVO.getIdEditora() + ");";
            state.executeUpdate(sql);
        } catch (SQLException e) {
            throw new SQLException("Não foi possível atualizar dados do livro. \n" + e.getMessage());
        } finally {
            con.close();
            state.close();
        }
        
    }
    
    
    
}
