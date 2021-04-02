package cont.ciddev.projectjsf.controllers;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import cont.ciddev.projectjsf.entity.Empleado;
import cont.ciddev.projectjsf.services.EmpleadoServices;

/**
 * @author ciddev
 * Clase controller que se encarga de procesar la informacion para la pantalla principal.xhtml
 */
@ManagedBean
@ViewScoped
public class PrincipalController {

	/**
	 * Lista de empleados para la tabla
	 */
	private List<Empleado>empleados;
	
	/**
	 * Servicio con los metodos que realizan la logica de negocio para empleados
	 */
	private EmpleadoServices empleadoService = new EmpleadoServices();
	
	/**
	 * Metodo que se encarga de inicializar la informacion de la pantalla principal
	 */
	@PostConstruct
	public void init() {
		this.consultarEmpleados();
	}
	
	/**
	 * Metodo que consulta la lista de empleados
	 */
	public void consultarEmpleados() {
		this.empleados = empleadoService.consultarEmpleados();
	}

	/**
	 * Devuelve la lista de empleados
	 * @return{@link Empleado}lista empleados
	 */
	public List<Empleado> getEmpleados() {
		return empleados;
	}

	/**
	 * Le damos nueva lista a empleados
	 * @param empleados
	 */
	public void setEmpleados(List<Empleado> empleados) {
		this.empleados = empleados;
	}
	
	
}
