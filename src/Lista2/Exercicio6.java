package Lista2;

import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {
        //Fazer um programa que o usuário entre com uma frase e o programa imprima na tela a frase com todos os caracteres em maiúsculo.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Entre com seu nome: ");
        String a = scanner.nextLine(); // Correção aqui
        String masc = a.toUpperCase();
        System.out.println(masc);
    }
}

