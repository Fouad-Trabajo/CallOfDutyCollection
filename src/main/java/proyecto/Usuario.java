package proyecto;

public class Usuario {
	private String nombre;
	private int espacioInventario;
	private Arma armaPrincipal;
	private Arma armaSecundaria;
	private int nivel;
	
	public Usuario(String nombre) {
		this.nombre = nombre;
		nivel=1;
	}
	public Usuario(String nombre, int espacioInventario, Arma armaPrincipal, Arma armaSecundaria, int nivel) {
		this.nombre = nombre;
		this.espacioInventario = espacioInventario;
		this.armaPrincipal = armaPrincipal;
		this.armaSecundaria = armaSecundaria;
		this.nivel = nivel;
	}
	public Usuario(String nombre, int espacioInventario, Arma armaPrincipal, Arma armaSecundaria) {
		this.nombre = nombre;
		this.espacioInventario = espacioInventario;
		this.armaPrincipal = armaPrincipal;
		this.armaSecundaria = armaSecundaria;
		nivel=1;
	}
	public int getNivel() {
		return nivel;
	}

	public void setNivel(int nivel) {
		this.nivel = nivel;
	}

	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getEspacioInventario() {
		return espacioInventario;
	}
	public void setEspacioInventario(int espacioInventario) {
		this.espacioInventario = espacioInventario;
	}
	public Arma getArmaPrincipal() {
		return armaPrincipal;
	}
	public void setArmaPrincipal(Arma armaPrincipal) {
		this.armaPrincipal = armaPrincipal;
	}
	public Arma getArmaSecundaria() {
		return armaSecundaria;
	}
	public void setArmaSecundaria(Arma armaSecundaria) {
		this.armaSecundaria = armaSecundaria;
	}
	

}
