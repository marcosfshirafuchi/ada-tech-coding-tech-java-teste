import java.util.Scanner;

public class Questao02 {
    /**
     * <h1> Coding Tank Java - Testes </h1>
     * Questão 2 ( 3 pontos )<br><br>
     *
     * Dada uma turma de alunos com N alunos, sendo que essa quantidade deve ser solicitada e definida pelo usuário, solicite o nome e a nota de cada um dos alunos. Seu programa deve imprimir apenas aqueles alunos que tiraram nota maior que a média da nota de todos os alunos.<br><br>
     * <p>
     * <b>Note:</b> Desenvolvido na linguagem Java.
     *
     * @author Marcos Ferreira Shirafuchi
     * @version 1.0
     * @since 10/12/2024
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a quantidade de alunos desejada: ");
        int quantidadeDeAlunos = scanner.nextInt();
        String[] nomeDoAluno = new String[quantidadeDeAlunos];
        double[] notaDoAluno = new double[quantidadeDeAlunos];
        double media = 0, soma = 0;
        for (int i = 0; i <quantidadeDeAlunos; i++){
            scanner.nextLine();
            System.out.printf("Digite o nome do %dº aluno : ",(i+1));
            nomeDoAluno[i] = scanner.nextLine();
            System.out.printf("Digite a nota do %dº aluno : ",(i+1));
            notaDoAluno[i] = scanner.nextDouble();
            soma += notaDoAluno[i];
        }
        media = soma / quantidadeDeAlunos;
        System.out.printf("A Média das notas dos alunos = %.1f\n",media);
        System.out.printf("Alunos que tiraram nota maior que a média da nota (%.1f) de todos os alunos(%d): \n",media,quantidadeDeAlunos);
        for (int i = 0; i <quantidadeDeAlunos; i++){
            if (notaDoAluno[i] > media){
                System.out.printf("Aluno: %s tem nota = %.1f\n", nomeDoAluno[i],notaDoAluno[i]);
            }
        }
        scanner.close();
    }
}
