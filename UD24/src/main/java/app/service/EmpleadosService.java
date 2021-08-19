package app.service;

import java.util.List;

import app.dto.Empleados;

public interface EmpleadosService {

	//Metodos del CRUD
	public List<Empleados> listarEmpleados(); //Listar All 
	
	public Empleados guardarEmpleados(Empleados empleados);	//Guarda un empleado CREATE
	
	public Empleados empleadosXID(Long id); //Leer datos de un empleado READ
	
	public List<Empleados> listarEmpleadosNombre(String nombre);//Listar empleados por campo nombre
	
	public Empleados actualizarEmpleados(Empleados empleados); //Actualiza datos de empleados UPDATE
	
	public void eliminarEmpleados(Long id);// Elimina empleados DELETE
	
	
}
