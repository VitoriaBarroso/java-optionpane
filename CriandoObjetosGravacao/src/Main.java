
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main extends JFrame {


    private Computador pc = new Computador();
    private JLabel jlstatus = new JLabel("Status: Desligado");
    private JButton btLigar = new JButton("Ligar Computador");
    private JButton btDesligar = new JButton("Desligar Computador");

    public Main() {
        super("Controle de Computador");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 150);
        setLayout(new java.awt.FlowLayout());

        add(jlstatus);
        add(btLigar);
        add(btDesligar);
        btDesligar.setEnabled(false);
        configurarAcoes();
        setVisible(true);
    }

    private void configurarAcoes() {
        btLigar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                pc.ligar();
                jlstatus.setText("Status: Ligado!");
                btLigar.setEnabled(false);
                btDesligar.setEnabled(true);
            }
        });
        btDesligar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                String statusMsg = pc.desligar();
                jlstatus.setText("Status: " + statusMsg);
                btLigar.setEnabled(true);
                btDesligar.setEnabled(false);
            }
        });
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new Main());
    }
}