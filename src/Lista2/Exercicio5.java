import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Entre com seu peso: ");
        int peso = scanner.nextInt(); // Correção aqui
        System.out.println("Entre com sua altura: ");
        int altura = scanner.nextInt(); // Correção aqui
        double imc = peso / (altura * altura); // Correção do cálculo e alteração para double para evitar truncamento
        System.out.println("Seu IMC é de: " + imc); // Correção do println()
    }
}

