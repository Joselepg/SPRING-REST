package app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



import app.dao.EmpleadosDAO;
import app.dto.Empleados;

@Service
public class EmpleadosServiceImpl implements EmpleadosService{
	
	//Utilizamos los metodos de la interface EmpleadosDAO.
	@Autowired
	EmpleadosDAO EmpleadosDAO;
	
	@Override
	public List<Empleados> listarEmpleados() {
		
		return EmpleadosDAO.findAll();
	}

	@Override
	public Empleados guardarEmpleados(Empleados empleados) {
		
		return EmpleadosDAO.save(empleados);
	}

	@Override
	public Empleados empleadosXID(Long id) {
		
		return EmpleadosDAO.findById(id).get();
	}
	

	@Override
	public Empleados actualizarEmpleados(Empleados empleados) {
		
		return EmpleadosDAO.save(empleados);
	}

	@Override
	public void eliminarEmpleados(Long id) {
		
		EmpleadosDAO.deleteById(id);
		
	}


	@Override
	public List<Empleados> listarEmpleadosNombre(String nombre) {
		
		return EmpleadosDAO.findByNombre(nombre);
	}

}
