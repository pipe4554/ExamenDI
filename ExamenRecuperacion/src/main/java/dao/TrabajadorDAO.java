package dao;

import java.util.ArrayList;

import models.Trabajador;

public class TrabajadorDAO {
	ArrayList<Trabajador> trabajadores; 
	
	public TrabajadorDAO(String tipoDep) {
		if (tipoDep.equals("ChapaYPintura")) {
			Trabajador trab1 = new Trabajador("Jose Luis");
			Trabajador trab2 = new Trabajador("Maria Perez");
			Trabajador trab3 = new Trabajador("Alejandro Ruiz");
			trabajadores.add(trab1);
			trabajadores.add(trab2);
			trabajadores.add(trab3);
		}else if(tipoDep.equals("Mecanica")) {
			Trabajador trab1 = new Trabajador("Carlos Perez");
			Trabajador trab2 = new Trabajador("Adrian Martinez");
			Trabajador trab3 = new Trabajador("Manuel Revuelto");
			trabajadores.add(trab1);
			trabajadores.add(trab2);
			trabajadores.add(trab3);
		}else if(tipoDep.equals("Ventas")) {
			Trabajador trab1 = new Trabajador("Fernando Lopez");
			Trabajador trab2 = new Trabajador("Juan Pablo");
			trabajadores.add(trab1);
			trabajadores.add(trab2);
		}else {
			System.out.println("se ha introducido un departemento equivocado");
		}
	}
	
	public ArrayList<Trabajador> getTrabajadores(){
		return trabajadores;
	}
}
