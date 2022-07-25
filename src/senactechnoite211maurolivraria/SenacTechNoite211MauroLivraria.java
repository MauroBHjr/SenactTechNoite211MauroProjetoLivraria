/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package senactechnoite211maurolivraria;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import view.menuLivraria;

/**
 *
 * @author 182110041
 */
public class SenacTechNoite211MauroLivraria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String userAtendente = JOptionPane.showInputDialog(null,"Usuário:","Livraria Lótus - Login",JOptionPane.PLAIN_MESSAGE);
        
        
        
        if (userAtendente != ""){
            menuLivraria menuPrincipal = new menuLivraria();
//            JLabel jlblUserAtendente = new JLabel(userAtendente);
//            jlblUserAtendente.setVisible(true);
//            jlblUserAtendente.setSize(200, 100);
            menuPrincipal.setVisible(true);
            menuPrincipal.setLocationRelativeTo(null);
//            menuPrincipal.add(jlblUserAtendente);
            menuPrincipal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        } else {
            System.out.println("Falha ao logar.");
        }
    }
    
}
