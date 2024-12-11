import java.util.Scanner;

public class Questao01 {
    /**
     * <h1> Coding Tank Java - Testes </h1>
     * Questão 1 ( 3 pontos )<br><br>
     *
     * Um motorista precisa abastecer seu carro para uma viagem. O carro tem um consumo médio de combustível de 12 km por litro e o motorista planeja percorrer uma distância de 360 km. Crie um programa que solicite o preço do combustível por litro ao usuário e calcule o custo total da viagem. Além disso, informe quantos litros de combustível serão necessários para completar a viagem.<br><br>
     * <p>
     * <b>Note:</b> Desenvolvido na linguagem Java.
     *
     * @author Marcos Ferreira Shirafuchi
     * @version 1.0
     * @since 10/12/2024
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double distanciaTotal = 360, distanciaMedia = 12;
        System.out.print("Digite o preco do combustivel: ");
        double precoDoCombustivel = scanner.nextDouble();
        double litrosDeCombustivel = distanciaTotal / distanciaMedia;
        double custoTotalDeViagem = precoDoCombustivel * litrosDeCombustivel;
        System.out.printf("Custo total de viagem de %.1f km = R$ %.2f\n", distanciaTotal, custoTotalDeViagem);
        System.out.printf("Serão necessários %.1f litros de combustível para completar a viagem de %.1f km.\n", litrosDeCombustivel, distanciaTotal);
        scanner.close();
    }
}