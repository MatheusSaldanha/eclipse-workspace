package arrays;

public class Forecach {

	public static void main(String[] args) {
		double notas[] = {9.6, 9.5, 8.5, 7.9};
		double t = 0;
		for(double nota: notas) {
			System.out.println(nota);
			t +=nota;
			
		}
		
		System.out.println("Media: "+t/notas.length);
	}

}
