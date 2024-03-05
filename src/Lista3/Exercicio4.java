package Lista3;

import java.util.Scanner;
public class Exercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o CPF (somente números): ");
        String cpf = scanner.nextLine();

        if (validarCPF(cpf)) {
            System.out.println("CPF válido.");
        } else {
            System.out.println("CPF inválido.");
        }
    }

    public static boolean validarCPF(String cpf) {
        // Remover caracteres não numéricos
        cpf = cpf.replaceAll("[^0-9]", "");

        // Verifica se o CPF possui 11 dígitos
        if (cpf.length() != 11) {
            return false;
        }

        // Verifica se todos os dígitos são iguais
        if (cpf.matches("(\\d)\\1{10}")) {
            return false;
        }

        // Calcula o primeiro dígito verificador
        int soma = 0;
        for (int i = 0; i < 9; i++) {
            soma += Integer.parseInt(cpf.substring(i, i + 1)) * (10 - i);
        }
        int digito1 = 11 - (soma % 11);
        if (digito1 > 9) {
            digito1 = 0;
        }

        // Calcula o segundo dígito verificador
        soma = 0;
        for (int i = 0; i < 10; i++) {
            soma += Integer.parseInt(cpf.substring(i, i + 1)) * (11 - i);
        }
        int digito2 = 11 - (soma % 11);
        if (digito2 > 9) {
            digito2 = 0;
        }

        // Verifica se os dígitos verificadores estão corretos
        return Integer.parseInt(cpf.substring(9, 10)) == digito1 && Integer.parseInt(cpf.substring(10)) == digito2;
    }
}
