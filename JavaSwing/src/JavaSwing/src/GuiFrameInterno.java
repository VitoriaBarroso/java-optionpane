import java.awt.*;
import javax.swing.JInternalFrame;


public class GuiFrameInterno extends JInternalFrame {
    public GuiFrameInterno(){
        inicializarComponentes();
    }
private void  inicializarComponentes(){
    setTitle("Usando o frame interno");
    setSize(300,100);
    setResizable(true);
    setClosable(true);
    setMaximizable(true);
    setIconifiable(true);
    setBackground(Color.PINK);
    setVisible(true);
}
}

