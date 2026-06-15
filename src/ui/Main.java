
package ui;

import data.GestorDatos;
import java.util.ArrayList;
import model.Tour;



/**
 * Clase principal
 * 
 * Permite ejecutar la aplicación, cargar los tours
 * desde el archivo de texto y mostrar los resultados.
 * 
 * 
 */

public class Main {

    
    /**
     * Método principal
     * 
     * Carga los tours desde el archivo de texto,
     * muestra todos los registros y posteriormente
     * filtra los tours de tipo Familiar.
     * 
     * @param args argumentos de línea de comandos.
     */
   
    public static void main(String[] args) {
        
        GestorDatos gestor = new GestorDatos();
        
        ArrayList<Tour> listaTours = gestor.cargarTours();
        
        System.out.println("===== LISTADO DE TODOS LOS TOURS =====");
        System.out.println();
        for (Tour tour : listaTours) {
            System.out.println(tour);
        }
                
        System.out.println("\n===== TOURS FILTRADOS POR TIPO FAMILIAR =====");
        System.out.println();
        for (Tour tour : listaTours) {
             if (tour.getTipo().equalsIgnoreCase("Familiar")) {
             System.out.println(tour);
             
             }
    
     
       }
                         
        
     }


  }