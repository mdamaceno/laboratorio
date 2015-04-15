<%-- 
    Document   : listaClientes.jsp
    Created on : 14/04/2015, 23:08:32
    Author     : mdamaceno
--%>

<%@page import="br.com.laboratorio.beans.Cliente"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>JSP Page</title>
  </head>
  <body>
    <h1>Clientes cadastrados</h1>
    
    <ul>
      <%
      List<Cliente> lista = (List<Cliente>)request.getAttribute("lista");
      for (Cliente c:lista) { %>
        <li><%= c.getNome() %></li>
      <% } %>
    </ul>
    <form action="clientes">
      <input type="hidden" name="ac" value="novoCliente" />
      <input type="submit" value="Novo Cliente" />
    </form>
  </body>
</html>
