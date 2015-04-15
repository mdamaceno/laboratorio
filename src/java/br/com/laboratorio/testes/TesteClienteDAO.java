/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.laboratorio.testes;

import br.com.laboratorio.beans.Cliente;
import br.com.laboratorio.dao.ClienteDAO;
import java.util.List;

/**
 *
 * @author mdamaceno
 */
public class TesteClienteDAO {
  
  public static void main(String[] args) {
    //testCreate();
    testUpdate();
    //testDestroy();
    //testIndex();
    //testShow();
  }
  
  public static void testCreate() {
    Cliente c = new Cliente();
    
    c.setNome("Lucas");
    c.setTelefone("3285191515");
    c.setSexo(0);
    c.setEndereco1("Rua Aurora Tristão");
    c.setEndereco2("385");
    c.setEndereco3("Casa 2");
    c.setEndereco4("Bandeirantes");
    c.setCidade("Juiz de Fora");
    c.setCidade("MG");
    
    ClienteDAO cDao = new ClienteDAO();
    cDao.create(c);
  }
  
  public static void testUpdate() {
    Cliente c = new Cliente();
    
    c.setNome("Marco Damaceno");
    c.setTelefone("3285142010");
    c.setEndereco2("380");
    c.setId(1);
    
    ClienteDAO cDao = new ClienteDAO();
    cDao.update(c);
  }
  
  public static void testDestroy() {
    Cliente c = new Cliente();
    
    c.setId(1);
    
    ClienteDAO cDao = new ClienteDAO();
    cDao.destroy(c);
  }
  
  public static void testIndex() {
    Cliente c = new Cliente();
    ClienteDAO uDAO = new ClienteDAO();
    List<Cliente> lst  = uDAO.index(c);
    
    for(Cliente cli:lst) {
      System.err.println("ID: " + cli.getId() + " - NOME: " + cli.getNome());
    }
  }
  
  public static void testShow() {
    Cliente c = new Cliente();
    ClienteDAO cDao = new ClienteDAO();
    c.setId(1);
    Cliente cli = cDao.show(c);
    System.err.println("ID: " + cli.getId() + " - NOME: " + cli.getNome());
  }
  
}
