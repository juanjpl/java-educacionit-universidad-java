package ar.com.educacionit.universidad.oop.ecommerce;

public class Resultado {

	private String titulo;
	private String imagen;
	private float precio;
	private String autor;
	
	
	public Resultado(String titulo, String imagen, float precio, String autor) {
		super();
		this.titulo = titulo;
		this.imagen = imagen;
		this.precio = precio;
		this.autor = autor;
	}
	
	public String getImagen() {
		//ya estoy dentro de la clase
		return this.imagen;
		
	}
	
	public String getTitulo() {
		return this.titulo;
	}
	
	public float getPrecio() {
		return this.precio;
	}
	
	public String getAutor() {
		return this.autor;
	}
	
	public void setPrecio(float nuevoPrecio) {
		
		if(nuevoPrecio<0) {
			this.precio = 0;
		}else {
			this.precio = nuevoPrecio;
		}
		
	}
	
	public void setImagen(String nuevaImagen) {
		//aprovechar el encapsulamiento
		
		if(nuevaImagen == null) {
			this.imagen = "https://empty-image.com";
		}else {
			this.imagen = nuevaImagen;
		}
	
	}
	
	public void setTitulo(String nuevoTitulo) {
		this.titulo = nuevoTitulo;
	}

	@Override
	public String toString() {
		return "Resultado [titulo=" + titulo + ", imagen=" + imagen + ", precio=" + precio + ", autor=" + autor + "]";
	}





}
	
