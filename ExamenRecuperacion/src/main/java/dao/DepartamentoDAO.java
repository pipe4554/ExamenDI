package dao;

import java.util.ArrayList;

import models.Departamento;

public class DepartamentoDAO {
	ArrayList<Departamento> departs;
	Departamento ChapaYPintura, Mecanica, Ventas;
	
	public DepartamentoDAO() {
		TrabajadorDAO CYPtrab = new TrabajadorDAO("ChapaYPintura");
		ChapaYPintura =new Departamento("ChapaYPintura", CYPtrab.getTrabajadores());
		
		TrabajadorDAO Mtrab = new TrabajadorDAO("Mecanica");
		Mecanica = new Departamento("Mecanica", Mtrab.getTrabajadores());
		
		TrabajadorDAO Vtrab = new TrabajadorDAO("Ventas");
		Ventas = new Departamento("Ventas", Vtrab.getTrabajadores());
		
		departs.add(ChapaYPintura);
		departs.add(Mecanica);
		departs.add(Ventas);
	}
	
	public ArrayList<Departamento> getDepartamentos(){
		return departs;
	}
}
