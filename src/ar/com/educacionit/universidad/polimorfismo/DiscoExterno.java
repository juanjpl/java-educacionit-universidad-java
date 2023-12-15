package ar.com.educacionit.universidad.polimorfismo;

public class DiscoExterno extends Object {

	private String nombre;
	private int capacidad;
	
	
	public DiscoExterno(String nombre, int capacidad) {
		this.nombre = nombre;
		this.capacidad = capacidad;
	}


	public String getNombre() {
		return nombre;
	}


	public int getCapacidad() {
		return capacidad;
	}


	//POLIMORFISMO
	//estoy reescribiendo el metodo del padre
	
	@Override
	public String toString() {
		return "DiscoExterno [nombre=" + nombre + ", capacidad=" + capacidad + "]";
	}
	
	
	
	
}
