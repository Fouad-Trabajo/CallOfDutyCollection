package proyecto;

import java.util.Scanner;


public class Init {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
        InventarioController inventario = new InventarioController();
        boolean seguir = true;

        Usuario usuario = registroUsuario();
        System.out.println("\nBienvenido al campo de batalla, " + usuario.getNombre());
		while (seguir) {
			System.out.println("\n---------------------------------");
            System.out.println("\nMenú:\n");
            System.out.println("1. Mostrar Inventario");
            System.out.println("2. Añadir armas a la mochila");
            System.out.println("3. Añadir accesorios a la mochila");
            System.out.println("4. Equipar");
            System.out.println("5. Desequipar");
            System.out.println("0. Salir");
            System.out.println("\n---------------------------------");

            System.out.print("\nSeleccione una opción: ");
            int opcion = scan.nextInt();
            scan.nextLine();
            System.out.println("\n---------------------------------");
            switch (opcion) {
            case 1:
				System.out.println("\n---------------------------------");
				System.out.println("\nMostrar Inventario\n");
				System.out.println("1. De todo el inventario");
				System.out.println("2. De armas");
				System.out.println("3. Solo armas principales");
				System.out.println("4. Solo armas secundarias");
				System.out.println("5. Solo accesorios");
				System.out.println("0. Atras");
				System.out.println("\n---------------------------------");
				
				System.out.print("\nSeleccione una opción: ");
				int mostrar=scan.nextInt();
				scan.nextLine();
				System.out.println("\n---------------------------------");
				switch (mostrar) {
					case 1:
						inventario.mostrarInventarios();
						break;
					case 2:
						inventario.mostrarInventarioArmas();
						break;
					case 3:
						inventario.mostrarInventarioArmasPrincipales();
						break;
					case 4:
						inventario.mostrarInventarioArmasSecundarias();
						break;
					case 5:
						inventario.mostrarInventarioAccesorios();
						break;
					case 0:
						System.err.println("\nVolviendo al menu");
						break;
					default:
						System.err.println("\nOpción no válida.");
					}
				break;
			case 2:
				System.out.println("\n---------------------------------");
				System.out.println("\nAñadir armas a la mochila\n");
				System.out.println("1. Principal");
				System.out.println("2. Secundaria");
				System.out.println("0. Atras");
				System.out.println("\n---------------------------------");

				System.out.print("\nSeleccione una opción: ");
				
				int añadir = scan.nextInt();
				scan.nextLine();
				System.out.println("\n---------------------------------");
					switch (añadir) {
						case 1:
							System.out.println("Añade los datos del arma");
							System.out.println("Nombre:");
							String nombre = scan.nextLine();
							System.out.println("Descripcion:");
							String descripcion= scan.nextLine();
							System.out.println("Tipo:");
							String tipo = scan.nextLine();
							System.out.println("Daño:");
							int danioBase= scan.nextInt(); 
							scan.nextLine();
							System.out.println("Alcance:");
							int alcanceMaximo= scan.nextInt();
							scan.nextLine();
							System.out.println("Penetracion:");
							int penetracio= scan.nextInt();
							scan.nextLine();
							ArmaPrincipal armaPrincipal= new ArmaPrincipal(nombre,descripcion, tipo, danioBase,alcanceMaximo,penetracio);
							inventario.addArmaPrincipalInventary(armaPrincipal);
							break;
						case 2:
							System.out.println("Añade los datos del arma");
							System.out.println("Nombre:");
							String n = scan.nextLine();
							System.out.println("Descripcion:");
							String d= scan.nextLine();
							System.out.println("Tipo:");
							String t = scan.nextLine();
							System.out.println("Daño:");
							int danio= scan.nextInt(); 
							scan.nextLine();
							System.out.println("Tido de munidion:");
							String tipoMunicion= scan.nextLine(); 
							System.out.println("Tiene recarga rapida?[1]Si [2]No");
							boolean recargaRapida= true;
							int eleccion=scan.nextInt();
							if (eleccion==1){
								recargaRapida= true; 
							}
							else if (eleccion==2){
								recargaRapida= false;
							}
							else {
								recargaRapida= false;
							}
							
							ArmaSecundaria armaSecundaria= new ArmaSecundaria(n,d, t, danio,tipoMunicion,recargaRapida);
							inventario.addArmaSecundaria(armaSecundaria);
							break;
						case 0:
							System.err.println("\nVolviendo al menu");
							break;
						default:
							System.err.println("\nOpción no válida.");
						}
				break;
			case 3:
				System.out.println("Añade los datos del accesorio");
				System.out.println("Nombre:");
				String name = scan.nextLine();
				System.out.println("Descripcion:");
				String description= scan.nextLine();
				System.out.println("Mejora:");
				String mejora= scan.nextLine();
				System.out.println("Daño en area:");
				int dañoEnArea= scan.nextInt(); 
				scan.nextLine();
				System.out.println("Nivel requerido:");
				int nivelRequerido= scan.nextInt(); 
				scan.nextLine();
				Accesorio accesorio = new Accesorio(name,description,mejora,dañoEnArea,nivelRequerido);
				inventario.addAccesorio(accesorio);;
				break;
			case 4:
				System.out.println("Que arma te quieres equipar");
				System.out.println("[1] Arma principal");
				System.out.println("[2] ArmaSecundaria");
				int es=scan.nextInt();
				scan.nextLine();
				if(es==1) {
					System.out.println("Que arma te quieres equipar?(ingrese que linea)");
					inventario.mostrarInventarioArmasPrincipales();
					int linea=scan.nextInt();
					scan.nextLine();
					inventario.equipar(linea-1, es, usuario);
				}
				if(es==2) {
					System.out.println("Que arma te quieres equipar?(ingrese que linea)");
					inventario.mostrarInventarioArmasSecundarias();;
					int lineaa=scan.nextInt();
					scan.nextLine();
					inventario.equipar(lineaa-1, es, usuario);
				}
				else {
					System.out.println("Opcion no valida");
				}
				break;
			case 5:
				System.out.println("Que arma te quieres equipar");
				System.out.println("[1] Arma principal");
				System.out.println("[2] ArmaSecundaria");
				int esta=scan.nextInt();
				scan.nextLine();
				if(esta==1) {
					inventario.desequipar(esta, usuario);
				}
				if(esta==2) {
					inventario.desequipar(esta, usuario);
				}
				else {
					System.out.println("Opcion no valida");
				}
				break;
			case 0:
				System.out.println("\nSaliendo.");
				seguir=false;
				break;
			default:
				System.err.println("\nOpción no válida.");
            }
			
		}
		scan.close();
		
	}

	  private static Usuario registroUsuario() {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Introduce tu nombre, guerrero: ");

	        String nombreUsuario = sc.nextLine();
	        Usuario usuario = new Usuario(nombreUsuario);
	        return usuario;
	    
	}


}
