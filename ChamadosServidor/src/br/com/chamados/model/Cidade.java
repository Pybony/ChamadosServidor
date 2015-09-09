package br.com.chamados.model;
// Generated 06/09/2015 10:21:06 by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Cidade generated by hbm2java
 */
public class Cidade  implements java.io.Serializable {


     private int id;
     private Estado estado;
     private String nome;
     private String cep;
     private Set bairros = new HashSet(0);
     private Set funcionarios = new HashSet(0);
     private Set empresas = new HashSet(0);
     private Set pessoas = new HashSet(0);

    public Cidade() {
    }

	
    public Cidade(int id, Estado estado, String nome, String cep) {
        this.id = id;
        this.estado = estado;
        this.nome = nome;
        this.cep = cep;
    }
    public Cidade(int id, Estado estado, String nome, String cep, Set bairros, Set funcionarios, Set empresas, Set pessoas) {
       this.id = id;
       this.estado = estado;
       this.nome = nome;
       this.cep = cep;
       this.bairros = bairros;
       this.funcionarios = funcionarios;
       this.empresas = empresas;
       this.pessoas = pessoas;
    }
   
    public int getId() {
        return this.id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    public Estado getEstado() {
        return this.estado;
    }
    
    public void setEstado(Estado estado) {
        this.estado = estado;
    }
    public String getNome() {
        return this.nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getCep() {
        return this.cep;
    }
    
    public void setCep(String cep) {
        this.cep = cep;
    }
    public Set getBairros() {
        return this.bairros;
    }
    
    public void setBairros(Set bairros) {
        this.bairros = bairros;
    }
    public Set getFuncionarios() {
        return this.funcionarios;
    }
    
    public void setFuncionarios(Set funcionarios) {
        this.funcionarios = funcionarios;
    }
    public Set getEmpresas() {
        return this.empresas;
    }
    
    public void setEmpresas(Set empresas) {
        this.empresas = empresas;
    }
    public Set getPessoas() {
        return this.pessoas;
    }
    
    public void setPessoas(Set pessoas) {
        this.pessoas = pessoas;
    }




}


