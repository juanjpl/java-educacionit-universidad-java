package ar.com.educacionit.universidad.generics;

import java.util.Comparator;

public final class ApellidoComparator implements Comparator<Alumno> {

	protected DireccionEnum direccion;
	
	public ApellidoComparator(DireccionEnum direccion) {
		this.direccion = direccion;
		
	}
	
	
	@Override
	public int compare(Alumno o1, Alumno o2) {
		
		
		//ASC
		if(DireccionEnum.ASC.equals(this.direccion)) {
			return o1.getApellido().compareTo(o2.getApellido());
		}else {
			return o2.getApellido().compareTo(o1.getApellido());
		}
		
		//DESC
		
		
	
	}
	
}
