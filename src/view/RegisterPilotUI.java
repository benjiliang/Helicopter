package view;

import javax.swing.*;

public class RegisterPilotUI extends JFrame {
	public RegisterPilotUI() {
		setTitle("Registro de Piloto");
		setSize(500, 600);
		setResizable(false);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		
		JLabel label = new JLabel("Registro de nuevo piloto");
		label.setBounds(160, 10, 200, 40);
		
		JLabel nombre = new JLabel("Nombre del piloto");
		nombre.setBounds(10, 50, 200, 20);
		JTextField nombreTxt = new JTextField();
		nombreTxt.setBounds(10,70,200,20);
		
		JLabel idLbl = new JLabel("Identificacion del piloto");
		idLbl.setBounds(10, 110, 200, 20);
		JTextField id = new JTextField();
		id.setBounds(10,130,200,20);
		
		JLabel age = new JLabel("Edad del piloto");
		age.setBounds(10, 170, 200, 20);
		JTextField ageTxt = new JTextField();
		ageTxt.setBounds(10,190,200,20);
		
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
        getContentPane().add(idLbl);
        getContentPane().add(id);
        getContentPane().add(nombre);
        getContentPane().add(nombreTxt);
        getContentPane().add(age);
        getContentPane().add(ageTxt);
        getContentPane().add(save);
        getContentPane().add(cancel);
	}
}
