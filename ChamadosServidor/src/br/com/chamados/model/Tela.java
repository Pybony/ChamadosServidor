package br.com.chamados.model;
// Generated 30/08/2015 21:21:25 by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Tela generated by hbm2java
 */
@Entity
@Table(name="tela"
    ,catalog="chamados"
)
public class Tela  implements java.io.Serializable {


     private int id;
     private String descricao;
     private Set funcionarioHasTelas = new HashSet(0);

    public Tela() {
    }

	
    public Tela(int id) {
        this.id = id;
    }
    public Tela(int id, String descricao, Set funcionarioHasTelas) {
       this.id = id;
       this.descricao = descricao;
       this.funcionarioHasTelas = funcionarioHasTelas;
    }
   
     @Id 

    
    @Column(name="id", unique=true, nullable=false)
    public int getId() {
        return this.id;
    }
    
    public void setId(int id) {
        this.id = id;
    }

    
    @Column(name="descricao", length=45)
    public String getDescricao() {
        return this.descricao;
    }
    
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="tela")
    public Set getFuncionarioHasTelas() {
        return this.funcionarioHasTelas;
    }
    
    public void setFuncionarioHasTelas(Set funcionarioHasTelas) {
        this.funcionarioHasTelas = funcionarioHasTelas;
    }




}


