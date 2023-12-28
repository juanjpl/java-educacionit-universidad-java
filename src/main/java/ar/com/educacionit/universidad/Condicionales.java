package ar.com.educacionit.universidad;

public class Condicionales {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		boolean llueve = false;
		if(llueve) {
			System.out.println("Llueve");
		}else {
			System.out.println("No llueve");
		}

		
		
		int edad = 37;
		if(edad ==18) {
			System.out.println("18");
		}else if(edad == 35) {
			System.out.println("35");
		}else if(llueve) {
			System.out.println("Llueve");
		}else if(edad > 36 && edad<=37) {
			System.out.println("mayor a 36 y menor o igual a 37");
		}else {
			System.out.println("Ninguna");
		}
		
		
		//Switch
		
		switch (edad) {
		case 18: {
			
			System.out.println("18");
			break;
		}
		case 36:
		case 37: {
			
			System.out.println("default");
			break;
		}
		default:
			System.out.println("Edad distita a 18");
		}
		
		
		
		boolean aprobado = (edad >=7 ? true : false);
		System.out.println(aprobado);
	}

}
