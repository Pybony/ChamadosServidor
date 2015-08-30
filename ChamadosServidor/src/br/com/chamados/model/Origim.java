package br.com.chamados.model;
// Generated 24/08/2015 20:26:41 by Hibernate Tools 4.3.1


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Origim generated by hbm2java
 */
@Entity
@Table(name="origim"
    ,catalog="chamados"
)
public class Origim  implements java.io.Serializable {


     private int id;
     private String descricao;

    public Origim() {
    }

    public Origim(int id, String descricao) {
       this.id = id;
       this.descricao = descricao;
    }
   
     @Id 

    
    @Column(name="id", unique=true, nullable=false)
    public int getId() {
        return this.id;
    }
    
    public void setId(int id) {
        this.id = id;
    }

    
    @Column(name="descricao", nullable=false, length=45)
    public String getDescricao() {
        return this.descricao;
    }
    
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }




}


