package Exercicio3;

import java.time.LocalDate;
import java.util.ArrayList;

public class Principal{
   public static void main(String[] args){
      Funcionario f1 = new Medico(131, "Rogerio Ceni", "13110560191", "13110560191", "11975570881", LocalDate.of(2020, 04, 29), 200000, "51043", "Cardiologista");
      Funcionario f2 = new Enfermeiro(123, "Jorge Jesus", "52859840842", "jjdamarcia@gmail.com", "11957830912", LocalDate.of(2018, 06, 13), 800000, "112349", false);

      ArrayList<Funcionario> funcionarios = new ArrayList<>();
      Hospital hospital = new Hospital("Albert Einstein", "Av. Albert Einstein, 627/701 - Morumbi", funcionarios);
        
      hospital.adicionarFuncionario(f1);
      hospital.adicionarFuncionario(f2);
      hospital.excluirFuncionario(123);
      hospital.exibirTodosFuncionarios();
      hospital.exibirFuncionariosAnoContrato(2018);
      hospital.imprimir();
   }
}
