package exercicios;
/*
Exercício 01: Calculando o quadrado de um número:
Leia um número no console faça o cálculo da área quadrado
desse número e exiba o resultado no console. Lembrando que o
quadrado de um número é calculado multiplicando-se o número
por ele mesmo. Por exemplo, para encontrar o quadrado de 2 é
preciso multiplicar o 2 por 2, tendo como resultado o número 4.*/

import java.util.Scanner;

public class Exercicio01 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Informe um número: ");
        int numero = teclado.nextInt();
        int area = numero * numero;

        System.out.println("A área do quadrado é: " + area);
        teclado.close();
    }
}
