import javax.swing.JOptionPane;

public class confirmacao {
    public static void main(String[] args) {
        int resposta = JOptionPane.showConfirmDialog(null, "Deseja continuar?", "Confirmação", JOptionPane.YES_NO_OPTION);
        
        if (resposta == JOptionPane.YES_OPTION) {
            System.out.println("Você escolheu continuar.");
        } else if (resposta == JOptionPane.NO_OPTION) {
            System.out.println("Você escolheu não continuar.");
        } else {
            System.out.println("Você cancelou a operação.");
        }
    }
    
}
