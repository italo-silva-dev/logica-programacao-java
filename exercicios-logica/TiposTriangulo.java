// Exercicio 09: Classificar o tipo do triângulo pelos lados

import java.util.Scanner;

public class TiposTriangulo {
	public static void main (String [] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite o primeiro lado do triângulo: ");
		int l1 = scanner.nextInt();
		
		System.out.println("Digite o segundo lado do triângulo: ");
		int l2 = scanner.nextInt();
		
		System.out.println("Digite o terceiro lado do triângulo: ");
		int l3 = scanner.nextInt();
		
		if (l1 == l2 && l2 == l3) {
			System.out.println("É um triângulo Equilátero!");
		}
		else if (l1 == l2 || l1 == l3 || l2 == l3) {
			System.out.println("É um triângulo Isósceles!");
		}
		else {
			System.out.println("É um triângulo Escaleno!");
		}
	}
}
