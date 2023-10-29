import java.util.Scanner;
import java.util.Random;

public class joguinho {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Random random = new Random();

        int nAleatorio = random.nextInt(100) + 1;
        int tentativas = 5;

        System.out.println("Bem vindo ao jogo!");
        System.out.println("Você tem 5 tentativas para adivinhar o número.");

        while (tentativas > 0) {
            System.out.println("Tentativas restantes: " + tentativas);
            System.out.println("Digite um número: ");
            int numero = entrada.nextInt();

            if(numero == nAleatorio) {
                System.out.println("Parabéns, você acertou!");
                break;
            } else if (Math.abs(numero - nAleatorio) == 1) {
                System.out.println("Tá quente!");
            } else if (numero < nAleatorio) {
                System.out.println("O número é maior");
            } else {
                System.out.println("O número é menor");
            }

            tentativas--;
        }
        if (tentativas == 0) {
            System.out.println("Game Over! O número correto era " + nAleatorio);
        }
        entrada.close();
    }
}