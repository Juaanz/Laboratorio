package logica;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Lob;
import javax.persistence.MappedSuperclass;

import datatypes.DtUsuario;

@Entity(name = "usuario")
@javax.persistence.Table(name = "usuario")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public abstract class Usuario {
	@Id
	private String nickname;
	private String nombre;
	private String apellido;
	private String email;
	private Date fechaNac;
	private String passward;
	
	@Lob
	private byte[] imagen;
	
	public Usuario() {
		super();
	}
	
	
	public Usuario(String nickname, String nombre, String apellido, String email, Date fechaNac, String passward,
			byte[] imagen) {
		super();
		this.nickname = nickname;
		this.nombre = nombre;
		this.apellido = apellido;
		this.email = email;
		this.fechaNac = fechaNac;
		this.passward = passward;
		this.imagen = imagen;
	}

	//public abstract DtUsuario getDtUsuario();
	public DtUsuario getDtUsuario() {
		return new DtUsuario(this.getNickname(), this.getNombre(), this.getApellido(), this.getEmail(), this.getFechaNac(), this.getImagen(), this.getPassward());
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getFechaNac() {
		return fechaNac;
	}

	public void setFechaNac(Date fechaNac) {
		this.fechaNac = fechaNac;
	}

	public byte[] getImagen() {
		return imagen;
	}

	public void setImagen(byte[] imagen) {
		this.imagen = imagen;
	}

	public String getPassward() {
		return passward;
	}

	public void setPassward(String passward) {
		this.passward = passward;
	}

}
