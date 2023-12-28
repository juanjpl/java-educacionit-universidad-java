package ar.com.educacionit.universidad.interfacesIII.servicio;

public class ServiceBuilder {

	
	/*ENUM*/
	public static IQuery buildService(String ws) {
		// TODO Auto-generated method stub
		
		if(ws == null) {
			System.err.println("Error no definio ws");
		}
		
		IQuery query;
		
		switch (ws) {
		case "1": {
			
			query = new DBQuery();
			break;
		}
		case "2":{
			query = new RestQuery();
			break;
		}
		case "3":{
			query = new FileQuery();
			break;
		}
		default:
			query = null;
		}
		return query;
	}

	
}
