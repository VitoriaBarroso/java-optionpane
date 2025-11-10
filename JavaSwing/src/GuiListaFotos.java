import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.*;

public class GuiListaFotos extends JPanel {
    private JList<String> liFotos;
    private JLabel lbFoto;
    private JScrollPane spLista;

    public GuiListaFotos() {
        inicializarComponentes();
        definirEventos();
    }
    private void inicializarComponentes() {
        setLayout(new BorderLayout(10, 10));
        String[] nomesFotos = {"git.jpg", "Java.jpg", "linux.jpg"};
        // JList que exibe a lista de nomes de arquivos
        liFotos = new JList<>(nomesFotos);
        liFotos.setFont(new Font("Arial", Font.PLAIN, 14));
        spLista = new JScrollPane(liFotos);
        spLista.setPreferredSize(new Dimension(200, 0));
        lbFoto = new JLabel("Selecione uma foto na lista", JLabel.CENTER);
        lbFoto.setFont(new Font("Arial", Font.BOLD, 16));
        lbFoto.setHorizontalTextPosition(JLabel.CENTER);
        lbFoto.setVerticalTextPosition(JLabel.BOTTOM);
        add(spLista, BorderLayout.WEST);
        add(lbFoto, BorderLayout.CENTER);
    }

    private void definirEventos() {
        liFotos.addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                if (!e.getValueIsAdjusting()) {
                    String nomeArquivo = liFotos.getSelectedValue();
                    if (nomeArquivo != null) {
                        try {
                            String caminhoFoto = "/image/" + nomeArquivo;
                            ImageIcon icon = new ImageIcon(getClass().getResource(caminhoFoto));
                            Image imagem = icon.getImage().getScaledInstance(
                                    lbFoto.getWidth(), lbFoto.getHeight(), Image.SCALE_SMOOTH);
                            lbFoto.setIcon(new ImageIcon(imagem));
                            lbFoto.setText(nomeArquivo);
                        } catch (Exception ex) {
                            lbFoto.setIcon(null);
                            lbFoto.setText("Erro ao carregar a foto.");
                            ex.printStackTrace();
                        }
                    }
                }
            }
        });
    }
}