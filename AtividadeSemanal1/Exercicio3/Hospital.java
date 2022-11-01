package Exercicio3;

import java.util.ArrayList;

public class Hospital{
   private String nome;
   private String endereco;
   private ArrayList<Medico> medicosContratados = new ArrayList<>();
   
   public Hospital(){
      
   }
   public Hospital(String nome, String endereco, ArrayList<Medico> medicosContratados){
      this.nome = nome;
      this.endereco = endereco;
      this.medicosContratados = medicosContratados;
   }

   public String getNome(){
      return nome;
   }
   public void setNome(String nome){
      this.nome = nome;
   }
   public String getEndereco(){
      return endereco;
   }
   public void setEndereco(String endereco){
      this.endereco = endereco;
   }
   public ArrayList<Medico> getMedicosContratados(){
      return medicosContratados;
   }
   public void setMedicosContratados(ArrayList<Medico> medicosContratados){
      this.medicosContratados = medicosContratados;
   }

   public void adicionarMedico(Medico medico){
      medicosContratados.add(medico); 
   }
   public void excluirMedico(String CRM){
      boolean medicoEncontrado = false;
      for(int i = 0; i < medicosContratados.size(); i++){
         if(this.medicosContratados.get(i).getCRM() == CRM){
            medicoEncontrado = true;
            medicosContratados.remove(i);
            System.out.println("O medico " +medicosContratados.get(i).getNome() + " foi removido!");
         }
      }      
      if(medicoEncontrado == false) System.out.println("O medico com o CRM: " + CRM + " nao foi encontrado!");
   }
   public void exibirMedicosAnoContrato(int ano){
      System.out.println("\nFuncionarios contratados a partir do ano " +ano+ ":");
      for(int i = 0; i < medicosContratados.size(); i++){
         if(medicosContratados.get(i).getDataContratacao().getYear() >= ano){
            System.out.println(medicosContratados.get(i).getNome() + "\n");
         }  
      }
   }
   public void imprime(){
      for(Medico m : medicosContratados){
         m.imprime();
      }
   }   
}
