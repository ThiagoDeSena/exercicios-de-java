import java.util.Random;
import java.util.Scanner;

public class Atividade_6 {
//    Crie um
//    jogo em que o programa escolhe um número entre 1 e 50, e o/a usuário/a
//    deve adivinhar. O programa informa apenas se o palpite está certo ou
//    errado. O jogo termina quando o número é adivinhado.
public static void main(String[] args) throws InterruptedException {
    Scanner scanner = new Scanner(System.in);
    Random random = new Random();

    System.out.println("Gerando um número....");
    Thread.sleep(2000);
    int numero = random.nextInt(49) +1;

    System.out.print("Adivinhe o número sorteado: ");
    int numeroAdivinhado = scanner.nextInt();

    if (numeroAdivinhado == numero){
        System.out.println("Parabéns! Você adivinhou o número :)");
    }else {
        System.out.printf("Não foi dessa vez! :(\nO número sorteado foi o: "+numero);
    }

}
}
