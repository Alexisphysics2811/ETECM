/***
*Program: Practica1CasaDeCambio.java
*Author: Alexis Rabago
*Date: 30/10/2022
***/

//Lib
import java.awt.*;
import java.awt.event.*;
import java.util.concurrent.Flow;

import javax.swing.*;


public class Practica1CasaDeCambio extends JFrame implements ActionListener {
    
    private JLabel labelWelcome;
    private JTextField textFieldAmount, textFieldRate;
    private JButton buttonCalculate, buttonClear, buttonExit;

    public static void main(String[] args) throws Exception {
        Practica1CasaDeCambio demo = new Practica1CasaDeCambio();
        demo.setSize(750, 500);
        demo.createGUI();
        demo.setTitle("Currency Converter");
        demo.setVisible(true);
    }

    private void createGUI() {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        Container window = getContentPane();
        window.setLayout(new FlowLayout());

        labelWelcome = new JLabel("Welcome! Please enter the the amount of currency you want to convert and the conversion rate.\n");
        window.add(labelWelcome);

        textFieldAmount = new JTextField(10);
        textFieldAmount.setBounds(9,10,30,30);
        window.add(textFieldAmount);

        textFieldRate = new JTextField(10);
        textFieldRate.setBounds(9,10,30,30);
        window.add(textFieldRate);

        buttonCalculate = new JButton("Calculate");
        buttonCalculate.setBounds(2,40,30,30);
        window.add(buttonCalculate);
        buttonCalculate.addActionListener(this);
        
        buttonClear = new JButton("Clear");
        buttonClear.setBounds(2,40,30,30);
        window.add(buttonClear);
        buttonClear.addActionListener(this);

        buttonExit = new JButton("Exit");
        buttonExit.setBounds(2,40,30,30);
        window.add(buttonExit);
        buttonExit.addActionListener(this);
    }
}
