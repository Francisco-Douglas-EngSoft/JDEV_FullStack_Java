public class aninhados {
    public static void main(String[] args) {
        int idade = 20;
        boolean estudante = true;

        if (idade >= 18) {
            if (estudante) {
                System.out.println("Você é maior de idade e é estudante.");
            } else {
                System.out.println("Você é maior de idade, mas não é estudante.");
            }
        } else {
            System.out.println("Você é menor de idade.");
        }
    }
    
}
