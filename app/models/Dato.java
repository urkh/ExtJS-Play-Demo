package models;

import javax.persistence.Entity;
import javax.persistence.Id;
import play.db.ebean.Model;

@Entity
public class Dato extends Model{

	@Id
	private Long id;
	
	private String nombre;

	private String apellido;

	private String fechaNac;
	
	private String correo;
	
	public static Finder<Long, Dato> buscar = new Finder<Long, Dato>(Long.class, Dato.class); 


	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getApellido() {
		return apellido;
	}
	
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}


	public String getFechaNac() {
		return fechaNac;
	}
	
	public void setFechaNac(String fechaNac) {
		this.fechaNac = fechaNac;
	}
	
	public String getCorreo() {
		return correo;
	}
	
	public void setCorreo(String correo) {
		this.correo = correo;
	}


	
	
}
