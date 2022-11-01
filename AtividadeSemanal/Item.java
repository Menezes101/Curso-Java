package AtividadeSemanal1;

public abstract class Item{
   protected int codigoItem;
   protected Boolean estaEmprestado;
   
   public int getCodigoItem(){
      return codigoItem;
   }
   public void setCodigoItem(int codigoItem){
      if(codigoItem > 0){
         this.codigoItem = codigoItem;
      }else{
         this.codigoItem = -1;
      }
   }
   public Boolean getEstaEmprestado(){
      return estaEmprestado;
   }
   public void setEstaEmprestado(Boolean estaEmprestado){
      this.estaEmprestado = estaEmprestado;
   }

   public Item(int codigoItem){
      this.codigoItem = codigoItem;
      this.estaEmprestado = false;
   }
}
