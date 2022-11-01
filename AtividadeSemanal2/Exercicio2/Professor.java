package Exercicio2;

public class Professor extends Funcionario{
   
   private String titulacao;
   private int quantidadePublicacao;
   private String linkCurriculo;

   public Professor(int matricula, String nome, String telefone, String email, double salario, String titulacao,
      int quantidadePublicacao, String linkCurriculo){
      super(matricula, nome, telefone, email, salario);
      this.titulacao = titulacao;
      this.quantidadePublicacao = quantidadePublicacao;
      this.linkCurriculo = linkCurriculo;
   }

   public String getTitulacao(){
      return titulacao;
   }
   public void setTitulacao(String titulacao){
      this.titulacao = titulacao;
   }
   public int getQuantidadePublicacao(){
      return quantidadePublicacao;
   }
   public void setQuantidadePublicacao(int quantidadePublicacao){
      this.quantidadePublicacao = quantidadePublicacao;
   }
   public String getLinkCurriculo(){
      return linkCurriculo;
   }
   public void setLinkCurriculo(String linkCurriculo){
      this.linkCurriculo = linkCurriculo;
   }

   @Override
   public void imprimir(){
      super.imprimir();
      System.out.println("\nTitulacao: " +titulacao+ "\nQuantidade de publicacoes: " +quantidadePublicacao+ "\nLink do curriculo: " +linkCurriculo);
   }
}
