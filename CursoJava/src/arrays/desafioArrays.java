package arrays;

import java.util.Scanner;

public class desafioArrays {

	public static void main(String[] args) {
		Scanner entrada =  new Scanner(System.in);
		System.out.print("Quantas notas: ");
		int quant = entrada.nextInt();

		double notas[] =  new double[quant];
		double media;
		double total=0;

		for(int i=0;i < notas.length;i++){
			System.out.print("Informae a nota "+ (i+1) +": ");
			notas[i] = entrada.nextDouble();
		}
		
		
		for(double nota: notas){
			total += nota;
		}
		media = total/notas.length;
		System.out.println("A media é " + media);

		entrada.close();
	}

}
