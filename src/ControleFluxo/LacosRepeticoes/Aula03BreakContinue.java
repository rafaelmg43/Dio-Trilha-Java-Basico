package ControleFluxo.LacosRepeticoes;

public class Aula03BreakContinue {
    public static void main(String[] args) {
        System.out.println("Exemplo break");
        for (int i = 0; i <= 5; i++) {
            if (i == 3){
                break;
            }
            System.out.println(i);
        }
        System.out.println("Exemplo continue \n");
        for (int x = 0; x <= 5; x++) {
            if (x == 3){
                continue;
            }
            System.out.println(x);
        }
    }
}
