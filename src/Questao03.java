import java.util.Scanner;

public class Questao03 {
    /**
     * <h1> Coding Tank Java - Testes </h1>
     * Questão 3 ( 3 pontos )<br><br>
     * <p>
     * Uma família está dividindo uma pizza entre seus membros. Crie um programa que solicite o número de membros da família e o número de fatias da pizza. O programa deve calcular quantas fatias cada membro vai receber, e informar se haverá sobras e quantas fatias sobrarão. Se a pizza não puder ser igualmente dividida, o programa deve sugerir quantas fatias adicionais são necessárias para que todos recebam a mesma quantidade.<br><br>
     * <p>
     * <b>Note:</b> Desenvolvido na linguagem Java.
     *
     * @author Marcos Ferreira Shirafuchi
     * @version 1.0
     * @since 10/12/2024
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o número de membros da família: ");
        int numerosDeMembrosDaFamilia = scanner.nextInt();
        System.out.print("Digite o numero de fatias da pizza: ");
        int numerosDeFatiasDaPizza = scanner.nextInt();
        int fatiaPorMembro = numerosDeFatiasDaPizza / numerosDeMembrosDaFamilia;
        int sobrasDaPizza = numerosDeFatiasDaPizza % numerosDeMembrosDaFamilia;
        System.out.printf("Cada membro poderá comer %d fatias!\n", fatiaPorMembro);
        if(sobrasDaPizza > 0){
            System.out.printf("Sobrara %d fatias de pizzas!\n",sobrasDaPizza);
        }else{
            System.out.println("Não haverá sobras de pizza!");
        }
        if(sobrasDaPizza > 0){
            int fatiasAdicionais = numerosDeMembrosDaFamilia - sobrasDaPizza;
            System.out.printf("Falta %d fatias de pizzas para que todos membros da família comam igualmente!",fatiasAdicionais);
        }
        scanner.close();
    }

}
