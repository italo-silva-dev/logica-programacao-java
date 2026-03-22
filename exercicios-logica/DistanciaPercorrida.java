// Exercicio 05: Calcular distância percorrida com base em velocidade e tempo

import java.util.Scanner;

public class DistanciaPercorrida {
    static void main (String [] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Qual foi sua distância percorrida? ");
        int n1 = scanner.nextInt();

        System.out.print("Qual foi o tempo da viagem? ");
        int n2 = scanner.nextInt();

        System.out.println(n1 * n2 + "Km/h");

    }
}
