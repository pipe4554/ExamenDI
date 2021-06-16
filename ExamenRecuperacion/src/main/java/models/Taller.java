package models;

import java.util.ArrayList;
import java.util.Arrays;

public class Taller {

	private static int id;
	private int idTaller;
	private String ciudad;
	private ArrayList<Departamento> Departamentos;

	public Taller(String ciudad, ArrayList<Departamento> departamentos) {
		super();
		idTaller = id;
		this.ciudad = ciudad;
		Departamentos = departamentos;
		id++;
	}

	@Override
	public String toString() {
		return "Taller: id del Taller= " + idTaller + ", ciudad= " + ciudad + ", Departamentos= " + Departamentos;
	}

	
	
}
