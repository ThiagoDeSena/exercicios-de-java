import java.util.Scanner;

public class Atividade_5 {
//    Escreva um programa
//    que receba duas palavras e determine se elas são anagramas (se possuem
//as mesmas letras, mas em ordem diferente). Exemplo: "amor" e "roma".
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.printf("Digite a 1º palavra: ");
    String Primeirapalavra = scanner.nextLine();
    System.out.printf("Digite a 2º palavra: ");
    String Segundapalavra = scanner.nextLine();

    boolean iguais = false;


    for (int i = 0; i < Primeirapalavra.length(); i++) {
        for (int j = 0; j < Segundapalavra.length(); j++) {
            if (Primeirapalavra.charAt(i) == Segundapalavra.charAt(j)){
                iguais = true;
                break;
            }else {
                iguais = false;
            }
        }
    }

    if (Primeirapalavra.length() != Segundapalavra.length()){
        iguais = false;
    }

    if (iguais){
        System.out.printf("As palavras "+Primeirapalavra+" e "+Segundapalavra+" são anagramas");
    }else {
        System.out.printf("As palavras NÃO são anagramas");
    }


}
}
