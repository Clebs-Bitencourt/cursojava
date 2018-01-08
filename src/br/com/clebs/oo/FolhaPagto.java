package br.com.clebs.oo;
/*FolhaPagto.java

Escrever uma rotina que receba os dados de um Empregado, calcule o SALARIO LIQUIDO e imprima todos os dados.

FOLHA DE PAGAMENTO
--------------------------------------------------------
MATRICULA..............: 999999
NOME...................: XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX
DATA DE ADMISSAO.......: DD/MM/AAAA
CARGO..................: XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX
DEPARTAMENTO...........: XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX
NUMERO DE DEPENDENTES..: 99
SALARIO BRUTO..........: 999.999.999,99
DESCONTOS..............: 999.999.999,99
SALARIO LIQUIDO........: 999.999.999,99 */
import java.util.Date;

public class FolhaPagto{
	
	public static double calculaSalario(Funcionario assalariado){
		return assalariado.getSalario()-assalariado.getDescontos();
	}
	
	public static void imprimir(Funcionario assalariadoParaImprimir){
		System.out.println(assalariadoParaImprimir.getMatricula());
		System.out.println(assalariadoParaImprimir.getNome());
		System.out.println(assalariadoParaImprimir.getDataAdmissao());
		System.out.println(assalariadoParaImprimir.getCargo());
		System.out.println(assalariadoParaImprimir.getDepartamento());
		System.out.println(assalariadoParaImprimir.getNumDependentes());
		System.out.println(assalariadoParaImprimir.getSalario());
		System.out.println(assalariadoParaImprimir.getDescontos());
		System.out.println(assalariadoParaImprimir.getSalarioLiquido());
	}
	
	public static void main(String[] args){
		
		Funcionario funcionario = new Funcionario(9191);
		funcionario.setNome("joaquim da silva");
		funcionario.setDataAdmissao(new Date());
		funcionario.setCargo("Soldador");
		funcionario.setDepartamento("producao");
		funcionario.setNumDependentes((byte) 2);
		funcionario.setSalario(2700.0);
		funcionario.setDescontos(300.0);
		
		double salarioLiquido = calculaSalario(funcionario);
		funcionario.setSalarioLiquido(salarioLiquido);
		imprimir(funcionario);
		
	}
}