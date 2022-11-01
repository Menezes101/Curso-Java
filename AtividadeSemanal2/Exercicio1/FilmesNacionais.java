package Exercicio1;

public class FilmesNacionais extends Filmes{
   private boolean investimentoGoverno;

   public FilmesNacionais(){
   
   }
   public FilmesNacionais(String titulo, String genero, int anoLancamento, String tempoDuracao, String diretor,
      boolean investimentoGoverno){
      super(titulo, genero, anoLancamento, tempoDuracao, diretor);
      this.investimentoGoverno = investimentoGoverno;
   }

   public boolean isInvestimentoGoverno(){
      return investimentoGoverno;
   }
   public void setInvestimentoGoverno(boolean investimentoGoverno){
      this.investimentoGoverno = investimentoGoverno;
   }
   
   @Override
   public void imprimir(){
      super.imprimir();
      System.out.println("Investimento do governo: " +(investimentoGoverno ? "Sim\n" : "Nao\n" ));
   }
}
