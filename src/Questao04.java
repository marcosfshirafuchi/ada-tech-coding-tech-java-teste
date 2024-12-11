import java.util.Scanner;

public class Questao04 {
    /**
     * <h1> Coding Tank Java - Testes </h1>
     * Questão 4 ( 1 ponto )<br><br>
     * <p>
     * Um número para ser considerado primo deve ser divisível apenas por 1 e ele mesmo. Considerando isso, crie um programa que vai solicitar um número para o usuário e dizer se ele é primo.<br><br>
     * <p>
     * <b>Note:</b> Desenvolvido na linguagem Java.
     *
     * @author Marcos Ferreira Shirafuchi
     * @version 1.0
     * @since 10/12/2024
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int numero = scanner.nextInt();
        boolean numeroPrimo = true;
        if (numero <= 1) {
            numeroPrimo = false;
        } else {
            for (int i = 2; i <= Math.sqrt(numero); i++) {
                if (numero % i == 0) {
                    numeroPrimo = false;
                    break;
                }
            }
        }
        if (numeroPrimo) {
            System.out.printf("%d é um número primo.\n", numero);
        } else {
            System.out.printf("%d  não é um número primo.\n", numero);
        }
        scanner.close();
    }
}
