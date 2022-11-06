package arrays;

import java.util.Arrays;

public class Exercicios {

	public static void main(String[] args) {
		double notaAluno[] =  new double[4];//maneira mais comum de usar
		notaAluno[0] = 7.9;
		notaAluno[1] = 8;
		notaAluno[2] = 5.3;
		notaAluno[3] = 4;
		
		System.out.println("Notas do aluno A :" + Arrays.toString(notaAluno));
												 //função que exibe os valores do array
		double total = 0;
		
		for(int i = 0; i < notaAluno.length; i++) {
			total += notaAluno[i];
		}
		System.out.println("Aluno A tem media: " +total/notaAluno.length);
		
		double notaAlunoB[] = {9, 6, 6}; //menos comum de se utilizar
		
		double t = 0;
		for (int i = 0; i < notaAlunoB.length; i++) {
			t += notaAlunoB[i];
		}
		System.out.println("Notas do aluno B: " + Arrays.toString(notaAlunoB));
		
		System.out.println("Aluno B tem media: " + t/notaAlunoB.length);
	}
	
}
