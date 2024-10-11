package ficheros;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.List;

public class MainFicheros {
	
	public static List<String> fichero2List (String nombreFichero) throws IOException
	{
		List<String> lista = null;
		
			lista = Files.readAllLines(Path.of(nombreFichero));
	
		return lista;
	}
	
	public static void listToFichero (List<String> lista, String nombreFichero) throws IOException
	{
		Files.write(Path.of(nombreFichero), lista, StandardOpenOption.CREATE);
	}
	
	public static void main(String[] args) {
		
		List<String> lista = List.of("HOLA", "QUEX", "TAL");
		try {
			listToFichero(lista, "salida.txt");
			lista = fichero2List("salida.txt");
			System.out.println(lista);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
