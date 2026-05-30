package Caso_5;

import java.util.Scanner;

public class Main {
//REALIZADO POR IVAN CORCINO
    public static void main(String[] args) {
        GestorEstudiantes gestor = new GestorEstudiantes();
        Scanner scanner = new Scanner(System.in);
        String opcion = "";

        System.out.println("=== REGISTRO DE ESTUDIANTES ===");

        while (!opcion.equals("0")) {
            System.out.println("\n1. Agregar estudiante");
            System.out.println("2. Mostrar lista");
            System.out.println("0. Salir");
            System.out.print("Opción: ");
            opcion = scanner.nextLine();

            switch (opcion) {
                case "1":
                    try {
                        System.out.print("Nombre del estudiante: ");
                        String nombre = scanner.nextLine();
                        gestor.agregar(nombre);
                        System.out.println("Agregado correctamente.");
                    } catch (Exception e) {
                        System.out.println("Error: " + e.getMessage());
                    }
                    break;

                case "2":
                    gestor.mostrarLista();
                    break;

                case "0":
                    System.out.println("Programa finalizado.");
                    break;

                default:
                    System.out.println("Opción no válida. Intenta de nuevo.");
            }
        }

        scanner.close();
    }
}