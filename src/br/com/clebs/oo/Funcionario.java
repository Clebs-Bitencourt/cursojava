package br.com.clebs.oo;

import java.util.Date;

public class Funcionario {
	
	private int matricula;
	private String nome;
	private Date dataAdmissao;
	private String cargo;
	private String departamento;
	private byte numDependentes;
	private double salario;
	private double descontos;
	private double salarioLiquido;
	
	public Funcionario(int matricula) {
		setMatricula(matricula);
	}
	
	public double getSalarioLiquido() {
		return salarioLiquido;
	}


	public void setSalarioLiquido(double salarioLiquido) {
		this.salarioLiquido = salarioLiquido;
	}


	public int getMatricula() {
		return matricula;
	}
	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Date getDataAdmissao() {
		return dataAdmissao;
	}
	public void setDataAdmissao(Date dataAdmissao) {
		this.dataAdmissao = dataAdmissao;
	}
	public String getCargo() {
		return cargo;
	}
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	public String getDepartamento() {
		return departamento;
	}
	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}
	public byte getNumDependentes() {
		return numDependentes;
	}
	public void setNumDependentes(byte numDependentes) {
		this.numDependentes = numDependentes;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}

	public double getDescontos() {
		return descontos;
	}

	public void setDescontos(double descontos) {
		this.descontos = descontos;
	}
	
	
	

}
