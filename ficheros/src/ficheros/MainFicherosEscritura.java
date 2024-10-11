package ficheros;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainFicherosEscritura {
	
	
    public static void	list2Fichero (List<String> lpalabras, String nombreFichero) throws IOException
    {
    	Path path = Path.of(nombreFichero);//fichero
    	Files.write(path, lpalabras, StandardOpenOption.CREATE);//escribo /crea el fichero si no existe
    }
    
    
   
	

	/**
	 * Este método pide un palabra por teclado
	 * 
	 * @return
	 */
	public static String pedirPalabra() {
		String palabraIntroducida = null;// sección de declaración
		Scanner scanner = null;

		scanner = new Scanner(System.in);// cuerpo
		palabraIntroducida = scanner.nextLine();
		//scanner.close();

		return palabraIntroducida;// fin
	}

	public static void main(String[] args) throws IOException {

		// pedir palabra hasta que intro fin
		// si la palabra no es fin, la añado a la lista
		// y sigo pidiendo
		// si es fin, paro
		String palabra = null;
		List<String> listaPalabras = null;
		boolean salir = false;

			listaPalabras = new ArrayList<String>();//creo la lista vacía
			

			System.out.println("INTRO PALABRAS SEPARADAS POR INTRO");
			System.out.println("CUANDO QUIERAS PARAR INTRODUCE FIN ...");
			do {
				palabra = pedirPalabra();//pido palabra
				palabra = palabra.toUpperCase();//la paso a mayúsuclas
				
				if (!(palabra.equals("FIN"))) {//si es != de Fin, la añado a la lista
					listaPalabras.add(palabra); //add a la lista y continúo
				} else {
					salir = true;//me paro
				}
				
			} while (!salir);
			//muestro la lista
			for (String p: listaPalabras)
			{
				System.out.println(p);
			}
			
			try {
				list2Fichero(listaPalabras, "listanombres.txt");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
	}

}
