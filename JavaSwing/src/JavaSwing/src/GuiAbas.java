import javax.swing.*;
import java.awt.*;

public class GuiAbas extends JPanel {
    private JTabbedPane abas;
    private JMenuItem aba;

    public GuiAbas() {
        setLayout(new BorderLayout());
        setBackground(Color.PINK);
        abas = new JTabbedPane();


        JPanel aba1 = new JPanel();
        aba1.add(new JLabel(" Aba 1"));
        abas.addTab("Aba 1", aba1);
        aba = new JMenuItem("GitHub", new ImageIcon(getClass().getResource("/image/git.jpg")));


        JPanel aba2 = new JPanel();
        aba2.add(new JLabel(" Aba 2"));
        abas.addTab("Aba 2", aba2);


        JPanel aba3 = new JPanel();
        aba3.add(new JLabel("Aba 3"));
        abas.addTab("Aba 3", aba3);

        add(abas, BorderLayout.CENTER);
    }
}