package ar.com.educacionit.universidad.interfacesIV.turnos;

public class PorcentajeAtendidos implements IKPI{

	
		
		@Override
		public Result execute(Turno[] turnos) {
			
			Atendidos atendidos = new Atendidos();
			Result res =  atendidos.execute(turnos);
			
			//?? Math.ceil / floor / round
			
			return new Result("% Atendidos", res.getValue() * 100 / turnos.length);
		
		/*
	
		int atendidos = 0 ;
		for(int i =0 ; i < turnos.length ; i++) {
			
			if(turnos[i].getFechaAtencion() != null) {
				atendidos++;
			}
		}
		
		
		 * Atendidos atendidos = new Atendidos();
		 * Result res = atendidos.execute(turnos);
		 * 
		 * 
		 * return new Result("% Atendidos" , res.getValue()*100/turnos.length);
		 * usar Math.ceil / floor / round
		 
		
		
		return new Result("Porcentaje Atendidos: " ,(atendidos*100) / turnos.length);
		*/
	}

	
	
}
