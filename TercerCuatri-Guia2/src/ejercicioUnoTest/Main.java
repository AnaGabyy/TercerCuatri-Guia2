package ejercicioUnoTest;

import ejercicioUno.*;

public class Main {

    public static void main(String[] args) {

    /*Se requiere implementar un sistema de gestión de cuentas bancarias. Las cuentas bancarias pueden ser de varios
    tipos, como por ejemplo, cuentas de ahorro, cuentas corrientes, cuentas de inversión, entre otras. Para representar
    cada tipo de cuenta, se definen interfaces como Extracción, Depósito, Transferencia, Cobro de cheques, etc. Además,
    se desea que el sistema sea implementado utilizando el patrón singleton para garantizar que solo haya una instancia
    del sistema en ejecución(Clase SistemaBancario). Finalmente, se requiere que las cuentas bancarias sean almacenadas
    en una colección de tipo ArrayList y que se utilice el polimorfismo para manejar las diferentes cuentas.*/

    //Creo el sistema
    SistemaBancario sistemaBancario = SistemaBancario.getInstance();

    //Creo las cuentas
    CuentaAhorro cuentaAhorro = new CuentaAhorro(200.0d, "Sandra", 5543219);
    CuentaCorriente cuentaCorriente = new CuentaCorriente(300.0d, "Yorman", 3340985);
    CuentaInversion cuentaInversion = new CuentaInversion(500.0d, "Camila", 2556901);

    sistemaBancario.agregarCuenta(cuentaAhorro);
    sistemaBancario.agregarCuenta(cuentaCorriente);
    sistemaBancario.agregarCuenta(cuentaInversion);

    cuentaAhorro.extraer(100.0d);
    System.out.println(cuentaAhorro.getSaldo());

    cuentaCorriente.depositar(700.0d);
    System.out.println(cuentaCorriente.getSaldo());

    cuentaInversion.transferir(cuentaInversion, cuentaAhorro, 500.0d);
    System.out.println(cuentaInversion.getSaldo());

    }

}
