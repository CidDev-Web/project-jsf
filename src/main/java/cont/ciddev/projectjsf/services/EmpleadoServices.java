/**
 * 
 */
package cont.ciddev.projectjsf.services;

import java.util.ArrayList;
import java.util.List;

import cont.ciddev.projectjsf.entity.Empleado;

/**
 * @author ciddev
 * Clase que permite realizar la logica de negocio para Empleados
 */
public class EmpleadoServices {
	
	/**
	 * Metodo que permite consultar la lista de empleados
	 * @return{@link Empleado} lista de empleados
	 */
	public List<Empleado> consultarEmpleados(){
		
		//Generar la lista de empleados a consultar
		List<Empleado> empleados = new ArrayList<Empleado>();
		
		//Siendo innecesario liarla con una BD para probar, generamos unos objetos de prueba
		Empleado empleadoIBM = new Empleado();
		empleadoIBM.setNombre("Diego");
		empleadoIBM.setPrimerApellido("Paniagua");
		empleadoIBM.setSegundoApellido("Lopez");
		empleadoIBM.setPuesto("Senior Developer Java");
		empleadoIBM.setStatus(true);
		
		Empleado empleadoMicrosoft = new Empleado();
		empleadoMicrosoft.setNombre("Luis");
		empleadoMicrosoft.setPrimerApellido("Lopez");
		empleadoMicrosoft.setSegundoApellido("Mero");
		empleadoMicrosoft.setPuesto("CEO");
		empleadoMicrosoft.setStatus(false);
		
		Empleado empleadoApple = new Empleado();
		empleadoApple.setNombre("Marcelino");
		empleadoApple.setPrimerApellido("Pan");
		empleadoApple.setSegundoApellido("Yvino");
		empleadoApple.setPuesto("Debugger");
		empleadoApple.setStatus(true);
		
		empleados.add(empleadoIBM);
		empleados.add(empleadoMicrosoft);
		empleados.add(empleadoApple);
		
		return empleados;
		
	}
}
