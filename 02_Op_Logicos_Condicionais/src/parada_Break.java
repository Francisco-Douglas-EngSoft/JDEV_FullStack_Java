public class parada_Break {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            if (i == 5) {
                break; // O loop será interrompido quando i for igual a 5
            }
            System.out.println("Contador: " + i);
        }
        //o operador break é usado para sair de um loop antes que ele termine normalmente. No exemplo acima, o loop será interrompido quando o valor de "i" for igual a 5, e o programa continuará a execução após o loop.
    }
}
