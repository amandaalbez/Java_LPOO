package Lista3;

import java.util.Scanner;

public class Exercicio2 {
    static int fibonacci(int n){
        if( n == 1 || n == 2){
            return 1;
        }
        else{
            return fibonacci(n-1) + fibonacci(n-2);
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero;
        System.out.println("Digite um número: ");
        numero = scanner.nextInt();

        for(int  i = 1; i <= numero; i++){
            System.out.println(fibonacci(i));
        }
    }
}
