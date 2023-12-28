package ar.com.educacionit.universidad.interfacesIV.turnos;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Scanner;

public class GeneradorTurnos {

	
	public static Turno[] generarTurnos() {
		
		
		String dni;
		String tipoTramite;
		int sucursal;
		
		Scanner teclado = new Scanner(System.in);
		
		
		
		/*
		ArrayList<Turno> turnos;
		turnos.add();
		
		let turnos = [];
		turnos.push();
		*/
		
		ArrayList<Turno> turnos = new ArrayList<>();
		
		//cargar turnos mientras no indique dni = 0
		System.out.println("Ingrese turnos:");
		dni = teclado.next();
		
		while(!dni.trim().equals("0")) {
			System.out.println("Tipo de tramite");
			tipoTramite = teclado.next();
			
			System.out.println("Ingrese Sucursal:");
			sucursal = teclado.nextInt();
			
			LocalDateTime now = LocalDateTime.now();
			
			Turno turno = new Turno(dni, tipoTramite,now, sucursal);
			turnos.add(turno);
			
			System.out.println("Ingrese turnos:");
			dni = teclado.next();
			
		}
		
		
		
		teclado.close();
		
		//transformo el ArrayList en un array de Turnos para poder retornar....
		return turnos.toArray(new Turno[turnos.size()]);
	}
}
