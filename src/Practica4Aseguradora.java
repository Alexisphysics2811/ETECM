/***
*Program: Practica4Aseguradora.java
*Author: Alexis Rabago
*Date: 30/10/2022
***/

//Lib
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Practica4Aseguradora extends JFrame implements ActionListener {
    
    private JPanel companyPanel, welcomePanel, userPanel, buttonPanel;
    private JLabel labelCompany, labelWelcome, labelName, labelPhone, labelEmail, labelBirthYear;
    private JTextField fieldName, fieldPhone, fieldEmail, fieldBirthYear;
    private JButton buttonLifeInsurance, buttonCarInsurance;
    private ImageIcon logoIcon;

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

        companyPanel = new JPanel();
        window.add(companyPanel);

        logoIcon = new ImageIcon("img/QuantaInsuranceIcon.png");
        JLabel labelIcon = new JLabel();
        labelIcon.setIcon(logoIcon);
        companyPanel.add(labelIcon);

        labelCompany = new JLabel("<html><center><h1>Quanta Insurance</h1><h2>Because the chances of having an accident are never 0</h2></center></html>", SwingConstants.CENTER);
        companyPanel.add(labelCompany);

        welcomePanel = new JPanel();
        window.add(welcomePanel);

        labelWelcome = new JLabel("<html><h3>Welcome. Please enter the requested data and choose your insurance plan.</h3></html>");
        welcomePanel.add(labelWelcome);

        userPanel = new JPanel();
        window.add(userPanel);

        labelName = new JLabel("Name");
        userPanel.add(labelName);
        fieldName = new JTextField(10);
        fieldName.setBounds(9,10,30,30);
        userPanel.add(fieldName);

        labelPhone = new JLabel("Phone");
        userPanel.add(labelPhone);
        fieldPhone = new JTextField(10);
        fieldPhone.setBounds(9,10,30,30);
        userPanel.add(fieldPhone);

        labelEmail = new JLabel("Email");
        userPanel.add(labelEmail);
        fieldEmail = new JTextField(10);
        fieldEmail.setBounds(9,10,30,30);
        userPanel.add(fieldEmail);

        labelBirthYear = new JLabel("BirthYear");
        userPanel.add(labelBirthYear);
        fieldBirthYear = new JTextField(10);
        fieldBirthYear.setBounds(9,10,30,30);
        userPanel.add(fieldBirthYear);

        buttonPanel = new JPanel();
        buttonPanel.setPreferredSize(new Dimension(1200,100));
        window.add(buttonPanel);

        buttonLifeInsurance = new JButton("Life Insurance");
        buttonLifeInsurance.setBounds(2, 40, 30, 30);
        buttonLifeInsurance.addActionListener(this);
        buttonPanel.add(buttonLifeInsurance);

        buttonCarInsurance = new JButton("Car Insurance");
        buttonCarInsurance.setBounds(2, 40, 30, 30);
        buttonCarInsurance.addActionListener(this);
        buttonPanel.add(buttonCarInsurance);
    }

    public void actionPerformed(ActionEvent e) {
        Object o = e.getSource();
        int insuranceCost = 0;
        String Name, Phone, Email, BirthYear;
        Name = fieldName.getText();
        Phone = fieldPhone.getText();
        Email = fieldEmail.getText();
        BirthYear = fieldBirthYear.getText();
        if (o == buttonLifeInsurance){
            if (!"".equals(Name) && !"".equals(Phone) && !"".equals(Email) && !"".equals(BirthYear)) {
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
                String insuranceCostString = String.valueOf(insuranceCost);
                JOptionPane.showMessageDialog(null, "Your selected insurance plan has a cost of " + insuranceCostString);
            }
            else {
                JOptionPane.showMessageDialog(null, "Missing data, please try again");
            }
        }
        else if (o == buttonCarInsurance){
            if (!"".equals(Name) && !"".equals(Phone) && !"".equals(Email) && !"".equals(BirthYear)) {
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
                        insuranceCost = insuranceCost + 0;
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
                String insuranceCostString = String.valueOf(insuranceCost);
                JOptionPane.showMessageDialog(null, "Your selected insurance plan has a cost of " + insuranceCostString);
            }
            else {
                JOptionPane.showMessageDialog(null, "Missing data, please try again");
            }
        }
    }
}
