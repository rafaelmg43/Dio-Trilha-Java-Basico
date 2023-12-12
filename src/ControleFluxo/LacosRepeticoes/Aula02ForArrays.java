package ControleFluxo.LacosRepeticoes;

import java.awt.font.FontRenderContext;

public class Aula02ForArrays {
    public static void main(String[] args) {
        //arrays o indice de elementos inicia em 0
        String alunos[] = {"FELIPE", "JOAO", "MARIA", "JULIA"};
//        for (int i = 0; i < alunos.length; i++) {
//            System.out.println("O aluno no indice x:" + i + " " + alunos[ i ]);
//        }
        //exemplo for each
        for (String aluno : alunos) {
            System.out.println("Nome do aluno :" + aluno);
        }
    }
}
