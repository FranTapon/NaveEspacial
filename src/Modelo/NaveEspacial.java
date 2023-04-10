package Modelo;

public abstract class NaveEspacial {
	protected String nombre;
	protected int energia;
	protected double pos_X;
	protected double pos_Y;
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getEnergia() {
		return energia;
	}
	public void setEnergia(int energia) {
		this.energia = energia;
	}
	public double getPos_X() {
		return pos_X;
	}
	public void setPos_X(double pos_X) {
		this.pos_X = pos_X;
	}
	public double getPos_Y() {
		return pos_Y;
	}
	public void setPos_Y(double pos_Y) {
		this.pos_Y = pos_Y;
	}
	@Override
	public String toString() {
		return "NaveEspacial [nombre=" + nombre + ", energia=" + energia + ", pos_X=" + pos_X + ", pos_Y=" + pos_Y
				+ "]";
	}
	
	public NaveEspacial(String nombre, int energia,double pos_X, double pos_Y) {
		this.nombre = nombre;
		this.energia = energia;
		this.pos_X = pos_X;
		this.pos_Y = pos_Y;
	}
	public void mover(double inc_X,double inc_Y) {
	this.pos_X =+ inc_X;
	this.pos_Y =+ inc_Y;
}
	public abstract void ataca(NaveEspacial adversario);
	
	public void recibir(int danio) {
		this.energia =- danio;
	}
}