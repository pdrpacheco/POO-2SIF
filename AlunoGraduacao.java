package br.fiap.aluno;

public class AlunoGraduacao extends Aluno {
	
	//atributos espec�ficos
	private String curso;
	private double trabalho;
	
	//m�todo
		public double calcularMedia(){
			return (prova1 + prova2 / 2);
		}
}
