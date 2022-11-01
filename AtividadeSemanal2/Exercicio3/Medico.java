package Exercicio3;

import java.time.LocalDate;

public class Medico extends Funcionario{
   private String crm;
   private String especialidade;

   public Medico(int matricula, String nome, String cpf, String email, String telefone, LocalDate dataContratacao,
      double salario, String crm, String especialidade){
      super(matricula, nome, cpf, email, telefone, dataContratacao, salario);
      this.crm = crm;
      this.especialidade = especialidade;
   }
   public String getCrm(){
      return crm;
   }
   public void setCrm(String crm){
      this.crm = crm;
   }
   public String getEspecialidade(){
      return especialidade;
   }
   public void setEspecialidade(String especialidade){
      this.especialidade = especialidade;
   }
   
   @Override
   public void imprimir(){
      super.imprimir();
      System.out.println("\nCRM: " +crm+ "\nEspecialidade: " +especialidade);
   }
}
