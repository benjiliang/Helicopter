package view;

import javax.swing.*;

public class MainUI extends JFrame {
	public MainUI() {
		setTitle("HSMS");
		setSize(700, 200);
		setResizable(false);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JLabel label = new JLabel("Sistema de monitoreo de estados de helicopteros");
		label.setBounds(200, 30, 700, 20);
		
		getContentPane().setLayout(null);
        getContentPane().add(label);
        
        JButton registerBtn = new JButton("Registrar Helicoptero");
        JButton registerPilotBtn = new JButton("Registrar Piloto");
        
        String[] helicopteros = {"Helicoptero 1", "Helicoptero 2", "Helicoptero 3"};
        JComboBox<String> comboBox = new JComboBox<>(helicopteros);
        
        JButton checkBtn = new JButton("Checkear Estado");

        registerBtn.addActionListener(e -> {
        	RegistryUI newRegistry = new RegistryUI();
        	newRegistry.setVisible(true);
        });
        
        checkBtn.addActionListener(e -> {
        	String selected = (String) comboBox.getSelectedItem();
        	StatusUI checkStatus = new StatusUI(selected);
        	checkStatus.setVisible(true);
        	
        });
        
        registerPilotBtn.addActionListener(e -> {
        	RegisterPilotUI newPilot = new RegisterPilotUI();
        	newPilot.setVisible(true);
        });
        
        registerBtn.setBounds(40, 60, 200, 30);
        registerPilotBtn.setBounds(40, 100, 200, 30);
        checkBtn.setBounds(470, 60, 150, 30);
        getContentPane().add(registerBtn);
        getContentPane().add(registerPilotBtn);
        getContentPane().add(checkBtn);
        
        
        
        comboBox.setBounds(270, 60, 200, 30);
        getContentPane().add(comboBox);
	}
}
