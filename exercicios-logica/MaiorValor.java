// Exercicio 07: Definir dois valores e mostrar qual é o maior

import java.util.Scanner;

public class MaiorValor {
    static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o A: " );
        int a = scanner.nextInt();

        System.out.print("Digite o B: ");
        int b = scanner.nextInt();

        if (a > b){
            System.out.println("Maior valor: " + a);
        } else {
            System.out.println("Maior valor: " + b);
        }

    }
}
