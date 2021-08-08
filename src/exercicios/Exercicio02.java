package exercicios;

import java.util.Scanner;

/*
O índice de massa corporal, mais conhecido pela sigla IMC, é um
índice adotado pela OMS (Organização Mundial de Saúde), que é
usado para o diagnóstico do sobrepeso e da obesidade.O IMC pode ser
facilmente calculado a partir de dois simples dados: peso e altura.

Criar um pequeno programa que faça esse cálculo automaticamente.
Veja aqui a fórmula:

IMC = PESO / (ALTURA * ALTURA)
Lembrando que o peso é em quilogramas e a altura é em metros.

A primeira coisa a se fazer é declarar duas variáveis que vão receber
o peso e a altura, respectivamente. Esses dois valores serão informados
pelo usuário - da mesma forma como fizemos na aula anterior.

Depois dessas duas variáveis, vai ser preciso declarar uma terceira que
vai guardar o resultado da multiplicação da altura por ela mesma
(é a parte "ALTURA * ALTURA" da fórmula acima).

Agora basta dividir o peso pela multiplicação que foi feita.
O resultado dessa divisão já será o final. Guarde o resultado dessa divisão
em uma quarta variável que será utilizada para exibir para o usuário.

 */
public class Exercicio02 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("CÁLCULO DO ÍNDICE DE MASSA CORPORAL");

        System.out.print("Informe o peso: ");
        Double peso = teclado.nextDouble();

        System.out.print("Informe a altura: ");
        Double altura = teclado.nextDouble();

        Double imc = peso / (altura * altura);

        System.out.println("IMC: " + imc);




    }

}
