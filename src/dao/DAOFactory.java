/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

/**
 *
 * @author Mauro B H Jr
 */
public class DAOFactory {
    private static ClienteDAO cDAO = new ClienteDAO();
    public static ClienteDAO getClienteDAO(){
        return cDAO;
    }
    
    private static LivroDAO lDAO = new LivroDAO();
    public static LivroDAO getLivroDAO(){
        return lDAO;
    }
    
    private static EditoraDAO eDAO = new EditoraDAO();
    public static EditoraDAO getEditoraDAO(){
        return eDAO;
    }

    private static VendaProdutoDAO vpDAO = new VendaProdutoDAO();
    public static VendaProdutoDAO getVendaProdutoDAO(){
        return vpDAO;
    }
}
