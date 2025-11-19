import javax.swing.*;
import java.awt.*;

public class GuiBarraProgresso extends JPanel {
    private JProgressBar barraProgresso;

    public GuiBarraProgresso() {
        setLayout(new BorderLayout());
        barraProgresso = new JProgressBar(0, 100);
        barraProgresso.setValue(0);
        barraProgresso.setStringPainted(true);
        add(barraProgresso, BorderLayout.CENTER);
        simularProgresso();
    }

    private void simularProgresso() {
        SwingWorker<Void, Void> worker = new SwingWorker<>() {
            @Override
            protected Void doInBackground() throws Exception {
                for (int i = 0; i <= 100; i++) {
                    Thread.sleep(50);
                    barraProgresso.setValue(i);
                }
                return null;
            }
        };
        worker.execute();
    }
}