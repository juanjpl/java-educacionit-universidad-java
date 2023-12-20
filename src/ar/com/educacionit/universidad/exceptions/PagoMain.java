package ar.com.educacionit.universidad.exceptions;

import java.time.LocalDate;

public class PagoMain {

	public static void main(String[] args) {
		
		double montoAPagar = 150;
		String metodoDePagoSel = "MP";
		
		IMetodoDePago metodoDePago = new MercadoPago("https://mercadopago.com.ar","user","pasword");
		
		//cuando quiera pagar pueden pasar varias cosas 
		//1- se corta la conexion  ---NetworkException
		//2- no tiene saldo  ---- SinSaldoException
		//3- TimeOut -- demoró el pago y se corta el pago ----TimeOutException
		
		
		int reintentos =3;
		ResultadoPago resultado = null;
		Pago pago = new Pago(montoAPagar, LocalDate.now(),""+ Math.random(),"Vendedor","Comprador");
		
		do {
			
			try {
				resultado = metodoDePago.pagar(pago);
				//aca !! todo lo que escribas se ejecuta porque el pago fué correcto
			
			} catch (NetworkException | SinSaldoException e) {
				e.printStackTrace();
			}catch(TimeoutException te) {
				reintentos-- ;
			}finally {
				//DB  para cerrar conexiones
				System.out.println("Ejecutando el Finally...");
			}
			
			
		}while(resultado==null && reintentos>0);
		
		//listo ya pago!!
		
		System.out.println(resultado);
		
		
	}
}
