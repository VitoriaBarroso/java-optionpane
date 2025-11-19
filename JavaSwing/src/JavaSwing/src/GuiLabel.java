import javax.swing.*;
import java.awt.*;

public class GuiLabel extends JPanel {
    private JLabel label1, label2, label3, label4;
    private ImageIcon originalIcon;

    public GuiLabel(){
        iniciarComponentes();
    }
    private void iniciarComponentes(){
        setLayout(new GridLayout(4, 1, 10, 10));
        originalIcon = new ImageIcon(getClass().getResource("/image/Java.jpg"));
        setBackground(new Color(213, 100, 124));
        label1 = new JLabel("1. Aprendendo sobre JLabels", JLabel.CENTER);
        label1.setFont(new Font("Monospaced", Font.BOLD, 16));

        if (originalIcon != null) {
            Image img = originalIcon.getImage().getScaledInstance(150, 100, Image.SCALE_SMOOTH);
            ImageIcon resizedIcon = new ImageIcon(img);
            label2 = new JLabel(resizedIcon, JLabel.CENTER);
            label2.setToolTipText("Imagem de Exemplo");
        }
        label3 = new JLabel("3. Formatação de Cores", JLabel.CENTER);
        label3.setOpaque(true);
        label3.setBackground(Color.DARK_GRAY);
        label3.setForeground(Color.PINK);
        label3.setFont(new Font("Monospaced", Font.PLAIN, 14));
        ImageIcon finalIcon = (originalIcon != null) ? (ImageIcon) label2.getIcon() : null;
        label4 = new JLabel("", finalIcon, JLabel.CENTER);
        label4.setFont(new Font("arial", Font.ITALIC, 20));
        label4.setForeground(Color.BLACK);
        label4.setHorizontalTextPosition(JLabel.LEFT);
        label4.setVerticalTextPosition(JLabel.CENTER);
        add(label1);
        add(label2);
        add(label3);
        add(label4);
    }
}