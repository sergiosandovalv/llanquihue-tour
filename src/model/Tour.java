
package model;

/**
 * Permite almacenar la información de un tour turístico,
 * 
 * 
 * @author debian12
 */

public class Tour {

private String nombre;
private String tipo;
private int precio;


/**
 * Permite crear un objeto Tour con nombre, tipo y precio.
 * 
 * @param nombre Nombre del tour.
 * @param tipo Tipo de tour.
 * @param precio Precio del tour.
 */
    public Tour(String nombre, String tipo, int precio) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    
   /**
    * Muestra la información del tour en formato texto.
    * @return Datos del tour formateados para mostrar por consola.
    */ 
    
@Override

public String toString() {
    return "===== DATOS DEL TOUR =====\n"
            + "Nombre : " + nombre + "\n"
            + "Tipo   : " + tipo + "\n"
            + "Precio : $" + precio;
           
    
}


    
}
