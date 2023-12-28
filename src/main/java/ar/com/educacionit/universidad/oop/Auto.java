package ar.com.educacionit.universidad.oop;

public class Auto {

	
	/*ATRIBUTOS*/
	private String marca;
	private String modelo;
	private int anio;
	private String color;
	private String patente;
	private float velocidadInicial;
	
	/*CONSTRUCTOR*/
	public Auto(String marca, String modelo, int anio, String color, String patente) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.anio = anio;
		this.color = color;
		this.patente = patente;
		this.velocidadInicial = 0;
		
	}


	
	
	/*METODOS*/
	//void --- no retorna nada, o retorna void
	
	//POLIMORFISMO -- por sobrecarga
	//dos o mas metodos con el mismo nombre, pero distintos argumentos


	 void acelerar() {
		this.velocidadInicial++;
	}
	
  void acelerar(float v) {
		this.velocidadInicial += v;
	}
	
	
	void frenar() {
		
	}
	
	void encender() {
		
	}

public float getVelocidad() {
	return velocidadInicial;
}


	@Override
	public String toString() {
		return "Auto [marca=" + marca + ", modelo=" + modelo + ", anio=" + anio + ", color=" + color + ", patente="
				+ patente + ", velocidadInicial=" + velocidadInicial + "]";
	}




	
	
	
	/*metodo toString()*/

	
}
