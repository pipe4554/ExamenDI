package gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import models.Taller;
import dao.DepartamentoDAO;

public class AñadirTaller {

	public static void main(String[] args) {
		JFrame frame = new JFrame("Mi primera GUI");       
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);       
        frame.setSize(300, 300);      
        
        JLabel lblID = new JLabel("ID del taller");
        JTextField ID = new JTextField(10);
        
        JLabel lblCiudad = new JLabel("indique la ciudad");
        final JTextField ciudad = new JTextField(10);
        
        JButton añadirTaller = new JButton("Añadir Taller");
        añadirTaller.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				DepartamentoDAO dep = new DepartamentoDAO();
				
				Taller taller = new Taller(ciudad.getText(), dep.getDepartamentos());
				
				System.out.println("se ha guardado el taller");
				
			}
		});
        
        frame.getContentPane().add(lblID);
        frame.getContentPane().add(ID);
        frame.getContentPane().add(lblCiudad);
        frame.getContentPane().add(ciudad);
        frame.getContentPane().add(añadirTaller);      
        frame.setVisible(true); 

	}

}
