package AtividadeSemanal1;

public class Notebook extends Item{
   protected String modelo;
   protected String marca;
   protected String processador;
   
   public String getModelo(){
      return modelo;
   }
   public void setModelo(String modelo){
      this.modelo = modelo;
   }
   public String getMarca(){
      return marca;
   }
   public void setMarca(String marca){
      this.marca = marca;
   }
   public String getProcessador(){
      return processador;
   }
   public void setProcessador(String processador){
      this.processador = processador;
   }

   public Notebook(int codigoItem, String modelo, String marca, String processador){
      super(codigoItem);
      this.modelo = modelo;
      this.marca = marca;
      this.processador = processador;
   }

   public void exibir(){
      System.out.println("--Notebook--");
      System.out.println("Modelo: " +modelo);
      System.out.println("Marca: " +marca);
      System.out.println("Processador: " +processador);
   }
}
