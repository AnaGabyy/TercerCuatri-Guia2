package uno;

import java.util.ArrayList;

public class SistemaBancario {
    private static SistemaBancario instance = null;
    private ArrayList<Cuenta> cuentas;

    /*El constructor es privado para garantizar que solo se pueda crear una instancia
    de la clase a través del método estático "getInstance()"*/
    private SistemaBancario() {
        cuentas = new ArrayList<Cuenta>();
    }

    public static SistemaBancario getInstance() {
        if (instance == null) {
            instance = new SistemaBancario();
        }
        return instance;
    }

    public void agregarCuenta(Cuenta cuenta) {
        cuentas.add(cuenta);
    }

    public void eliminarCuenta(Cuenta cuenta) {
        cuentas.remove(cuenta);
    }

    public ArrayList<Cuenta> getCuentas() {
        return cuentas;
    }

    public Cuenta buscarCuenta(Integer numero) {
        for (Cuenta cuenta : cuentas) {
            if (cuenta.getNumeroCuenta() == numero) {
                return cuenta;
            }
        }
        return null;
    }
}
