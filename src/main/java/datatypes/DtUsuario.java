package datatypes;

import java.util.Date;

public class DtUsuario {

	private String nickname;
	private String nombre;
	private String apellido;
	private String email;
	private Date fechaNac;
	private String passward;
	private byte[] imagen;


	
	public DtUsuario(String nickname, String nombre, String apellido, String email, Date fechaNac, byte[] imagen,String passward) {
		super();
		this.nickname = nickname;
		this.nombre = nombre;
		this.apellido = apellido;
		this.email = email;
		this.fechaNac = fechaNac;
		this.imagen = imagen;
		this.passward = passward;
	}
	public String getNickname() {
		return nickname;
	}
	public String getNombre() {
		return nombre;
	}
	public byte[] getImagen() {
		return imagen;
	}
	public void setImagen(byte[] imagen) {
		this.imagen = imagen;
	}
	public String getApellido() {
		return apellido;
	}
	public String getEmail() {
		return email;
	}
	public Date getFechaNac() {
		return fechaNac;
	}
	public String getPassward() {
		return passward;
	}
	
	@Override
	public String toString() {
		return "NickName = " + nickname + "\nNOMBRE = " + nombre + "\nApellido = " + apellido + "\nEmail = " + email +"\nfechaNac =" + fechaNac +"" ;
	}
}
