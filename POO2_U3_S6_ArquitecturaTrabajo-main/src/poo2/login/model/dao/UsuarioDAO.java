package poo2.login.model.dao;
import java.time.*;
public class UsuarioDAO {

	/**
	 * Este metodo tiene como propósito validar las credenciales
	 * ingresadas por el usuario.
	 * @param usuario
	 * @param passwd
	 * @return
	 */
	
	
	public String getHora() {
		LocalDateTime locaDate = LocalDateTime.now();
		int hours  = locaDate.getHour();
		int minutes = locaDate.getMinute();
		String hour = hours + "";
		String minutos = minutes + "";
		if(hours > 12) {
			hours -= 12;
			hour = hours + "";
		}  
		
		return hour + ":" + minutos;
	}
	
	public UsuarioDTO validarCredenciales(String usuario, String passwd, String hora) {
		UsuarioDTO dto =  null;
		if(usuario.equals("poo2") && passwd.equals("poo2") && hora.equalsIgnoreCase(getHora())) {
			dto = new UsuarioDTO();
			dto.setNombres("Boris");
			dto.setApellidos("Perez");
		}else if(usuario.equals("poo1") && passwd.equals("poo1") && hora.equalsIgnoreCase(getHora())) {
			dto = new UsuarioDTO();
			dto.setNombres("Franco");
			dto.setApellidos("Velandia");
		}
			
		return dto;
	}
	
}
