/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jdbc;

/**
 *
 * @author TADS
 */
public class TesteConexao {
    public static void main(String[] args) {
        try {
             Conexao.conectar();
        } catch (Exception e) {
        }
    }
    
}
