package ar.com.educacionit.universidad.polimorfismo;

public class Consola {

	
	private String serie;
	public String fabricante;
	protected String nombre;
	protected String color;
	
	//Constructor
	public Consola(String serie, String fabricante, String nombre, String color) {
		super();
		this.serie = serie;
		this.fabricante = fabricante;
		this.nombre = nombre;
		this.color = color;
	}
	
	//getter y setters
	
	public String getSerie() {
		return this.serie;
	}
	
	public String getFabricante() {
		return this.fabricante;
	}
	public String getNombre() {
		return this.nombre;
	}
	
	public String getColor() {
		return this.color;
	}
	
	public void play() {
		System.out.println("Jugando con la consola!");
	}
	
}
