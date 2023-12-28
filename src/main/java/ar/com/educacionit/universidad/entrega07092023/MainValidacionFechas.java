package ar.com.educacionit.universidad.entrega07092023;

import java.time.LocalDateTime;
import java.util.Scanner;

public class MainValidacionFechas {

	public static void main(String[] args) {

		// Atributos
		int anio;
		int mes;
		int dia;

		int anioIngresado=0;
		int mesIngresado=0;
		int diaIngresado=0;
		boolean bisiesto = false;
		boolean flag = false;
		String ingreso;

		LocalDateTime fechaActual = LocalDateTime.now();
		anio = fechaActual.getYear();
		mes = fechaActual.getMonthValue();
		dia = fechaActual.getDayOfMonth();

		System.out.println("Fecha actual: " + dia + "/" + mes + "/" + anio);
		System.out.println("Ejercicio java 001");
		System.out.println("Validador de fechas");
		Scanner teclado = new Scanner(System.in);

		// teclado.close();

		int ingresado = 0;
		do {

			System.out.println("Ingrese anio (entre 1900 y 2099):");
			ingreso = teclado.next();

			if (isNumeric(ingreso)) {
				ingresado = Integer.parseInt(ingreso);
				anioIngresado = ingresado;
				flag = true;
			} else {
				System.out.println("Anio ingresado incorrecto ---error  !!!");
				flag = false;
			}

		} while (ingresado <= 1900 || ingresado > 2099 || flag == false);

		if ((ingresado % 4 == 0) && ((ingresado % 100 != 0) || (ingresado % 400 == 0))) {
			bisiesto = true;
			System.out.println("Anio bisiesto !!!");
		}else {
			System.out.println("Anio no bisiesto");
		}

	

		System.out.println("Anio validado! ");

		do {

			System.out.println("Ingrese mes (numerico entre 1 y 12):");
			ingreso = teclado.next();

			if (isNumeric(ingreso)) {
				ingresado = Integer.parseInt(ingreso);
				mesIngresado = ingresado;
				flag = true;
			} else {
				flag = false;
			}

		} while (ingresado <= 0 || ingresado > 12 || flag == false  );

		System.out.println("Mes validado! ");
		

		do {

			System.out.println("Ingrese dia (numerico entre 1 y 31 (febrero 29 si es bisiesto):");
			ingreso = teclado.next();

			if (isNumeric(ingreso)) {
				ingresado = Integer.parseInt(ingreso);
				diaIngresado = ingresado;
				//System.out.println("dia ingresado es numero");
				
				
				if(mesIngresado==2 && bisiesto == true ) {
					
					if(diaIngresado>=1 && diaIngresado<=29) {
						System.out.println("mes bisiesto con 29 dias");
						//System.out.println(diaIngresado);
						flag=true;
					
					}else {
						System.out.println("dias ingresados --- error");
						flag=false;
						
					}
				
				
					
				}else if(mesIngresado==2 && bisiesto == false ) {
					
					if(diaIngresado>=1 && diaIngresado<=28) {
						System.out.println("mes no bisiesto con 28 dias");
						//System.out.println(diaIngresado);
						flag=true;
					
					}else {
						System.out.println("dias ingresados --- error");
						flag=false;
						
					}
					
					
				}
				
				
				
				if(mesIngresado == 1 || mesIngresado == 3 || mesIngresado == 5 || mesIngresado == 7
						|| mesIngresado == 8 || mesIngresado == 10 || mesIngresado == 12){
					
					if(diaIngresado>=1 && diaIngresado<=31) {
						//System.out.println("mes con 31 dias");
						//System.out.println(diaIngresado);
						flag=true;
					
					}else {
						System.out.println("dias ingresados --- error");
						flag=false;
						
					}
				
					
				}else if(mesIngresado == 4 || mesIngresado == 6 || mesIngresado == 9 || mesIngresado == 11){
					
					if(diaIngresado>=1 && diaIngresado<=30) {
						//System.out.println("mes con 30 dias");
						//System.out.println(diaIngresado);
						flag=true;
					
					}else {
						System.out.println("dias ingresados --- error");
						flag=false;
					
					}
				}
				
		

			} else {
				flag = false;
				//System.out.println("dia ingresado es string");
			}

		} while ( flag == false);

		//System.out.println("Dia validado!");
		

		teclado.close();
		System.out.println("Felicidades !!! Fecha validada correctamente!" );
		System.out.println("Fecha validada: " + diaIngresado + "/" + mesIngresado + "/" + anioIngresado);

	}





	private static boolean isNumeric(String ingreso) {
		
	
		if (ingreso == null || "".equals(ingreso) || ingreso.isBlank()) {
			
			return false;
		}
		try {
			double d = Double.parseDouble(ingreso);
		} catch (NumberFormatException nfe) {
			return false;
		}

		return true;

	}

}
