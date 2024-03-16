package proyecto;

public class Equipamiento {
	private int id=0;
	private int espacioMochila;
	private String nombre;
	private String descripcion;
	
	public Equipamiento(String nombre, String descripcion) {
		incrementId();
		this.espacioMochila = 1;
		this.nombre = nombre;
		this.descripcion = descripcion;
	}
	public Equipamiento(String nombre, int espacioMochila, String descripcion) {
		incrementId();
		this.espacioMochila = espacioMochila;
		this.nombre = nombre;
		this.descripcion = descripcion;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getEspacioMochila() {
		return espacioMochila;
	}
	public void setEspacioMochila(int espacioMochila) {
		this.espacioMochila = espacioMochila;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public void incrementId() {
		this.id++;
	}
}
