package Exame;

public class Break {
    public static void main(String[] args) {
        //Break

        //Imprima os primeiros 25 números
        int valorMax = 50;
        for(int i=0; i <= valorMax ; i++){
            if(i > 25){
                break;
            }
            System.out.println(i);
        }
    }
}
