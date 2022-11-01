package AtividadeSemanal1;

public class Aluno extends Usuario{
   protected String curso;
   protected int ano;

   public String getCurso(){
      return curso;
   }
   public void setCurso(String curso){
      this.curso = curso;
   }
   public int getAno(){
      return ano;
   }
   public void setAno(int ano){
      this.ano = ano;
   }

   @Override
   public String toString(){
      return super.toString()+" Curso: "+curso+"\n Ano: "+ano;
   }
   
   public Aluno(String curso, int ano, int codigoUsuario, String nome, String cpf, String email){
      super(codigoUsuario, nome, cpf, email);
      this.curso = curso;
      this.ano = ano;
   }
}
