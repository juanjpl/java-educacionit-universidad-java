package ar.com.educacionit.universidad.exceptions;

public class TarjetaDebito implements IMetodoDePago {

	@Override
	public ResultadoPago pagar(Pago pago) throws NetworkException , SinSaldoException, TimeoutException{
		return null;
	}

}
