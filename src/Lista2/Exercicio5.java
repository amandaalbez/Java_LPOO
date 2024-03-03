import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Entre com seu peso: ");
        int a = Scanner.nextInt();
        System.out.println("Entre com sua altura: ");
        int b = Scanner.nextInt();
        int imc = a / (b*b);
        System.out.println("Seu imc é de: "+imc+);

    }
}
