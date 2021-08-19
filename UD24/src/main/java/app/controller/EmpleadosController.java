package app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import app.dto.Empleados;
import app.service.EmpleadosServiceImpl;


@RestController
@RequestMapping("/api")
public class EmpleadosController {
	
	@Autowired
	EmpleadosServiceImpl empleadosServiceImpl;
	
	@GetMapping("/empleados")
	public List<Empleados> listarEmpleados(){
		return empleadosServiceImpl.listarEmpleados();
	}
	
	//listar Empleados por campo nombre
	@GetMapping("/empleados/nombre/{nombre}")
	public List<Empleados> listarEmpleadosNombre(@PathVariable(name="nombre") String nombre) {
	    return empleadosServiceImpl.listarEmpleadosNombre(nombre);
	}
	
	
	@PostMapping("/empleados")
	public Empleados salvarEmpleados(@RequestBody Empleados empleados) {
		
		return empleadosServiceImpl.guardarEmpleados(empleados);
	}
	
	
	@GetMapping("/empleados/{id}")
	public Empleados empleadosXID(@PathVariable(name="id") Long id) {
		
		Empleados empleados_xid= new Empleados();
		
		empleados_xid=empleadosServiceImpl.empleadosXID(id);
		
		System.out.println("empleados XID: "+empleados_xid);
		
		return empleados_xid;
	}
	
	@PutMapping("/empleados/{id}")
	public Empleados actualizarEmpleados(@PathVariable(name="id")Long id,@RequestBody Empleados empleados) {
		
		Empleados empleados_seleccionado= new Empleados();
		Empleados empleados_actualizado= new Empleados();
		
		empleados_seleccionado= empleadosServiceImpl.empleadosXID(id);
		
		empleados_seleccionado.setNombre(empleados.getNombre());
		empleados_seleccionado.setApellido(empleados.getApellido());
		empleados_seleccionado.setPuesto(empleados.getPuesto());
		String Puesto = empleados.getPuesto();
		switch (Puesto) {
		case("policia"):
			empleados_seleccionado.setSalario(2000);
		case("programador"):
			empleados_seleccionado.setSalario(1500);
		case("charcutero"):
			empleados_seleccionado.setSalario(800);
		case("pescador"):
			empleados_seleccionado.setSalario(750);
		case("panadero"):
			empleados_seleccionado.setSalario(900);
		default:
			empleados_seleccionado.setSalario(1000);
		}
		
		empleados_actualizado = empleadosServiceImpl.actualizarEmpleados(empleados_seleccionado);
		
		System.out.println("El empleados actualizado es: "+ empleados_actualizado);
		
		return empleados_actualizado;
	}
	
	@DeleteMapping("/empleados/{id}")
	public void eleiminarEmpleados(@PathVariable(name="id")Long id) {
		empleadosServiceImpl.eliminarEmpleados(id);
	}
	
	
}
