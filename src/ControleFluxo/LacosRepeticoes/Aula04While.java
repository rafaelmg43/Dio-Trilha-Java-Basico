package ControleFluxo.LacosRepeticoes;

import java.util.concurrent.ThreadLocalRandom;

public class Aula04While {
    public static void main(String[] args) {
        // Joãozinho recebeu R$ 50,00 de mesada e foi em uma loja de doces gastar todo o seu dinheiro,
        // logo, enquanto o valor dos doces não igualar a R$ 50,00 ele foi adicionando itens no carrinho.
        double mesada = 50.0;
        while (mesada > 0) {
            Double valorDoce = valorAleatorio();
            if (valorDoce > mesada) {
                valorDoce = mesada;
            }
            System.out.println("Doce do valor de :" + valorDoce + " Adicionado no carrinho :");
            mesada = mesada - valorDoce;
        }
        System.out.println(" mesada = " + mesada);
        System.out.println(" Joaozinho Gastou toda sua mesada em doces");
    }

    private static double valorAleatorio() {
        return ThreadLocalRandom.current().nextDouble(2, 15);
    }
}
