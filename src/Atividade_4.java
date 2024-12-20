import java.util.Scanner;

public class Atividade_4 {
//    Crie um programa que leia um número inteiro e exiba o número invertido.
//        Exemplo: se o usuário digitar 1234, o programa deve exibir 4321.
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int numero = scanner.nextInt();

        String numeroString = Integer.toString(numero);
        StringBuilder builder = new StringBuilder(numeroString);
        builder.reverse();
        String numeroInvertido = builder.toString();

        System.out.println("Número Invertido: "+numeroInvertido);
    }
}
