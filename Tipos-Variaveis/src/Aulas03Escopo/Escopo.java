package Aulas03Escopo;

import javax.swing.plaf.PanelUI;

public class Escopo {
    //escopo de classe
    //escopo de metodo
    //escopo de

    public class Conta {
        //variavel da classe conta
        double saldo = 10.0;


        public void sacar(Double valor) {
            //variavel local de metodo
            double novoSaldo = saldo - valor;


            public void imprimirSaldo(){
                //Disponivel em toda classe
                System.out.println(saldo);
                //somente o metodo sacar conhece esta variavel
                System.out.println(novoSaldo);
            }
        }

        public double calcularDividaExponencial() {
            //variavel local de método
            double valorParcela = 50.0;//começando a variavel
            double valorMontante = 0.0;
            for (int x = 1; x <= 5; x++) {
                double valorCalculado = valorParcela;
                valorMontante = valorMontante + valorCalculado;
            }
            //escopo de fluxo
            //x e valorCalculado nunca estarao disponivel fora
            return valorMontante;
        }
    }
}
