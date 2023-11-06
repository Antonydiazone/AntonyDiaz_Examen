/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package antonydiaz_examen;

import java.util.Scanner;

/**
 *
 * @author antob
 */
public class AntonyDiaz_Examen {

    /**
     * @param args the command line arguments
     */
         public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder menuHistory = new StringBuilder();
        // Menu
        while (true) {
            System.out.println("Menú:");
            System.out.println("1. Ejercicios String ");
            System.out.println("2. Respuestas a preguntas ");
            System.out.println("3. Mostrar el historial del menú ");
            System.out.println("4. Salir");
            System.out.print("Ingrese una opción: ");

            int opcion = scanner.nextInt();
            scanner.nextLine(); // Consumir la nueva línea

            switch (opcion) {
                case 1:
                    menuHistory.append("Ejercicios String - ");
                    ejercicioString(scanner);
                    break;
                case 2:
                    menuHistory.append("Respuestas a preguntas - ");
                    respuestasPreguntas();
                    break;
                case 3:
                    menuHistory.append("Mostrar el historial del menú - ");
                    mostrarHistorial(menuHistory.toString());
                    break;
                case 4:
                    System.out.println("Saliendo del programa.");
                    return;
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
            }
        }
    }

    public static void ejercicioString(Scanner scanner) {
        System.out.print("Ingrese una cadena (al menos 8 caracteres): ");
        String input = scanner.nextLine();

        if (input.length() >= 8) {
            if (input.length() % 2 == 0) {
                // Cadena de tamaño par
                int halfLength = input.length() / 2;
                String firstHalf = input.substring(0, halfLength);
                String secondHalf = input.substring(halfLength);
                StringBuilder result = new StringBuilder();
                for (int i = 0; i < halfLength; i++) {
                    result.append(firstHalf.charAt(i)).append('-').append(secondHalf.charAt(i));
                }
                System.out.println("Cadena resultante: " + result.toString());
            } else {
                // Cadena de tamaño impar
                int halfLength = input.length() / 2;
                String firstHalf = input.substring(0, halfLength);
                String secondHalf = input.substring(halfLength);
                String result = secondHalf + firstHalf;
                System.out.println("Cadena resultante: " + result);
            }
        } else {
            System.out.println("La cadena ingresada no cumple con el tamaño mínimo requerido.");
        }
    }
    // respuestas a preguntas 
    public static void respuestasPreguntas() {
        System.out.println("Respuestas a preguntas:");
        System.out.println("a. Ciclos For, While y Do-While:");
        System.out.println("   - El ciclo for se utiliza para repetir un bloque de código un número fijo de veces.");
        System.out.println("   - El ciclo while se utiliza para repetir un bloque de código mientras una condición sea verdadera.");
        System.out.println("   - El ciclo do-while es similar al while, pero garantiza que el bloque de código se ejecuta al menos una vez.");

        System.out.println("b. Funciones .charAt(), .indexOf() y .length():");
        System.out.println("   - .charAt() devuelve el carácter en una posición específica de una cadena.");
        System.out.println("   - .indexOf() devuelve la posición de la primera ocurrencia de un carácter o subcadena en una cadena.");
        System.out.println("   - .length() devuelve la longitud (número de caracteres) de una cadena.");

        System.out.println("c. Tipos de datos primitivos en Java:");
        System.out.println("   - int: Almacena números enteros.");
        System.out.println("   - boolean: Almacena valores de verdad (true o false).");
    }
    // Mostrar el historial del menú
    public static void mostrarHistorial(String historial) {
        System.out.println("Historial del menú: " + historial);
    }
    }
    

