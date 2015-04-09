/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.laboratorio.testes;

import br.com.laboratorio.beans.Usuario;
import br.com.laboratorio.dao.UsuarioDAO;
import java.util.List;

/**
 *
 * @author mdamaceno
 */
public class TesteDAO {
  
  public static void main(String[] args) {
    //testCreate();
    //testUpdate();
    //testDestroy();
    //testIndex();
    testShow();
  }
  
  public static void testCreate() {
    Usuario u = new Usuario();
    
    u.setNome("Lucas");
    u.setUsername("lucas");
    u.setSenha("8871");
    
    UsuarioDAO uDao = new UsuarioDAO();
    uDao.create(u);
  }
  
  public static void testUpdate() {
    Usuario u = new Usuario();
    
    u.setNome("Marco Damaceno");
    u.setUsername("mdamaceno2");
    u.setSenha("4321");
    u.setId(1);
    
    UsuarioDAO uDao = new UsuarioDAO();
    uDao.update(u);
  }
  
  public static void testDestroy() {
    Usuario u = new Usuario();
    
    u.setId(1);
    
    UsuarioDAO uDao = new UsuarioDAO();
    uDao.destroy(u);
  }
  
  public static void testIndex() {
    Usuario u = new Usuario();
    UsuarioDAO uDAO = new UsuarioDAO();
    List<Usuario> lst  = uDAO.index(u);
    
    for(Usuario usu:lst) {
      System.err.println("ID: " + usu.getId() + " - NOME: " + usu.getNome());
    }
  }
  
  public static void testShow() {
    Usuario u = new Usuario();
    UsuarioDAO uDAO = new UsuarioDAO();
    u.setId(6);
    Usuario user = uDAO.show(u);
    System.err.println("ID: " + user.getId() + " - NOME: " + user.getNome());
  }
  
}
