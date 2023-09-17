package view;

import javax.swing.*;

public class RegistryUI extends JFrame {
	
	public RegistryUI() {
		setTitle("Registro de Helicoptero");
		setSize(500, 600);
		setResizable(false);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		
		JLabel label = new JLabel("Registro de nuevo helicoptero");
		label.setBounds(160, 10, 200, 40);
		
		JLabel placaLbl = new JLabel("Placa de helicoptero");
		placaLbl.setBounds(10, 50, 200, 20);
		JTextField placaTxt = new JTextField();
		placaTxt.setBounds(10,70,200,20);
		
		JLabel weightLbl = new JLabel("Peso de helicoptero");
		weightLbl.setBounds(10, 110, 200, 20);
		JTextField weightTxt = new JTextField();
		weightTxt.setBounds(10,130,200,20);
		
		JLabel fuelLbl = new JLabel("Tipo combustible de helicoptero");
		fuelLbl.setBounds(10, 170, 200, 20);
		JTextField fuelTxt = new JTextField();
		fuelTxt.setBounds(10,190,200,20);
		
		JLabel maxFuelLbl = new JLabel("Capacidad maxima de combustible");
		maxFuelLbl.setBounds(10, 230, 200, 20);
		JTextField maxFuelTxt = new JTextField();
		maxFuelTxt.setBounds(10,250,200,20);
		
		JLabel colorLbl = new JLabel("Color de helicoptero");
		colorLbl.setBounds(10, 290, 200, 20);
		JTextField colorTxt = new JTextField();
		colorTxt.setBounds(10,310,200,20);
		
		JLabel pilotLbl = new JLabel("Piloto encargado");
		pilotLbl.setBounds(10, 350, 200, 20);
		String[] pilotos = {"Benji", "Maverick", "Tom Cruise"};
        JComboBox<String> comboBox = new JComboBox<>(pilotos);
        
        comboBox.setBounds(10,370,200,20);
        
        JButton save = new JButton("Guardar");
        JButton cancel = new JButton("Cancelar");
        save.setBounds(340, 500, 100, 20);
        cancel.setBounds(230, 500, 100, 20);
        
        save.addActionListener(e -> {
        	System.out.println("Guardando info");
        	this.dispose();
        });
        
        cancel.addActionListener(e -> {
        	this.dispose();
        });
		
		
		
		getContentPane().setLayout(null);
        getContentPane().add(label);
        getContentPane().add(placaLbl);
        getContentPane().add(placaTxt);
        getContentPane().add(weightLbl);
        getContentPane().add(weightTxt);
        getContentPane().add(fuelLbl);
        getContentPane().add(fuelTxt);
        getContentPane().add(maxFuelLbl);
        getContentPane().add(maxFuelTxt);
        getContentPane().add(colorLbl);
        getContentPane().add(colorTxt);
        getContentPane().add(pilotLbl);
        getContentPane().add(comboBox);
        getContentPane().add(save);
        getContentPane().add(cancel);
        
        
	}
}
