package ar.com.educacionit.universidad.exceptions;

public class MercadoPago implements IMetodoDePago , IConfigurable {
	
	private String urlMP;
	private String user;
	private String password;
	
	

	public MercadoPago() {
		
	}



	public MercadoPago(String urlMP, String user, String password) {
		super();
		this.urlMP = urlMP;
		this.user = user;
		this.password = password;
	}



	@Override
	public ResultadoPago pagar(Pago pago) throws NetworkException , SinSaldoException, TimeoutException{
		System.out.println("Conectando a mercado pago..." + urlMP);
		System.out.println("Usuario: " + user);
		


		if(pago.getMonto() >10 && pago.getMonto()<20) {
			throw new TimeoutException();
		}
		
		
		if(pago.getMonto() >20 && pago.getMonto()<40) {
			throw new SinSaldoException();
		}
		
		if(pago.getMonto() >40 && pago.getMonto()<50) {
			throw new NetworkException("Error al consultar el servidor de MP");
		}
		
System.out.println("Conexion ok...");
		
		System.out.println("realizando pago...");
		return new ResultadoPago(true,"Pago Exitoso!!");
	}



	@Override
	public void configurar(String... args) {
		// TODO Auto-generated method stub
		
		if(args.length == 0 || args.length >3) {
			throw new IllegalArgumentException("Argumentos invalidos");
		}
		this.user = args[0];
		this.password=args[1];
		this.urlMP = args[2];
	}

}
