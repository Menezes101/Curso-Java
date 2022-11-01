package Exercicio3;

import java.time.LocalDate;
import java.util.ArrayList;

public class Principal{
   public static void main(String[] args){
      Medico m1 = new Medico("234.567", "Cleiton Rasta", "Neurocirurgiao", "cabecadegelo@gmail.com", LocalDate.of(2020, 9, 11), 21760.97f);
      Medico m2 = new Medico("743.891", "Welington Rato", "Pediatra", "ratowelington@gmail.com", LocalDate.of(2021, 02, 21), 4356.80f);
      
      ArrayList<Medico> medicosContratados = new ArrayList<>();
      Hospital h1 = new Hospital("Hospital Que Salva", "Rua Claudia Raia, 25", medicosContratados);

      h1.adicionarMedico(m1);
      h1.adicionarMedico(m2);
      h1.imprime();
      h1.exibirMedicosAnoContrato(2020);
      h1.excluirMedico("234.567");
   }  
}