package view;

import javax.swing.*;

public class StatusUI extends JFrame {
	private String placa;
	public StatusUI(String placa) {
		setTitle("Checkeo de Estado");
		setSize(500, 600);
		setResizable(false);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		
		JLabel placaLbl = new JLabel("Estado del helicoptero: " + placa);
		placaLbl.setBounds(10, 10, 500, 20);
		
		JLabel weightLbl = new JLabel("Peso de helicoptero: ");
		weightLbl.setBounds(10, 40, 500, 20);
		
		JLabel fuelLbl = new JLabel("Tipo combustible de helicoptero: ");
		fuelLbl.setBounds(10, 70, 500, 20);
		
		JLabel maxFuelLbl = new JLabel("Capacidad maxima de combustible: ");
		maxFuelLbl.setBounds(10, 100, 500, 20);
		
		JLabel colorLbl = new JLabel("Color de helicoptero: ");
		colorLbl.setBounds(10, 130, 500, 20);
		
		JLabel pilotLbl = new JLabel("Piloto encargado: ");
		pilotLbl.setBounds(10, 160, 500, 20);
		
		JLabel inFlightLbl = new JLabel("En vuelo: ");
		inFlightLbl.setBounds(10, 190, 500, 20);
		
		JLabel tempMotor = new JLabel("Temperatura del motor: ");
		tempMotor.setBounds(10, 220, 500, 20);
		
		JLabel altimeter = new JLabel("Altura: ");
		altimeter.setBounds(10, 250, 500, 20);
		
		JLabel compass = new JLabel("Direccion de la brujula: ");
		compass.setBounds(10, 280, 500, 20);
		
		JLabel airspeed = new JLabel("Velocidad del viento: ");
		airspeed.setBounds(10, 310, 500, 20);
		
		JLabel radar = new JLabel("Ubicacion en radar: ");
		radar.setBounds(10, 340, 500, 20);
		
		JLabel fueltank = new JLabel("Combustible disponible: " + "\nTiempo que puede volar el helicoptero: ");
		fueltank.setBounds(10, 370, 500, 20);
		
		JLabel propeller = new JLabel("Velocidad de las helices: ");
		propeller.setBounds(10, 400, 500, 20);
		
		
		getContentPane().setLayout(null);
        getContentPane().add(placaLbl);
        getContentPane().add(weightLbl);
        getContentPane().add(fuelLbl);
        getContentPane().add(maxFuelLbl);
        getContentPane().add(colorLbl);
        getContentPane().add(pilotLbl);
        getContentPane().add(inFlightLbl);
        getContentPane().add(tempMotor);
        getContentPane().add(altimeter);
        getContentPane().add(compass);
        getContentPane().add(airspeed);
        getContentPane().add(radar);
        getContentPane().add(fueltank);
        getContentPane().add(propeller);
	}
}
