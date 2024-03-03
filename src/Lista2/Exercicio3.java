import org.w3c.dom.ls.LSOutput;

public class Exercicio3 {
    public static void main(String[] args) {
        //Fazer um programa que imprima na tela a média
        //dos números impares que estão no intervalo de 0 a 100.
        int soma = 0;
        int contador = 0;

        for(int i = 1; i <= 100; i += 2){
            soma += i;
            contador++;
        }
        double media = (double) soma / contador;
        System.out.println("A média dos números ímpares de 0 a 100 é: "+ media);
    }
}
