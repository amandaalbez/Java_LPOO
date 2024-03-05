package Lista3;

import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        // Calcular Fatorial de um número
        int numero;
        System.out.println("Informe o número que deseja saber o fatorial: ");
        Scanner scanner = new Scanner(System.in);
        numero = scanner.nextInt(); // Atribuição do valor digitado a 'numero'
        long fatorial = 1;
        int i = 1;

        while (i <= numero) {
            fatorial = fatorial * i; // Multiplicação para calcular o fatorial
            i++;
        }
        System.out.println("O fatorial de " + numero + " é: " + fatorial); // Correção na impressão
    }
}

