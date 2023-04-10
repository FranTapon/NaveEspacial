package Modelo;

public class DestructorEstelar extends NaveEspacial{

	private int cantidadTripulantes;
	public DestructorEstelar(String nombre, double pos_X, double pos_Y,int cantidadTripulantes) {
		super(nombre,1000,pos_X, pos_Y);
		this.cantidadTripulantes = cantidadTripulantes;
		
	}


	@Override
	public void ataca(NaveEspacial adversario) {
		adversario.recibir(200);
		
	}

	public void mover(double inc_X,double inc_Y) {
		inc_Y = inc_Y/2;
		inc_X = inc_X/2;
		this.pos_X =+ inc_X;
		this.pos_Y =+ inc_Y;
	}
	@Override
	public String toString() {
		return "DestructorEstelar [cantidadTripulantes=" + cantidadTripulantes + "]";
	}
	
}