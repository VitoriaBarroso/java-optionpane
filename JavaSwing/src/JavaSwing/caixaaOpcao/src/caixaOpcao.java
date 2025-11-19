
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class caixaOpcao {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            criarEMostrarGUI();
        });
    }

        private static void criarEMostrarGUI() {
            // 1. Cria a janela principal (JFrame)
            JFrame janela = new JFrame("Exemplo de Caixa de Opção");
            janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Define a ação de fechar a janela
            janela.setSize(400, 200); // Define o tamanho da janela
            janela.setLayout(new java.awt.FlowLayout()); // Define o layout dos componentes

            // 2. Cria as caixas de opção (JCheckBox)
            JCheckBox checkBox1 = new JCheckBox("Opção 1");
            JCheckBox checkBox2 = new JCheckBox("Opção 2");
            JCheckBox checkBox3 = new JCheckBox("Opção 3");

            // 3. Adiciona um rótulo para mostrar o status
            JLabel statusLabel = new JLabel("Status: Nenhuma opção selecionada");

            // 4. Cria o botão para verificar o status
            JButton verificarBotao = new JButton("Verificar Opções");

            // 5. Adiciona uma "ação" ao botão quando ele é clicado
            verificarBotao.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    String mensagem = "Opções selecionadas: ";
                    if (checkBox1.isSelected()) {
                        mensagem += "Opção 1, ";
                    }
                    if (checkBox2.isSelected()) {
                        mensagem += "Opção 2, ";
                    }
                    if (checkBox3.isSelected()) {
                        mensagem += "Opção 3, ";
                    }

                    // Remove a vírgula e o espaço extra no final
                    if (mensagem.endsWith(", ")) {
                        mensagem = mensagem.substring(0, mensagem.length() - 2);
                    } else {
                        mensagem = "Nenhuma opção selecionada";
                    }

                    statusLabel.setText("Status: " + mensagem);
                }
            });

            // 6. Adiciona os componentes à janela
            janela.add(checkBox1);
            janela.add(checkBox2);
            janela.add(checkBox3);
            janela.add(verificarBotao);
            janela.add(statusLabel);

            // 7. Torna a janela visível
            janela.setVisible(true);
    }
}

