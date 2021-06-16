package app;

import models.*;
import dao.*;


public class Main {
	private static TallerDAO TDAO = new TallerDAO();
	
	public static void main(String[] args) {
		for (Taller t : TDAO.getTalleres()) {
			System.out.println(t.toString());
		}

	}

}
