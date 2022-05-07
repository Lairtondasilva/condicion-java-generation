package condicao;

import java.util.Scanner;

public class Question3 {
	public static void main (String[]args) {
		
		Scanner reader = new Scanner(System.in);
		
		int age;
		
		System.out.println("Digite uma idade: ");
		age = reader.nextInt();
		
		if (age>=10 && age<=14) {
			System.out.println("categoria: infantil");
		}
		else if(age>=15 && age<=17) {
			System.out.println("categoria: juvenil");
		}
		else if(age>=18 && age <=25) {
			System.out.println("categoria: adulto");
		}
		else {
			System.out.println("categoria: não identificada");
		}
	}
		
}
