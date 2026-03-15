package Fundamentos_teoricos;

import java.util.Scanner;

public class EstruturaCondicionalIfEncadeado {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int dia = entrada.nextInt();

        System.out.println("O dia da semana é: ") ;

        if(dia == 1){
            System.out.println("Domingo");
        }else if(dia == 2){
            System.out.println("Segunda-feira");
        }else if(dia == 3){
            System.out.println("Terça-feira");
        }else if(dia == 4){
            System.out.println("Quarta-feira");
        }else if(dia == 5){
            System.out.println("Quinta-feira");
        }else if(dia == 6){
            System.out.println("Sexta-feira");
        }else if(dia == 7){
            System.out.println("Sabado");
        }

    }
}
