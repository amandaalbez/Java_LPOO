package Exame;

public interface Questao2NP2 {
    public static void main (String [] args){
        //As declarações de métodos print com a mesma assinatura de parâmetro int.
        //Métodos sobrecarregados devem ter diferentes assinaturas. No caso, ambas têm um parâmetro do tipo int, o que causa conflito. Apenas um desses métodos pode existir. Você precisa decidir qual manter ou dar a um deles uma assinatura diferente. Vou manter o primeiro para este exemplo
        int i = 8;
        print(i);
        print();
        int j = 9;
        print(j);
    }
    public static void print(){
        System.out.println("Called print with no parameters");
    }
    public static void print(int i){
        System.out.println("Called print with no parameters i");
    }
    public static void print(int j){
        System.out.println("Called print with no parameters j");
    }
}
