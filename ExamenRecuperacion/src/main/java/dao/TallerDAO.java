package dao;

import java.util.ArrayList;
import models.Taller;
public class TallerDAO {
	ArrayList<Taller> talleres;
	
	public TallerDAO() {
		DepartamentoDAO departsDAO = new DepartamentoDAO();
		
		Taller taller1 = new Taller("Zaragoza", departsDAO.getDepartamentos());
		Taller taller2 = new Taller("Huesca", departsDAO.getDepartamentos());
		Taller taller3 = new Taller("Teruel", departsDAO.getDepartamentos());
		Taller taller4 = new Taller("Madrid", departsDAO.getDepartamentos());
		Taller taller5 = new Taller("Barcelona", departsDAO.getDepartamentos());
		Taller taller6 = new Taller("Valencia", departsDAO.getDepartamentos());
		Taller taller7 = new Taller("Cadiz", departsDAO.getDepartamentos());
		Taller taller8 = new Taller("Jaen", departsDAO.getDepartamentos());
		
		talleres.add(taller1);
		talleres.add(taller2);
		talleres.add(taller3);
		talleres.add(taller4);
		talleres.add(taller5);
		talleres.add(taller6);
		talleres.add(taller7);
		talleres.add(taller8);
	}
	
	public ArrayList<Taller> getTalleres(){
		return talleres;
	}
}
