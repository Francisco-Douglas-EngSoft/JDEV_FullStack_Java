package mediaNotas;

import java.util.Scanner;

public class calculoMedia {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            Alunos aluno1 = new Alunos();
            aluno1.setNome("João");
            calcularNotas(scanner, aluno1);

            Alunos aluno2 = new Alunos();
            aluno2.setNome("Maria");
            calcularNotas(scanner, aluno2);
        }
    }

    private static void calcularNotas(Scanner scanner, Alunos aluno) {
        System.out.println("Informe as três notas de " + aluno.getNome() + " (de 0 a 10):");
        double nota1 = lerNota(scanner, 1);
        double nota2 = lerNota(scanner, 2);
        double nota3 = lerNota(scanner, 3);

        aluno.setNotas(nota1, nota2, nota3);
        System.out.printf("Média de %s: %.2f%n%n", aluno.getNome(), aluno.calcularMedia());
    }

    private static double lerNota(Scanner scanner, int numeroNota) {
        while (true) {
            System.out.print("Nota " + numeroNota + ": ");
            if (scanner.hasNextDouble()) {
                double nota = scanner.nextDouble();
                if (nota >= 0 && nota <= 10) {
                    return nota;
                }
                System.out.println("A nota deve estar entre 0 e 10.");
            } else {
                scanner.next();
                System.out.println("Informe um número válido.");
            }
        }
    }
}
