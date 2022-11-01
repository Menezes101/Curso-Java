package Exercicio4;

import java.util.ArrayList;

public class Departamento{
   private String nome; 
   private String telefone;
   private String email;
   private ArrayList<Professor> professores = new ArrayList<>();
   ;

   public Departamento(){

   }
   public Departamento(String nome, String telefone, String email, ArrayList<Professor> professores){
      this.nome = nome;
      this.telefone = telefone;
      this.email = email;
      this.professores = professores;
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
   public ArrayList<Professor> getProfessores(){
      return professores;
   }
   public void setProfessores(ArrayList<Professor> professores){
      this.professores = professores;
   }
   
   public void adicionarProfessor(Professor professor){
      professores.add(professor);
   }
   public boolean buscaProfessor(int matricula){
      for(int i = 0; i < professores.size(); i++){
         if(this.professores.get(i).getMatricula() == matricula){
            System.out.println("\nO professor e da instituicao!\n");
            return true;
         }else{
            System.out.println("\nO professor nao pertence a instituicao!\n");
         }
      }
      return true;
   }
   public void excluirProfessor(int matricula){
      for(int i = 0; i < professores.size(); i++){
         if(this.professores.get(i).getMatricula() == matricula){
            professores.remove(i);
            System.out.println("\nProfessor nao pertence mais a instituicao!");
         }else{
            System.out.println("Professor nao encontrado!");
         }
      }      
   }
   public void imprime(){
      for(Professor p : professores){
         p.imprime();
      }
   }
}
