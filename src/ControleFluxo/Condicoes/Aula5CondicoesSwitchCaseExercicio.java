package ControleFluxo.Condicoes;

public class Aula5CondicoesSwitchCaseExercicio {
    public static void main(String[] args) {
//        Imagina que fomos requisitados a criar um sistema de plano telefônico onde:
//        O sistema terá 03 planos: BASIC, MIDIA , TURBO;
//        BASIC: 100 minutos de ligação;
//        MÍDIA: 100 minutos de ligação + WhatsApp e Instagram grátis;
//        TURBO: 100 minutos de ligação + WhatsApp e Instagram grátis + 5 GB Youtube.
        String plano = "T";

        switch (plano){
            case "T":{
                System.out.println("5Gb You Tube");

            }
            case "M":{
                System.out.println("WhatsApp e intagram gratis");

            }
            case "B":{
                System.out.println("100 minutos de ligacao ");
                break;
            }
            default:{
                System.out.println("Plano nao definido: ");
            }
        }
    }
}
