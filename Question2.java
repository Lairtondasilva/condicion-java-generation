package condicao;

import java.util.Scanner;
 
public class Question2 {
	public static void main(String[]args) {
		Scanner reader = new Scanner(System.in);
		int a,b,c;
		
		System.out.println("digite o valor de a: ");
		a = reader.nextInt();
		System.out.println("digite o valor de b: ");
		b = reader.nextInt();
		System.out.println("digite o valor de c: ");
		c = reader.nextInt();
		
		if(a<=b && b<=c) {
			System.out.println(a+" , "+b+" , "+c);
		}
		else if(a<=c && c<=b) {
			System.out.println(a+" , "+c+" , "+b);
		}
		else if(b<=a && a<=c) {
			System.out.println(b+" , "+a+" , "+c);
		}
		else if(b<=c && c<=a) {
			System.out.println(b+" , "+c+" , "+a);
		} 
		else if(c<=a && a<=b) {
			System.out.println(c+" , "+a+" , "+b);
		}
		else {
			System.out.println(c+" , "+b+" , "+a);
		}
	}
}
