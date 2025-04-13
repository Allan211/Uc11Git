/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Adm
 */

import java.sql.PreparedStatement;
import java.sql.Connection;
import javax.swing.JOptionPane;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;


public class ProdutosDAO {
    conectaDAO conexao = new conectaDAO();
    
    ArrayList<ProdutosDTO> listagem = new ArrayList<>();
    
    public void cadastrarProduto (ProdutosDTO produto) throws SQLException {
        conexao.conectar();
        
        String nome = produto.getNome();
        int valor = produto.getValor();
        String status = produto.getStatus();
        
        Statement stmt = conexao.conn.createStatement();
        String sql;                
        sql = "insert into produtos (nome, valor, status) values ('" + nome + "', '" + valor + "', '" + status + "')";
        stmt.executeUpdate(sql);
        System.out.println("Dados inseridos.");
        
    }
    
    public ArrayList<ProdutosDTO> listarProdutos(){
        
        return listagem;
    }
    
    
    
        
}

