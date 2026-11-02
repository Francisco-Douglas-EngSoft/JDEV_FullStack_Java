import java.util.ArrayList;
import java.util.List;

public class relacionamentoObjetos {
    public static void main(String[] args) {
        Curso curso = new Curso("Java Orientado a Objetos");

        Aluno aluno1 = new Aluno("Ana");
        Aluno aluno2 = new Aluno("Carlos");

        curso.adicionarAluno(aluno1);
        curso.adicionarAluno(aluno2);

        curso.exibirAlunos();
    }

    static class Aluno {
        private final String nome;

        Aluno(String nome) {
            this.nome = nome;
        }

        String getNome() {
            return nome;
        }
    }

    static class Curso {
        private final String nome;
        private final List<Aluno> alunos = new ArrayList<>();

        Curso(String nome) {
            this.nome = nome;
        }

        void adicionarAluno(Aluno aluno) {
            alunos.add(aluno);
        }

        void exibirAlunos() {
            System.out.println("Curso: " + nome);
            System.out.println("Alunos matriculados:");
            for (Aluno aluno : alunos) {
                System.out.println("- " + aluno.getNome());
            }
        }
    }
}
