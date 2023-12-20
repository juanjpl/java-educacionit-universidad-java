package ar.com.educacionit.universidad.exceptions;

import java.time.LocalDate;

public class Pago {

	
	private double monto;
	private LocalDate fechaPago;
	private String nroTrx;
	private String vendedor;
	private String comprador;
	
	
	public Pago(double monto, LocalDate fechaPago, String nroTrx, String vendedor, String comprador) {
		super();
		this.monto = monto;
		this.fechaPago = fechaPago;
		this.nroTrx = nroTrx;
		this.vendedor = vendedor;
		this.comprador = comprador;
	}


	public double getMonto() {
		return monto;
	}


	public void setMonto(double monto) {
		this.monto = monto;
	}


	public LocalDate getFechaPago() {
		return fechaPago;
	}


	public void setFechaPago(LocalDate fechaPago) {
		this.fechaPago = fechaPago;
	}


	public String getNroTrx() {
		return nroTrx;
	}


	public void setNroTrx(String nroTrx) {
		this.nroTrx = nroTrx;
	}


	public String getVendedor() {
		return vendedor;
	}


	public void setVendedor(String vendedor) {
		this.vendedor = vendedor;
	}


	public String getComprador() {
		return comprador;
	}


	public void setComprador(String comprador) {
		this.comprador = comprador;
	}
	
	
	
	
	
}
