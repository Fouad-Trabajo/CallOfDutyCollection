package proyecto;

public class ArmaPrincipal extends Arma{
	private int alcanceMaximo;
	private int penetracion;

	public ArmaPrincipal(String nombre, String descripcion, String tipo, int danioBase, int alcanceMaximo,
			int penetracion) {
		super(nombre, descripcion, tipo, danioBase);
		this.alcanceMaximo = alcanceMaximo;
		this.penetracion = penetracion;
	}

	public int getAlcanceMaximo() {
		return alcanceMaximo;
	}

	public void setAlcanceMaximo(int alcanceMaximo) {
		this.alcanceMaximo = alcanceMaximo;
	}

	public int getPenetracion() {
		return penetracion;
	}

	public void setPenetracion(int penetracion) {
		this.penetracion = penetracion;
	}

	@Override
	public String toString() {
		return "ArmaPrincipal{" + "nombre='" + getNombre() + '\'' + ", descripcion='" + getDescripcion() + '\''
				+ ", tipo='" + getTipo() + '\'' + ", dañoBase=" + getDanioBase() + ", alcanceMaximo=" + alcanceMaximo
				+ ", penetracion=" + penetracion + '}';
	}
}
