import javax.swing.JOptionPane;

public class entradaDados {
    public static void main(String[] args){
        String nome = JOptionPane.showInputDialog("Digite seu nome: ");
        String idade = JOptionPane.showInputDialog("Digite sua idade: ");

        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
    }
}
