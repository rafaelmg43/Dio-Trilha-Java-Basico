package ControleFluxo.Excecoes;

import java.text.NumberFormat;
import java.text.ParseException;


public class Aula02HierarquiaDeExcecoes {
    public static void main(String[] args) throws ParseException {

        Number valor = null;
        try {
            valor = NumberFormat.getInstance().parse("a1.75");
            System.out.println(valor);
        } catch (ParseException e) {
            throw new RuntimeException(e);

        }

    }
}

