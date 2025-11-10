import java.awt.event.*;
import javax.swing.*;

public class GuiCombo extends JPanel{
    private JComboBox cbEstado;
    private JLabel lbEstados;
    private JButton btMostrar;

    public GuiCombo(){
        inicializarComponentes();
        definirEvento();
    }
    private void definirEvento(){
        btMostrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Indice Selecionado: "+cbEstado.getSelectedIndex()+"\n Texto Selecionado"+cbEstado.getSelectedIndex());
            }
        });
    }
    private void inicializarComponentes(){
        setLayout(null);
        String[] cbEstadosItens = {"Espirito Santo", "Minas Gerais", "Rio de Janeiro", "São Paulo"};
        cbEstado = new JComboBox(cbEstadosItens);
        lbEstados = new JLabel("Estado do Sudeste");
        btMostrar = new JButton("Mostrar");
        add(lbEstados);
        add(cbEstado);
        add(btMostrar);
        lbEstados.setBounds(25,15,150,25);
        cbEstado.setBounds(25,75,150,35);
        btMostrar.setBounds(25,75,100,25);
    }

}

