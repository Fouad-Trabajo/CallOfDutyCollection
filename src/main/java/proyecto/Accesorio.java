package proyecto;

public class Accesorio extends Equipamiento{
	
	private String mejora;
	private int dañoEnArea;
	private int nivelRequerido;
	
	
	public Accesorio(String nombre, String descripcion, String mejora, int dañoEnArea, int nivelRequerido) {
		super(nombre, descripcion);
		this.mejora = mejora;
		this.dañoEnArea = dañoEnArea;
		this.nivelRequerido = nivelRequerido;
	}
	public int getDañoEnArea() {
		return dañoEnArea;
	}
	public void setDañoEnArea(int dañoEnArea) {
		this.dañoEnArea = dañoEnArea;
	}
	public String getMejora() {
		return mejora;
	}
	public void setMejora(String mejora) {
		this.mejora = mejora;
	}
	public int getNivelRequerido() {
		return nivelRequerido;
	}
	public void setNivelRequerido(int nivelRequerido) {
		this.nivelRequerido = nivelRequerido;
	}
	public String toString() {
        return "Accesorio{" +
                "nombre='" + getNombre() + '\'' +
                ", descripcion='" + getDescripcion() + '\'' +
                ", mejora='" + mejora + '\'' +
                ", dañoEnArea=" + dañoEnArea +
                ", nivelRequerido=" + nivelRequerido +
                '}';
    }
}
