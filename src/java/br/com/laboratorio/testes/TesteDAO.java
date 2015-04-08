/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.laboratorio.testes;

import br.com.laboratorio.beans.Usuario;
import br.com.laboratorio.dao.UsuarioDAO;

/**
 *
 * @author mdamaceno
 */
public class TesteDAO {
  
  public static void main(String[] args) {
    testCreate();
  }
  
  public static void testCreate() {
    Usuario u = new Usuario();
    
    u.setNome("Marco");
    u.setUsername("mdamaceno");
    u.setSenha("1234");
    
    UsuarioDAO uDao = new UsuarioDAO();
    uDao.create(u);
  }
  
}
