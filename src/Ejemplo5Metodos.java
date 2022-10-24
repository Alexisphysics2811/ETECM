/**
 * @(#) Ejemplo Metodos.java
 *
 * @Descripción Realiza dos tipos de Métodos
 * @author Profesora Adriana Vega Palos
 * Fecha:  Ciclos Escolar
 * @version 1.00
 */
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Ejemplo5Metodos extends JFrame 
    implements ActionListener {

    private JButton salir, ejecutar;
    private JPanel panel;

    public static void main(String[] args) {
     Ejemplo5Metodos marco = new Ejemplo5Metodos();
        marco.setSize(420, 420);
        marco.crearGUI();
        marco.setVisible(true);
    }

    private void crearGUI() {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        Container ventana = getContentPane();
        ventana.setLayout(new FlowLayout() );

		 panel = new JPanel();
		 panel.setPreferredSize(new Dimension(330, 330));
		 panel.setBackground(Color.white);
		 ventana.add(panel);
		
		 ejecutar = new JButton("Haga clic");
		 ventana.add(ejecutar);
		 ejecutar.addActionListener(this);
		 
		 salir = new JButton("Salir");
		 ventana.add(salir);
		 salir.addActionListener(this);
    }

  public void actionPerformed(ActionEvent event) {
     Graphics papel = panel.getGraphics();
 	Object origen= event.getSource(); //para trabajar con más de un botón
 	
     if (origen == ejecutar) {
    	 dibujarLogo(papel, 10, 20);
    	 dibujarLogo(papel, 100, 100);
     
    	 papel.setColor(Color.RED);
     
    	 papel.drawOval(200, 30, 100, 100);
    	 papel.drawOval(230, 50, 70, 70);
    	 papel.drawOval(250, 60, 50, 50);
     
    	 //variables a utilizar
    	 int a;
    	 String cLongitud, cAnchura;
    	 int iLongitud, iAnchura;

    	 // Caja de mensaje de entrada de datos
    	 cLongitud = JOptionPane.showInputDialog("introduce Longitud");
    	 cAnchura  = JOptionPane.showInputDialog("introduce Anchura");

    	 // Convertir valores numéricos
    	 iLongitud = Integer.parseInt(cLongitud);
    	 iAnchura  = Integer.parseInt(cAnchura);

    	 a = areaRectangulo(iLongitud, iAnchura);
    	 JOptionPane.showMessageDialog(null, "El área es: " + a); 
     }
     else {
       	 System.exit(0);// Sale del Sistema
       	 }
   } 

    
 //Método no regresa parámetro(s)
    private void dibujarLogo(Graphics areaDibujo,
    	int xPos, int yPos) {
    	areaDibujo.setColor(Color.green);
    	areaDibujo.drawRect(xPos, yPos, 60, 60);
    	areaDibujo.drawRect(xPos, yPos, 40, 40);
    	areaDibujo.drawRect(xPos, yPos, 20, 20);
 }
    
  // Método regresa un parámetro o resultado
    private int areaRectangulo(int longitud, int anchura) {
    	int area;
    	area = longitud * anchura;
    	return area;
    }
    
}