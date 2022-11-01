package AtividadeSemanal1;

public class Livro extends Item{
   protected String nome;
   protected String editora;
   
   public String getNome(){
      return nome;
   }
   public void setNome(String nome){
      this.nome = nome;
   }
   public String getEditora(){
      return editora;
   }
   public void setEditora(String editora){
      this.editora = editora;
   }

   public Livro(String nome, String editora, int codigoItem){
      super(codigoItem);
      this.nome = nome;
      this.editora = editora;
      setEstaEmprestado(estaEmprestado);
   }

   public void exibir(){
      System.out.println("--Livro--");
      System.out.println("Código: " +codigoItem);
      System.out.println("Nome: " +nome);
      System.out.println("Editora: " +editora);
   }
}
