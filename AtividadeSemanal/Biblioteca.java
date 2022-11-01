package AtividadeSemanal1;

public class Biblioteca{
   private int contEmp = 0;
   private String nome;
   private Emprestimo[] emprestimos;
   private Item[] itens;
   private Usuario[] usuarios;
 
   public String getNome(){
      return nome;
   }
   public void setNome(String nome){
      this.nome = nome;
   }
   public Emprestimo[] getEmprestimos(){
      return emprestimos;
   }
   public void setEmprestimos(Emprestimo[] emprestimos){
      this.emprestimos = emprestimos;
   }
   public Item[] getItens(){
      return itens;
   }
   public void setItens(Item[] itens){
      this.itens = itens;
   }
   public Usuario[] getUsuarios(){
      return usuarios;
   }
   public void setUsuarios(Usuario[] usuarios){
      this.usuarios = usuarios;
   }

   public Biblioteca(String nome, Emprestimo[] emprestimos, Item[] itens){
      this.nome = nome;
      this.emprestimos = emprestimos;
      this.itens = itens;
   }

   public void addEmprestimo(Emprestimo emprestimo){
      emprestimos[contEmp] = emprestimo;
      contEmp++;
   }
   
   public void imprimirTodosEmprestimos(){
      System.out.println(" ");
   }
}