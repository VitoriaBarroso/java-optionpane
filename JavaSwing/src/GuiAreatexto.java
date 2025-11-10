import java.awt.event.*;
import javax.swing.*;
import java.awt.*;


public class GuiAreatexto extends JPanel{
    private JTextField tfCampo;
    private JTextArea taTexto;
    private JScrollPane scrollPane;
    private JButton btLimpar;
    private final static String novaLinha = "\n";
    private final int LARGURA_ICONE = 32;
    private final int ALTURA_ICONE = 32;

    public GuiAreatexto(){
        inicializarComponentes();
        definirEventos();
    }

    private void definirEventos(){
        tfCampo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tfCampo.selectAll();
                taTexto.append(tfCampo.getText()+novaLinha);
                taTexto.setCaretPosition(taTexto.getDocument().getLength());
            }
        });
        btLimpar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tfCampo.setText("");
                taTexto.setText("");
            }
        });
    }

    private void inicializarComponentes(){
        setLayout(null);
        tfCampo = new JTextField();
        taTexto = new JTextArea();

        try {
            ImageIcon originalIcon = new ImageIcon(getClass().getResource("/image/borracha.png"));
            Image originalImage = originalIcon.getImage();
            Image resizedImage = originalImage.getScaledInstance(LARGURA_ICONE, ALTURA_ICONE, Image.SCALE_SMOOTH);
            ImageIcon resizedIcon = new ImageIcon(resizedImage);
            btLimpar = new JButton(resizedIcon);

        } catch (Exception e) {
            System.err.println("Erro ao carregar ou redimensionar a imagem: " + e.getMessage());
            btLimpar = new JButton("Limpar");
        }

        scrollPane = new JScrollPane(taTexto);
        tfCampo.setBounds(5, 15, 200, 25);
        btLimpar.setBounds(210, 15, 100, 25);
        scrollPane.setBounds(5, 45, 305, 120);
        add(tfCampo);
        add(btLimpar);
        add(scrollPane);
    }
}