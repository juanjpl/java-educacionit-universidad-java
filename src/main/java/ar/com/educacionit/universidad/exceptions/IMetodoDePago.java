package ar.com.educacionit.universidad.exceptions;

public interface IMetodoDePago {

	public ResultadoPago pagar(Pago pago) throws NetworkException , SinSaldoException, TimeoutException;
	
}
