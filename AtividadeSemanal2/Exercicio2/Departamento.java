package Exercicio2;

import java.util.ArrayList;

public class Departamento{
   private String nome;
   private String telefone;
   private String email;
   private ArrayList<Funcionario> funcionarios = new ArrayList<>();

   public Departamento(String nome, String telefone, String email){
      this.nome = nome;
      this.telefone = telefone;
      this.email = email;
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
   public ArrayList<Funcionario> getFuncionarios(){
      return funcionarios;
   }
   public void setFuncionarios(ArrayList<Funcionario> funcionarios){
      this.funcionarios = funcionarios;
   }

   public void adicionarFuncionario(Funcionario funcionario){
      funcionarios.add(funcionario);
   }
   public boolean buscarFuncionario(int matricula){
      for(Funcionario funcionarioEncontrado : funcionarios){
         if(funcionarioEncontrado.getMatricula() == matricula){
            return true;
         }
      }
      System.out.println("\nO funcionario pesquisado nao foi encontrado!");
      return false;
   }
   public void excluirFuncionario(int matricula){
      if(buscarFuncionario(matricula)){
         for(Funcionario funcionarioEncontrado : funcionarios){
            if(funcionarioEncontrado.getMatricula() == matricula){
               System.out.println("\nO funcionario " +funcionarioEncontrado.getNome()+ " foi removido com sucesso!");
               break;
            }
         }
      }
   }
   public void imprimir(){
      System.out.println("\nNome: " +nome+ "\nTelefone: " +telefone+ "\nE-mail: " +email);
      for(Funcionario funcionarioEncontrado : funcionarios){
         funcionarioEncontrado.imprimir();
      }
   }
}
