package Lista2;

import java.util.Scanner;

public class Exercicio7 {
    public static void main(String[] args) {
        //Fazer um programa que o usuário entre com seu nome completo e o programa exiba na tela apenas o primeiro e o último nome.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Entre com seu Nome: ");
        String nome = scanner.nextLine();
        String[] nomeS = nome.split(" ");
        System.out.println(" " + nomeS[0] + " " + nomeS[nomeS.length - 1]);

    }
}
