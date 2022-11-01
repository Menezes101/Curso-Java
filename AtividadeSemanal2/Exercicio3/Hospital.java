package Exercicio3;

import java.util.ArrayList;

public class Hospital{
    
    private String nome;
    private String endereco;
    private ArrayList<Funcionario> funcionarios;

    Hospital(String nome, String endereco, ArrayList<Funcionario> funcionarios){
        this.nome = nome;
        this.endereco = endereco;
        this.funcionarios = funcionarios;
    }

    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public String getEndereco(){
        return endereco;
    }
    public void setEndereco(String endereco){
        this.endereco = endereco;
    }
    public ArrayList<Funcionario> getFuncionarios(){
        return funcionarios;
    }
    public void setFuncionarios(ArrayList<Funcionario> funcionarios){
        this.funcionarios = funcionarios;
    }

    public void adicionarFuncionario(Funcionario funcionario){
        this.funcionarios.add(funcionario);
    }
    public void excluirFuncionario(int matricula){
        for(Funcionario funcionario : this.funcionarios){
            if(funcionario.getMatricula() == matricula){
                this.funcionarios.remove(funcionario);
                System.out.println("\nFuncionario removido!");
            }
        }
    }
    public void exibirTodosFuncionarios(){
        for(Funcionario funcionario : this.funcionarios){
            funcionario.imprimir();
        }
    } 
    public void exibirFuncionariosAnoContrato(int ano){
        System.out.println("\nFuncionarios contratados a partir de " +ano+ ":");
        for(Funcionario funcionario : this.funcionarios){
            if(funcionario.getDataContratacao().getYear() == ano){
                System.out.println(funcionario.getNome());
            }
        }
    }  
    public void imprimir(){
        System.out.println("\nNome: " +nome+ "\nEndereco: " +endereco+ "\nFuncionarios: ");
        for(Funcionario f : this.funcionarios){
            f.imprimir();
        }
    }
}