/***
*Program: Practica1CasaDeCambio.java
*Author: Alexis Rabago
*Date: 30/10/2022
***/

//Lib
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class Practica2CalculoDeSueldos extends JFrame implements ActionListener {
    
    private JLabel labelWelcome;
    private JTextField textField;
    private JButton button;

    public static void main(String[] args) {
        Practica1CasaDeCambio demo = new Practica1CasaDeCambio();
        demo.setSize(650, 500);
        demo.createGUI();
        demo.setTitle("Currency Converter");
        demo.setVisible(true);
    }

    private void createGUI() {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        Container window = getContentPane();
        window.setLayout(new FlowLayout());
    }

    public void actionPerformed(ActionEvent e) {
        Object o = e.getSource();
        
    }
}
