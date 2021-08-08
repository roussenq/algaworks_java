package exercicios;

import java.util.Scanner;

/*
Crie um programa que vai receber do usuário o valor do produto
e a quantidade do produto que se deseja. Com essas informações
encontre o subtotal que será o valor do produto multiplicado pela quantidade.

Se a quantidade desejada do produto for maior que 10 unidades,
vai ser preciso dar um desconto de 10% em cima do subtotal,
mas se for menor que 10, você NÃO aplica desconto algum.

Para encontrar o valor referente ao percentual de desconto
(que vai ser 0% ou 10%, dependendo da quantidade) você multiplica o
subtotal pelo próprio percentual e divide tudo por 100.

Tendo o valor referente ao percentual de desconto, você vai retirar
esse valor do subtotal. O que sobrar será o valor total final e
deverá ser apresentado no console.
 */
public class Exercicio03 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.print("Informe o valor do produto: ");
        Double valorProduto = teclado.nextDouble();

        System.out.print("Informe a quantidade do produto: ");
        int qtdProduto = teclado.nextInt();

        Double valorTotal = valorProduto * qtdProduto;

        if (qtdProduto > 10) {
            valorTotal = valorTotal - (valorTotal * 0.1);
        }

        System.out.print("Valor total: " + valorTotal);

    }

}
