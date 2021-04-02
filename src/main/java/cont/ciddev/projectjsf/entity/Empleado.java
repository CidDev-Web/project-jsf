/**
 * 
 */
package cont.ciddev.projectjsf.entity;

/**
 * @author ciddev
 * Clase que respresentara entidades de empleados
 *
 */
public class Empleado {
	
	private String nombre, primerApellido, segundoApellido, puesto;
	private boolean status;
	
	/**
	 * Getters y Setters de la clase y sus atributos
	 * Estan todos, es innecesario documentar cada uno de los metodos de prueba
	 */
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getPrimerApellido() {
		return primerApellido;
	}
	public void setPrimerApellido(String primerApellido) {
		this.primerApellido = primerApellido;
	}
	public String getSegundoApellido() {
		return segundoApellido;
	}
	public void setSegundoApellido(String segundoApellido) {
		this.segundoApellido = segundoApellido;
	}
	public String getPuesto() {
		return puesto;
	}
	public void setPuesto(String puesto) {
		this.puesto = puesto;
	}
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}

	
}
