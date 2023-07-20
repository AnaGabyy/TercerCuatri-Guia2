package uno;

public interface CuentaBancaria {

    public void extraer(Double monto);
    public void depositar(Double monto);
    public void transferir(Cuenta cuentaOrigen, Cuenta cuentaDestino, Double monto);
}
