package app.dto;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="empleados")
public class Empleados {

	//Atributos de entidad cliente
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)//busca ultimo valor e incrementa desde id final de db
	private Long id;
	@Column(name = "nombre")
	private String nombre;
	@Column(name = "apellido")
	private String apellido;
	@Column(name = "puesto")
	private String puesto;
	@Column(name = "salario")
	private int salario;
	
	//Constructores
	
	public Empleados() {
	
	}

	/**
	 * @param id
	 * @param nombre
	 * @param apellido
	 * @param direccion
	 * @param salario
	 */
	public Empleados(Long id, String nombre, String apellido, String puesto, int salario) {
		//super();
		this.id = id;
		this.nombre = nombre;
		this.apellido = apellido;
		this.puesto = puesto;
		this.salario = salario;
	}

	
	//Getters y Setters
	
	/**
	 * @return  id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * @param id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * @return nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @return apellido
	 */
	public String getApellido() {
		return apellido;
	}

	/**
	 * @param apellido to set
	 */
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	/**
	 * @return puesto
	 */
	public String getPuesto() {
		return puesto;
	}

	/**
	 * @param puesto to set
	 */
	public void setPuesto(String puesto) {
		this.puesto = puesto;
	}

	/**
	 * @return salario
	 */
	public int getSalario() {
		return salario;
	}

	/**
	 * @param salario to set
	 */
	public void setSalario(int salario) {
		this.salario = salario;
	}
	
	//Metodo impresion de datos por consola
	@Override
	public String toString() {
		return "Cliente [id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + ", puesto=" + puesto
				+ ", salario=" + salario + "]";
	}
	
	
	
	
	
}
