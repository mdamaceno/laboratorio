/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.laboratorio.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author mdamaceno
 */
public class Conexao {
  public static Connection getConnection() {
    Connection con = null;
    try {
      Class.forName("org.postgresql.Driver");
      //Class.forName("com.mysql.jdbc.Driver");
      con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/laboratorio", "postgres", "marco");
      //con = DriverManager.getConnection("jdbc:mysql://localhost:3306/laboratorio", "root", "marco");
      System.err.println("Conectado com sucesso!");
    } catch (SQLException ex) {
      System.out.println("Erro - Conexão" + ex.getMessage());
    } catch (ClassNotFoundException ex) {
      System.err.println("Erro - Driver " + ex.getMessage());
    }
    return con;
  }
}
