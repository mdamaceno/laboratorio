/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.laboratorio.testes;

import br.com.laboratorio.jdbc.Conexao;

/**
 *
 * @author mdamaceno
 */
public class TesteConexao {
  public static void main(String[] args) {
    Conexao.getConnection();
  }
}
