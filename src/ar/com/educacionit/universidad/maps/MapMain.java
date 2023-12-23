package ar.com.educacionit.universidad.maps;

import java.security.KeyStore.Entry;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapMain {

	
	public static void main(String[] args) {
		
		Map<String,Integer> mapDias = new HashMap<>();
		
		//cargar los valors en un mapa
		
		mapDias.put("Lunes", 1);
		mapDias.put("Martes", 2);
		mapDias.put("Miercoles", 3);
		mapDias.put("Jueves", 4);
		mapDias.put("Viernes", 5);
		mapDias.put("Sabado", 6);
		mapDias.put("Domingo", 7);
		
		System.out.println(mapDias);
		
		//Vacio?
		boolean empty = mapDias.isEmpty();	
		System.out.println("Empty?: " + empty);
		
		//contiene algo?
		System.out.println("Lunes?" + mapDias.containsKey("Lunes"));
		System.out.println("1?" + mapDias.containsValue(1));
		
		//Quitar elementos
		int value = mapDias.remove("Lunes");
		System.out.println("Values deleted: "+ value);
		
		mapDias.remove("Jueves",4);
		
		System.out.println(mapDias);
		
		//Obtener las claves --- SETS
		Set<String> keys= mapDias.keySet()
;
		System.out.println(keys);
		
		//obtener los valores --- Collections<V>
		Collection<Integer> values = mapDias.values()
;
		System.out.println(values);
		
		//vacias un mapa
		//mapDias.clear();
		
		//Obtener un solo valor del mapa
		Integer valor = mapDias.get("Miercoles");
		System.out.println("Valor: " + valor);
		
		//Recorrer el mapa por sus valores
		for (String aKey : keys) {
			Integer aValue= mapDias.get(aKey);
			System.out.println(aKey + "-" + aValue);
		}
		
		
		//Recorrer de a pares!
		Set<java.util.Map.Entry<String, Integer>> entries = mapDias.entrySet();
		
		for(java.util.Map.Entry<String, Integer> aEntry : entries) {
			
			
			System.out.println(aEntry.getKey() + "-" + aEntry.getValue());
		}
	}
}
