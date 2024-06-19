public class Exercicio1 {
    public static void main(String[] args) {
        //Fazer um programa que imprima os números pares
        //que existem no intervalo de 1 a 15
        int i = 1;
        while (i <= 15){
            if (i % 2 == 0){
                System.out.println(i);
            }
            i++;
        }
    }
}
