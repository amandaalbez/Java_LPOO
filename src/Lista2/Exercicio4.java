import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        //Fazer um programa que exiba a janela de diálogo três vezes, em cada uma delas o usuário irá entrar com um número inteiro
        Scanner scanner = new Scanner (System.in);
        System.out.println("Entre com um número: ");
        int a = Scanner.nextInt();
        System.out.println("Entre com um número: ");
        int b = Scanner.nextInt();
        System.out.println("Entre com um número: ");
        int c = Scanner.nextInt();
        int d = a + b + c;
        System.out.println("A soma é de: "+d);
    }
}
