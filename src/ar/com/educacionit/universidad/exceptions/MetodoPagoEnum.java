package ar.com.educacionit.universidad.exceptions;

public enum MetodoPagoEnum {

	
	MERCADO_PAGO("MP", new MercadoPago()),
	TARJETA_CREDITO("TC", new TarjetaCredito()),
	TARJETA_DEBITO("TD",new TarjetaDebito()),
	TRANSFERENCIA("TRA", new Transferencia());
	
	
	private String key;
	private IMetodoDePago valor;
	
	
	
	private MetodoPagoEnum(String key, IMetodoDePago valor) {
		this.valor = valor;
	}



	public String getKey() {
		return key;
	}



	public IMetodoDePago getValor() {
		return valor;
	}
	
	
}
