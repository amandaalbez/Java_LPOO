package Exame;

import javax.swing.*;
import java.util.Scanner;

public class EntradadeDados {
    public static void main(String []args){
        //Exibe uma janela com uma caixa de diálogo
        String valor = JOptionPane.showInputDialog(" ");

        //caixa de diálogo no terminal
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        scanner.close();
        System.out.println(s); //Exibe a mensagem recebida
    }
}
