package Modelo;


public class CazaLigero extends NaveEspacial {

	

	public CazaLigero(String nombre, double pos_X, double pos_Y) {
		super(nombre,500, pos_X, pos_Y);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void ataca(NaveEspacial adversario) {
		adversario.recibir(50);
	}

}