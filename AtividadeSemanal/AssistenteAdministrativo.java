package AtividadeSemanal1;

public class AssistenteAdministrativo extends Usuario{
   protected String inicioContrato;
   protected String fimContrato;

   public String getInicioContrato(){
      return inicioContrato;
   }
   public void setInicioContrato(String inicioContrato){
      this.inicioContrato = inicioContrato;
   }
   public String getFimContrato(){
      return fimContrato;
   }
   public void setFimContrato(String fimContrato){
      this.fimContrato = fimContrato;
   }

   @Override
   public String toString(){
      return super.toString()+" Inicio de contrato: "+fimContrato+"\n Fim de contrato: ";
   }
   
   public AssistenteAdministrativo(String inicioContrato, String fimContrato, int codigoUsuario, String nome, String cpf, String email){
      super(codigoUsuario, nome, cpf, email);
      this.inicioContrato = inicioContrato;
      this.fimContrato = fimContrato;
   }
}
