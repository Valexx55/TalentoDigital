package mapas;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class MainMapas {
	
	public static void main(String[] args) {
		
		Map<String, Integer> mapa = new HashMap<String, Integer>();
		
		mapa.put("idusuario", 3);
		
		int numero =  mapa.get("idusuario");
		
		System.out.println(numero);
		
		//Map<String, Persona> mapaPersonas = new HashMap<String, Persona>();
		//Map<String, Persona> mapaPersonas = new TreeMap<String, Persona>();
		Map<String, Persona> mapaPersonas = new LinkedHashMap<String, Persona>();
		
		Persona p1 = new Persona(0, 0, "Vale", 70);
		Persona p2 = new Persona(0, 0, "Oriana", 50);
		Persona p3 = new Persona(0, 0, "Juanjo", 18);
		Persona p4 = new Persona(0, 0, "Nagore", 65);
		
		mapaPersonas.put("53130984", p1);
		mapaPersonas.put("Z1349674", p2);
		mapaPersonas.put("71636899", p3);
		mapaPersonas.put("53901441", p4);
		
		Persona juanjo = mapaPersonas.get("71636899");
		System.out.println("Juanjo = " + juanjo);
		
		
		//recorrer
		//1 obtengo las claves
		Set<String> claves =  mapaPersonas.keySet();
		//recorro las claves
		for (String clave: claves)
		{
			System.out.println("Clave = " + clave);
			//cómo accedo a la persona asociada a esa clave
			Persona paux =  mapaPersonas.get(clave);
			System.out.println(paux.toString());
		}
		
		
		
		
		
	}

}
