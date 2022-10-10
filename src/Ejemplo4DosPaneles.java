/***:
*@Programa: Ejemplo4DosPaneles.java
*Autor:    Adriana Vega Palos
*Fecha:    10/10/2022.
*Descripcion: Trabajar con mas de un panel,botones, dibujar con figuras y cajas de mensajes
*             Dibujar en los 2 paneles
*
***/
/*Bibliotecas*/
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class Ejemplo4DosPaneles extends JFrame 
    implements ActionListener {

    private JButton boton, salir, mensaje;
    private JPanel panel,panel1;

    public static void main(String[] args) {
    	Ejemplo4DosPaneles marco = new Ejemplo4DosPaneles();
        marco.setSize(800, 400);
        marco.setTitle("Ejemplo 1");
        marco.crearGUI();
        marco.setVisible(true);
    }

    private void crearGUI() {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        Container ventana = getContentPane();
        ventana.setLayout(new FlowLayout() );

	panel = new JPanel();
	panel.setPreferredSize(new Dimension(350, 280));
	panel.setBackground(Color.CYAN);
	ventana.add(panel);

	panel1 = new JPanel();
	panel1.setPreferredSize(new Dimension(350, 280));
	panel1.setBackground(Color.lightGray);
	ventana.add(panel1);
	
	boton = new JButton("Haga clic");
	ventana.add(boton);
	boton.addActionListener(this);
	
	mensaje = new JButton("mensaje");
	ventana.add(mensaje);
	mensaje.setEnabled(false);
	mensaje.setAlignmentX(CENTER_ALIGNMENT);
	mensaje.addActionListener(this);
	
	salir = new JButton("Salir");
	ventana.add(salir);
	salir.setEnabled(false);
	salir.setAlignmentX(CENTER_ALIGNMENT);
	salir.addActionListener(this);
	

    }

    public void actionPerformed(ActionEvent event) {

    	Object origen= event.getSource(); //permite trabajar con más de un botón
    	
        Graphics papel = panel.getGraphics();
        Graphics papel1 = panel1.getGraphics();
 
        if (origen == boton) {
        	papel.drawLine(20, 20, 150, 150);
        	papel.setColor(Color.GREEN);
        	papel.drawOval(25, 25, 70, 70);
        	papel.setColor(Color.BLACK);
        	papel.drawString("Este es un texto que se dibuja .______..........",80,80);
        	papel.setColor(Color.YELLOW);
        	papel.drawRect(50, 50, 120, 120);
        	papel.fillRect(90, 90, 120, 120);
        	salir.setEnabled(true);
        	mensaje.setEnabled(true);          
            }
        else if (origen==mensaje){
        	JOptionPane.showMessageDialog(null, "Hola Dibujemos en dos panel"); //mensaje
        	papel1.setColor(Color.GREEN);
        	papel1.drawString("Rectángulo 3d...........",25,25);
        	papel.drawString("hola quiero estar en el primer panel",20,50);
        	papel1.draw3DRect(100, 100, 150, 150, true); 
        	papel1.setColor(Color.BLUE);
        	papel1.fillRoundRect(110, 110, 150, 150, 150, 150);
        	papel1.setColor(Color.MAGENTA);
        	papel1.drawString("Segundo Rectángulo...........",120,120);
        	papel1.setColor(Color.white);
        	papel1.drawOval(2, 2, 20, 20);
        	papel1.setColor(Color.MAGENTA);
        	papel1.fillOval(150,70, 10, 10);
        	
        	for(int i = 15; i <40; i++)
        	{
        		// Caja de mensaje
        		JOptionPane.showMessageDialog(null, "Muestra el incremento en la figura \n "
        				                      + "    cada que oprimas el botón de ok");
        		papel1.setColor(Color.ORANGE);
        		papel1.fillOval(i, i, 70, 70);
        		papel1.setColor(Color.YELLOW);
        		papel1.drawOval(i, i, 70, 70);
        		papel1.setColor(Color.BLUE);
        		papel1.drawOval(i, i, 70, 70);
        	}
        	
        } else {
        	 System.exit(0);// Sale del Sistema
        	 }
    }
}