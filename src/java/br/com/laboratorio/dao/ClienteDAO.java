/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.laboratorio.dao;

import br.com.laboratorio.beans.Cliente;
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
public class ClienteDAO {
  
  private final Connection con = Conexao.getConnection();
  
  public void create(Cliente cliente) {
    String sql = "INSERT INTO clientes (nome, telefone, sexo, endereco1, endereco2, endereco3, endereco4, cidade, estado) " +
            "VALUES (?,?,?,?,?,?,?,?,?);";
    
    try {
      PreparedStatement prep = con.prepareStatement(sql);
      prep.setString(1, cliente.getNome());
      prep.setString(2, cliente.getTelefone());
      prep.setInt(3, cliente.getSexo());
      prep.setString(4, cliente.getEndereco1());
      prep.setString(5, cliente.getEndereco2());
      prep.setString(6, cliente.getEndereco3());
      prep.setString(7, cliente.getEndereco4());
      prep.setString(8, cliente.getCidade());
      prep.setString(9, cliente.getEstado());
      
      prep.execute();
      prep.close();
      
      System.err.println("Cliente criado com sucesso.");
      
    } catch (SQLException ex) {
      System.err.println("Erro - " + ex.getMessage());
    }
  }
  
  public void update(Cliente cliente) {
    String sql = "UPDATE clientes SET nome = ?, telefone = ?, sexo = ?, " +
            "endereco1 = ?, endereco2 = ?, endereco3 = ?, endereco4 = ? " +
            "cidade = ?, estado = ? " +
            "WHERE id = ?";
    
    try {
      PreparedStatement prep = con.prepareStatement(sql);
      prep.setString(1, cliente.getNome());
      prep.setString(2, cliente.getTelefone());
      prep.setInt(3, cliente.getSexo());
      prep.setString(4, cliente.getEndereco1());
      prep.setString(5, cliente.getEndereco2());
      prep.setString(6, cliente.getEndereco3());
      prep.setString(7, cliente.getEndereco4());
      prep.setString(8, cliente.getCidade());
      prep.setString(9, cliente.getEstado());
      prep.setInt(10, cliente.getId());
      
      prep.execute();
      prep.close();
      
      System.err.println("Cliente alterado com sucesso.");
      
    } catch (SQLException ex) {
      System.err.println("Erro - " + ex.getMessage());
    }
  }
  
  public void destroy(Cliente cliente) {
    String sql = "DELETE FROM clientes WHERE id = ?";
    
    try {
      
      PreparedStatement prep = con.prepareStatement(sql);
      prep.setInt(1, cliente.getId());
      
      prep.execute();
      prep.close();
      
      System.err.println("Cliente removido com sucesso.");
      
    } catch (SQLException ex) {
      System.err.println("Erro - " + ex.getMessage());
    }
  }
  
  public List<Cliente> index(Cliente cliente) {
    
    String sql = "SELECT * FROM clientes;";
    List<Cliente> lst = new ArrayList<Cliente>();
    
    try {
      PreparedStatement prep = con.prepareStatement(sql);
      ResultSet res = prep.executeQuery();
      
      while(res.next()) {
        Cliente c = new Cliente();
        c.setId(res.getInt("id"));
        c.setNome(res.getString("nome"));
        c.setTelefone(res.getString("telefone"));
        c.setSexo(res.getInt("sexo"));
        c.setEndereco1(res.getString("endereco1"));
        c.setEndereco2(res.getString("endereco2"));
        c.setEndereco3(res.getString("endereco3"));
        c.setEndereco4(res.getString("endereco4"));
        c.setCidade(res.getString("cidade"));
        c.setEstado(res.getString("estado"));
        lst.add(c);
      }
      
    } catch (SQLException ex) {
      System.err.println("Erro - " + ex.getMessage());
    }
    
    return lst;
  }
  
  public Cliente show(Cliente cliente) {
    
    String sql = "SELECT * FROM usuarios WHERE id = ? LIMIT 1;";
    Cliente c = null;
    
    try {
      PreparedStatement prep = con.prepareStatement(sql);
      prep.setInt(1, cliente.getId());
      ResultSet res = prep.executeQuery();
      
      if(res.next()) {
        c = new Cliente();
        c.setId(res.getInt("id"));
        c.setNome(res.getString("nome"));
        c.setTelefone(res.getString("telefone"));
        c.setSexo(res.getInt("sexo"));
        c.setEndereco1(res.getString("endereco1"));
        c.setEndereco2(res.getString("endereco2"));
        c.setEndereco3(res.getString("endereco3"));
        c.setEndereco4(res.getString("endereco4"));
        c.setCidade(res.getString("cidade"));
        c.setEstado(res.getString("estado"));
      }
      
    } catch (SQLException ex) {
      System.err.println("Erro - " + ex.getMessage());
    }
    
    return c;
  }
  
}
