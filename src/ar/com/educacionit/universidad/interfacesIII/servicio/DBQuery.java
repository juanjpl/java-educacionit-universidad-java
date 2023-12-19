package ar.com.educacionit.universidad.interfacesIII.servicio;

public class DBQuery implements IQuery {

	@Override
	public User find() {
		System.out.println("Consultado base de datos de usuarios....");
		
		var user = new User();
		
		return null;
	}
	
}
