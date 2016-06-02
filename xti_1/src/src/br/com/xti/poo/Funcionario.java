package src.br.com.xti.poo;

public class Funcionario {
	String nome;
	double salario;
	boolean ativo;
	String senha;
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	public boolean isAtivo() {
		return ativo;
	}
	public void setAtivo(boolean ativo) {
		this.ativo = ativo;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	public String isSenhaCorreta(String s){
		return s;
	}
	
	

}
