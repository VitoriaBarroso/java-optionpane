import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Random;

public class GuiBotao extends JPanel {
    private JButton btMensagem, btTeimoso;
    private ImageIcon imageIcon1;

    public GuiBotao() {
        inicializarComponentes();
        definirEventos();
    }

    public void inicializarComponentes() {
        setLayout(null);
        // Caminho da imagem corrigido para ser mais seguro
        imageIcon1 = new ImageIcon(getClass().getResource("/image/git.jpg"));
        btMensagem = new JButton("Mensagem", imageIcon1);
        btMensagem.setBounds(50, 20, 140, 38);
        btMensagem.setToolTipText("Clique aqui para ver a mensagem");
        btTeimoso = new JButton("Teimoso");
        btTeimoso.setBounds(50, 70, 100, 25);
        add(btTeimoso);
        add(btMensagem);
    }

    public void definirEventos() {
        // Ação para o botão Mensagem
        btMensagem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Botão Mensagem !!");
            }
        });

        // Lógica do botão Teimoso
        btTeimoso.addMouseListener(new MouseAdapter() {
            private Random random = new Random();

            @Override
            public void mouseEntered(MouseEvent e) {
                int newX = random.nextInt(getWidth() - btTeimoso.getWidth());
                int newY = random.nextInt(getHeight() - btTeimoso.getHeight());
                btTeimoso.setLocation(newX, newY);
            }
        });
    }
}