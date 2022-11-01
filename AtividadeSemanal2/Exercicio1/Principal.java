package Exercicio1;

import java.util.ArrayList;

public class Principal{
   public static void main(String[] args){
      Filmes f1 = new FilmesNacionais("Cidade de Deus", "Ação, drama, suspense", 2002, "2h 10m",
       "Katia Lund e Fernando Meirellles", true);
      Filmes f2 = new FilmesNacionais("Tropa de Elite", "Acao", 2007, "1h 55m",
       "Jose Padilha", true);
      Filmes f3 = new FilmesInternacionais("Velozes e Furiosos", "Acao", 2001, "1h 46m",
       "Rob Cohen", 12240745.98);
      
      ArrayList<Filmes> filmes = new ArrayList<>();
      AcervoDigital a1 = new AcervoDigital("Filmao", "www.filmao.com.br", "sac.filmao@gmail.com", filmes);

      a1.adicionarFilme(f1);
      a1.adicionarFilme(f2); 
      a1.adicionarFilme(f3);
      a1.imprimir();
      a1.buscarFilme("uma noite no museu");
      a1.excluirFilme("Cidade de Deus");
   }
}
