package ar.com.educacionit.universidad.interfacesIII.servicio;

public class Service {

	public static void main(String[] args) {
		
		//recive la petición de algún cliente
		
		String ws = "1";
		
		//Crear el servicio de consulta
		IQuery query = ServiceBuilder.buildService(ws);
		
		//obtener el DTO = User
		User user = query.find();
		
		//retornar al cliente la data 
		System.out.println(user);
		
		//fin
		
		
	}
}
