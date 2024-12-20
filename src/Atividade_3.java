import java.util.Arrays;
import java.util.Scanner;

public class Atividade_3 {
//    Implemente um programa que calcule e exiba os primeiros n números da sequência
//    de Fibonacci. n deve ser fornecido pelo/a usuário/a.
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.printf("Quantos número você quer ver na sequência de fibonacci: ");
    int n = scanner.nextInt();
    long fibonacci[] = new long[n];

    for (int i = 0; i < n; i++) {
        if (i==0){
            fibonacci[i] = 1;
        }
        if (i==1){
            fibonacci[i] = 1;
        }
        if (i>1){
            fibonacci[i] = fibonacci[i-1] + fibonacci[i-2];
        }
    }

    System.out.println(Arrays.toString(fibonacci));
}
}
