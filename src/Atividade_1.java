import java.util.Scanner;

public class Atividade_1 {
/*
    Escreva um programa que peça dois números e um operador (+, -, *, /).
    Realize a operação indicada e exiba o resultado.
*/
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        boolean repetir = true;

        do {
            System.out.println();
            System.out.printf("Digite o 1º número: ");
            double numero1 = scanner.nextDouble();
            System.out.printf("Digite o 2º número: ");
            double numero2 = scanner.nextDouble();
            System.out.printf("Digite um operador: ");
            char operador = scanner.next().charAt(0);

            double resultadoDaOperacao;
            switch (operador){
                case '+':
                    resultadoDaOperacao = numero1 + numero2;
                    System.out.println("Resultado da operação: "+ resultadoDaOperacao);
                    break;
                case '-':
                    resultadoDaOperacao = numero1 - numero2;
                    System.out.println("Resultado da operação: "+ resultadoDaOperacao);
                    break;
                case '*':
                    resultadoDaOperacao = numero1 * numero2;
                    System.out.println("Resultado da operação: "+ resultadoDaOperacao);
                    break;
                case '/':
                    resultadoDaOperacao = numero1/numero2;
                    System.out.println("Resultado da operação: "+ resultadoDaOperacao);
                    break;
                default:
                    System.out.println("Operador inválido");
            }

            System.out.printf("Desja fazer outra operação? (S/N)");
            char resposta = scanner.next().charAt(0);

            if (resposta == 'N' || resposta == 'n'){
                repetir = false;
            }

            System.out.println();

        }while (repetir);

        System.out.println("Encerrando o programa....");

    }
}
