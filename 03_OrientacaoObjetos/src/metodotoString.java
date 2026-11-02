public class metodotoString {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa("João", 25);
        System.out.println(pessoa);
    }

    static class Pessoa {
        private String nome;
        private int idade;

        public Pessoa(String nome, int idade) {
            this.nome = nome;
            this.idade = idade;
        }

        @Override
        public String toString() {
            return "Pessoa{nome='" + nome + "', idade=" + idade + "}";
        }
    }
}