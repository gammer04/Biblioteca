/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package gestionbibloteca;

import java.util.Scanner;

/**
 *@descripcion se muestra la opciones de los metodos.
 * @author Jorge
 */
public class GestionBibloteca {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Biblioteca inventario = new Biblioteca();

        Scanner valor = new Scanner(System.in);
        System.out.print("------------------Menu--------------------\n "
                + "1 : --Buscar libros--\n "
                + "2 : --Eliminar--\n "
                + "3 : --Mostrar libros--\n"
                + "4: --agregar libros--\n"
                + "-------------------------------------------");
        System.out.print("\nIngrese una opcion\n ");
        int opcion = 0;
        System.out.println("Ingrese un numero entero\n");
        opcion = valor.nextInt();

        switch (opcion) {
            case 1:

                inventario.buscarLibro("cien de Soleda"); // Encontrado
                inventario.buscarLibro("Java Para princientes"); // No encontrado
                break;
            case 2:
                inventario.eliminarLibro("Cien Años de Soledad");
                break;
            case 3:
                // Mostrar todos los libros
                inventario.mostrarLibros();

            case 4:
                inventario.agregarLibro("cien de Soleda");
                inventario.agregarLibro("Java Para princientes");
                break;

            case 0:
                System.out.println("cerrar");
                break;

            default:
                break;

        }

    }

}
