package ControleFluxo.Condicoes;

public class Aula05CondicoesSwitchCase {
    public static void main(String[] args) {
        //Sistema de Medida usando if else
        //char sigla = 'G';

//        if (sigla == 'P') {
//            System.out.println("Pequeno");
//        } else if (sigla == 'M') {
//            System.out.println("Medio");
//        }else if(sigla == 'G'){
//            System.out.println("GRANDE");
//        }else{
//            System.out.println("INDEFINIDO");
//        }
        String sigla = "M";

        switch (sigla) {
            case "P": {
                System.out.println("Pequeno");
                break;
            }
            case "M": {
                System.out.println("Medio");
                break;
            }
            case "G": {
                System.out.println("Grande");
                break;
            }
            default:
                System.out.println("INDEFINIDO");
        }
    }
}
