import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GuiMenuPrincipal extends JFrame {
    private Container contentPane;
    private JMenuBar mnBarra;
    private JMenu mnArquivo, mnExemplos;

    private JMenuItem miSair, miBotao, miCaixaOpcao, miRadioOpcao, miLabelOpcao, miLista, miListaFotos, miComboOpcao, miAreaTexto, miDialogo;

    public GuiMenuPrincipal() {
        inicializarComponentes();
        definirEventos();
    }

    private void inicializarComponentes() {
        setTitle("Menu Principal");
        setBounds(0, 0, 800, 600);
        contentPane = getContentPane();
        contentPane.setLayout(new BorderLayout());
        mnBarra = new JMenuBar();
        mnArquivo = new JMenu("Arquivo");
        mnArquivo.setMnemonic('A');
        mnExemplos = new JMenu("Exemplos");
        mnExemplos.setMnemonic('E');
        miSair = new JMenuItem("Sair", new ImageIcon(getClass().getResource("/image/git.jpg")));
        miBotao = new JMenuItem("Botão");
        miCaixaOpcao = new JMenuItem("Caixa Opçao");
        miRadioOpcao = new JMenuItem("Radio Button");
        miLabelOpcao = new JMenuItem("Label");
        miLista = new JMenuItem("Calculadora de Desconto");
        miListaFotos = new JMenuItem("Lista de Fotos");
        miComboOpcao = new JMenuItem("Combo Box");
        miAreaTexto = new JMenuItem("Área de Texto");
        // ADIÇÃO: Inicializa o novo item de menu
        miDialogo = new JMenuItem("Diálogo");

        mnArquivo.add(miSair);
        mnExemplos.add(miBotao);
        mnExemplos.add(miCaixaOpcao);
        mnExemplos.add(miRadioOpcao);
        mnExemplos.add(miLabelOpcao);
        mnExemplos.add(miLista);
        mnExemplos.add(miListaFotos);
        mnExemplos.add(miComboOpcao);
        mnExemplos.add(miAreaTexto);
        mnExemplos.add(miDialogo);

        mnBarra.add(mnArquivo);
        mnBarra.add(mnExemplos);
        setJMenuBar(mnBarra);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    private void definirEventos() {
        miSair.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        miBotao.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                contentPane.removeAll();
                contentPane.add(new GuiBotao(), BorderLayout.CENTER);
                contentPane.revalidate();
                contentPane.repaint();
            }
        });

        miCaixaOpcao.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                contentPane.removeAll();
                contentPane.add(new caixaOpcao(), BorderLayout.CENTER);
                contentPane.revalidate();
                contentPane.repaint();
            }
        });

        miRadioOpcao.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                contentPane.removeAll();
                contentPane.add(new GuiRadio(), BorderLayout.CENTER);
                contentPane.revalidate();
                contentPane.repaint();
            }
        });

        miLabelOpcao.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                contentPane.removeAll();
                contentPane.add(new GuiLabel(), BorderLayout.CENTER);
                contentPane.revalidate();
                contentPane.repaint();
            }
        });

        miLista.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                contentPane.removeAll();
                contentPane.add(new GuiLista(), BorderLayout.CENTER);
                contentPane.revalidate();
                contentPane.repaint();
            }
        });

        miListaFotos.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                contentPane.removeAll();
                contentPane.add(new GuiListaFotos(), BorderLayout.CENTER);
                contentPane.revalidate();
                contentPane.repaint();
            }
        });

        miComboOpcao.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                contentPane.removeAll();
                contentPane.add(new GuiCombo(), BorderLayout.CENTER);
                contentPane.revalidate();
                contentPane.repaint();
            }
        });

        miAreaTexto.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                contentPane.removeAll();
                contentPane.add(new GuiAreatexto(), BorderLayout.CENTER);
                contentPane.revalidate();
                contentPane.repaint();
            }
        });


        miDialogo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                contentPane.removeAll();
                contentPane.add(new GuiDialogMenssage(), BorderLayout.CENTER);
                contentPane.revalidate();
                contentPane.repaint();
            }
        });
    }

    public static void abrir() {
        GuiMenuPrincipal frame = new GuiMenuPrincipal();
        Dimension tela = Toolkit.getDefaultToolkit().getScreenSize();
        frame.setLocation((tela.width - frame.getSize().width) / 2, (tela.height - frame.getSize().height) / 2);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        abrir();
    }
}