package br.fiap.aluno;

public class AlunoGraduacao extends Aluno {
	
	//atributos específicos
	private String curso;
	private double trabalho;
	
	//método
		public double calcularMedia(){
			return (prova1 + prova2 / 2);
		}
}
