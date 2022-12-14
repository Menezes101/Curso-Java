package Exercicio2;

public class Pessoa{
   private String nome;
   private String telefone; 
   private String email;
   private String endereco;
   
   public Pessoa(){
       
   }
   public Pessoa(String nome, String telefone, String email, String endereco){
       this.nome = nome;
       this.telefone = telefone;
       this.email = email;
       this.endereco = endereco;
   }
   
   public String getNome(){
       return this.nome;
   }
   public void setNome(String nome){
       this.nome = nome;
   }
   public String getTelefone(){
       return this.telefone;
   }
   public void setTelefone(String telefone){
       this.telefone = telefone;
   }
   public String getEmail(){
       return this.email;
   }
   public void setEmail(String email){
       this.email = email;
   }
   public String getEndereco(){
       return this.endereco;
   }
   public void setEndereco(String endereco){
       this.endereco = endereco;
   }
   
   public void imprime(){
       System.out.println("Nome: \n" +this.nome+ "\nTelefone: \n" +this.telefone+
       "\nE-mail: \n" +this.email+ "\nEndereco: \n" +this.endereco);
   }
}
