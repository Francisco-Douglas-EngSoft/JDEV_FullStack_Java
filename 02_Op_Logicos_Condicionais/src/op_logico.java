public class op_logico {
    public static void main(String[] args){
        boolean a = true;
        boolean b = false;

        // AND (&&): retorna true somente quando as duas condicoes sao true.
        boolean c = a && b;

        // OR (||): retorna true quando pelo menos uma das condicoes e true.
        boolean d = a || b;

        // NOT (!): inverte o valor logico; true vira false e vice-versa.
        boolean e = !a;

        System.out.println("a && b: " + c);
        System.out.println("a || b: " + d);
        System.out.println("!a: " + e);

        /*
         * Tabela-verdade para AND (&&) e OR (||):
         *
         * a      b      a && b    a || b
         * true   true   true      true
         * true   false  false     true
         * false  true   false     true
         * false  false  false     false
         *
         * O operador ! e aplicado a uma unica condicao:
         * !true = false e !false = true.
         *
         * && e || sao operadores de curto-circuito: quando o resultado
         * ja pode ser determinado pela primeira condicao, a segunda nao
         * e avaliada.
         */
    }
    
}
