/*NOmbre: Indicar el nombre del Alumno
*Descripcion: un juego al azar entre usuario y computadora* 
* Fecha: 
* CLASE JUEGO  
*
* PERMITE JUGAR CONTRA LA MAQUINA SE REQUIERE DE IMAGENES PARA QUE LAS ENVIE
* SE UTILIZA LA CLASE RANDOM Y UNA NUEVA BIBLIOTECA
* 
* C:\Users\FUB07\workspace\Hola\    RUTA DONDE DEBEN DE ESTAR LAS IMAGENES
*/


import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
//import java.util.*;   //NUEVA BIBLIOTECA

public class Ejemplo8Imagenes extends JFrame 
implements ActionListener  {
	private JPanel panel1,  panel2;
	private JButton botonSalir, botonCasa, botonAuto;
	private ImageIcon imagenCasa, imagenAuto; // Objeto para manejar imágenes
	
     public static void main(String[] args){
	   Ejemplo8Imagenes marco = new Ejemplo8Imagenes();
        marco.setSize(600, 350);
        marco.crearGUI();
        marco.setVisible(true);
        marco.setTitle("Imágenes");         // Permite crear el titulo del marco
        marco.getContentPane().setBackground(Color.darkGray); // permite asignarle un color al marco
		}	
		
        public void crearGUI() {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        Container ventana = getContentPane();
        ventana.setLayout(new FlowLayout() );

		panel1 = new JPanel();
		panel1.setPreferredSize(new Dimension(250, 250));
		panel1.setBackground(Color.orange);
		ventana.add(panel1);
		
		// PERMITE CREAR UN NUEVO PANEL EN LA APLICACIÓN
		panel2 = new JPanel();    
		panel2.setPreferredSize(new Dimension(270, 250));
		panel2.setBackground(Color.red);
		ventana.add(panel2);
		
		botonCasa = new JButton("Cotización Exposición Casa");
		ventana.add(botonCasa);
		botonCasa.addActionListener(this);
		
		botonAuto = new JButton("Exposición del Auto");
		ventana.add(botonAuto);
		botonAuto.addActionListener(this);
		
		botonSalir = new JButton("Salir");
		ventana.add(botonSalir);
		botonSalir.addActionListener(this);
		

	    }
	    
	    public void actionPerformed(ActionEvent event){
	    	
	    	Object origen= event.getSource();
	    	imagenCasa = new ImageIcon();  // Instancia objeto imagen
	    	imagenAuto = new ImageIcon();  // Instancia objeto imagen
	    	Graphics r=panel1.getGraphics();
	    	Graphics b=panel2.getGraphics();
 	    	
	    	//imagen de la Casa
	    	if (origen == botonCasa) {
	    		imagenCasa=new ImageIcon("img/casa.jpg");
	    		imagenCasa.paintIcon(this,r,10,10);
	    		r.drawString( "Casa de Campo", 50,240);
	    	}
	    	else if (origen == botonAuto) {
	    		
	    		// Página para modificar imágenes http://webresizer.com/resizer/
	    		// Permite modificar el tamaño de la imagen
	    		//imagenAuto = new ImageIcon(new ImageIcon("imagenAuto.png").getImage().getScaledInstance(200, 140, Image.SCALE_DEFAULT));
	    		imagenAuto=new ImageIcon("img/auto.jpg");
	    		imagenAuto.paintIcon(this,b,0,0);
	    		b.drawString( "Auto Clásico", 50,240);
	    	}
	    	if (origen == botonSalir) {
	    		 System.exit(0);
	    	}

			
     }
}