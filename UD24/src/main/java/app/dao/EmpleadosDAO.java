package app.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import app.dto.Empleados;

/**
 * @author Jose Luis
 *
 */
public interface EmpleadosDAO extends JpaRepository<Empleados, Long>{
	
	//Listar empleados por campo nombre
	public List<Empleados> findByNombre(String nombre);
	
}
