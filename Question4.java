package condicao;

import java.util.Scanner;
 
public class Question4 {
	public static void main(String[]args) {
		Scanner reader = new Scanner(System.in);
		int numero;
		 
		System.out.println("Digite um n�mero: ");
		numero = reader.nextInt();
		 
		if(numero%2==0) {
			System.out.println("n�mero: "+numero);
			System.out.printf("Raiz quadrada: %.3f ",Math.sqrt(numero));
		}
		else {
			System.out.println("n�mero: "+numero);
			System.out.println("Quadrado: "+Math.pow(numero,2));
		}
	}
}
