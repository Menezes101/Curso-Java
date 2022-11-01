package Exercicio2;

public class Secretario extends Funcionario{
   private boolean chefeSecretaria;

   public Secretario(int matricula, String nome, String telefone, String email, double salario,
       boolean chefeSecretaria){
      super(matricula, nome, telefone, email, salario);
      this.chefeSecretaria = chefeSecretaria;
   }

   public boolean isChefeSecretaria(){
      return chefeSecretaria;
   }
   public void setChefeSecretaria(boolean chefeSecretaria){
      this.chefeSecretaria = chefeSecretaria;
   }
   
   @Override
   public void imprimir(){
      super.imprimir();
      System.out.println("\nChefe da secretaria: " +(chefeSecretaria ? "Sim\n" : "Nao\n"));
   }
}
