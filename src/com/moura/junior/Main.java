package com.moura.junior;

/**
 * Método principal (main) para a execução das classes do exercício Aula01
 */

public class Main {

    public static void main(String[] args){
        System.out.println("-----Exercício Calculadora-----");
        Calculadora.soma(1,5);
        Calculadora.subtracao(10,1.7);
        Calculadora.multiplicacao(5.6,6);
        Calculadora.divisao(5,2.5);

        System.out.println("-----Exercício Mensagem-----");
        Mensagem.obterMensagem("06:00");
        Mensagem.obterMensagem("14:00");
        Mensagem.obterMensagem("19:00");

        System.out.println("-----Exercício Calculadora-----");
        Emprestimo.calcular(1000.0, Emprestimo.getDuasParcelas());
        Emprestimo.calcular(1000.0, Emprestimo.getTresParcelas());
        Emprestimo.calcular(1000.0, 5);

    }

}
