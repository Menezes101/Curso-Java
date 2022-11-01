package Exercicio2;

public class Principal{
   public static void main(String[] args){
      Professor p1 = new Professor(01,"Alberto Valentim", "11987409002", "valentimdascasadas@gmail.com",
       280000, "Tecnico", 0, "Valentimdascasadas");
      Professor p2 = new Professor(666,"Abel Ferreira", "11910065100", "abelprofessor@gmail.com",
       600000, "Mestre", 4, "Abelprofessor");  
      Secretario s1 = new Secretario(02, "Lucas Ikeda", "18996895151", "ikedovisk@gmail.com",
       7500, true);

      Departamento d1 = new Departamento("Departamento do Futebol", "40028922", "departamentodofut@gmail.com.br");
      d1.adicionarFuncionario(s1);
      d1.adicionarFuncionario(p1);
      d1.adicionarFuncionario(p2);
      d1.buscarFuncionario(666);
      d1.imprimir();
      d1.excluirFuncionario(01);
   }
}
