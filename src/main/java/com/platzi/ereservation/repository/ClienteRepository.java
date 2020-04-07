/**
 * 
 */
package com.platzi.ereservation.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.platzi.ereservation.modelo.Cliente;

/**
 * Interface para definir las operaciones de base de datos relacionadas con cliente
 * @author Gonza
 *
 */
public interface ClienteRepository extends JpaRepository<Cliente, String>{
	
	/**
	 * Definicion de metodo para buscar los clientes por su apellido
	 * @param apellidoCli
	 * @return
	 */
	public List<Cliente> findByApellidoCli(String apellidoCli);
	
	public Cliente findByIdentificacion(String identificacionCli);
}
