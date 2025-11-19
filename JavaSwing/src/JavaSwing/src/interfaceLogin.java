import javax.swing.SwingUtilities;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class interfaceLogin {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            GUILogin telaLogin = new GUILogin();


            telaLogin.addWindowListener(new WindowAdapter() {
                @Override
                public void windowClosed(WindowEvent e) {

                    caixaOpcao telaCaixaOpcao = new caixaOpcao();
                    telaCaixaOpcao.setVisible(true);
                }
            });

            telaLogin.setVisible(true);
        });
    }
}