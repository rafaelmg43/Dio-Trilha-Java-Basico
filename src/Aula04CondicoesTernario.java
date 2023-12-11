public class Aula04CondicoesTernario {
    public static void main(String[] args) {
        int nota = 6;

//        String resultado = nota >= 7 ? "aprovado" : "reprovado";
//        System.out.println(resultado);

        String resultado = nota >= 7 ? "Aprovado" : nota >= 5 && nota < 7 ? "Recuperacao" : "Reprovado";
        System.out.println(resultado);
    }

}
