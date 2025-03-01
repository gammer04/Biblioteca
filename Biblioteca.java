/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestionbibloteca;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author USER
 */
public class Biblioteca {

    private ArrayList<String> Libros;

    public Biblioteca() {
        this.Libros = new ArrayList<>();
    }

    // Método para agregar un medicamento
    public void agregarLibro(String Libro) {

        if (Libro != null && !Libro.isEmpty()) { // Validación básica
            Libros.add(Libro); // Agrega el Libro a la lista
            System.out.println("Libro agregado: " + Libro);
        } else {
            System.out.println("Error: El nombre del libro no puede estar vacío.");
        }
    }

    // Método para eliminar un medicamento
    public void eliminarLibro(String Libro) {
        if (Libro.contains(Libro)) { // Verifica si el medicamento existe
            Libros.remove(Libro); // Elimina el libro de la lista
            System.out.println("Libro eliminado: " + Libro);
        } else {
            System.out.println("Error: El libro no existe .");
        }
    }

    //Metodo para buscar libros
    public void buscarLibro(String Libro) {
        if (Libros.contains(Libro)) { // Verifica si el medicamento existe
            System.out.println("El libro '" + Libro + "' está en el inventario.");
        } else {
            System.out.println("El libro '" + Libro + "' NO está en el inventario.");
        }
    }

    // Método para mostrar todos los libros en la lista
    public void mostrarLibros() {
        if (Libros.isEmpty()) {
            System.out.println("No hay libros en la biblioteca.");
        } else {
            System.out.println("Libros en la biblioteca:");
            for (String libro : Libros) {
                System.out.println(libro);
            }
        }
    }
}
