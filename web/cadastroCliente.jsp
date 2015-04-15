<%@include file="partials/header.jsp" %>

<form action="clientes" method="post">
  <label>Nome: </label>
  <input type="text" name="edtNome" />
  <br>

  <label>Telefone: </label>
  <input type="text" name="edtTelefone" />
  <br>

  <label>Sexo: </label>
  Masculino <input type="radio" name="edtSexo" value="0" />
  Feminino <input type="radio" name="edtSexo" value="1" />
  <br>

  <label>Endereço: </label>
  <input type="text" name="edtEndereco" />
  <br>

  <input type="text" name="edtNumero" />
  <br>

  <input type="text" name="edtComplemento" />
  <br>

  <input type="text" name="edtBairro" />
  <br>

  <label>Cidade: </label>
  <input type="text" name="edtCidade" />
  <br>

  <label>Estado: </label>
  <input type="text" name="edtEstado" />
  <br>

  <input type="hidden" name="ac" value="gravaCliente" />
  <input type="submit" value="Cadastrar" />
</form>

<%@include file="partials/footer.jsp" %>