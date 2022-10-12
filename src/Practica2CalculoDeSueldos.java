/***
*Program: Practica1CasaDeCambio.java
*Author: Alexis Rabago
*Date: 30/10/2022
***/

//Lib
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.undo.StateEditable;


public class Practica2CalculoDeSueldos extends JFrame implements ActionListener {
    
    private JLabel labelWelcome;
    private JTextField textFieldDaily, textFieldAbsenceCount, textFieldOutput;
    private JButton buttonCalculate, buttonClear, buttonExit;

    public static void main(String[] args) {
        Practica1CasaDeCambio demo = new Practica1CasaDeCambio();
        demo.setSize(650, 500);
        demo.createGUI();
        demo.setTitle("Salary Calculator");
        demo.setVisible(true);
    }

    private void createGUI() {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        Container window = getContentPane();
        window.setLayout(new FlowLayout());

        labelWelcome = new JLabel("Favor de introducir el Sueldo Diario y la cantidad de inasistencias: ");
        window.add(labelWelcome);

        textFieldDaily = new JTextField(10);
        textFieldDaily.setBounds(9,10,30,30);
        window.add(textFieldDaily);

        textFieldAbsenceCount = new JTextField(10);
        textFieldAbsenceCount.setBounds(9,10,30,30);
        window.add(textFieldAbsenceCount);

        textFieldOutput = new JTextField(10);
        textFieldOutput.setBounds(9,10,30,30);
        textFieldOutput.setEditable(false);
        textFieldOutput.setEnabled(false);
        window.add(textFieldOutput);

        buttonCalculate = new JButton("Calculate");
        buttonCalculate.setBounds(2, 40, 30, 30);
        buttonCalculate.addActionListener(this);
        window.add(buttonCalculate);

        buttonClear = new JButton("Clear");
        buttonClear.setBounds(2, 40, 30, 30);
        buttonClear.addActionListener(this);
        window.add(buttonClear);

        buttonExit = new JButton("Exit");
        buttonExit.setBounds(2, 40, 30, 30);
        buttonExit.addActionListener(this);
        window.add(buttonExit);
    }

    public void actionPerformed(ActionEvent e) {
        Object o = e.getSource();
        if (o == buttonCalculate) {
            String stringDaily, stringAbsense, stringOutput;
            float Daily, Absense, Output;

            stringDaily = textFieldDaily.getText();
            stringAbsense = textFieldAbsense.getText();
            Daily = Float.parseFloat(stringDaily);
            Absense = Float.parseFloat(stringAbsense);
            Output = Float.parseFloat(stringOutput);

            
        }
        else if (o == buttonClear) {
            textFieldDaily.setText("");
            textFieldAbsenceCount.setText("");
            textFieldOutput.setText("");
        }
        else if (o == buttonExit) {
            System.exit(0);
        }
    }
}
