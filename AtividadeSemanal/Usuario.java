package AtividadeSemanal1;

public abstract class Usuario{
   protected int codigoUsuario;
   protected String nome;
   protected String cpf;
   protected String email;

   public int getCodigoUsuario(){
      return codigoUsuario;
   }

   public void setCodigoUsuario(int codigoUsuario){
      this.codigoUsuario = codigoUsuario;
   }

   public String getNome(){
      return nome;
   }

   public void setNome(String nome){
      this.nome = nome;
   }

   public String getCpf(){
      return cpf;
   }

   public void setCpf(String cpf){
      if(cpf.length() == 11){
         this.cpf = cpf;
      }else{
         this.cpf = "-1";
      }
   }

   public String getEmail(){
      return email;
   }

   public void setEmail(String email){
      this.email = email;
   }

   public String toString(){
      return " Codigo do usuario: "+codigoUsuario+"\n Nome: "+nome+"\n CPF: "+cpf+"\n E-mail: "+email;
   }
   
   public Usuario(int codigoUsuario, String nome, String cpf, String email) {
      this.codigoUsuario = codigoUsuario;
      this.nome = nome;
      this.cpf = cpf;
      this.email = email;
   }
}

