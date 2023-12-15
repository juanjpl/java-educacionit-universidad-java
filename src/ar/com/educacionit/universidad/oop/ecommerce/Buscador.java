package ar.com.educacionit.universidad.oop.ecommerce;

public class Buscador {

	//Atributos
	private String clave;
	private Resultado[] resultados;
	
	
	//constructor
	public Buscador() {
		this.resultados = new Resultado[0];
		this.clave="";
	}
	
	
	public Buscador(String clave, Resultado[] resultados) {
		
	}
	
	public void buscar() {
		//cuando usamos String
		if(claveVacia()) {
			System.out.println("La clave está vacía....");
			return;
		}
		//aca se llama al metodo getResultado(lista)
		Resultado res1 = new Libro("Sailor moon IV, Sailor Jupiter","https://cuspide.com/producto/4-sailor-moon/",500,"Naoko Takeuchi","12333",400,"Bla Bla BLa");
		Resultado res2 = new Musica("Sailor moon cd ","https://cuspide.com/producto/5-sailor-moon/",750,"Naoko Takeuchi","Sony",new String[] {"uno","dos","tre"});
		Resultado res3 = new Pelicula("Sailor moon The movie","https://cuspide.com/producto/12-sailor-moon/",1500,"Naoko Takeuchi","Warner","Blu-ray");

		//agregar los resultados al array resultados
		this.agregarResultado(res1);
		this.agregarResultado(res2);
		this.agregarResultado(res3);
	
	
	
	}
	
	public String getClave() {
		return this.clave;
	}
	
	public boolean claveVacia() {
		return "".equals(this.clave.trim());
	}
	
	public void agregarResultado(Resultado res) {
		var aux = new Resultado[this.resultados.length + 1];
		
		for(int i=0; i<this.resultados.length; i++) {
			aux[i]= this.resultados[i];
		}
		
		aux[this.resultados.length] = res;
		
		setResultados(aux);
	}
	
	private void setResultados(Resultado[] res) {
		this.resultados = res;
	}
	
	public Resultado[] getResultado() {
		
		return this.resultados;
	}
	
	private void setResultado(Resultado[] res) {
		
		if(res == null) {
			this.resultados=new Resultado[0];
		}else {
			this.resultados= res;
		}
	}
	
	public int getCantidad() {
		return this.resultados.length;
	}
	
	public void setClave(String clave) {
	
		this.clave = clave;
	}
	
	
}
