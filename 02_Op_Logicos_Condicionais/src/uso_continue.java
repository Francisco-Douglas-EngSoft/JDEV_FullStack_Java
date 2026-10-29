public class uso_continue {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            if (i == 5) {
                continue; // O loop irá pular a iteração quando i for igual a 5
            }
            System.out.println("Contador: " + i);
        }
        //o operador continue é usado para pular a iteração atual de um loop e continuar com a próxima iteração. No exemplo acima, quando o valor de "i" for igual a 5, o loop irá pular essa iteração e continuar com o próximo valor de "i".
    }
}
