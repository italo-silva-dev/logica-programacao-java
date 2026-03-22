// Exercicio 04: Ler valores do usuário e exibir cálculo com eles

import java.util.Scanner;

public class PedidoAtribuicao {
    static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        int x = scanner.nextInt();

        System.out.print("Digite o segundo número: ");
        int y = scanner.nextInt();

        System.out.print("Digite o terceiro número: ");
        int z = scanner.nextInt();

        System.out.println(x * y / z);
    }
}
