import javax.swing.*;
import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

public class GuiPedido extends JPanel {
    private JPanel pnPrincipal, pnTable;
    private JButton btRemover, btAdicionar;
    private JScrollPane scrollTable;
    private JTable table;
    private JLabel lbNumero, lbTotal, lbProduto, lbPrecoUnitario, lbQuantidade;
    private JTextField tfNumero, tfTotal, tfProduto, tfPrecoUnitario, tfQuantidade;
    private DefaultTableModel tableModel;
    private DecimalFormat df = new DecimalFormat("#,###.00");

    public GuiPedido() {
        inicializarComponentes();
        definirEventos();
    }

    private void inicializarComponentes() {
        setLayout(null);

        lbProduto = new JLabel("Produto");
        lbQuantidade = new JLabel("Quantidade");
        lbPrecoUnitario = new JLabel("Preço Unitário");
        lbNumero = new JLabel("Número do pedido");
        lbTotal = new JLabel("Total do pedido");

        tfProduto = new JTextField();
        tfPrecoUnitario = new JTextField();
        tfQuantidade = new JTextField();
        tfNumero = new JTextField();
        tfTotal = new JTextField();
        tfTotal.setEnabled(false);
        tfTotal.setHorizontalAlignment(JTextField.RIGHT);

        btAdicionar = new JButton("Adicionar");
        btAdicionar.setToolTipText("Adicionar um item ao pedido");
        btRemover = new JButton("Remover");
        btRemover.setToolTipText("Remove os itens selecionados");

        lbNumero.setBounds(15, 10, 120, 25);
        tfNumero.setBounds(130, 10, 100, 25);
        lbPrecoUnitario.setBounds(240, 10, 100, 25);
        tfPrecoUnitario.setBounds(345, 10, 100, 25);

        lbProduto.setBounds(15, 50, 100, 25);
        tfProduto.setBounds(130, 50, 100, 25);
        lbQuantidade.setBounds(240, 50, 100, 25);
        tfQuantidade.setBounds(345, 50, 100, 25);

        lbTotal.setBounds(15, 90, 100, 25);
        tfTotal.setBounds(130, 90, 100, 25);

        btAdicionar.setBounds(240, 90, 100, 25);
        btRemover.setBounds(345, 90, 100, 25);

        pnPrincipal = new JPanel();
        pnPrincipal.setLayout(null);
        pnPrincipal.setBounds(0, 0, 500, 400);

        pnPrincipal.add(lbNumero);
        pnPrincipal.add(tfNumero);
        pnPrincipal.add(lbPrecoUnitario);
        pnPrincipal.add(tfPrecoUnitario);
        pnPrincipal.add(lbProduto);
        pnPrincipal.add(tfProduto);
        pnPrincipal.add(lbQuantidade);
        pnPrincipal.add(tfQuantidade);
        pnPrincipal.add(lbTotal);
        pnPrincipal.add(tfTotal);
        pnPrincipal.add(btAdicionar);
        pnPrincipal.add(btRemover);

        pnTable = new JPanel(new BorderLayout());
        pnTable.setBorder(new TitledBorder("Itens do Pedido"));
        pnTable.setBounds(10, 130, 470, 230);

        tableModel = new DefaultTableModel(new String[]{"Produto", "Qtda", "Preço un", "Total"}, 0);
        table = new JTable(tableModel);

        DefaultTableCellRenderer alinhaDireita = new DefaultTableCellRenderer();
        alinhaDireita.setHorizontalAlignment(SwingConstants.RIGHT);
        table.getColumnModel().getColumn(1).setCellRenderer(alinhaDireita);
        table.getColumnModel().getColumn(2).setCellRenderer(alinhaDireita);
        table.getColumnModel().getColumn(3).setCellRenderer(alinhaDireita);

        table.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        table.getColumnModel().getColumn(0).setPreferredWidth(100);
        table.getColumnModel().getColumn(1).setPreferredWidth(50);
        table.getColumnModel().getColumn(2).setPreferredWidth(80);
        table.getColumnModel().getColumn(3).setPreferredWidth(80);

        scrollTable = new JScrollPane(table);
        pnTable.add(scrollTable, BorderLayout.CENTER);
        pnPrincipal.add(pnTable);
        add(pnPrincipal);
    }

    public void definirEventos() {
        btAdicionar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String produto = tfProduto.getText();
                String quantidadeStr = tfQuantidade.getText();
                String precoStr = tfPrecoUnitario.getText();

                if (produto.equals("") || quantidadeStr.equals("") || precoStr.equals("")) {
                    JOptionPane.showMessageDialog(null, "Preencha todos os campos!");
                    return;
                }

                try {
                    int quantidade = Integer.parseInt(quantidadeStr);
                    double preco = Double.parseDouble(precoStr);
                    double totalItem = quantidade * preco;

                    tableModel.addRow(new Object[]{
                            produto,
                            quantidade,
                            df.format(preco),
                            df.format(totalItem)
                    });

                    atualizarTotal();
                    tfProduto.setText("");
                    tfQuantidade.setText("");
                    tfPrecoUnitario.setText("");
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "Quantidade e preço devem ser numéricos.");
                }
            }
        });

        btRemover.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int[] linhas = table.getSelectedRows();
                if (linhas.length == 0) {
                    JOptionPane.showMessageDialog(null, "Selecione ao menos uma linha para remover.");
                    return;
                }
                for (int i = linhas.length - 1; i >= 0; i--) {
                    tableModel.removeRow(linhas[i]);
                }
                atualizarTotal();
            }
        });
    }

    private void atualizarTotal() {
        double total = 0;
        for (int i = 0; i < tableModel.getRowCount(); i++) {
            String valorStr = tableModel.getValueAt(i, 3).toString().replace(".", "").replace(",", ".");
            total += Double.parseDouble(valorStr);
        }
        tfTotal.setText(df.format(total));
    }
}