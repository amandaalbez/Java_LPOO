import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        //Fazer um programa que exiba a janela de diálogo três vezes, em cada uma delas o usuário irá entrar com um número inteiro
        Scanner scanner = new Scanner(System.in);
        System.out.println("Entre com um número: ");
        int a = scanner.nextInt(); // Correção aqui
        System.out.println("Entre com um número: ");
        int b = scanner.nextInt(); // Correção aqui
        System.out.println("Entre com um número: ");
        int c = scanner.nextInt(); // Correção aqui
        int d = a + b + c;
        System.out.println("A soma é de: " + d);
    }
}

