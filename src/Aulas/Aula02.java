package Aulas;

import java.util.Scanner;

public class Aula02 {

    public static void main(String[] args) {

        // Cria o objeto Scanner para ler dados do teclado
        Scanner entrada = new Scanner(System.in);

        /*
        =========================================================
        EXEMPLO 1 - Comparar dois números
        =========================================================
        */

        /*
        System.out.println("Digite um número: ");
        double num1 = entrada.nextDouble();

        System.out.println("Digite outro número: ");
        double num2 = entrada.nextDouble();

        // Verifica se os números são iguais
        if (num1 == num2) {
            System.out.println("Os números são iguais");

        // Verifica qual número é maior
        } else if (num1 > num2) {
            System.out.println("O maior número é: " + num1);

        } else {
            System.out.println("O maior número é: " + num2);
        }
        */


        /*
        =========================================================
        EXEMPLO 2 - Verificar se o número é PAR, ÍMPAR ou ZERO
        =========================================================
        */

        /*
        System.out.println("Digite um número: ");
        int num = entrada.nextInt();

        // Verifica se o número é zero
        if (num == 0) {
            System.out.println("O número é ZERO");

        // Verifica se o número é ímpar
        } else if (num % 2 != 0) {
            System.out.println("O número é ÍMPAR: " + num);

        // Caso contrário será par
        } else {
            System.out.println("O número é PAR: " + num);
        }
        */


        /*
        =========================================================
        EXEMPLO 3 - Tabuada usando FOR
        =========================================================
        */

        /*
        // Loop externo controla o número da tabuada
        for (int i = 1; i <= 10; i++) {

            // Loop interno faz as multiplicações
            for (int j = 0; j <= 10; j++) {

                System.out.println(i + " x " + j + " = " + (i * j));
            }

            // Linha em branco para separar as tabuadas
            System.out.println();
        }
        */


        /*
        =========================================================
        EXEMPLO 4 - Ler um número do usuário
        =========================================================
        */

        System.out.println("Digite um número: ");
        int num = entrada.nextInt();

        // Mostra o número digitado
        System.out.println("O número digitado foi: " + num);

        // Fecha o Scanner (boa prática)//
        entrada.close();
    }
}