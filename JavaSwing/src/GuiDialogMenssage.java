import java.awt.event.*;
import javax.swing.*;
public class GuiDialogMenssage extends JPanel{
    private ImageIcon imageIcon1;
    private JComboBox cbCaixas;

    GuiDialogMenssage(){
        inicializarComponentes();
        definirEventos();
    }
    private void inicializarComponentes(){
        setLayout(null);
        imageIcon1 = new ImageIcon("/image/linux.jpg");
        String[] cbCaxaItens = {"Pergunta", "Informação", "Alerta","Erro"};
        cbCaixas = new JComboBox(cbCaxaItens);
        cbCaixas.setBounds(25,40,150,25);
        add(cbCaixas);
    }
    private void definirEventos(){
        cbCaixas.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                switch(cbCaixas.getSelectedIndex()){
                    case 0:
                        JOptionPane.showMessageDialog(null, "Estou aprendendo java?", "Pergunta", JOptionPane.QUESTION_MESSAGE); break;
                    case 1:
                        JOptionPane.showMessageDialog(null,"Gravação OK", "Informação",JOptionPane.INFORMATION_MESSAGE ); break;
                    case 2:
                        JOptionPane.showMessageDialog(null,"Cuidado!", "erro", JOptionPane.ERROR_MESSAGE); break;
                }
            }
        });
    }
}

