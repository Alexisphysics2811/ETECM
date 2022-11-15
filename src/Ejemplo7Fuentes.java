/***:
*@Programa:   Fuentes.java
*@Autor:      Profra. Adriana Vega Palos
*@Fecha:      Ciclo Escolar
*@Descripción:Instanciar fuentes con sus atributos.
*
***/


import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Ejemplo7Fuentes extends JFrame 
    implements ActionListener {

    private JButton continuar, terminar;
    private JTextField campoNombre;
    private JLabel etiquetaBienvenida, etiqueta2;

    public static void main(String[] args) {
    	Ejemplo7Fuentes marco = new Ejemplo7Fuentes();
        marco.setSize(300, 300);
        marco.crearGUI();
        marco.setTitle("Cambiar tipo de Letra ");
        marco.setVisible(true);
    }

    private void crearGUI() {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        Container ventana = getContentPane();
        ventana.setLayout(new FlowLayout() );

        /* 
     	 * Instanciando color para utilizar con rgb
     	 * Página determina colores
     	 * https://htmlcolorcodes.com/es/tabla-de-colores/ 
         */
     	Color morado = new  Color (81, 46, 95);
     	Color lila   = new  Color (125, 60, 152);
     	Color cafe   = new Color (110, 44, 0);
        
     	/* Instanciando el tipo de fuente, tamaño y estilo
         * Determinar un nombre a la fuente 
         * */
        Font tipoLetra2 = new Font("Serief",Font.BOLD,16);
	    Font tipoLetra = new Font("Calibri",Font.ITALIC,16);
     	
	    etiquetaBienvenida = new JLabel("Escribe tu nombre");
	    etiquetaBienvenida.setFont(tipoLetra2);
	    etiquetaBienvenida.setForeground(Color.LIGHT_GRAY);
	    ventana.add(etiquetaBienvenida);
     
	    etiqueta2 = new JLabel(" y apellido");
	    etiqueta2.setFont(tipoLetra2);
	    ventana.add(etiqueta2);
 	
		campoNombre = new JTextField(10);
		campoNombre.setFont(tipoLetra);
		campoNombre.setForeground(cafe);
		campoNombre.setEditable(true);
		campoNombre.setEnabled(true);
		ventana.add(campoNombre);
		     
	 	continuar = new JButton("Continuar");
	 	continuar.setFont(tipoLetra);
	 	continuar.setBackground(lila);
	 	continuar.setForeground(morado);
	 	ventana.add(continuar);
	 	continuar.addActionListener(this);
	 	
	 	terminar = new JButton("terminar");
	 	terminar.setFont(tipoLetra);
	 	terminar.setBackground(lila);
	 	terminar.setForeground(morado);
	 	ventana.add(terminar);
	 	terminar.addActionListener(this);
    }

    public void actionPerformed(ActionEvent event) {
    	
    	Object origen= event.getSource();
		int totalCentavos;
		int dolares;
		int centavosRestantes;
		String totalCentavosString;
		String nombreUsuario;
		
		if (origen == continuar){
			nombreUsuario= campoNombre.getText();
			totalCentavosString = JOptionPane.showInputDialog(nombreUsuario + " \n Escribe un monto en centavos \n "+
			   " para convertir a dolares \n ");
			totalCentavos = Integer.parseInt(totalCentavosString);
			dolares = totalCentavos / 100;
			centavosRestantes = totalCentavos % 100; //operador modula
			JOptionPane.showMessageDialog(null, nombreUsuario + " tu tienes:   \n" +
			    totalCentavosString + " centavos se dividen en:\n" +
				dolares + " dólares\n" +
				centavosRestantes + " centavos.");
		}
		else {
			System.exit(0);// Sale del Sistema
		}
    }
}