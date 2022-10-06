/***
*Programa: Ejemplo3Layout.java
*Autor:    Profesora Adriana Vega Palos
*Fecha:    dd/mm/AAAA
*Descripcion: Manejo de Layout y Método setBouns
*             
*
***/

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Ejemplo3Layout extends JFrame implements ActionListener {

    private JLabel etiquetaBienvenida,EtiquetaResultado;
    private JTextField campoCodigo, campoTextoResultado;
    private JButton botonMostrar, botonLimpiar, botonCerrar;


    public static void main(String[] args) {
        Ejemplo3Layout demo = new Ejemplo3Layout ();
        demo.setSize(500,400);
        demo.crearGUI();
        demo.setTitle("Acomodar controles y panels");
        demo.setVisible(true);
    }

    private void crearGUI() {
        //setDefaultCloseOperation(EXIT_ON_CLOSE);
        Container ventana = getContentPane();
        //ventana.setLayout(new FlowLayout());
        setLayout(null);
        
        etiquetaBienvenida = new JLabel("Escribe una clave numérica");
        etiquetaBienvenida.setBounds(10, 10, 200, 20);
        ventana.add(etiquetaBienvenida);

        EtiquetaResultado = new JLabel("Muestra la acción");
        EtiquetaResultado.setBounds(10, 40, 250, 20);
        ventana.add(EtiquetaResultado);        
        
        campoCodigo = new JTextField(18);
        campoCodigo.setBounds(175, 10, 60, 18);
        ventana.add(campoCodigo);

        campoTextoResultado = new JTextField(18);
        campoTextoResultado.setBounds(175, 40, 230, 20);
        campoTextoResultado.setEditable(false);  // no permite editar
        campoTextoResultado.setEnabled(false);   // no lo deja disponible
        ventana.add(campoTextoResultado);
        
        botonMostrar = new JButton("Ejecutar");
        ventana.add(botonMostrar);
        botonMostrar.setBounds(20, 100, 200, 30);
        botonMostrar.addActionListener(this);
        
        botonLimpiar = new JButton("Limpiar Cajas de Texto");
        botonLimpiar.setBounds(20, 140, 200, 30);
        botonLimpiar.setAlignmentX(RIGHT_ALIGNMENT);
        ventana.add(botonLimpiar);
        botonLimpiar.addActionListener(this);
        
        botonCerrar = new JButton("Cerrar");
        botonCerrar.setAlignmentX(CENTER_ALIGNMENT);
        botonCerrar.setBounds(20, 180, 200, 30);
        ventana.add( botonCerrar);
        botonCerrar.addActionListener(this);
             
    }
    // inicia la programación para que algunos objetos realicen sus eventos
    
    public void actionPerformed(ActionEvent event) {
    	Object origen= event.getSource(); //permite trabajar con mas de un botón
    	
    	if (origen == botonMostrar) {	
           String cadenaCodigo;  // variable tipo texto
           int codigo;            //variable tipo entero
          

           cadenaCodigo = campoCodigo.getText();   //recibe el valor de la caja de texto en la variable
           codigo = Integer.parseInt(cadenaCodigo);//utiliza la variable de cadena para cambiarla a numérica
                                                   /*si el valor es decimal sera Double.parseDouble
                                                     o Float.parseFloat    */
           
           if (codigo == 9876) {                      //valida la variable entera
           
               campoTextoResultado.setText("¡Felicidades! clave correcta");//enviando un cadena de datos a la caja de texto
               
              }
           else 
              {
        	   JOptionPane.showMessageDialog(null,"Clave Incorrecta  " + cadenaCodigo); 
        	                                                         //el + es una concatenación
              }
    	}
    	else if (origen == botonLimpiar) {
    		//limpia cajas de texto
    		campoCodigo.setText("");       
    		campoTextoResultado.setText("");
    	}
    	     else {
    	    	 System.exit(0);// Sale del Sistema
    	}
    }
}