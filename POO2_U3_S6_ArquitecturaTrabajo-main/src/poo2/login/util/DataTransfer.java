package poo2.login.util;

import poo2.login.model.dao.UsuarioDAO;

public class DataTransfer {

	private String nombreCompleto;
	
	/*
	 * Inicio
	 * Bloque creación singleton
	 */
	private static DataTransfer instance;
	
	private DataTransfer() {		
	}
	
	public static DataTransfer getInstance() {
		if(instance==null) {
			instance = new DataTransfer();
		}
		
		return instance;
	}
	
	/*
	 * Fin
	 * Bloque creación singleton
	 */
	
	public String getNombreCompleto() {
		return nombreCompleto;
	}
	
	public void setNombreCompleto(String nombreCompleto) {
		this.nombreCompleto = nombreCompleto;
	}
	

	public String getHoraMinuto() {
		UsuarioDAO dao = new UsuarioDAO();
		String hora = dao.getHora();
		return hora;
	
	}

	
	
}
