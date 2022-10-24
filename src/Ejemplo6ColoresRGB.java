/***:
*@Programa: Ejemplo RGB
*Autor:    Adriana Vega Palos
*Fecha:    DD/MM/AAAA
*Descripcion: Manejo de colores con rgb
*
***/
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Ejemplo6ColoresRGB extends JFrame 
    implements ActionListener {

    private JButton dibuja;
    private JPanel panel;

    public static void main(String[] args) {
        Ejemplo6ColoresRGB marco = new Ejemplo6ColoresRGB();
        marco.setSize(600, 700);
        marco.crearGUI();
        marco.setTitle("Manejo RGB -----");
        marco.setVisible(true);
    }

    private void crearGUI() {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        Container ventana = getContentPane();
        ventana.setLayout(new FlowLayout() );

        panel = new JPanel();
        panel.setPreferredSize(new Dimension(500, 400));
        panel.setBackground(Color.white);
		ventana.add(panel);

		dibuja = new JButton("Dibuja Figuras");
		ventana.add(dibuja);
		dibuja.addActionListener(this);
    }

    public void actionPerformed(ActionEvent event) {
        Graphics papel = panel.getGraphics();
        //se instancia el color con un constructor con el rgb 
        Color guinda = new Color (100, 0, 45); // RGB
        papel.setColor (guinda);
        papel.fill3DRect(100, 200, 100, 100,true);
        papel.fillRoundRect(MAXIMIZED_BOTH, ERROR, ABORT, ABORT, FRAMEBITS, FRAMEBITS);
        //papel.drawRect(25, 25, 100, 100);
        //papel.drawRoundRect(20, 6, 140, 89, 10, 20);
    } 
}