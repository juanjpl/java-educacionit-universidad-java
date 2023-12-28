package ar.com.educacionit.universidad.exceptions;

public class ResultadoPago {

	private boolean status;
	private String description;
	
	
	public ResultadoPago(boolean status, String description) {
		super();
		this.status = status;
		this.description = description;
	}


	public boolean isStatus() {
		return status;
	}


	public void setStatus(boolean status) {
		this.status = status;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}
	
	
	
	
}
