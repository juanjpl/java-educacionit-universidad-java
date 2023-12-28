package ar.com.educacionit.universidad.oop.ecommerce;

public class MainResultados {

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		Buscador buscador = new Buscador();
		
		
		//Scanner teclado = new Scanner(System.in);//
		
		System.out.println("Buscar....");
		//String claveBuscadoPorElUsuario = teclado.next();
		//teclado.close();
		
		String claveBuscadoPorElUsuario="Sailor Moon";
		buscador.setClave(claveBuscadoPorElUsuario);
		buscador.buscar();
		
		System.out.println("Hemos encontrado " + buscador.getCantidad());
		
		Resultado[] res=buscador.getResultado();
		
		for(Resultado resultado : res) {
			System.out.println(resultado);
		}
	}

}
