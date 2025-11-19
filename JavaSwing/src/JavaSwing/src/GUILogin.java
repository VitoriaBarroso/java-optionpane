import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUILogin extends JFrame {
    private JTextField tfLogin;
    private JPasswordField pfsenha;
    private JButton btLogar;
    private JButton btCancelar;

    public GUILogin() {
        iniciarComponentes();
        definirEventos();
    }

    private void iniciarComponentes() {
        setTitle("Login do Sistema");
        setSize(400, 250);
        setLayout(null);

        JLabel lbLogin = new JLabel("Login:");
        tfLogin = new JTextField(5);
        JLabel lbsenha = new JLabel("Senha:");
        pfsenha = new JPasswordField(5);
        btLogar = new JButton("Logar");
        btCancelar = new JButton("Cancelar");

        // estudo adcional para cores ao sistema //
        lbLogin.setForeground(new Color(51,161,139));
        lbsenha.setForeground(new Color(51,161,139));
        btLogar.setBackground(new Color(51, 153, 255));
        btLogar.setForeground(Color.WHITE);
        btCancelar.setBackground(Color.PINK);
        btCancelar.setForeground(Color.WHITE);

        // tamanho dos objetos //
        lbLogin.setBounds(50, 50, 80, 25);
        tfLogin.setBounds(120, 50, 200, 25);
        lbsenha.setBounds(50, 90, 80, 25);
        pfsenha.setBounds(120, 90, 200, 25);
        btLogar.setBounds(75, 150, 100, 25);
        btCancelar.setBounds(200, 150, 100, 25);
        add(lbLogin);
        add(tfLogin);
        add(lbsenha);
        add(pfsenha);
        add(btLogar);
        add(btCancelar);
    }

    private void definirEventos() {
        btLogar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String senha = new String(pfsenha.getPassword());
                String usuario = tfLogin.getText();
                if (usuario.equals("Java8") && senha.equals("java8")) {
                    JOptionPane.showMessageDialog(null, "Login bem-sucedido!");
                    dispose();
                    GuiMenuPrincipal.abrir();

                } else {
                    JOptionPane.showMessageDialog(null, "Login ou Senha Incorretos!");
                }
            }
        });

        btCancelar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               dispose();
            }
        });
    }}

//        btCancelar.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                System.exit(0);
//            }
//        });
//    }