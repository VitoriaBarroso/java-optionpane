import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent; // Adicionado para KeyEvent

public class GuiLista extends JPanel {
    private JButton btCalcular;
    private JLabel lbValor;
    private JTextField tfValor;
    private JList<String> liDesconto; // Tipo genérico para JList
    private JTextField tfValorDesconto;
    private JScrollPane spLista;

    public GuiLista(){
        inicializarComponentes();
        definirEventos();
    }
    private void inicializarComponentes(){
        setLayout(null);
        String[] liDescontoItens = {"10%", "20%", "30%", "40%", "50%"};
        btCalcular = new JButton("Calcular");
        lbValor = new JLabel("Valor");
        tfValor = new JTextField(5);
        liDesconto = new JList<>(liDescontoItens);
        tfValorDesconto = new JTextField(5);
        tfValorDesconto.setEditable(false);
        spLista = new JScrollPane(liDesconto);
        btCalcular.setToolTipText("Faz o cálculo");
        btCalcular.setMnemonic(KeyEvent.VK_C);
        lbValor.setBounds(35, 5, 100, 25);
        tfValor.setBounds(35, 30, 100, 25);
        spLista.setBounds(35, 60, 100, 90);
        btCalcular.setBounds(35, 160, 100, 25);
        tfValorDesconto.setBounds(35, 195, 100, 25);
        add(btCalcular);
        add(lbValor);
        add(tfValor);
        add(spLista);
        add(tfValorDesconto);
    }
    private void definirEventos() {
        btCalcular.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (tfValor.getText().isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Por favor, digite um valor.");
                    tfValor.requestFocus();
                    return;
                }
                if (liDesconto.getSelectedIndex() == -1) {
                    JOptionPane.showMessageDialog(null, "Selecione um item da lista.");
                    return;
                }
                try {
                    float valor = Float.parseFloat(tfValor.getText());
                    int selectedIndex = liDesconto.getSelectedIndex();
                    float[] descontos = {0.10f, 0.20f, 0.30f, 0.40f, 0.50f};
                    float valorFinal = valor * (1 - descontos[selectedIndex]);
                    tfValorDesconto.setText(String.format("%.2f", valorFinal));
                } catch (NumberFormatException erro) {
                    JOptionPane.showMessageDialog(null, "Forneça apenas números válidos.");
                    tfValor.requestFocus();
                }
            }
        });
    }}

