package Exercicio3;

import java.time.LocalDate;

public class Funcionario{
   private int matricula;
   private String nome;
   private String cpf;
   private String email;
   private String telefone;
   private LocalDate dataContratacao;
   private double salario;

   public Funcionario(int matricula, String nome, String cpf, String email, String telefone, LocalDate dataContratacao,
      double salario){
      this.matricula = matricula;
      this.nome = nome;
      this.cpf = cpf;
      this.email = email;
      this.telefone = telefone;
      this.dataContratacao = dataContratacao;
      this.salario = salario;
   }

   public int getMatricula(){
      return matricula;
   }
   public void setMatricula(int matricula){
      this.matricula = matricula;
   }
   public String getNome(){
      return nome;
   }
   public void setNome(String nome){
      this.nome = nome;
   }
   public String getCpf(){
      return cpf;
   }
   public void setCpf(String cpf){
      this.cpf = cpf;
   }
   public String getEmail(){
      return email;
   }
   public void setEmail(String email){
      this.email = email;
   }
   public String getTelefone(){
      return telefone;
   }
   public void setTelefone(String telefone){
      this.telefone = telefone;
   }
   public LocalDate getDataContratacao(){
      return dataContratacao;
   }
   public void setDataContratacao(LocalDate dataContratacao){
      this.dataContratacao = dataContratacao;
   }
   public double getSalario(){
      return salario;
   }
   public void setSalario(double salario){
      this.salario = salario;
   }
   
   public void imprimir(){
      System.out.println("\nMatricula: " +matricula+ "\nNome: " +nome+ "\nCPF: " +cpf+ "\nE-mail: " +email+ "\nTelefone: " +telefone+
       "\nData de contratacao: " +dataContratacao+ "\nSalario: " +salario);
   }
}
