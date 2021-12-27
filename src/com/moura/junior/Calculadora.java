package com.moura.junior;
/**
 * Criação de uma calculadora como exercício para a aula sobre métodos.
 */

public class Calculadora {

    public static void soma(double num1, double num2){

        double resultado = num1 + num2;

        System.out.println("A soma entre " + num1 + " e " + num2 + " é igual a " + resultado);
    }

    public static void subtracao(double num1, double num2){

        double resultado = num1 - num2;

        System.out.println("A subtrção entre " + num1 + " e " + num2 + " é igual a " + resultado);
    }

    public static void multiplicacao(double num1, double num2){

        double resultado = num1 * num2;

        System.out.println("A multiplicação entre " + num1 + " e " + num2 + " é igual a " + resultado);
    }

    public static void divisao(double num1, double num2){

        double resultado = num1 / num2;

        System.out.println("A divisão entre " + num1 + " e " + num2 + " é igual a " + resultado);
    }
}
