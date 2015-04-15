<%-- 
    Document   : listaClientes.jsp
    Created on : 14/04/2015, 23:08:32
    Author     : mdamaceno
--%>

<%@page import="br.com.laboratorio.beans.Cliente"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="partials/header.jsp" %>
    <h1>Clientes cadastrados</h1>
    
    <input type="text" ng-model="yourName" placeholder="Enter a name here">
    
    <p>{{yourName}}</p>
    
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
      
<%@include file="partials/footer.jsp" %>
