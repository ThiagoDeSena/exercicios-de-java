import java.util.Scanner;

public class Atividade_7 {
//    Escreva um programa que
//    leia uma frase e conte o número de palavras nela. Considere que as
//    palavras estão separadas por espaços em branco.
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Digite uma frase: ");
    String frase = scanner.nextLine();

    int numeroDePalavras = 1;

    if (frase.isEmpty() || frase.isBlank()){
        numeroDePalavras = 0;
    } else {
        for (int i = 0; i < frase.length(); i++) {
            if (frase.charAt(i) == ' '){
                numeroDePalavras++;
            }
        }
    }


    if (numeroDePalavras!=0){
        System.out.println("A frase: \""+frase+"\" tem o total de "+numeroDePalavras+" palavras.");
    }else{
        System.out.println("A frase digitada não tem nenhuma palavra");
    }

}
}
