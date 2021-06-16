package models;

public class Trabajador {
	private static int id=0;
	private int idtrbajador;
	private String nombre;
	
	public Trabajador(String nombre) {
		super();
		idtrbajador = id;
		this.nombre = nombre;
		id++;
	}
	@Override
	public String toString() {
		return "Trabajador: id= " + id + ", nombre= " + nombre;
	}
	
	
	
}
