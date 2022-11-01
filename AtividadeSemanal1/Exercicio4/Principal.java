package Exercicio4;

import java.util.ArrayList;

public class Principal{
   public static void main(String[] args){
      Professor p1 = new Professor(01, "Bruno Corinthiano", "Bacharel", "1899971-0976", "brunaocorinthiano@gmail.com",
      18090.90);
      Professor p2 = new Professor(04, "Matheus Nazaro", "Mestre", "1899121-7441", "matheusorelhadeporco@gmail.com",
      1280.67);
      
      ArrayList<Professor> professores = new ArrayList<>();
      Departamento d1 = new Departamento("Departamento de Computacao", "4002-8922", "computa.unesp@unesp.br", professores);

      d1.adicionarProfessor(p1);
      d1.adicionarProfessor(p2);
      d1.imprime();
      d1.excluirProfessor(01);
      d1.buscaProfessor(01);
   }
}
