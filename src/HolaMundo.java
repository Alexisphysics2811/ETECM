/***:
*Program: HolaMundo.java
*Author:    Adriana Vega Palos
*Date:    27/09/2022.
*Description: Inicia POO Manejo de objetos y eventos
*
***/
/*Libraries*/
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class HolaMundo extends JFrame 
    implements ActionListener {

    private JButton boton;
    private JPanel panel;

    public static void main(String[] args) {
        HolaMundo marco = new HolaMundo();
        marco.setSize(420, 350);
        marco.crearGUI();
        marco.setTitle(" Mi primer programa de Java ");
        marco.setVisible(true);
    }

    private void crearGUI() {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        Container ventana = getContentPane();
        ventana.setLayout(new FlowLayout() );

	panel = new JPanel();
	panel.setPreferredSize(new Dimension(250, 150));
	panel.setBackground(Color.red);
	ventana.add(panel);

	boton = new JButton("Haga clic");
	ventana.add(boton);
	boton.addActionListener(this);
    }

    public void actionPerformed(ActionEvent event) {
        Graphics papel = panel.getGraphics();
	papel.drawLine(0, 0, 100, 100);
    }	
}
