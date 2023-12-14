package ControleFluxo.Excecoes;

public class FormatadorCep {
    public static void main(String[] args) {
        try {
            String CepFormatado = formatarCep("12345678");
            System.out.println(CepFormatado);

        } catch (CepInvalidoException e) {
            System.out.println("O Cep nao corresponde a regras de negocio ");
        }
    }
    static String formatarCep(String cep) throws CepInvalidoException {
        if (cep.length() != 8)
            throw new CepInvalidoException();

        //simulando um cep formatado
        return "23.765-064";
    }
}

