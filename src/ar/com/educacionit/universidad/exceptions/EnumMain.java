package ar.com.educacionit.universidad.exceptions;

import java.util.Scanner;

public class EnumMain {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		System.out.println("Seleccione el metodo de pago: "
				+ "MP ---- Mercado Pago"
				+ "TC ---- Tarjeta Credito"
				+ "TD ---- Tarjeta Debito"
				+ "TRA ---- Transaccion");
		
		
		String metodoDesdeFrontEnd = teclado.next();
		
		MetodoPagoEnum elEnum = getMetodoEnum(metodoDesdeFrontEnd);
		IMetodoDePago metodoDePagoImpl = elEnum.getValor();
		teclado.close();
		System.out.println(metodoDePagoImpl);
	}
	

	public static MetodoPagoEnum getMetodoEnum(String metodoDelFrontEnd) {
		if (metodoDelFrontEnd == null) {
			throw new IllegalArgumentException(metodoDelFrontEnd + " no es valido");
		}

		MetodoPagoEnum metodoEnum = null;

		switch (metodoDelFrontEnd) {
		case "MP": {

			metodoEnum = MetodoPagoEnum.MERCADO_PAGO;
			break;
		}
		case "TC": {

			metodoEnum = MetodoPagoEnum.TARJETA_CREDITO;
			break;
		}
		case "TD": {

			metodoEnum = MetodoPagoEnum.TARJETA_DEBITO;
			break;
		}
		case "TRA": {

			metodoEnum = MetodoPagoEnum.TRANSFERENCIA;
			break;
		}
		default:
			// throw new IllegalArgumentException("Unexpected value: " + metodoDelFrontEnd);
		}
		
		if(metodoEnum == null) {
			 throw new IllegalArgumentException("Unexpected value: " + metodoDelFrontEnd);
		}
		return metodoEnum;
	}

	public static IMetodoDePago getMetodo(MetodoPagoEnum metodoEnum) {
		// null , MERCADO_PAGO, TARJETA_CREDITO, TARJETA_DEBITO,TRANSFERENCIA
		
		if(metodoEnum == null) {
			 throw new IllegalArgumentException("MetodoEnum no es valido");
		}
		
	
		
	
		
		return metodoEnum.getValor();		
		
	}
}
	
