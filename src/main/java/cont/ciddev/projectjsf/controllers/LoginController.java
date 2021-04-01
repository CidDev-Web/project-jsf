/**
 * 
 */
package cont.ciddev.projectjsf.controllers;

import java.io.IOException;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;

/**
 * @author ciddev Clase que permite controlar el funcionamiento de login.xhtml
 *         -> Al dejar en blanco el managed este tomara el nombre de la clase
 *         como referencia
 */
@ManagedBean
public class LoginController {

	/**
	 * Atributos a recibir desde el Login
	 */
	private String usuario, password;

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * Esto ayuda para saber en que momento pasas del xhtml al metodo controller un
	 * simple aviso en consola
	 */
	public void ingresar() {
		System.out.println("Usuario: " + usuario);

		if (usuario.equals("CidDev") && password.equals("12345")) {
			try {
				this.redireccionar("principal.xhtml");
			} catch (IOException e) {
				System.out.println("La pagina no se encuentra");
				e.printStackTrace();
			}
		} else {
			FacesContext.getCurrentInstance().addMessage("formLogin:txtUsuario",
					new FacesMessage(FacesMessage.SEVERITY_ERROR, "User incorrecto", ""));
		}

	}
	
	private void redireccionar(String pagina) throws IOException {
		ExternalContext ec = FacesContext.getCurrentInstance().getExternalContext();
		ec.redirect(pagina);
	}

}
