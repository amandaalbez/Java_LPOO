package Lista3;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        // Converter Real - Cruzeiro Real e Cruzeiro
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o valor em Reais: ");
        float real = scanner.nextFloat();

        float cr = real * 2750;
        float c = real * 1000;

        DecimalFormat df = new DecimalFormat("#.##"); // Define o formato para dois dígitos após o ponto decimal

        System.out.println("Em Reais: " + df.format(real));
        System.out.println("Em Cruzeiro Real: " + df.format(cr));
        System.out.println("Em Cruzeiro: " + df.format(c));
    }
}

