package dos;

import java.util.ArrayList;

public class SistemaEnvio {

    private static SistemaEnvio instance = null;
    private ArrayList<Paquete> paquetes;

    // Constructor privado para implementar el patrón Singleton
    private SistemaEnvio() {
        paquetes = new ArrayList<Paquete>();
    }

    // Método estático para obtener la instancia única del sistema
    public static SistemaEnvio getInstance() {
        if (instance == null) {
            instance = new SistemaEnvio();
        }
        return instance;
    }

    // Método para agregar un paquete al sistema
    public void agregarPaquete(Paquete paquete) {
        paquetes.add(paquete);
    }

    public void eliminarPaquete(Paquete paquete) {
        paquetes.remove(paquete);
    }

    // Método para obtener la cantidad de paquetes en el sistema
    public int cantidadPaquetes() {
        return paquetes.size();
    }

    //Muestra los paquetes dentro del Array
    public ArrayList<Paquete> getPaquetes() {
        return paquetes;
    }

    // Método para calcular el peso total de todos los paquetes en el sistema
    public double pesoTotal() {
        double pesoTotal = 0.0d;
        for (Paquete paquete : paquetes) {
            pesoTotal = pesoTotal + paquete.getPeso();
        }
        return pesoTotal;
    }

    /* se utiliza el polimorfismo para manejar los diferentes tipos de paquetes y se imprimen los detalles específicos de cada tipo de paquete.*/
    public void imprimirDetalles() {
        for (Paquete paquete : paquetes) {
            System.out.println("Tipo: " + paquete.getClass().getSimpleName());
            System.out.println("Peso: " + paquete.getPeso());
            if (paquete instanceof Transportar) {
                System.out.println("Está listo para ser transportado: " + ((Transportar) paquete).listoParaTransportar());
            }
            if (paquete instanceof Fragil) {
                System.out.println("Es Fragil: " + ((Fragil) paquete).esFragil());
            }
            if (paquete instanceof RadioActivo) {
                System.out.println("Es Radioactivo: " + ((RadioActivo) paquete).esRadioActivo());
            }
            System.out.println("------------------------");
        }
    }
    /*`instanceof` es un operador de Java que se utiliza para verificar si un objeto es una instancia de una
    determinada clase o de una de sus subclases.La sintaxis del operador `instanceof` es la siguiente --> objeto instanceof Clase
    Donde `objeto` es una referencia a un objeto y `Clase` es una clase o una interfaz. Si el objeto es una instancia
    de la clase o interfaz especificada o una subclase de ella, el operador `instanceof` devuelve `true`. En caso
    contrario, devuelve `false`.*/

}
