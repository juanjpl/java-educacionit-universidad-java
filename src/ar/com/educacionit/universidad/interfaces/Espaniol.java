package ar.com.educacionit.universidad.interfaces;

public class Espaniol extends IdiomaBase implements IIdioma{

	public Espaniol() {
		super("Espaniol");
		// TODO Auto-generated constructor stub
	}

	@Override
	public void decir(String palabra) {
		// TODO Auto-generated method stub
		
		System.out.println("Decir:" + palabra);
	}
}

	


