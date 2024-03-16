package proyecto;

import java.util.ArrayList;
import java.util.List;


	public class InventarioController {
		
		private List<Arma> armasPrincipales = new ArrayList<>();
		private List<Arma> armasSecundarias = new ArrayList<>();
		private List<Accesorio> accesorios = new ArrayList<>();
		

		public InventarioController() {
			armasPrincipales.add(new ArmaPrincipal("AK-47", "Rifle de asalto automático", "Rifle de asalto", 40, 150, 1));
			armasPrincipales.add(new ArmaPrincipal("M4A1", "Rifle de asalto automático", "Rifle de asalto", 35, 200, 1));
			armasPrincipales.add(new ArmaPrincipal("SCAR-H", "Rifle de asalto automático", "Rifle de asalto", 38, 180, 2));
			armasPrincipales.add(new ArmaPrincipal("L96A1", "Rifle de francotirador", "Rifle de francotirador", 100, 300, 5));
			armasPrincipales.add(new ArmaPrincipal("M249", "Ametralladora ligera", "Ametralladora ligera", 30, 180, 3));
					
			armasSecundarias.add(new ArmaSecundaria("Pistola", "Pistola 9mm", "Arma de fuego", 20, "Balas", true));
			armasSecundarias.add(new ArmaSecundaria("Revolver", "Revolver calibre 45", "Arma de fuego", 25, "Balas", false));
			armasSecundarias.add(new ArmaSecundaria("Escopeta", "Escopeta de doble cañón", "Arma de fuego", 40, "Cartuchos", true));
			armasSecundarias.add(new ArmaSecundaria("Ballesta", "Ballesta de repetición", "Arma a distancia", 30, "Flechas", false));
			armasSecundarias.add(new ArmaSecundaria("Granada", "Granada explosiva", "Arma explosiva", 50, "Explosivos", false));
			
			accesorios.add(new Accesorio("Visor", "Visor telescópico", "Aumenta precisión", 0, 1));
			accesorios.add(new Accesorio("Silenciador", "Silenciador para armas", "Reduce ruido", 0, 2));
			accesorios.add(new Accesorio("Granada", "Granada de humo", "Crea área de humo", 10, 3));
			accesorios.add(new Accesorio("Botiquín", "Botiquín de primeros auxilios", "Recupera salud", 0, 4));
			accesorios.add(new Accesorio("Mina", "Mina terrestre", "Explosión al pisar", 50, 5));
			
		}
		public void mostrarInventarios() {
			mostrarArray(this.armasPrincipales, "Armas principales: \n------------------------\n");
			mostrarArray(this.armasSecundarias, "Armas secundarias: \n------------------------\n");
			mostrarArray(this.accesorios, "Accesorios: \n------------------------\n");
		}
		public void mostrarInventarioArmas() {
			mostrarArray(this.armasPrincipales, "Armas principales: \n------------------------\n");
			mostrarArray(this.armasSecundarias, "Armas secundarias: \n------------------------\n");
		}
		public void mostrarInventarioArmasPrincipales() {
			mostrarArray(this.armasPrincipales, "Armas principales: \n------------------------\n");
		}
		public void mostrarInventarioArmasSecundarias() {
			mostrarArray(this.armasSecundarias, "Armas secundarias: \n------------------------\n");
		}
		public void mostrarInventarioAccesorios() {
			mostrarArray(this.armasPrincipales, "Armas principales: \n------------------------\n");
		}
		private <Equipamiento> void mostrarArray(List<Equipamiento> equipamiento, String msg) {
			System.out.println(msg);
			for (Object item : equipamiento) {
				if(item != null)
					System.out.println(item + "\n");
			}
		}
		

		public void addArmaPrincipalInventary(ArmaPrincipal obj) {
			
				armasPrincipales.add(obj);
		}
		public void addArmaSecundaria(ArmaSecundaria obj) {
				armasSecundarias.add(obj);
		}
		public void addAccesorio(Accesorio obj) {

				accesorios.add(obj);
		}
		
		//equiparUsuario
		public boolean  equipar(int posicion, int opcion, Usuario usuario) {
			boolean equipado=false;
			switch (opcion) {
			case 1:
				if(armasPrincipales.get(posicion)!=null) {
					usuario.setArmaPrincipal((ArmaPrincipal)armasPrincipales.get(opcion));
					System.out.println("El arma " +armasPrincipales.get(opcion).getNombre() +" ha sido equipada");
					equipado=true;
				}
				else {
					System.out.println("Lo siento, no se encontro el arma");
				}
				break;
			case 2:
				if(armasSecundarias.get(posicion)!=null) {
					usuario.setArmaSecundaria((ArmaSecundaria)armasSecundarias.get(opcion));
					System.out.println("El arma " +armasSecundarias.get(opcion).getNombre() +" ha sido equipada");
					equipado=true;
				}
				else {
					System.out.println("Lo siento, no se encontro el arma");
				}
				break;
			default:
				System.err.println("\nOpción no válida.");
			}
			return equipado;
		}
		//desequipar
		public boolean desequipar( int opcion, Usuario usuario) {
			boolean desequipado=false;
			switch (opcion) {
			case 1:
				if(usuario.getArmaPrincipal()!=null) {
				    System.out.println("El arma " + usuario.getArmaPrincipal().getNombre() +" ha sio desequipada");
					usuario.setArmaPrincipal(null);;
					desequipado=true;
				}
				else {
					System.out.println("no hay arma que desequipar");
				}
				break;
			case 2:
				if(usuario.getArmaSecundaria()!=null) {
				    System.out.println("El arma " + usuario.getArmaSecundaria().getNombre() +" ha sio desequipada");
					usuario.setArmaPrincipal(null);;
					desequipado=true;
				}
				else {
					System.out.println("no hay arma que desequipar");
				}
				break;
			default:
				System.err.println("\nOpción no válida.");
			}
			return desequipado;
		}

	


}
