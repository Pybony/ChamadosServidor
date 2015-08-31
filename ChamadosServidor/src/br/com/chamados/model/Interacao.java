package br.com.chamados.model;
// Generated 30/08/2015 21:21:25 by Hibernate Tools 4.3.1


import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Interacao generated by hbm2java
 */
@Entity
@Table(name="interacao"
    ,catalog="chamados"
)
public class Interacao  implements java.io.Serializable {


     private Integer id;
     private Acompanhamento acompanhamento;
     private Chamado chamado;
     private String descricao;
     private Date data;
     private Integer autorId;
     private Character tipoAutor;
     private Boolean solucao;
     private Boolean privado;
     private Boolean email;

    public Interacao() {
    }

	
    public Interacao(Acompanhamento acompanhamento, Chamado chamado, String descricao, Date data) {
        this.acompanhamento = acompanhamento;
        this.chamado = chamado;
        this.descricao = descricao;
        this.data = data;
    }
    public Interacao(Acompanhamento acompanhamento, Chamado chamado, String descricao, Date data, Integer autorId, Character tipoAutor, Boolean solucao, Boolean privado, Boolean email) {
       this.acompanhamento = acompanhamento;
       this.chamado = chamado;
       this.descricao = descricao;
       this.data = data;
       this.autorId = autorId;
       this.tipoAutor = tipoAutor;
       this.solucao = solucao;
       this.privado = privado;
       this.email = email;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)

    
    @Column(name="id", unique=true, nullable=false)
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="acompanhamento_id", nullable=false)
    public Acompanhamento getAcompanhamento() {
        return this.acompanhamento;
    }
    
    public void setAcompanhamento(Acompanhamento acompanhamento) {
        this.acompanhamento = acompanhamento;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="chamado_id", nullable=false)
    public Chamado getChamado() {
        return this.chamado;
    }
    
    public void setChamado(Chamado chamado) {
        this.chamado = chamado;
    }

    
    @Column(name="descricao", nullable=false, length=45)
    public String getDescricao() {
        return this.descricao;
    }
    
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="data", nullable=false, length=0)
    public Date getData() {
        return this.data;
    }
    
    public void setData(Date data) {
        this.data = data;
    }

    
    @Column(name="autor_id")
    public Integer getAutorId() {
        return this.autorId;
    }
    
    public void setAutorId(Integer autorId) {
        this.autorId = autorId;
    }

    
    @Column(name="tipoAutor", length=1)
    public Character getTipoAutor() {
        return this.tipoAutor;
    }
    
    public void setTipoAutor(Character tipoAutor) {
        this.tipoAutor = tipoAutor;
    }

    
    @Column(name="solucao")
    public Boolean getSolucao() {
        return this.solucao;
    }
    
    public void setSolucao(Boolean solucao) {
        this.solucao = solucao;
    }

    
    @Column(name="privado")
    public Boolean getPrivado() {
        return this.privado;
    }
    
    public void setPrivado(Boolean privado) {
        this.privado = privado;
    }

    
    @Column(name="email")
    public Boolean getEmail() {
        return this.email;
    }
    
    public void setEmail(Boolean email) {
        this.email = email;
    }




}


