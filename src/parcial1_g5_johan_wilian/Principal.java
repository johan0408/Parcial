/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package parcial1_g5_johan_wilian;

import java.util.Scanner;

/**
 *
 * @author 1002797447
 */
public class Principal {
    public class Menu {
    private final Scanner scanner;

    public Menu(Scanner scanner) {
        this.scanner = scanner;
    }

    public void mostrarMenu() {
        int opcion;
        do {
            System.out.println("****** CONCESIONARIO CAUCANA DE VEHÍCULOS S.A.********");
            System.out.println("******* REGISTRO DE VEHÍCULOS VENDIDOS********");
            System.out.println("1. Registro de automóviles");
            System.out.println("2. Registro de motos");
            System.out.println("3. Vendedor");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();
            switch (opcion) {
                case 1:
                    registrarAutomovil();
                    break;
                case 2:
                    registrarMoto();
                    break;
                case 3:
                    mostrarVendedor();
                    break;
                case 4:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, seleccione una opción válida.");
                    break;
            }
        } while (opcion != 4);
    }

    private void registrarAutomovil() {
        // Lógica para el registro de automóviles
    }

    private void registrarMoto() {
        // Lógica para el registro de motos
    }

    private void mostrarVendedor() {
        System.out.println("Nombre del estudiante: [Nombre Apellido]");
    }
}

}
