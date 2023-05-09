package ejercicioDosTest;

import ejercicioDos.*;

public class Main {

    public static void main(String[] args) {
        /*Se desea implementar un sistema de gestión de envíos de paquetes. Los paquetes pueden ser de diferentes
        tipos, como por ejemplo, paquetes pequeños, paquetes medianos, paquetes grandes, entre otros. Para representar
        cada tipo de paquete, se definen interfaces como Package, Transportar, Fragil, RadioActivo, etc. Además, se
        desea que el sistema sea implementado utilizando el patrón singleton para garantizar que solo haya una
        instancia del sistema en ejecución. Finalmente, se requiere que los paquetes sean almacenados en una colección
        de tipo ArrayList y que se use el polimorfismo para manejar los diferentes tipos de paquetes.*/

        SistemaEnvio sistemaEnvio = SistemaEnvio.getInstance();

        PaquetePequenio paquetePequenio = new PaquetePequenio(1, 3.3d, "Argentina");
        PaqueteMediano paqueteMediano = new PaqueteMediano(2, 1.6d, "Brasil");
        PaqueteGrande paqueteGrande = new PaqueteGrande(3, 9.0d, "Venezuela");

        sistemaEnvio.agregarPaquete(paquetePequenio);
        sistemaEnvio.agregarPaquete(paqueteMediano);
        sistemaEnvio.agregarPaquete(paqueteGrande);

        System.out.println(sistemaEnvio.cantidadPaquetes());

        System.out.println(sistemaEnvio.pesoTotal());

        sistemaEnvio.imprimirDetalles();


    }
}
