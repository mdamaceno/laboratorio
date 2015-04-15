/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.laboratorio.controllers;

import br.com.laboratorio.beans.Cliente;
import br.com.laboratorio.dao.ClienteDAO;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author mdamaceno
 */
@WebServlet(name = "Clientes", urlPatterns = {"/clientes"})
public class Clientes extends HttpServlet {

  /**
   * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
   * methods.
   *
   * @param request servlet request
   * @param response servlet response
   * @throws ServletException if a servlet-specific error occurs
   * @throws IOException if an I/O error occurs
   */
  protected void processRequest(HttpServletRequest request, HttpServletResponse response)
          throws ServletException, IOException {
    
    String action = request.getParameter("ac");
    
    Cliente c = new Cliente();
    ClienteDAO cDao = new ClienteDAO();
    
    if (action == null) {
      List<Cliente> lista = cDao.index(c);

      request.setAttribute("lista", lista);
      RequestDispatcher saida = request.getRequestDispatcher("listaClientes.jsp");
      saida.forward(request, response);
      
    } else if(action.equals("novoCliente")) {
      RequestDispatcher saida = request.getRequestDispatcher("cadastroCliente.jsp");
      saida.forward(request, response);
      
    } else if (action.equals("gravaCliente")) {
      c.setNome(request.getParameter("edtNome"));
      c.setTelefone(request.getParameter("edtTelefone"));
      c.setSexo(Integer.parseInt(request.getParameter("edtSexo")));
      c.setEndereco1(request.getParameter("edtEndereco"));
      c.setEndereco2(request.getParameter("edtNumero"));
      c.setEndereco3(request.getParameter("edtComplemento"));
      c.setEndereco4(request.getParameter("edtBairro"));
      c.setCidade(request.getParameter("edtCidade"));
      c.setEstado(request.getParameter("edtEstado"));
      
      cDao.create(c);
      
      response.sendRedirect("clientes");
    }
    
  }

  // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
  /**
   * Handles the HTTP <code>GET</code> method.
   *
   * @param request servlet request
   * @param response servlet response
   * @throws ServletException if a servlet-specific error occurs
   * @throws IOException if an I/O error occurs
   */
  @Override
  protected void doGet(HttpServletRequest request, HttpServletResponse response)
          throws ServletException, IOException {
    processRequest(request, response);
  }

  /**
   * Handles the HTTP <code>POST</code> method.
   *
   * @param request servlet request
   * @param response servlet response
   * @throws ServletException if a servlet-specific error occurs
   * @throws IOException if an I/O error occurs
   */
  @Override
  protected void doPost(HttpServletRequest request, HttpServletResponse response)
          throws ServletException, IOException {
    processRequest(request, response);
  }

  /**
   * Returns a short description of the servlet.
   *
   * @return a String containing servlet description
   */
  @Override
  public String getServletInfo() {
    return "Short description";
  }// </editor-fold>

}
