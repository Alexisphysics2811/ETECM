/***
*Program: Practica2CalculoDeSueldos.java
*Author: Alexis Rabago
*Date: 30/10/2022
***/

//Lib
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class Practica2CalculoDeSueldos extends JFrame implements ActionListener {
    
    private JLabel labelWelcome;
    private JTextField textFieldDaily, textFieldAbsence, textFieldOutput;
    private JButton buttonCalculate, buttonClear, buttonExit;

    public static void main(String[] args) {
        Practica2CalculoDeSueldos demo = new Practica2CalculoDeSueldos();
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

        textFieldAbsence = new JTextField(10);
        textFieldAbsence.setBounds(9,10,30,30);
        window.add(textFieldAbsence);

        textFieldOutput = new JTextField(10);
        textFieldOutput.setBounds(9,10,30,30);
        textFieldOutput.setEditable(false);
        textFieldOutput.setEnabled(false);
        window.add(textFieldOutput);

        buttonCalculate = new JButton("Calcular");
        buttonCalculate.setBounds(2, 40, 30, 30);
        buttonCalculate.addActionListener(this);
        window.add(buttonCalculate);

        buttonClear = new JButton("Limpiar");
        buttonClear.setBounds(2, 40, 30, 30);
        buttonClear.addActionListener(this);
        window.add(buttonClear);

        buttonExit = new JButton("Salir");
        buttonExit.setBounds(2, 40, 30, 30);
        buttonExit.addActionListener(this);
        window.add(buttonExit);
    }

    public void actionPerformed(ActionEvent e) {
        Object o = e.getSource();
        if (o == buttonCalculate) {
            String stringDaily, stringAbsence, stringOutput;
            float Daily, Output;
            int Absence;

            stringDaily = textFieldDaily.getText();
            stringAbsence = textFieldAbsence.getText();
            Daily = Float.parseFloat(stringDaily);
            Absence = Integer.parseInt(stringAbsence);
            Output = 0;

            if (Daily*30 <=6500) {
                JOptionPane.showMessageDialog(null, "Ayuda de transporte: +350");
                Output = (Daily + 50)*7;
                if (Absence == 0) {
                    JOptionPane.showMessageDialog(null, "Bono de puntualidad: +" + (Output/100)*12);
                    Output = Output + (Output/100)*12;
                }
                else if (0 < Absence) {
                    JOptionPane.showMessageDialog(null, "Descuento de faltas: -" + (Output/7)*Absence);
                    Output = Output - (Output/7)*Absence;
                }
                JOptionPane.showMessageDialog(null, "Vales de despensa: +200");
                Output = Output + 200;
            }

            else if (Daily*30 > 6500) {
                Output = Daily*15;
                JOptionPane.showMessageDialog(null, "Fondo de ahorro: +" + (Output/100)*13);
                JOptionPane.showMessageDialog(null, "Vales de despensa: +" + (Output/100)*15);
                Output = Output + (Output/100)*13 + (Output/100)*15;
                if (0 < Absence) {
                    Output = Output - (Output/7)*Absence;
                }
            }
            JOptionPane.showMessageDialog(null, "Impuesto del 7%: -" + (Output/100)*7);
            Output = Output - (Output/100)*7;
            JOptionPane.showMessageDialog(null, "SS del 5%: -" + (Output/100)*5);
            Output = Output - (Output/100)*5;

            stringOutput = String.valueOf(Output);
            textFieldOutput.setText(stringOutput);

        }
        else if (o == buttonClear) {
            textFieldDaily.setText("");
            textFieldAbsence.setText("");
            textFieldOutput.setText("");
        }
        else if (o == buttonExit) {
            System.exit(0);
        }
    }
}
