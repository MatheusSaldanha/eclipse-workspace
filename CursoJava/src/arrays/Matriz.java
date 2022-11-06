package arrays;

import java.util.Scanner;

public class Matriz {
   
    public static void main(String[] args) {
        Scanner entrada =  new Scanner(System.in);

        System.out.print("Quantos alunos: ");
        int quantAlunos = entrada.nextInt();

        System.out.print("Quantas notas por aluno: ");
        int quantNotas = entrada.nextInt();

        double notasDaTurma[][] = new double[quantAlunos][quantNotas];
        double total=0;
        double media;
        
        for(int a=0; a<notasDaTurma.length;a++){

            for(int n=0;n<notasDaTurma[a].length;n++){
            
                System.out.printf("Informe a nota %d do aluno %d: ",n+1, a+1 );
                notasDaTurma[a][n] =  entrada.nextDouble();
                total += notasDaTurma[a][n];
            }
        }
        media = total/(quantAlunos * quantNotas);
        System.out.println("Média da tuma é: " + media);

        entrada.close();
    }
}
