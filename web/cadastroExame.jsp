<%@include file="partials/header.jsp" %>

<form action="sendings/scliente.jsp" method="get">
  <label>Cliente: </label>
  <input type="text" name="edtCliente" />
  <br>

  <label>Descrição do exame: </label>
  <textarea name="edtDescricao"></textarea>
  <br>

  <label>Tempo de jejum: </label>
  <input type="number" name="edtTempoJejum" />
  <br>

  <label>Tempo de entrega: </label>
  <input type="date" name="edtTempoEntrega" />
  <br>

  <label>Entregue: </label>
  <input type="checkbox" name="edtEntregue" />
  <br>

  <input type="submit" value="Cadastrar" />
</form>

<%@include file="partials/footer.jsp" %>