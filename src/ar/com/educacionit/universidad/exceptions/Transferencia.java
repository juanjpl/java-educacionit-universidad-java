package ar.com.educacionit.universidad.exceptions;

public class Transferencia implements IMetodoDePago {

	@Override
	public ResultadoPago pagar(Pago pago) throws NetworkException , SinSaldoException, TimeoutException{
		return null;
	}

}
