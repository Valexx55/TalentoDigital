package validacion.equals;

public class MainEquals {
	
	public static void main(String[] args) {
		
		Alumno alumno1 = new Alumno("Jesús", 10);
		Alumno alumno2 = new Alumno("Dani", 8);
		Alumno alumno3 = new Alumno("Jesús", 10);
		
		
		if (alumno1==alumno3)//== compara direcciones
		{
			System.out.println("Son iguales con ==");
		} else {
			System.out.println("Son distintos con ==");
		}
		
		if (alumno1.equals(alumno3))//el equals de OBject tb comprara direcciones
		{
			System.out.println("Son iguales con equals");
		} else {
			System.out.println("Son distintos con equals");
		}
		
		if (alumno1 instanceof Object)
		{
			System.out.println("El alumno es un Objeto");
		}
		
		String nombre = "HOLA";
		
		if (nombre instanceof Object)
		{
			System.out.println("Nombre es un Objeto");
		}
		
		
	}

	
	
	
	
	
	
	
	
	
	
}
