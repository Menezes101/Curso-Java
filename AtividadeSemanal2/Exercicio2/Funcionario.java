package Exercicio2;

public class Funcionario{
   private int matricula;
   private String nome;
   private String telefone;
   private String email;
   private double salario;

   public Funcionario(int matricula, String nome, String telefone, String email, double salario){
      this.matricula = matricula;
      this.nome = nome;
      this.telefone = telefone;
      this.email = email;
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
   public String getTelefone(){
      return telefone;
   }
   public void setTelefone(String telefone){
      this.telefone = telefone;
   }
   public String getEmail(){
      return email;
   }
   public void setEmail(String email){
      this.email = email;
   }
   public double getSalario(){
      return salario;
   }
   public void setSalario(double salario){
      this.salario = salario;
   }
   
   public void imprimir(){
      System.out.println("\nMatricula: " +matricula+ "\nNome: " +nome+ "\nTelefone: " +telefone+ "\nE-mail: " +email+ "\nSalario: " +salario);
   }
}
