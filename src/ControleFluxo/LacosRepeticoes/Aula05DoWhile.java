package ControleFluxo.LacosRepeticoes;

import java.util.Random;

public class Aula05DoWhile {
    public static void main(String[] args) {
        //Joãozinho resolveu ligar para o seu amigo, dizendo que hoje se entupiu de comer docinhos:

        System.out.println("Discando... ... ...");

        do {
            //telefone tocando varias vezes
            System.out.println(" Telefone Tocando");
        } while (tocando());
                System.out.println("Alo quem fala?  !!!");
    }
    private static boolean tocando(){
        boolean atendeu = new Random().nextInt(3)==1;
        System.out.println("Atendeu ? " + atendeu);
        //negando o ato de continuar tocando
        return ! atendeu;
    }
}
