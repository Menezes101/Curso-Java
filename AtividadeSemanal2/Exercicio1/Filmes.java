package Exercicio1;

abstract class Filmes{
   private String titulo;
   private String genero;
   private int anoLancamento;
   private String tempoDuracao;
   private String diretor;

   public Filmes(){

   }
   public Filmes(String titulo, String genero, int anoLancamento, String tempoDuracao, String diretor){
      this.titulo = titulo;
      this.genero = genero;
      this.anoLancamento = anoLancamento;
      this.tempoDuracao = tempoDuracao;
      this.diretor = diretor;
   }
   
   public String getTitulo(){
      return titulo;
   }
   public void setTitulo(String titulo){
      this.titulo = titulo;
   }
   public String getGenero(){
      return genero;
   }
   public void setGenero(String genero){
      this.genero = genero;
   }
   public int getAnoLancamento(){
      return anoLancamento;
   }
   public void setAnoLancamento(int anoLancamento){
      this.anoLancamento = anoLancamento;
   }
   public String getTempoDuracao(){
      return tempoDuracao;
   }
   public void setTempoDuracao(String tempoDuracao){
      this.tempoDuracao = tempoDuracao;
   }
   public String getDiretor(){
      return diretor;
   }
   public void setDiretor(String diretor){
      this.diretor = diretor;
   }
   
   public void imprimir(){
      System.out.println("\nTitulo: " +titulo+ "\nGenero: " +genero+ "\nAno de lancamento: "
       +anoLancamento+ "\nTempo de duracao: " +tempoDuracao+ "\nDiretor:" +diretor);
   }  
}
