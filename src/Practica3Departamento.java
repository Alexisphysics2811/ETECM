/***
*Program: Practica2CalculoDeSueldos.java
*Author: Alexis Rabago
*Date: 30/10/2022
***/

//Lib
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class Practica3Departamento extends JFrame implements ActionListener {
     private JLabel labelWelcome;
     private JPanel panelBlueprint, panelInfo;

     public static void main(String[] args) {
        Practica3Departamento demo = new Practica3Departamento ();
        demo.setSize(650, 500);
        demo.createGUI();
        demo.setTitle("Departamento");
        demo.setVisible(true);
     }

     private void createGUI() {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        Container window = getContentPane();
        window.setLayout(new FlowLayout());

        labelWelcome = new JLabel("Departamento Postes #69");
     }
}
