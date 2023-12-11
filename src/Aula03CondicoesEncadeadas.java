public class Aula03CondicoesEncadeadas {
    public static void main(String[] args) {
        int nota = 6;

        if (nota >= 7) {
            System.out.println("APROVADO");
        } else if (nota >= 5 && nota < 7) {
            System.out.println("RECUPERACAO");
        } else {
            System.out.println("REPROVADO");
        }
    }
}
