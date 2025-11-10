import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class caixaOpcao extends JFrame {
    private JButton btVerificar, btMarcar, btDesmarcar;
    private JCheckBox  ckIngles, ckInformatica;

    public caixaOpcao(){
        setTitle("Exemplo de JCheckBox");
        setSize(300, 200);
        inicializarComponentes();
        definirEventos();
    }
    private void inicializarComponentes(){
        btVerificar = new JButton("Verificar");
        ckIngles = new JCheckBox("Ingles");
        ckInformatica = new JCheckBox("Informatica");
        btMarcar = new JButton("Marcar");
        btDesmarcar = new JButton("Desmarcar");
        setLayout(null);
        add(btVerificar);
        add(ckIngles);
        add(ckInformatica);
        add(btMarcar);
        add(btDesmarcar);
        btVerificar.setBounds(20,70,100,20);
        ckIngles.setBounds(15,15,100,25);
        ckInformatica.setBounds(15,40,100,25);
        btMarcar.setBounds(20,130,100,20);
    }
    private void definirEventos(){
        btMarcar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ckInformatica.setSelected(true);
                ckIngles.setSelected(true);
            }
        });
        btDesmarcar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ckInformatica.setSelected(false);
                ckIngles.setSelected(false);
            }
        });
        btVerificar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String selecao = "Selecionados";
                if(ckIngles.isSelected()){
                    selecao+="\nIngles";
                }
                if(ckInformatica.isSelected()){
                    selecao+="\nInformatica";
                }
                JOptionPane.showMessageDialog(null, selecao);

            }
        });
    }
}

