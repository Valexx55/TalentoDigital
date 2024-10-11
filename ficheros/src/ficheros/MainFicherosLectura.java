package ficheros;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class MainFicherosLectura {

	
	 public static List<String> fichero2List (String nombrefichero) throws IOException
	    {
	    	List<String> lista = null;
	    	
	    		lista = Files.readAllLines(Path.of(nombrefichero));
	    	
	    	return lista;
	    }
	 
	 
	 public static void main(String[] args) throws IOException {

			List<String> listaPalabras = null;

				listaPalabras = new ArrayList<String>();//creo la lista vacía
				listaPalabras = fichero2List("listanombres.txt");
				for (String p: listaPalabras)
				{
					System.out.println(p);
				}

				
				
		}
}
