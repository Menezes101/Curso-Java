package Exercicio1;

public class Principal{
   public static void main(String[] args){
      Veiculo v1 = new Veiculo("Opala", "Chevrolet", 1978, 1978, "Vermelho-calcinha", "M1T0RO6", 100f, true);
      Veiculo v2 = new Veiculo("HB20", "Hyundai", 2022, 2022, "Branco", "MJW32M1", 2452.75f, false);

      v1.imprime();
      v1.pagarIpva();
      v1.atualizarValorIPVA(2f);
      
      v2.imprime();
      v2.atualizarValorIPVA(2f);
      v2.pagarIpva();
   }
}
