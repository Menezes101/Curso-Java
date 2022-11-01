package Exercicio3;

import java.time.LocalDate;

public class Enfermeiro extends Funcionario{
   private String cip;
   private boolean chefeSetor;

   public Enfermeiro(int matricula, String nome, String cpf, String email, String telefone, LocalDate dataContratacao,
      double salario, String cip, boolean chefeSetor){
      super(matricula, nome, cpf, email, telefone, dataContratacao, salario);
      this.cip = cip;
      this.chefeSetor = chefeSetor;
   }

   public String getCip(){
      return cip;
   }
   public void setCip(String cip){
      this.cip = cip;
   }
   public boolean isChefeSetor(){
      return chefeSetor;
   }
   public void setChefeSetor(boolean chefeSetor){
      this.chefeSetor = chefeSetor;
   }
   
   @Override
   public void imprimir(){
      super.imprimir();
      System.out.println("\nCIP: " +cip+ "\nChefe do setor: " +chefeSetor);
   }
}
