package AtividadeSemanal1;

import java.util.Calendar;

public class Emprestimo{
   private int MAX = 4;
   private int codigoEmprestimo;
   private int codigoUsuario;
   private Item[] itensDoEmprestimo;
   private Calendar dataEmprestimo;
   private Calendar dataDevolucao;
   
   public int getCodigoEmprestimo(){
      return codigoEmprestimo;
   }
   public void setCodigoEmprestimo(int codigoEmprestimo){
      this.codigoEmprestimo = codigoEmprestimo;
   }
   public int getCodigoUsuario(){
      return codigoUsuario;
   }
   public void setCodigoUsuario(int codigoUsuario){
      this.codigoUsuario = codigoUsuario;
   }
   public Item[] getItensDoEmprestimo(){
      return itensDoEmprestimo;
   }
   public void setItensDoEmprestimo(Item[] itensDoEmprestimo){
      this.itensDoEmprestimo = itensDoEmprestimo;
   }
   public Calendar getDataEmprestimo(){
      return dataEmprestimo;
   }
   public void setDataEmprestimo(Calendar dataEmprestimo){
      this.dataEmprestimo = dataEmprestimo;
   }
   public Calendar getDataDevolucao(){
      return dataDevolucao;
   }
   public void setDataDevolucao(Calendar dataDevolucao){
      this.dataDevolucao = dataDevolucao;
   }
   
   public Emprestimo(int codigoEmprestimo, int codigoUsuario, Item[] itensDoEmprestimo, Calendar dataEmprestimo, Calendar dataDevolucao) {
      this.codigoEmprestimo = codigoEmprestimo;
      this.codigoUsuario = codigoUsuario;
      this.dataEmprestimo = dataEmprestimo;
      itensDoEmprestimo = new Item[MAX];
   }
}
