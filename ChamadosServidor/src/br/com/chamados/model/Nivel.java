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
 * Nivel generated by hbm2java
 */
@Entity
@Table(name="nivel"
    ,catalog="chamados"
)
public class Nivel  implements java.io.Serializable {


     private int id;
     private String descricao;
     private Set funcaos = new HashSet(0);

    public Nivel() {
    }

	
    public Nivel(int id) {
        this.id = id;
    }
    public Nivel(int id, String descricao, Set funcaos) {
       this.id = id;
       this.descricao = descricao;
       this.funcaos = funcaos;
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

@OneToMany(fetch=FetchType.LAZY, mappedBy="nivel")
    public Set getFuncaos() {
        return this.funcaos;
    }
    
    public void setFuncaos(Set funcaos) {
        this.funcaos = funcaos;
    }




}


