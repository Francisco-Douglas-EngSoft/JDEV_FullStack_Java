public class ternario {
    public static void main(String[] args){
        int idade = 20;
        boolean maiorDeIdade = idade >= 18;

        // Operador ternario: condicao ? valor_se_verdadeiro : valor_se_falso
        String resultado = maiorDeIdade ? "Voce pode entrar." : "Voce nao pode entrar.";
        System.out.println(resultado);

    }
    
}
