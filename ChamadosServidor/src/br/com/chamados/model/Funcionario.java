package br.com.chamados.model;
// Generated 24/08/2015 20:26:41 by Hibernate Tools 4.3.1


import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Funcionario generated by hbm2java
 */
@Entity
@Table(name="funcionario"
    ,catalog="chamados"
)
public class Funcionario  implements java.io.Serializable {


     private Integer id;
     private Funcao funcao;
     private Pessoa pessoa;
     private Date dataAdmicao;
     private String setor;
     private Date dataDesligamento;
     private Set funcionarioHasTelas = new HashSet(0);

    public Funcionario() {
    }

	
    public Funcionario(Funcao funcao, Pessoa pessoa, Date dataAdmicao, String setor) {
        this.funcao = funcao;
        this.pessoa = pessoa;
        this.dataAdmicao = dataAdmicao;
        this.setor = setor;
    }
    public Funcionario(Funcao funcao, Pessoa pessoa, Date dataAdmicao, String setor, Date dataDesligamento, Set funcionarioHasTelas) {
       this.funcao = funcao;
       this.pessoa = pessoa;
       this.dataAdmicao = dataAdmicao;
       this.setor = setor;
       this.dataDesligamento = dataDesligamento;
       this.funcionarioHasTelas = funcionarioHasTelas;
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
    @JoinColumn(name="funcao_id", nullable=false)
    public Funcao getFuncao() {
        return this.funcao;
    }
    
    public void setFuncao(Funcao funcao) {
        this.funcao = funcao;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="pessoa_id", nullable=false)
    public Pessoa getPessoa() {
        return this.pessoa;
    }
    
    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="data_admicao", nullable=false, length=0)
    public Date getDataAdmicao() {
        return this.dataAdmicao;
    }
    
    public void setDataAdmicao(Date dataAdmicao) {
        this.dataAdmicao = dataAdmicao;
    }

    
    @Column(name="setor", nullable=false, length=45)
    public String getSetor() {
        return this.setor;
    }
    
    public void setSetor(String setor) {
        this.setor = setor;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="data_desligamento", length=0)
    public Date getDataDesligamento() {
        return this.dataDesligamento;
    }
    
    public void setDataDesligamento(Date dataDesligamento) {
        this.dataDesligamento = dataDesligamento;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="funcionario")
    public Set getFuncionarioHasTelas() {
        return this.funcionarioHasTelas;
    }
    
    public void setFuncionarioHasTelas(Set funcionarioHasTelas) {
        this.funcionarioHasTelas = funcionarioHasTelas;
    }




}


