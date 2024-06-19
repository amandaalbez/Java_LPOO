package Exame;

public class EstruturadeRepeticao {
    public static void main(String[] args) {
        //while, do while, for
        //1- While - Imprime números de 0 a 9
        int count = 0;
        while (count < 10){
            System.out.println(count);
            count += 1; // ou count++;
        }

        //2- do/while
        do {
            System.out.println("Dentro do do-while");
        } while (count < 10);

        //3- For
        for(int i=0; i<10; i++){
            System.out.println("For"+i);
        }
    }
}
