import javax.swing.JOptionPane;

public class calculoMedia {
    public static void main(String[] args) {
        // Aqui você pode adicionar código para calcular a média de valores.
        // Por exemplo, você pode solicitar ao usuário que insira vários valores
        // e depois calcular a média desses valores.

        String input = JOptionPane.showInputDialog("Digite os valores separados por vírgula:");
        String[] valoresStr = input.split(",");
        double soma = 0;
        int quantidade = valoresStr.length;

        for (String valorStr : valoresStr) {
            try {
                double valor = Double.parseDouble(valorStr.trim());
                soma += valor;
            } catch (NumberFormatException e) {
                System.out.println("Valor inválido: " + valorStr);
                quantidade--; // Desconta do total se o valor for inválido
            }
        }

        if (quantidade > 0) {
            double media = soma / quantidade;
            System.out.println("A média dos valores é: " + media);
        } else {
            System.out.println("Nenhum valor válido foi inserido.");
        }
    }
    
}
