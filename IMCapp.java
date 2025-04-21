package hause.retos.imc;

import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class IMCapp extends JFrame implements ActionListener {

	// componentes
	JPanel panel;
	JLabel menPeso, menAlt, imcInfo, pesoInfo;
	JTextField textPeso, textAlt;
	JButton boton;

	IMCapp() {

		setLayout(new FlowLayout(FlowLayout.CENTER, 150, 10)); // margen(ancho, alto)

		panel = new JPanel();

		menAlt = new JLabel("Introduce tu altura");
		textAlt = new JTextField();

		menPeso = new JLabel("Introduce tu peso");
		textPeso = new JTextField();

		boton = new JButton("Calcular IMC");
		boton.addActionListener(this);

		imcInfo = new JLabel("");

		pesoInfo = new JLabel("");

		panel.setLayout(new GridLayout(0, 2, 30, 15)); // (rows, cols, ancho, alto)

		panel.add(menAlt);
		panel.add(textAlt);

		panel.add(menPeso);
		panel.add(textPeso);
		
		add(panel);
		add(boton);
		add(imcInfo);
		add(pesoInfo);
	}

	public static void main(String[] args) {
		IMCapp v = new IMCapp();

		v.setTitle("Calcular IMC"); // título de la ventana
		v.setSize(300, 250); // dimensiones(ancho, alto)
		v.setLocationRelativeTo(null); // ventana en el centro
		v.setVisible(true); // visibilidad
		v.setDefaultCloseOperation(EXIT_ON_CLOSE);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == boton) {

			try {
				double altura = Double.parseDouble(textAlt.getText());
				double peso = Double.parseDouble(textPeso.getText());
				double imc = peso / Math.pow(altura, 2);
				double imcRedondeado = Math.round(imc * 100.0) / 100.0;

				if (imc < 18.5) {
					imcInfo.setText("IMC: " + String.valueOf(imcRedondeado));
					pesoInfo.setText("Estás en un peso bajo.");
				} else if (imc < 25) {
					imcInfo.setText("IMC: " + String.valueOf(imcRedondeado));
					pesoInfo.setText("Estás en un peso normal.");
				} else if (imc < 30) {
					imcInfo.setText("IMC: " + String.valueOf(imcRedondeado));
					pesoInfo.setText("Tienes sobrepeso.");
				} else {
					imcInfo.setText("IMC: " + String.valueOf(imcRedondeado));
					pesoInfo.setText("Padeces de obesidad.");
				}

			} catch (Exception e2) {
				imcInfo.setText("Error en la introducción de datos.");
			}
		}

	}

}
