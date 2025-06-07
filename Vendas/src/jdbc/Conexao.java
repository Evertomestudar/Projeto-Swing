/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jdbc;
import java.sql.Connection;
import java.sql.DriverManager; // necessário
import javax.swing.JOptionPane;

public class Conexao {
         
    public static Connection conectar() {

        Connection conexao = null;

        String driver = "com.mysql.cj.jdbc.Driver";
        String url = "jdbc:mysql://localhost:3306/bdvendas"; // removido "?" desnecessário
        String user = "root";
        String senha = "root";

        try {
            Class.forName(driver);
            conexao = DriverManager.getConnection(url, user, senha);
            JOptionPane.showMessageDialog(null, "Conectado com sucesso!!");
            return conexao;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Opss, algo deu errado: " + e);
            return null;
        }
    }

    public static Connection desconectar(Connection conexao) {
        try {
            if (conexao != null) {
                conexao.close();
            }
        } catch (Exception e) {
            // silencioso, como no original
        }

        return null;
    }
}