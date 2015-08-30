package br.com.chamados.model;
// Generated 24/08/2015 20:26:41 by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Situacao generated by hbm2java
 */
@Entity
@Table(name="situacao"
    ,catalog="chamados"
)
public class Situacao  implements java.io.Serializable {


     private int id;
     private String descricao;
     private Set chamados = new HashSet(0);

    public Situacao() {
    }

	
    public Situacao(int id) {
        this.id = id;
    }
    public Situacao(int id, String descricao, Set chamados) {
       this.id = id;
       this.descricao = descricao;
       this.chamados = chamados;
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

@OneToMany(fetch=FetchType.LAZY, mappedBy="situacao")
    public Set getChamados() {
        return this.chamados;
    }
    
    public void setChamados(Set chamados) {
        this.chamados = chamados;
    }




}


