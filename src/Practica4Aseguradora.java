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
        demo.setSize(1300, 700);
        demo.createGUI();
        demo.setTitle("Quanta Insurance");
        demo.setVisible(true);
    }

    private void createGUI() {
        setDefaultCloseOperation(ABORT);
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
}
