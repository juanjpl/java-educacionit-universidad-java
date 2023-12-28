package ar.com.educacionit.universidad.polimorfismo;

public class MainConsola {

	public static void main(String[] args) {
		
		Play play1 = new Play("1234","Gris",1,false,32,false);
		Play play2 = new Play("123456","Negro",2,false,64,false);
		Play play5 = new Play("12345678","Blanco",5,true,64,true);
		
		Xbox xbox360 = new Xbox("22222","Negro",true,500,true);
		
		//Ahora puedo invocar los metodos play de cada consola;
		
		play1.play();
		play2.play();
		play5.play();
		
		xbox360.play();
		
		
		//Object[] consolas = new Object[] {play1,play2,play5,xbox360};
	/*
		
		for(Object o : consolas) {
			
			//dame la consola que esta dentro de Object
			Consola c = (Consola)o;
			
			//no se si hay play o xbox, pero , no importa
			c.play();
		}
		*/
		
		Consola[] consolas = new Consola[] {play1,play2,play5,xbox360};
		
for(Consola o : consolas) {
			
			o.play();
			
			//si justo aca quiero saber si es play o xbox, puedo ?
			if(o instanceof Play p) {
				p.getNombre();
			}
			
			if(o instanceof Xbox x) {
				x.getNombre();
			}
			
			if(o.getClass().isAssignableFrom(Play.class)) {
				Play s = (Play)o;
			}
		}
		
	}
}
