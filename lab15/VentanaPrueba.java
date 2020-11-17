import javax.swing.JFrame;
import javax.swing.JPanel;

public class VentanaPrueba extends JFrame {

  public VentanaPrueba(){
    setBounds(100, 100, 500, 500);
    setTitle("Título prueba");
    componentes();

    setDefaultCloseOperation(EXIT_ON_CLOSE);
  }

  public void componentes(){
    JPanel panel = new JPanel();

    panel.setBackground(Color.GREEN);
    this.getContentPane().add(panel);

  }

  public static void main(String[] args) {
    VentanaPrueba v1 = new VentanaPrueba();

    v1.setVisible(true);
  }
}
