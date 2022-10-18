/***
*Program: Practica1CasaDeCambio.java
*Author: Alexis Rabago
*Date: 30/10/2022
*Notes: La prescencia de botones de direccion de cambio es redundante ya que es facilmente reemplazada por la tasa
*de cambio variable que proporciona el usuario. Ejemplo: USD y MXN 20.00/0.05
***/

//Lib
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Practica1CasaDeCambio extends JFrame implements ActionListener {
    
    private JLabel labelWelcome;
    private JTextField textFieldAmount, textFieldRate, textFieldResult;
    private JButton buttonCalculate, buttonClear, buttonExit;

    public static void main(String[] args) {
        Practica1CasaDeCambio demo = new Practica1CasaDeCambio();
        demo.setSize(750, 500);
        demo.createGUIP1();
        demo.setTitle("Currency Converter");
        demo.setVisible(true);
    }

    void createGUIP1() {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        Container window = getContentPane();
        window.setLayout(new FlowLayout());

        labelWelcome = new JLabel("Bienvenido! Por favor introduzca en los siguientes campos la cantidad a convertir y la tasa de cambio (el orden es irrelevante)\n");
        window.add(labelWelcome);

        textFieldAmount = new JTextField(10);
        textFieldAmount.setBounds(9,10,30,30);
        window.add(textFieldAmount);

        textFieldRate = new JTextField(10);
        textFieldRate.setBounds(9,10,30,30);
        window.add(textFieldRate);

        textFieldResult = new JTextField(10);
        textFieldResult.setBounds(9,10,30,30);
        textFieldResult.setEditable(false);
        textFieldResult.setEnabled(false);
        window.add(textFieldResult);

        buttonCalculate = new JButton("Calcular");
        buttonCalculate.setBounds(2,40,30,30);
        window.add(buttonCalculate);
        buttonCalculate.addActionListener(this);
        
        buttonClear = new JButton("Limpiar");
        buttonClear.setBounds(2,40,30,30);
        window.add(buttonClear);
        buttonClear.addActionListener(this);

        buttonExit = new JButton("Salir");
        buttonExit.setBounds(2,40,30,30);
        window.add(buttonExit);
        buttonExit.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        Object origin = e.getSource();

        if (origin == buttonCalculate) {
            String stringAmount, stringRate, stringResult;
            float Amount, Rate, Result;

            stringAmount = textFieldAmount.getText();
            stringRate = textFieldRate.getText();
            
            Amount = Float.parseFloat(stringAmount);
            Rate = Float.parseFloat(stringRate);

            Result = Amount*Rate;
            
            stringResult = String.valueOf(Result);
            textFieldResult.setText(stringResult);
        }
        else if (origin == buttonClear) {
            textFieldAmount.setText("");
            textFieldRate.setText("");
            textFieldResult.setText("");
        }
        else if (origin == buttonExit) {
            System.exit(0);
        }
    }
}
