public class condicionais {
    public static void main(String[] args){
        int idade = 20;
        boolean maiorDeIdade = idade >= 18;

        if(maiorDeIdade){
            System.out.println("Voce e maior de idade.");
        } else if(idade >= 16){
            System.out.println("Voce e menor de idade, mas pode votar.");
        } else {
            System.out.println("Voce e menor de idade.");
        }

        // Operador ternario: condicao ? valor_se_verdadeiro : valor_se_falso
        String resultado = maiorDeIdade ? "Voce pode entrar." : "Voce nao pode entrar.";
        System.out.println(resultado);
    }
    
}
