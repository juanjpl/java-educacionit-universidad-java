package ar.com.educacionit.universidad.interfacesIV.turnos;

public class Atendidos implements IKPI {

	
	@Override
	public Result execute(Turno[] turnos) {
		
		int atendidos = 0 ;
		for(int i =0 ; i < turnos.length ; i++) {
			
			if(turnos[i].getFechaAtencion() != null) {
				atendidos++;
			}
		}
		
		return new Result("Cantidad Atendidos: ", atendidos);
	}
}
