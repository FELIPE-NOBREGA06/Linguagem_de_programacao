package Fundamentos_teoricos;

import java.util.Scanner;

public class InstrucaoLer {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe um número: ");
        int a = entrada.nextInt();
        System.out.println("O número informado é: " );
        System.out.println(a);

        entrada.close();
    }
}
