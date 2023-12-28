package ar.com.educacionit.universidad.interfacesIV.turnos;

public class CantidadTotal implements IKPI{

	
	@Override
	public Result execute(Turno[] turnos) {
		
		
		
		return new Result("Cantidad total: "  ,turnos.length);
	}
}
