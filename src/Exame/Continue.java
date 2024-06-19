package Exame;

public class Continue {
    public static void main(String[] args) {
        //Continue
        double valorTotal = 2000;
        for(int parcela = (int) valorTotal;parcela >= 1; parcela--){
            double valorParcela = valorTotal / parcela;
            if(valorParcela < 1000){
                continue;
            }
            System.out.println("Parcela "+ parcela +" R$ "+valorParcela);

        }
    }
}
