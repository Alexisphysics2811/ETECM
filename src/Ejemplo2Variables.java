/***
*Program: Ejemplo2Variables.java
*Author:    Adriana Vega Palos
*Date:    29/09/2022
*Description: Inicia POO Manejo de objetos y eventos tipos de datos, 2 objetos cajas de texto y etiquetas
*             dos métodos setBouns (localizar objetos en la pantalla y setEditable
*
***/

//Libraries
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

//Class declaration
public class Ejemplo2Variables extends JFrame implements ActionListener {
    //Hereditations
    private JLabel etiquetaBienvenida;
    private JTextField campoCodigo, campoTextoResultado;
    private JButton boton, botonLimpiar, botonCerrar;
   
    //Class initialization
    public static void main(String[] args) {
        Ejemplo2Variables demo = new Ejemplo2Variables ();
        //Properties asignation with methods
        demo.setSize(400,550);
        demo.createGUI();
        demo.setTitle("Abrir Boveda");
        demo.setVisible(true);
    }

    //GUI Creation
    private void createGUI() {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        Container ventana = getContentPane();
        ventana.setLayout(new FlowLayout());

        //Instantiating controls using methods
        etiquetaBienvenida = new JLabel("Escriba el código");
        ventana.add(etiquetaBienvenida);

        campoCodigo = new JTextField(10);
        campoCodigo.setBounds(9, 10, 30, 30);
        ventana.add(campoCodigo);

        boton = new JButton("abrir");
        ventana.add(boton);
        boton.setBounds(2, 20, 30, 30);
        boton.addActionListener(this);

        campoTextoResultado = new JTextField(6);
        campoTextoResultado.setBounds(2, 30, 30, 30);
        campoTextoResultado.setEditable(false);  // no permite editar
        campoTextoResultado.setEnabled(false);   // no lo deja disponible
        ventana.add(campoTextoResultado);
        
        botonLimpiar = new JButton("Limpiar");
        botonLimpiar.setBounds(2, 40, 30, 30);
        ventana.add(botonLimpiar);
        botonLimpiar.addActionListener(this);
        
        botonCerrar = new JButton("Salir");
        botonCerrar.setAlignmentX(CENTER_ALIGNMENT);
        botonCerrar.setBounds(2, 50, 30, 30);
        ventana.add( botonCerrar);
        botonCerrar.addActionListener(this);
       
    }

    //Event programming
    public void actionPerformed(ActionEvent event) {
    	Object origen= event.getSource(); //multiple buttons
    	if (origen == boton) {	
           String cadenaCodigo;  //str variable
           int codigo;            //int variable
          

           cadenaCodigo = campoCodigo.getText();   //Textbox input
           codigo = Integer.parseInt(cadenaCodigo);//str to int
                                                   //Double.parseDouble or Float.parseFloat if float
           
           if (codigo == 123) {                      //Validation
           
               campoTextoResultado.setText("abierta");//Textbox output
               
              }
           else 
              {
        	   JOptionPane.showMessageDialog(null,"Clave Incorrecta  " + cadenaCodigo); 
        	                                                         //concatenation
              }
    	}
    	else if (origen == botonLimpiar) {
    		//clear textbox
    		campoCodigo.setText("");       
    		campoTextoResultado.setText("");
    	}
    	     else {
    	    	 System.exit(0);// Exit Button
    	}
    }
}