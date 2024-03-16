package proyecto;

public class InventarioController {
private final int TAM_INVENTARIO_DEF = 10;
	
	private ArmaPrincipal[] armasPrincipalesInventario= new ArmaPrincipal[TAM_INVENTARIO_DEF];;
	private ArmaSecundaria[] armasSecundariasInventario= new ArmaSecundaria[TAM_INVENTARIO_DEF];
	private Accesorio[] accesoriosInventario= new Accesorio[TAM_INVENTARIO_DEF];
	
	

	public InventarioController() {
		armasPrincipalesInventario[0]=new ArmaPrincipal("AK-47", "Rifle de asalto automático", "Rifle de asalto", 40, 150, 1);
		armasPrincipalesInventario[1]=new ArmaPrincipal("M4A1", "Rifle de asalto automático", "Rifle de asalto", 35, 200, 1);
		armasPrincipalesInventario[2]=new ArmaPrincipal("SCAR-H", "Rifle de asalto automático", "Rifle de asalto", 38, 180, 2);
		armasPrincipalesInventario[3]=new ArmaPrincipal("L96A1", "Rifle de francotirador", "Rifle de francotirador", 100, 300, 5);
		armasPrincipalesInventario[4]=new ArmaPrincipal("M249", "Ametralladora ligera", "Ametralladora ligera", 30, 180, 3);
				
		armasSecundariasInventario[0]= new ArmaSecundaria("Pistola", "Pistola 9mm", "Arma de fuego", 20, "Balas", true);
		armasSecundariasInventario[1]= new ArmaSecundaria("Revolver", "Revolver calibre 45", "Arma de fuego", 25, "Balas", false);
		armasSecundariasInventario[2]= new ArmaSecundaria("Escopeta", "Escopeta de doble cañón", "Arma de fuego", 40, "Cartuchos", true);
		armasSecundariasInventario[3]= new ArmaSecundaria("Ballesta", "Ballesta de repetición", "Arma a distancia", 30, "Flechas", false);
		armasSecundariasInventario[4]= new ArmaSecundaria("Granada", "Granada explosiva", "Arma explosiva", 50, "Explosivos", false);
		
		accesoriosInventario[0]=new Accesorio("Visor", "Visor telescópico", "Aumenta precisión", 0, 1);
		accesoriosInventario[1]=new Accesorio("Silenciador", "Silenciador para armas", "Reduce ruido", 0, 2);
		accesoriosInventario[2]=new Accesorio("Granada", "Granada de humo", "Crea área de humo", 10, 3);
		accesoriosInventario[3]=new Accesorio("Botiquín", "Botiquín de primeros auxilios", "Recupera salud", 0, 4);
		accesoriosInventario[4]=new Accesorio("Mina", "Mina terrestre", "Explosión al pisar", 50, 5);
		
	}
	public void mostrarInventarios() {
		mostrarArray(this.armasPrincipalesInventario, "Armas principales: \n------------------------\n");
		mostrarArray(this.armasSecundariasInventario, "Armas secundarias: \n------------------------\n");
		mostrarArray(this.accesoriosInventario, "Accesorios: \n------------------------\n");
	}
	public void mostrarInventarioArmas() {
		mostrarArray(this.armasPrincipalesInventario, "Armas principales: \n------------------------\n");
		mostrarArray(this.armasSecundariasInventario, "Armas secundarias: \n------------------------\n");
	}
	public void mostrarInventarioArmasPrincipales() {
		mostrarArray(this.armasPrincipalesInventario, "Armas principales: \n------------------------\n");
	}
	public void mostrarInventarioArmasSecundarias() {
		mostrarArray(this.armasSecundariasInventario, "Armas secundarias: \n------------------------\n");
	}
	public void mostrarInventarioAccesorios() {
		mostrarArray(this.armasPrincipalesInventario, "Armas principales: \n------------------------\n");
	}
	private void mostrarArray(Equipamiento[] arr, String msg) {
		System.out.println(msg);
		for (Equipamiento item : arr) {
			if(item != null)
				System.out.println(item + "\n");
		}
	}

	public void addArmaPrincipalInvertary(ArmaPrincipal obj) {
		
			if(armasPrincipalesInventario[armasPrincipalesInventario.length-1]==null) {
				for(int i=0; i<armasPrincipalesInventario.length;i++) {
					if(armasPrincipalesInventario[i]==null) {
						System.out.println("\nEl arma " + obj.getNombre() + " ha sido añadida");
						armasPrincipalesInventario[i]=obj;
						break;
					}
					
				}
			}
			else if(armasPrincipalesInventario[armasPrincipalesInventario.length-1]!=null) {
				System.out.println("\nNo hay espacio para mas armas principales");
			}
	}
	public void addArmaSecundaria(ArmaSecundaria obj) {
		if(armasSecundariasInventario[armasSecundariasInventario.length-1]==null) {
			for(int i=0; i<armasSecundariasInventario.length;i++) {
				if(armasSecundariasInventario[i]==null) {
					System.out.println("\nEl arma " + obj.getNombre() + " ha sido añadida");
					armasSecundariasInventario[i]=obj;
					break;
				}
				
			}
		}
		else if(armasSecundariasInventario[armasSecundariasInventario.length-1]!=null) {
			System.out.println("\nNo hay espacio para mas armas secundarias");
		}
	}
	public void addAccesorio(Accesorio obj) {

		if(accesoriosInventario[accesoriosInventario.length-1]==null) {
			for(int i=0; i<accesoriosInventario.length;i++) {
				if(accesoriosInventario[i]==null) {
					System.out.println("\nEl accesorio " + obj.getNombre() + " ha sido añadida");
					accesoriosInventario[i]=obj;
					break;
				}
			}
		}
		else if(accesoriosInventario[accesoriosInventario.length-1]!=null) {
			System.out.println("\nNo hay espacio para mas accesorios");
		}
	}
	
	//equiparUsuario
	public boolean  equipar(int posicion, int opcion, Usuario usuario) {
		boolean equipado=false;
		switch (opcion) {
		case 1:
			if(armasPrincipalesInventario[posicion]!=null) {
				usuario.setArmaPrincipal((ArmaPrincipal)armasPrincipalesInventario[posicion]);
				System.out.println("El arma " +armasPrincipalesInventario[posicion].getNombre() +" ha sio equipada");
				equipado=true;
			}
			else {
				System.out.println("Lo siento, no se encontro el arma");
			}
			break;
		case 2:
			if(armasSecundariasInventario[posicion]!=null) {
				usuario.setArmaSecundaria((ArmaSecundaria)armasSecundariasInventario[posicion]);
				System.out.println("El arma " +armasSecundariasInventario[posicion].getNombre() +" ha sio equipada");
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
