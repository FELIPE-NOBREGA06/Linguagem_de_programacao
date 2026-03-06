package Aula01;

public class Aula01 {

    public static void main(String[] args) {

        // ================================================
        // 1. OPERAÇÕES MATEMÁTICAS BÁSICAS
        // ================================================

        int soma = 2 + 2;
        int subtracao = 2 - 2;
        int divisao = 2 / 2;
        int multiplicacao = 2 * 2;

        System.out.println("Soma: " + soma);
        System.out.println("Subtração: " + subtracao);
        System.out.println("Divisão: " + divisao);
        System.out.println("Multiplicação: " + multiplicacao);


        // ================================================
        // 2. ORDEM DE PRECEDÊNCIA
        // ================================================

        int equacao = 4 + (4 * 4); // 4 + 16 = 20
        System.out.println("Resultado da equação: " + equacao);


        // ================================================
        // 3. OPERADORES LÓGICOS
        // ================================================

        boolean andExemplo = true && false;
        boolean orExemplo = true || false;
        boolean notExemplo = !true;

        System.out.println("AND (true && false): " + andExemplo);
        System.out.println("OR  (true || false): " + orExemplo);
        System.out.println("NOT (!true): " + notExemplo);


        // ================================================
        // 4. OPERADOR TERNÁRIO
        // ================================================

        String resultadoTernario = (1 == 1 && 2 == 2) ? "Verdadeiro" : "Falso";
        System.out.println("Validação ternária: " + resultadoTernario);


        // ================================================
        // 5. EXEMPLO PRÁTICO — APROVAÇÃO DE ALUNO
        // ================================================

        double nota = 4.5;
        double notaProva = 2.0;
        double frequencia = 0.75;

        double media = (nota + notaProva) / 2;

        if (media >= 7.0 && frequencia >= 0.75) {
            System.out.println("Situação: Aprovado");
        } else if (media < 4.0) {
            System.out.println("Situação: Reprovado");
        } else {
            System.out.println("Situação: Prova Final (PF)");
        }
    }
}