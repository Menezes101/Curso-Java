package AtividadeSemanal1;

public class Professor extends Usuario{
   protected String titulacao;

   public String getTitulacao(){
      return titulacao;
   }

   public void setTitulacao(String titulacao){
      this.titulacao = titulacao;
   }

   @Override
   public String toString(){
      return super.toString()+"\n Titulação: "+titulacao;
   }

   public Professor(String titulacao, int codigoUsuario, String nome, String cpf, String email){
      super(codigoUsuario, nome, cpf, email);
      this.titulacao = titulacao;
   }
}
