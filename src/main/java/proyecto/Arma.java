package proyecto;

public class Arma extends Equipamiento{
	private String tipo;
	private int danioBase;

	
	public Arma(String nombre, String descripcion, String tipo, int danioBase) {
		super(nombre, descripcion);
		this.tipo = tipo;
		this.danioBase = danioBase;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public int getDanioBase() {
		return danioBase;
	}
	public void setDanioBase(int dañoBase) {
		this.danioBase = dañoBase;
	}
}
