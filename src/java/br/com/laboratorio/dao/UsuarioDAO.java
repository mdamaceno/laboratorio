/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.laboratorio.dao;

import br.com.laboratorio.beans.Usuario;
import br.com.laboratorio.jdbc.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author mdamaceno
 */
public class UsuarioDAO {
  
  private Connection con = Conexao.getConnection();
  
  public void create(Usuario usuario) {
    String sql = "INSERT INTO usuarios (nome, username, senha) " +
            "VALUES (?,?,?)";
    
    try {
      
      PreparedStatement prep = con.prepareStatement(sql);
      prep.setString(1, usuario.getNome());
      prep.setString(2, usuario.getUsername());
      prep.setString(3, usuario.getSenha());
      
      prep.execute();
      prep.close();
      
      System.err.println("Usuário criado com sucesso.");
      
    } catch (SQLException ex) {
      System.err.println("Erro - " + ex.getMessage());
    }
  }
}
