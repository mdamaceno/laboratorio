<%@page import="java.util.List"%>
<%@page import="br.com.laboratorio.beans.Usuario"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>JSP Page</title>
  </head>
  <body>
    <h1>Usuários do sistema</h1>
    
    <ul>
      <%
      List<Usuario> lista = (List<Usuario>)request.getAttribute("lista");
      for(Usuario u:lista) { %>
      <li><%= u.getNome() %></li>
      <% } %>
    </ul>
  </body>
</html>
