package exercicios;

import java.util.Scanner;

public class Exercicio04 {

    static final Integer IDADE_MINIMA_TIRAR_CNH = 18;

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Informe sua idade: ");
        Integer idade = teclado.nextInt();

        if (idade >= IDADE_MINIMA_TIRAR_CNH) {
            System.out.println("É maior de idade, pode tirar a carteira CNH!");
        } else {
            System.out.println("É menor de idade, não pode tirar a carteira CNH!");
        }
    }
}
