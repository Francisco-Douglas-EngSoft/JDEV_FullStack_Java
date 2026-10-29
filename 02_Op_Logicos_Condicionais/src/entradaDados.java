import javax.swing.JOptionPane;

public class entradaDados {
    public static void main(String[] args) {
        // Aqui você pode adicionar código para 
        // entrada de dados, como leitura do teclado ou de arquivos.

        String valor = JOptionPane.showInputDialog("Digite um valor:"); // Exemplo de entrada de dados usando JOptionPane
        System.out.println("O valor digitado foi: " + valor);
    }
}
