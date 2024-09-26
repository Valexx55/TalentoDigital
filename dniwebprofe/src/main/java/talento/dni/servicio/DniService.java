package talento.dni.servicio;

import java.sql.SQLException;
import java.util.List;

import talento.dni.Dni;
import talento.dni.repository.DniRepository;

public class DniService {
	
	public List<Dni> recuperarListadoDni () throws SQLException{
		List<Dni> listaDni = null;
		DniRepository dniRepository = null;
			
			dniRepository = new DniRepository();
			listaDni = dniRepository.consultarTodos();
		
		return listaDni;
	}

}
