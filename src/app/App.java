package app;

import beans.MenuFacadeRemote;
import config.Contexto;
import java.util.Scanner;
import javax.naming.InitialContext;
import javax.naming.NamingException;

/**
 *
 * @author fcastillo
 */
public class App {

    public static void main(String[] args) throws NamingException {
        InitialContext ctx = Contexto.obtener();

        String nombreJNDI = "java:global/Capitulo03/Capitulo03-ejb/MenuFacade";

        MenuFacadeRemote menu = (MenuFacadeRemote) ctx.lookup(nombreJNDI);

        Scanner scanner = new Scanner(System.in);

        int salir = 0;
        int opcion;

        while (salir != 3) {
            System.out.println("\n1 - Listar todas las Facultades");
            System.out.println("2 - Listar todas las Carreras");
            System.out.println("3 - Salir");
            try {
                System.out.println("\nSeleccione una opción: ");
                opcion = scanner.nextInt();
                switch (opcion) {
                    case 1:
                        listarFacultades(menu);
                        break;
                    case 2:
                        listarCarreras(menu);
                        break;
                    case 3:
                        salir = 3;
                        break;
                    default:
                        System.out.println("Opcion no valida");
                }
            } catch (Exception e) {
                System.out.println("Solo se aceptan numeros ");
                scanner.next();
            }
        }
    }

    private static void listarFacultades(MenuFacadeRemote menu) {
        System.out.println("Listado de Facultades\n");
        menu.obtenerFacultades().stream().forEach(x -> {
            System.out.println(x.getNombre());
        });
    }

    private static void listarCarreras(MenuFacadeRemote menu) {
        System.out.println("Listado de Carreras\n");
        menu.obtenerCarreras().stream().forEach(x -> {
            System.out.println(x.getNombre());
        });
    }
}
