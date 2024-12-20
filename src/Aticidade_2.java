import java.util.Scanner;

public class Aticidade_2 {
//    Crie um programa que leia uma palavra e verifique se ela é um palíndromo
//            (se pode ser lida da mesma forma de trás para frente). Ignore
//    diferenças entre maiúsculas e minúsculas.
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.printf("Digite uma palavra: ");
    String palavra = scanner.nextLine();
    String palavraInvertida = "";


    for (int i=palavra.length() - 1;i>=0;i--){
        palavraInvertida += palavra.charAt(i);
    }

    palavra = palavra.toUpperCase();
    palavraInvertida = palavraInvertida.toUpperCase();
    boolean palindromo = true;
    for (int i = 0; i <= palavra.length()-1 ; i++) {
        if (palavra.charAt(i) != palavraInvertida.charAt(i)){
            palindromo = false;
        }
    }
    if (palindromo){
        System.out.println("A palavra "+palavra+" é um palíndromo");
    }else {
        System.out.println(palavra+" Não é um palíndromo");
    }
}
}
