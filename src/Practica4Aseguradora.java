/***
*Program: Practica4Aseguradora.java
*Author: Alexis Rabago
*Date: 30/10/2022
***/

//Lib
import java.awt.*;
import java.awt.event.*;
import java.util.concurrent.Flow;

import javax.swing.*;

public class Practica4Aseguradora extends JFrame implements ActionListener {
    
    private JLabel labelWelcome, labelName, labelPhone, labelEmail, labelBirthYear;
    private JTextField fieldName, fieldPhone, fieldEmail, fieldBirthYear;
    private JButton buttonLifeInsurance, buttonCarInsurance;

    public static void main(String[] args) {
        Practica4Aseguradora demo = new Practica4Aseguradora();
        demo.setSize(1200, 700);
        demo.createGUI();
        demo.setTitle("Quanta Insurance");
        demo.setVisible(true);
    }

    private void createGUI() {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        Container window = getContentPane();
        window.setLayout(new FlowLayout());

        labelWelcome = new JLabel("Welcome. Please enter the requested data and choose your insurance plan.\n");
        window.add(labelWelcome);

        labelName = new JLabel("Name");
        window.add(labelName);
        fieldName = new JTextField(10);
        fieldName.setBounds(9,10,30,30);
        window.add(fieldName);

        labelPhone = new JLabel("Phone");
        window.add(labelPhone);
        fieldPhone = new JTextField(10);
        fieldPhone.setBounds(9,10,30,30);
        window.add(fieldPhone);

        labelEmail = new JLabel("Email");
        window.add(labelEmail);
        fieldEmail = new JTextField(10);
        fieldEmail.setBounds(9,10,30,30);
        window.add(fieldEmail);

        labelBirthYear = new JLabel("BirthYear");
        window.add(labelBirthYear);
        fieldBirthYear = new JTextField(10);
        fieldBirthYear.setBounds(9,10,30,30);
        window.add(fieldBirthYear);

        buttonLifeInsurance = new JButton("Life Insurance");
        buttonLifeInsurance.setBounds(2, 40, 30, 30);
        buttonLifeInsurance.addActionListener(this);
        window.add(buttonLifeInsurance);

        buttonCarInsurance = new JButton("Car Insurance");
        buttonCarInsurance.setBounds(2, 40, 30, 30);
        buttonCarInsurance.addActionListener(this);
        window.add(buttonCarInsurance);
    }

    public void actionPerformed(ActionEvent e) {
        Object o = e.getSource();
        int insuranceCost = 0;
        if (o == buttonLifeInsurance){
            insuranceCost = 10000;
            int insuranceCostPercentile = 100;
            Object[] lifeInsuranceOptions = {"Minor", "Adult Woman", "Adult Man"};
            int lifeInsuranceOptionsIndex = JOptionPane.showOptionDialog(null, "Select the correspondant option: \n Is the interested a ...", "Life Insurance", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, lifeInsuranceOptions, lifeInsuranceOptions[0]);
            String lifeInsuranceOptionsOutput = lifeInsuranceOptions[lifeInsuranceOptionsIndex].toString();
            if ("Minor".equals(lifeInsuranceOptionsOutput)) {
                insuranceCost = insuranceCost - insuranceCostPercentile*50;
            }
            else if ("Adult Woman".equals(lifeInsuranceOptionsOutput)) {
                insuranceCost = insuranceCost + insuranceCostPercentile*40;
            }
            else if ("Adult Man".equals(lifeInsuranceOptionsOutput)) {
                insuranceCost = insuranceCost + insuranceCostPercentile*23;
            }
        }
        else if (o == buttonCarInsurance){
            insuranceCost = 4800;
            int insuranceCostPercentile = 48;
            String carInsuranceYearStr = JOptionPane.showInputDialog(null, "Input the model year of the vehicle: ");
            int carInsuranceYear = Integer.parseInt(carInsuranceYearStr);
            Object[] carInsuranceOptions = {"Limited", "Extended"};
            int carInsuranceOptionsIndex = JOptionPane.showOptionDialog(null, "Select the type of insurance you want: ", "Car Insurance", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, carInsuranceOptions, carInsuranceOptions[0]);
            String carInsuranceOptionsOutput = carInsuranceOptions[carInsuranceOptionsIndex].toString();
            if ("Limited".equals(carInsuranceOptionsOutput)) {
                if (carInsuranceYear >= 2000) {
                    insuranceCost = insuranceCost + insuranceCostPercentile*22;
                }
                else if (carInsuranceYear < 2000) {
                    insuranceCost = insuranceCost;
                }
            }
            else if ("Extended".equals(carInsuranceOptionsOutput)) {
                if (carInsuranceYear >= 2000) {
                    insuranceCost = insuranceCost + insuranceCostPercentile*120;
                }
                else if (carInsuranceYear < 2000) {
                    insuranceCost = insuranceCost + insuranceCostPercentile*50;
                }
            }
        }
        String insuranceCostString = String.valueOf(insuranceCost);
        JOptionPane.showMessageDialog(null, "Your selected insurance plan has a cost of " + insuranceCostString);
    }
}
