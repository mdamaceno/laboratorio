/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.laboratorio.beans;

/**
 *
 * @author mdamaceno
 */
public class Cliente {
  private int id;
  private String nome;
  private String telefone;
  private int sexo;
  private String endereco1, endereco2, endereco3, endereco4;
  private String cidade;
  private String estado;

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public String getTelefone() {
    return telefone;
  }

  public void setTelefone(String telefone) {
    this.telefone = telefone;
  }

  public int getSexo() {
    return sexo;
  }

  public void setSexo(int sexo) {
    this.sexo = sexo;
  }

  public String getEndereco1() {
    return endereco1;
  }

  public void setEndereco1(String endereco1) {
    this.endereco1 = endereco1;
  }

  public String getEndereco2() {
    return endereco2;
  }

  public void setEndereco2(String endereco2) {
    this.endereco2 = endereco2;
  }

  public String getEndereco3() {
    return endereco3;
  }

  public void setEndereco3(String endereco3) {
    this.endereco3 = endereco3;
  }

  public String getEndereco4() {
    return endereco4;
  }

  public void setEndereco4(String endereco4) {
    this.endereco4 = endereco4;
  }

  public String getCidade() {
    return cidade;
  }

  public void setCidade(String cidade) {
    this.cidade = cidade;
  }

  public String getEstado() {
    return estado;
  }

  public void setEstado(String estado) {
    this.estado = estado;
  }
  
  
}
