package models;

import java.util.ArrayList;
import java.util.Arrays;

public class Departamento {

	private static int id;
	private int idDepartamento;
	private String tipoDepartamento;
	private ArrayList<Trabajador> trabajadores;

	public Departamento(String tipoDepartamento, ArrayList<Trabajador> trabajadores) {

		idDepartamento = id;
		this.tipoDepartamento = tipoDepartamento;
		this.trabajadores = trabajadores;

		id++;
	}

	@Override
	public String toString() {
		return "Departamento: id del Departamento=" + idDepartamento + ", tipo de Departamento=" + tipoDepartamento
				+ ", trabajadores=" + trabajadores;
	}

	

}