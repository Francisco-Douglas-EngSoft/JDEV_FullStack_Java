package mediaNotas;

import mediaNotas.Alunos;

public class calculoMedia {
    public static void main(String[] args){
        System.out.println("Calculando média...");

        Alunos aluno1 = new Alunos();
        aluno1.nome = "João";
        System.out.println("Nome do aluno: " + aluno1.nome);

        Alunos aluno2 = new Alunos();
        aluno2.nome = "Maria";
        System.out.println("Nome do aluno: " + aluno2.nome);
    }
}
