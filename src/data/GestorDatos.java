
package data;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import model.Tour;

/**
 * 
 * Se encarga de la lectura de los datos
 * desde el archivo tours.txt
 * 
 * Permite cargar la información de tours y almacenarla
 * en ArrayList.
 * 
 * 
 */

public class GestorDatos {

    /**
     * Lee el archivo tours.txt y carga los datos en un ArrayList.
     * 
     * Cada línea del archivo debe contener:nombre;tipo;precio
     * @return Lista con los tours cargados desde el archivo.
     */
    
    public ArrayList<Tour> cargarTours() {

        ArrayList<Tour> listaTours = new ArrayList<>();
        
        String rutaArchivo = "src/resources/tours.txt";
        
           try {
            // Se abre el archivo para lectura
            BufferedReader lector = new BufferedReader(new FileReader(rutaArchivo));

            // Lectura línea por línea
            String linea;

            // Se lee el archivo línea por línea
            while ((linea = lector.readLine()) != null) {

                // Se separa la línea usando punto y coma ;
                String[] partes = linea.split(";");

                // Se valida que la línea tenga 3 datos
                if (partes.length == 3) {

                    // Se convierten los datos al tipo correspondiente
                    String nombre = partes[0];
                    String tipo = partes[1];
                    int precio = Integer.parseInt(partes[2]);

                    // Se crea un objeto Tour con los datos leídos
                    Tour tour = new Tour(nombre, tipo, precio);

                    // Se agrega el objeto a la lista
                    listaTours.add(tour);
                }
            }

            // Se cierra el lector
            lector.close();

        } catch (IOException e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());

        } catch (NumberFormatException e) {
            System.out.println("Error al convertir el precio: " + e.getMessage());
        }
            
        // Se retorna la lista con los tours cargados  
           return listaTours;
        }
    
}
