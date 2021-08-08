package exercicios;
/*
Para criar uma calculadora simples você vai precisar receber
três informações pelo console. São os dois números que
participarão da operação e também a operação que será realizada.

Você vai receber o primeiro número, depois vai receber qual
é a operação e, por último, o segundo número.

Para receber a operação você pode receber
também um número que vai indicar a mesma. Por exemplo, o número 1
será adição, o 2 subtração, o 3 multiplicação e o 4 divisão.

Com esses três valores - os dois números e qual será a operação -
você pode utilizar a estrutura de decisão if para só realizar a
operação que o usuário escolheu. */

import java.util.Scanner;

public class Exercicio05 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Informe o primeiro número: ");
        Double numero1 = teclado.nextDouble();
        System.out.print("Informe a operação (1)-Soma, (2)-Subtração,(3)-Divisão,(4)-Multiplicação): ");
        Integer operacao = teclado.nextInt();
        System.out.print("Informe o segundo número: ");
        Double numero2 = teclado.nextDouble();


        Double resultado = 0.0;
        String tipoOperacao = "";
        if (operacao == 1) {
            tipoOperacao = "soma";
            resultado = numero1 + numero2;
        } else if (operacao == 2) {
            if (numero1 > numero2) {
                tipoOperacao = "subtração";
                resultado = numero1 - numero2;
            } else {
                tipoOperacao = "subtração";
                resultado = numero2 - numero1;
            }
        } else if (operacao == 3) {
            tipoOperacao = "divisão";
            resultado = numero1 / numero2;
        } else if (operacao == 4) {
            tipoOperacao = "multiplicação";
            resultado = numero1 * numero2;
        }

        System.out.print("A " + tipoOperacao + " dos números é: " + resultado);

    }
}
