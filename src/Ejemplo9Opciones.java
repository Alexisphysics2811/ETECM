/******
*@Programa: Opciones.java
*Autor:    Nombre del Alumno  
*Fecha:    DD/MM/YYYY
*Profesor: Adriana Vega Palos
*Descripción: Objeto o control JRadioButton
*
*******/

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Ejemplo9Opciones extends JFrame implements ActionListener{
    private JTextField tf1,tf2;
    private ButtonGroup bg, ec;
    private JRadioButton radio1, radio2, radio3, c, v, d;
    private JLabel lblResultado;
    private JButton boton1, botonTermina;
    /*ENCAPSULAR VARIABLES RESPETE TIPO DE DATO*/
    private double acumulaOperaciones=0,  resultado=0;
    private String varResultado;
       
    public static void main(String[] ar) {
     Ejemplo9Opciones formulario1=new Ejemplo9Opciones();
        formulario1.setBounds(100,100,380,350);
        formulario1.setVisible(true);
    } 
    
    public Ejemplo9Opciones() {
        setLayout(null);
        tf1=new JTextField();
        tf1.setBounds(10,10,100,30);
        add(tf1);
        
        tf2=new JTextField();
        tf2.setBounds(10,60,100,30);
        add(tf2);
       
        lblResultado=new JLabel("Se mostrará Resultado");
        lblResultado.setBounds(200,80,150,30);
        add(lblResultado);
        
        bg=new ButtonGroup();
        radio1=new JRadioButton("Sumar");
        radio1.setBounds(10,110,100,30);
        bg.add(radio1); // incluir el JradioButton a el grupo
        add(radio1);
        
        radio2=new JRadioButton("Restar");
        radio2.setBounds(10,140,100,30);
        bg.add(radio2); // incluir el JradioButton a el grupo
        add(radio2);
        
        radio3=new JRadioButton("Multiplicar");
        radio3.setBounds(120,140,100,30);
        bg.add(radio3); // incluir el JradioButton a el grupo
        add(radio3);
        
        boton1=new JButton("Resultado");
        boton1.setBounds(40,180,100,30);
        boton1.addActionListener(this);
        add(boton1);
        
        botonTermina = new JButton("Cerrar Aplicación ");
        botonTermina.setBounds(180, 180, 160, 30);
        add(botonTermina);
        botonTermina.addActionListener( this);
    }
    
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==boton1) {
         
            double v1=Double.parseDouble(tf1.getText());
            double v2=Double.parseDouble(tf2.getText());
            
             if (radio1.isSelected()) {
             resultado=v1+v2;
             acumulaOperaciones=acumulaOperaciones + resultado;//Acumulador
             }
             
             if (radio2.isSelected()) {
             resultado=v1-v2;
             
             acumulaOperaciones=acumulaOperaciones + resultado;//Acumulador
             }
             
             if (radio3.isSelected()) {
             resultado=v1*v2;
             
              /*Acumula Operaciones*/           
             acumulaOperaciones=acumulaOperaciones + resultado;
             }
            
            setTitle(String.valueOf(resultado));
            
            varResultado=Double.toString(resultado);
            lblResultado.setText(varResultado);
            JOptionPane.showMessageDialog(null, "Se muestra " + 
             "\n la acumulación de las operaciones realizadas: " + acumulaOperaciones );
         }
        else{
         System.exit(0);
        }
    }
}