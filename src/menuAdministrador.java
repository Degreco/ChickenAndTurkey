import java.util.Scanner;

public class menuAdministrador {
	Scanner teclado = new Scanner(System.in);

	public void mostrarMenu(){
		boolean salir = false;
		while (!salir) {
		System.out.println("******* MENU ADMINISTRADOR *******");
		System.out.println();
		System.out.println("1. Usuarios");
		System.out.println("2. Vehiculos");
		System.out.println("3. Informes");
		System.out.println("4. Salir");
		System.out.println("Opcion: ");
		int opcion = teclado.nextInt();	
		
		switch (opcion) {
			case 1:
				menuUsuariosAdministrador();
				break;
			case 2:
				menuVehiculosADministrador();
				break;
			case 3:
				informes();
				break;
			case 4:
				salir = true;
				break;
			default:
				break;
		}

		}
	}

	public static void menuUsuariosAdministrador() {
		Scanner teclado = new Scanner(System.in);

		System.out.println("******* MENU ADMINISTRADOR *******");
		System.out.println();
		System.out.println("1. Consultar usuarios");
		System.out.println("2. Crear usuario");
		System.out.println("3. Editar usuario");
		System.out.println("Opcion: ");
		int opcion = teclado.nextInt();
		switch (opcion) {
			case 1:

				break;
			case 2:

				break;
			case 3:
				
				break;

		}
	}

	public static void menuVehiculosADministrador() {
		System.out.println("******* MENU ADMINISTRADOR *******");
		System.out.println();
		System.out.println("1. Consualtar vehiculos");
		System.out.println("Crear vehiculo");
		System.out.println("Editar vehiculo");
	}

	public static void informes(){
		System.out.println("******* MENU ADMINISTRADOR *******");
		System.out.println("1. Crear informe");
	}

	public static void consultarUsuario(){
		System.out.println("Nombre: ");
		System.out.println("Apellido: ");
	}
}
