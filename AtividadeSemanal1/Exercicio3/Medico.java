package Exercicio3;

import java.time.LocalDate;

public class Medico{
   private String CRM;
   private String nome;
   private String especialidade;
   private String email;
   private LocalDate dataContratacao;
   private float salario;

   public Medico(){
   
   }
   public Medico(String cRM, String nome, String especialidade, String email, LocalDate dataContratacao,
         float salario){
      CRM = cRM;
      this.nome = nome;
      this.especialidade = especialidade;
      this.email = email;
      this.dataContratacao = dataContratacao;
      this.salario = salario;
   }
   public String getCRM(){
      return CRM;
   }
   public void setCRM(String cRM){
      CRM = cRM;
   }
   public String getNome(){
      return nome;
   }
   public void setNome(String nome){
      this.nome = nome;
   }
   public String getEspecialidade(){
      return especialidade;
   }
   public void setEspecialidade(String especialidade){
      this.especialidade = especialidade;
   }
   public String getEmail(){
      return email;
   }
   public void setEmail(String email){
      this.email = email;
   }
   public LocalDate getDataContratacao(){
      return dataContratacao;
   }
   public void setDataContratacao(LocalDate dataContratacao){
      this.dataContratacao = dataContratacao;
   }
   public float getSalario(){
      return salario;
   }
   public void setSalario(float salario){
      this.salario = salario;
   }

   public void imprime(){
      System.out.println("\nCRM: " +this.CRM+ "\nNome: " +this.nome+ "\nEspecialidade: " +this.especialidade+ 
      "\nE-mail: " +this.email+ "\nData de contratacao: " +this.dataContratacao+ "\nSalario: " +this.salario);
   }
}
