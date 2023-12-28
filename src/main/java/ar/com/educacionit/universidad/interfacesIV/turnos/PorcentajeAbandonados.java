package ar.com.educacionit.universidad.interfacesIV.turnos;

public class PorcentajeAbandonados implements IKPI {
	public Result execute(Turno[] turnos) {
		int abandonados = 0;
		for (var iKpi : turnos) {
			abandonados += iKpi.getFechaAbandono() != null ? 1 : 0;
		}
		return new Result("Abandonados", abandonados);
	}
}