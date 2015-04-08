<%

  String cliente = request.getParameter("edtNome");
  String descricao = request.getParameter("edtDescricao");
  String tempoJejum = request.getParameter("edtTempoJejum");
  String tempoEntrega = request.getParameter("edtTempoEntrega");
  String entregue = request.getParameter("edtEntregue");

%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>JSP Page</title>
  </head>
  <body>
    <h1>Cliente cadastrado</h1>
    <p>Nome: <%= cliente %></p>
  </body>
</html>
