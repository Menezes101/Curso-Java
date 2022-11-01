package Exercicio1;

public class FilmesInternacionais extends Filmes{
   private double taxaImposto;

   public FilmesInternacionais(String titulo, String genero, int anoLancamento, String tempoDuracao, String diretor,
         double taxaImposto){
      super(titulo, genero, anoLancamento, tempoDuracao, diretor);
      this.taxaImposto = taxaImposto;
   }

   public double getTaxaImposto(){
      return taxaImposto;
   }
   public void setTaxaImposto(double taxaImposto){
      this.taxaImposto = taxaImposto;
   }
   
   @Override
   public void imprimir(){
      super.imprimir();
      System.out.println("Taxa de imposto: " +taxaImposto);
   }
}
