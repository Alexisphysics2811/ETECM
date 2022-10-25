/***
*Program: Practica3Departamento.java
*Author: Alexis Rabago
*Date: 30/10/2022
***/

//Lib
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Practica3Departamento extends JFrame implements ActionListener {
   
   private JLabel labelWelcome;
   private JTextField textFieldInput;
   private JButton buttonInitialize;
   private JPanel panelBlueprint, panelInfo;

   public static void main(String[] args) {
      Practica3Departamento demo = new Practica3Departamento ();
      demo.setSize(1300, 700);
      demo.createGUI();
      demo.setTitle("Building Information");
      demo.setVisible(true);
   }

   private void createGUI() {
      setDefaultCloseOperation(EXIT_ON_CLOSE);
      Container window = getContentPane();
      window.setLayout(new FlowLayout());

      panelBlueprint = new JPanel();
      panelBlueprint.setPreferredSize(new Dimension(600,600));
      window.add(panelBlueprint);

      panelInfo = new JPanel();
      panelInfo.setPreferredSize(new Dimension(600,600));
      window.add(panelInfo);

      labelWelcome = new JLabel("Blueprint and Information of the building: ");
      window.add(labelWelcome);

      textFieldInput = new JTextField(10);
      textFieldInput.setBounds(9, 10, 30, 30);
      textFieldInput.setAlignmentX(CENTER_ALIGNMENT);
      window.add(textFieldInput);

      buttonInitialize = new JButton("Display Information");
      buttonInitialize.setBounds(2, 40, 30, 30);
      buttonInitialize.setAlignmentX(CENTER_ALIGNMENT);
      buttonInitialize.addActionListener(this);
      window.add(buttonInitialize);

   }

   public void actionPerformed(ActionEvent e) {
      Object o = e.getSource();

      Graphics canvasBlueprint = panelBlueprint.getGraphics();
      Graphics canvasInfo = panelInfo.getGraphics();

      if (o == buttonInitialize) {
         String buildingDatabaseName;
         buildingDatabaseName = textFieldInput.getText();
         if ("Postes #69".equals(buildingDatabaseName)) {
            JOptionPane.showMessageDialog(null, "Building found in database, displaying...");
            DrawBlueprint(canvasBlueprint, 50, 200);
         }
         else {
            JOptionPane.showMessageDialog(null, "Couldn't find the requested building in the database.");
            textFieldInput.setText("");
         }
      }

   }

   private void DrawBlueprint(Graphics canvas, int x, int y) {
      canvas.drawRect(x, y, 500, 150); //Main
      canvas.drawRect(x, y, 50, 50); //Lightcube
      canvas.drawRect(x+50, y, 75, 50); //Bathroom1
      canvas.drawRect(x, y+50, 125, 100); //Bedroom1
      canvas.drawRect(x+150, y, 225, 25); //Stairs
      canvas.drawRect(x+375, y, 75, 50); //Kitchen
      canvas.drawRect(x+450, y, 50, 50); //Bathroom2
      canvas.drawRect(x+375, y+50, 125, 100); //Bedroom2
   }
}