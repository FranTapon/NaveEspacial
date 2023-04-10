package Prueba;

import Modelo.CazaLigero;
import Modelo.DestructorEstelar;

public class Prueba {

	public static void main(String[] args) {
		DestructorEstelar nave = new DestructorEstelar("Nave",12,12,12);
		CazaLigero caza = new CazaLigero("caza",12,12);
		System.out.println(caza);

	}

}