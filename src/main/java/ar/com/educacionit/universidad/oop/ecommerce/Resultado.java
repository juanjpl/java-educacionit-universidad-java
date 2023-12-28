package ar.com.educacionit.universidad.oop.ecommerce;

import java.time.LocalDate;

public class Resultado {

	private String titulo;
	private String imagen;
	private Float precio;
	private String autor;
	private Integer CantidadVendidos;
	private LocalDate fechaPublicacion;
	
	
	public LocalDate getFechaPublicacion() {
		return fechaPublicacion;
	}

	public void setFechaPublicacion(LocalDate fechaPublicacion) {
		this.fechaPublicacion = fechaPublicacion;
	}

	public Resultado(String titulo, String imagen, Float precio, String autor) {
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
	
	public Integer getCantidadVendidos() {
		return CantidadVendidos;
	}

	public void setCantidadVendidos(int cantidadVendidos) {
		CantidadVendidos = cantidadVendidos;
	}

	public String getTitulo() {
		return this.titulo;
	}
	
	public Float getPrecio() {
		return this.precio;
	}
	
	public String getAutor() {
		return this.autor;
	}
	
	public void setPrecio(Float nuevoPrecio) {
		
		if(nuevoPrecio<0) {
			this.precio = (float) 0;
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
	
