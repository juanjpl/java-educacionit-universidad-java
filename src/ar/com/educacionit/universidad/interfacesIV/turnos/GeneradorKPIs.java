package ar.com.educacionit.universidad.interfacesIV.turnos;

public class GeneradorKPIs {

	public static IKPI[] buildKpis() {
		IKPI[] kpis = new IKPI[] { 
				new CantidadTotal(), 
				new Atendidos(), 
				new PorcentajeAtendidos(),
				new PorcentajeAbandonados() 
			};
		return kpis;
	}
}
