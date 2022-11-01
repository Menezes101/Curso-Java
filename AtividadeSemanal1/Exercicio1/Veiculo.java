package Exercicio1;

public class Veiculo{
   private String nome;
   private String montadora;
   private int anoFabricacao;
   private int anoModelo;
   private String cor;
   private String placa;
   private float valorIpva;
   private boolean ipvaPago;
   
   public Veiculo(String nome, String montadora, int anoFabricacao, int anoModelo, String cor, String placa,
         float valorIpva, boolean ipvaPago){
      this.nome = nome;
      this.montadora = montadora;
      this.anoFabricacao = anoFabricacao;
      this.anoModelo = anoModelo;
      this.cor = cor;
      this.placa = placa;
      this.valorIpva = valorIpva;
      this.ipvaPago = ipvaPago;
   }

   public String getNome(){
      return nome;
   }
   public void setNome(String nome){
      this.nome = nome;
   }
   public String getMontadora(){
      return montadora;
   }
   public void setMontadora(String montadora){
      this.montadora = montadora;
   }
   public int getAnoFabricacao(){
      return anoFabricacao;
   }
   public void setAnoFabricacao(int anoFabricacao){
      this.anoFabricacao = anoFabricacao;
   }
   public int getAnoModelo(){
      return anoModelo;
   }
   public void setAnoModelo(int anoModelo){
      this.anoModelo = anoModelo;
   }
   public String getCor(){
      return cor;
   }
   public void setCor(String cor){
      this.cor = cor;
   }
   public String getPlaca(){
      return placa;
   }
   public void setPlaca(String placa){
      this.placa = placa;
   }
   public float getValorIpva(){
      return valorIpva;
   }
   public void setValorIpva(float valorIpva){
      this.valorIpva = valorIpva;
   }
   public boolean getIpvaPago(){
      return ipvaPago;
   }
   public void setIpvaPago(boolean ipvaPago){
      this.ipvaPago = ipvaPago;
   }

   public boolean verificarStatusIPVA(){
      return ipvaPago;
   }
   public void pagarIpva(){
      if(ipvaPago == true){
         System.out.println("\nO IPVA foi pago com sucesso!");
      }else{
      System.out.println("\nO IPVA nao foi pago, realize o pagamento!");
      }
   }
   public void atualizarValorIPVA(float reajuste){
      this.valorIpva = this.valorIpva + (this.valorIpva * reajuste) / 100;
      System.out.println("\nO valor do IPVA atualizado e de " +this.valorIpva);
   }
   public void imprime(){
      System.out.println("\nNome: " +this.nome+ "\nMontadora: " +this.montadora+ "\nAno de fabricacao: " +this.anoFabricacao+
      "\nAno do modelo: " +this.anoModelo+ "\nCor: " +this.cor+ "\nPlaca: " +this.placa+ "\nValor do IPVA: " +this.valorIpva);
   }
}
