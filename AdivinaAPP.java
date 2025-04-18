package hause.retos.adivinar;

import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class AdivinaAPP extends JFrame implements ActionListener {

	JLabel men1, men2, men3;
	JTextField text1;
	JButton boton, reiniciar;
	JPanel panel;

	static int intentos = 5;
	static int numAdivinar = (int) (Math.random() * 50 + 1);

	public void resetGame() {
		intentos = 5;

		numAdivinar = (int) (Math.random() * 50 + 1);

		text1.setText("");
		men3.setText("");

		men2.setText("Te quedan " + intentos + " intentos.");

		boton.setEnabled(true);

		setTitle("Adivina");
	}

	AdivinaAPP() {
		panel = new JPanel();

		panel.setLayout(new GridLayout(0, 1, 0, 8)); // (rows, cols, ancho, alto)

		men1 = new JLabel("Introduce un número para adivinar");
		men2 = new JLabel("Te quedan " + intentos + " intentos.");
		boton = new JButton("Intentar");
		boton.addActionListener(this);
		men3 = new JLabel();
		reiniciar = new JButton("Reiniciar");
		reiniciar.addActionListener(this);

		setLayout(new FlowLayout(FlowLayout.CENTER, 80, 10)); // margen(ancho, largo)
		int ancho = 5;
		text1 = new JTextField(ancho);

		panel.add(men1);
		panel.add(text1);
		panel.add(men3);
		panel.add(men2);
		panel.add(boton);
		panel.add(reiniciar);
		add(panel);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		men2.setText("Te quedan " + intentos + " intentos.");
		
		if (e.getSource() == boton) {
			try {
				if (intentos == 0) {
					boton.setEnabled(false);
					Intentos0 v2 = new Intentos0(this, true);
					v2.setVisible(true);
				} else if (Integer.parseInt(text1.getText()) > numAdivinar) {
					numMenor v3 = new numMenor(this, true);
					v3.setVisible(true);
				} else if (Integer.parseInt(text1.getText()) < numAdivinar) {
					numMayor v4 = new numMayor(this, true);
					v4.setVisible(true);
				} else {
					setTitle("Enhorabuena!");
					men2.setText("Has adivinado!");
					boton.setEnabled(false);
				}
				intentos--;
				
			} catch (Exception e2) {
				setTitle("ERROR");
			}
		}
		
		if(e.getSource() == reiniciar) {
			resetGame();
		}
		

	}

	public static void main(String[] args) {
		AdivinaAPP v = new AdivinaAPP();

		v.setTitle("Adivina"); // título de la ventana
		v.setSize(300, 250); // dimensiones(ancho, alto)
		v.setLocationRelativeTo(null); // ventana en el centro
		v.setVisible(true); // visibilidad
		v.setDefaultCloseOperation(EXIT_ON_CLOSE);

	}

	public static class Intentos0 extends JDialog {

		JLabel men1, men2;

		public Intentos0(AdivinaAPP parent, boolean modal) {
			super(parent, modal);

			men1 = new JLabel("Te has quedado sin intentos");
			men2 = new JLabel("El número era: " + numAdivinar);

			setLayout(new FlowLayout(FlowLayout.CENTER, 80, 10)); // margen(ancho, largo)
			setSize(250, 125);
			setLocationRelativeTo(null);


			add(men1);
			add(men2);

		}
	}

	public static class numMenor extends JDialog {

		JLabel men1, men2;

		public numMenor(AdivinaAPP parent, boolean modal) {
			super(parent, modal);

			men1 = new JLabel("El número es menor.");

			setLayout(new FlowLayout(FlowLayout.CENTER, 80, 10)); // margen(ancho, largo)
			setSize(250, 125);
			setLocationRelativeTo(null);

			add(men1);

		}
	}

	public static class numMayor extends JDialog {

		JLabel men1;

		public numMayor(AdivinaAPP parent, boolean modal) {
			super(parent, modal);

			men1 = new JLabel("El número es mayor.");

			setLayout(new FlowLayout(FlowLayout.CENTER, 80, 10)); // margen(ancho, largo)
			setSize(250, 125);
			setLocationRelativeTo(null);

			add(men1);

		}
	}

}
