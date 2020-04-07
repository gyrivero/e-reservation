/**
 * 
 */
package com.platzi.ereservation.resources.vo;

import lombok.Data;

/**
 * Clase que representa la tabla Cliente
 * 
 * @author Gonza
 *
 */
@Data
public class ClienteVO {

	private String nombreCli;
	private String apellidoCli;
	private String identificacionCli;
	private String direccionCli;
	private String telefonoCli;
	private String emailCli;
}
