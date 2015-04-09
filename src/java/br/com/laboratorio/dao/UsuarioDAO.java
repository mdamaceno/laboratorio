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
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author mdamaceno
 */
public class UsuarioDAO {
  
  private final Connection con = Conexao.getConnection();
  
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
  
  public void update(Usuario usuario) {
    String sql = "UPDATE usuarios SET nome = ?, username = ?, senha = ? " +
            "WHERE id = ?";
    
    try {
      
      PreparedStatement prep = con.prepareStatement(sql);
      prep.setString(1, usuario.getNome());
      prep.setString(2, usuario.getUsername());
      prep.setString(3, usuario.getSenha());
      prep.setInt(4, usuario.getId());
      
      prep.execute();
      prep.close();
      
      System.err.println("Usuário alterado com sucesso.");
      
    } catch (SQLException ex) {
      System.err.println("Erro - " + ex.getMessage());
    }
  }
  
  public void destroy(Usuario usuario) {
    String sql = "DELETE FROM usuarios WHERE id = ?";
    
    try {
      
      PreparedStatement prep = con.prepareStatement(sql);
      prep.setInt(1, usuario.getId());
      
      prep.execute();
      prep.close();
      
      System.err.println("Usuário removido com sucesso.");
      
    } catch (SQLException ex) {
      System.err.println("Erro - " + ex.getMessage());
    }
  }
  
  public List<Usuario> index(Usuario usuario) {
    
    String sql = "SELECT * FROM usuarios;";
    List<Usuario> lst = new ArrayList<Usuario>();
    
    try {
      PreparedStatement prep = con.prepareStatement(sql);
      ResultSet res = prep.executeQuery();
      
      while(res.next()) {
        Usuario u = new Usuario();
        u.setId(res.getInt("id"));
        u.setNome(res.getString("nome"));
        u.setUsername(res.getString("Username"));
        u.setSenha(res.getString("senha"));
        lst.add(u);
      }
      
    } catch (SQLException ex) {
      System.err.println("Erro - " + ex.getMessage());
    }
    
    return lst;
  }
  
  public Usuario show(Usuario usuario) {
    
    String sql = "SELECT * FROM usuarios WHERE id = ? LIMIT 1;";
    Usuario u = null;
    
    try {
      PreparedStatement prep = con.prepareStatement(sql);
      prep.setInt(1, usuario.getId());
      ResultSet res = prep.executeQuery();
      
      if(res.next()) {
        u = new Usuario();
        u.setId(res.getInt("id"));
        u.setNome(res.getString("nome"));
        u.setUsername(res.getString("Username"));
        u.setSenha(res.getString("senha"));
      }
      
    } catch (SQLException ex) {
      System.err.println("Erro - " + ex.getMessage());
    }
    
    return u;
  }
}
