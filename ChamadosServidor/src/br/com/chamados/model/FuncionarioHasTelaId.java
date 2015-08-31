package br.com.chamados.model;
// Generated 30/08/2015 21:21:25 by Hibernate Tools 4.3.1


import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * FuncionarioHasTelaId generated by hbm2java
 */
@Embeddable
public class FuncionarioHasTelaId  implements java.io.Serializable {


     private int funcionarioId;
     private int telaId;

    public FuncionarioHasTelaId() {
    }

    public FuncionarioHasTelaId(int funcionarioId, int telaId) {
       this.funcionarioId = funcionarioId;
       this.telaId = telaId;
    }
   


    @Column(name="funcionario_id", nullable=false)
    public int getFuncionarioId() {
        return this.funcionarioId;
    }
    
    public void setFuncionarioId(int funcionarioId) {
        this.funcionarioId = funcionarioId;
    }


    @Column(name="tela_id", nullable=false)
    public int getTelaId() {
        return this.telaId;
    }
    
    public void setTelaId(int telaId) {
        this.telaId = telaId;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof FuncionarioHasTelaId) ) return false;
		 FuncionarioHasTelaId castOther = ( FuncionarioHasTelaId ) other; 
         
		 return (this.getFuncionarioId()==castOther.getFuncionarioId())
 && (this.getTelaId()==castOther.getTelaId());
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + this.getFuncionarioId();
         result = 37 * result + this.getTelaId();
         return result;
   }   


}


