import java.util.Objects;

public class EqualsHashcode {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa("João", 30);
        Pessoa p2 = new Pessoa("João", 30);

        System.out.println(p1.equals(p2)); // true
        System.out.println(p1.hashCode() == p2.hashCode()); // true
    }

    static class Pessoa {
        private final String nome;
        private final int idade;

        Pessoa(String nome, int idade) {
            this.nome = nome;
            this.idade = idade;
        }

        @Override
        public boolean equals(Object objeto) {
            if (this == objeto) {
                return true;
            }
            if (!(objeto instanceof Pessoa)) {
                return false;
            }

            Pessoa outraPessoa = (Pessoa) objeto;
            return idade == outraPessoa.idade
                    && Objects.equals(nome, outraPessoa.nome);
        }

        @Override
        public int hashCode() {
            return Objects.hash(nome, idade);
        }
    }
}

// equals() e hashCode() em Java
// equals() verifica se dois objetos são considerados iguais pelo conteúdo. Sem sobrescrevê-lo, a implementação herdada de Object compara se são o mesmo objeto na memória.

// hashCode() retorna um número inteiro usado por coleções como HashSet e HashMap para localizar objetos com eficiência.

// Regra importante
// Se a.equals(b) retornar true, então a.hashCode() e b.hashCode() devem ser iguais. Por isso, ao sobrescrever equals(), sobrescreva também hashCode().

// O contrário não é obrigatório: objetos diferentes podem ter o mesmo hashCode().
