public class VariaveisGlobaisLocais {

    // Variável global
    static int maior = 32;

    public static void main(String[] args) {

        // Variável local
        int maiorIdade = 19;

        System.out.println("A variável maiorIdade é uma variável local: " + maiorIdade);
        System.out.println("Variável global: " + maior);

        // Chamada do método
//        metodo();
    }

    // Outro método
//    public static void metodo() {
//        System.out.println("Método executado!");
//    }
}