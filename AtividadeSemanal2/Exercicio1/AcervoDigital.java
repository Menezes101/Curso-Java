package Exercicio1;

import java.util.ArrayList;

public class AcervoDigital{
   private String nome;
   private String site;
   private String email;
   private ArrayList<Filmes> filmes = new ArrayList<>();

   public AcervoDigital(String nome, String site, String email, ArrayList<Filmes> filmes){
      this.nome = nome;
      this.site = site;
      this.email = email;
      this.filmes = filmes;
   }

   public String getNome(){
      return nome;
   }
   public void setNome(String nome){
      this.nome = nome;
   }
   public String getSite(){
      return site;
   }
   public void setSite(String site){
      this.site = site;
   }
   public String getEmail(){
      return email;
   }
   public void setEmail(String email){
      this.email = email;
   }
   public ArrayList<Filmes> getFilmes(){
      return filmes;
   }
   public void setFilmes(ArrayList<Filmes> filmes){
      this.filmes = filmes;
   }

   public void adicionarFilme(Filmes filme){
      filmes.add(filme);
   }
   public boolean buscarFilme(String titulo){
      for(Filmes filmeEncontrado : filmes){
         if(filmeEncontrado.getTitulo().equalsIgnoreCase(titulo)){
            return true;
         }
      }
      System.out.println("\nO filme procurado nao foi encontrado no acervo");
      return false;
   }
   public void excluirFilme(String titulo){
      if(buscarFilme(titulo)){
         for(Filmes filmeEncontrado : filmes){
            if(filmeEncontrado.getTitulo() == titulo){
               filmes.remove(filmeEncontrado);
               System.out.println("\n" +filmeEncontrado.getTitulo()+ " foi removido com sucesso!\n");
               break;
            }
         }
      }else{
         System.out.println("\nFilme nao encontrado no acervo");
      }
   }
   public void imprimir(){
      System.out.println("\nAcervo: " +nome+ "\n\nSite: " +site+ "\nE-mail: " +email);
      for(Filmes filmeEncontrado : filmes){
         filmeEncontrado.imprimir();
      }
   }
}
