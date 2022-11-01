package Exercicio2;

public class Principal{
   public static void main(String[] args){
      Pessoa p1 = new Pessoa("Gabriel Menezes Tiburcio", "11975570881", "gabriel.m.tiburcio@hotmail.com", "Rua Joao Goncalves Foz, 1800\n\n");
      Pessoa p2 = new Pessoa("Matheus Augusto Nazaro", "18991707174", "matheusorelhadeporco@gmail.com", "Rua Hortencia, 179\n\n");
      Pessoa p3 = new Pessoa("Lucas Vinicius de Carvalho Ikeda", "18996895151", "lucasikeda@gmail.com", "Rua Castro Alvez, 992\n\n");
      
      Agenda c1 = new Agenda();


      c1.adicionarContato(p1);
      c1.adicionarContato(p2);
      c1.adicionarContato(p3);
      c1.imprime();
      if(c1.buscarContato("Lucas Vinicius de Carvalho Ikeda") == true){
         System.out.println("Contato encontrado!");
      }else{
         System.out.println("Contato nao existente!");
      }
      c1.excluirContato("Lucas Vinicius de Carvalho Ikeda");
   }  

}
