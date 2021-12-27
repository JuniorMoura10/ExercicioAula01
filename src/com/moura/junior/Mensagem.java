package com.moura.junior;

/**
 * Classe que exibe uma mensagem (Bom dia, Boa tarde ou Boa noite) de acordo com o horário
 * para o exercício da Aula01
 */

public class Mensagem {

    public static void obterMensagem(String hora){

        switch (hora){
            case "05:00":
            case "06:00":
            case "07:00":
            case "08:00":
            case "09:00":
            case "10:00":
            case "11:00":

                mensagemBomDia();
                break;

            case "12:00":
            case "13:00":
            case "14:00":
            case "15:00":
            case "16:00":
            case "17:00":

                mensagemBoaTarde();
                break;

            case "18:00":
            case "19:00":
            case "20:00":
            case "21:00":
            case "22:00":
            case "23:00":
            case "00:00":
            case "01:00":
            case "02:00":
            case "03:00":
            case "04:00":

                mensagemboaNoite();
                break;

            default:
                System.out.println("Hora inválida!");


        }
    }

    public static void mensagemBomDia(){

        System.out.println("Bom dia!");
    }

    public static void mensagemBoaTarde(){

        System.out.println("Boa Tarde");
    }

    public static void mensagemboaNoite(){

        System.out.println("Boa Noite!");
    }
}
