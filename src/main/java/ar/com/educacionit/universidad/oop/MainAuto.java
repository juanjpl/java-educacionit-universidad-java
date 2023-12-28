package ar.com.educacionit.universidad.oop;

public class MainAuto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Clase nombreDeObjeto = new Clase();
		
		
		Auto clioMio = new Auto("Renault","Clio mio",2016,"rojo","abc123");
		Auto astraMio = new Auto("Astra","Astra mio",2018,"azul","abc123");
		
		System.out.println(clioMio);
		System.out.println(astraMio);
		
		System.out.println(clioMio.toString());
		System.out.println(astraMio.toString());
		
		boolean iguales = astraMio == clioMio ;
		System.out.println(iguales);
		
		Auto copiaDeClio = clioMio;
		
		boolean iguales2 = copiaDeClio == clioMio ;
		System.out.println(iguales2);
		
		//copiaDeClio.velocidadInicial= 2.0f;
		copiaDeClio.acelerar(22);
		
		System.out.println(clioMio.toString());
		System.out.println(copiaDeClio.toString());
		
		Auto auto1 = new Auto("Ford", "Falcon", 1986, "Negro", "s0001ss");
		auto1.acelerar();
		System.out.println(auto1.getVelocidad());
		auto1.acelerar(5);
		System.out.println(auto1.getVelocidad());

		
	}

}
