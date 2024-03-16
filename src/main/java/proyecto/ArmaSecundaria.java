package proyecto;

public class ArmaSecundaria extends Arma{
	private String tipoMunicion;
	private boolean recargaRapida;
	
	public ArmaSecundaria(String nombre, String descripcion, String tipo, int danioBase, String tipoMunicion, boolean recargaRapida) {
		super(nombre, descripcion, tipo, danioBase);
		this.tipoMunicion = tipoMunicion;
		this.recargaRapida = recargaRapida;
	}
	public String getTipoMunicion() {
		return tipoMunicion;
	}
	public void setTipoMunicion(String tipoMunicion) {
		this.tipoMunicion = tipoMunicion;
	}
	public boolean isRecargaRapida() {
		return recargaRapida;
	}
	public void setRecargaRapida(boolean recargaRapida) {
		this.recargaRapida = recargaRapida;
	}
   @Override
    public String toString() {
        return "ArmaSecundaria{" +
                "nombre='" + getNombre() + '\'' +
                ", descripcion='" + getDescripcion() + '\'' +
                ", tipo='" + getTipo() + '\'' +
                ", danio=" + getDanioBase() +
                ", tipoMunicion='" + tipoMunicion + '\'' +
                ", recargaRapida=" + recargaRapida +
                '}';
    }
}
