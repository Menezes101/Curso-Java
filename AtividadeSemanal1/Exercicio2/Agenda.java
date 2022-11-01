package Exercicio2;

import java.util.ArrayList;

public class Agenda{
   private ArrayList<Pessoa> Contatos = new ArrayList<>();

   public Agenda(){
      
   }

   public ArrayList<Pessoa> getContatos(){
      return Contatos;
   }
   public void setContatos(ArrayList<Pessoa> contatos){
      Contatos = contatos;
   }

   public void adicionarContato(Pessoa contato){
      Contatos.add(contato);
   }
   public void excluirContato(String nome){
      for(int i = 0; i < Contatos.size(); i++){
         if(this.Contatos.get(i).getNome() == nome){
            Contatos.remove(i);
         }else{
            System.out.println("Contato invalido!");
         }
      }
   }
   public boolean buscarContato(String nome){
      boolean encontrado = false;
      for(int i = 0; i < Contatos.size(); i++){
         if(this.Contatos.get(i).getNome() == nome){
            encontrado = true;
         }    
      }
      return encontrado;
   }
   public void imprime(){
      for(Pessoa p : Contatos){
         p.imprime();
      }
   }
}
