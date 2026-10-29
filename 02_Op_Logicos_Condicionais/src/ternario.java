public class ternario {
    public static void main(String[] args){
        int idade = 20;
        boolean maiorDeIdade = idade >= 18;

        // Operador ternario: condicao ? valor_se_verdadeiro : valor_se_falso
        String resultado = maiorDeIdade ? "Voce pode entrar." : "Voce nao pode entrar.";
        System.out.println(resultado);


        //Calculo de Notas do Aluno
        double nota1 = 7.5;
        double nota2 = 8.0;
        double media = (nota1 + nota2) / 2;

        String resultadoAluno = media >= 7.0 ? "Aluno aprovado" : (media >= 5.0 ? "Aluno em recuperacao" : "Aluno reprovado");
        System.out.println("Media: " + media);
        System.out.println("Resultado: " + resultadoAluno);

    }
    
}
