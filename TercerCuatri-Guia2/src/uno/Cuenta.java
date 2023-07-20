package uno;

public abstract class Cuenta implements CuentaBancaria{

    private Double saldo;
    private String titular;
    private Integer numeroCuenta;

    public Cuenta(Double saldo, String titular, Integer numeroCuenta) {
        this.saldo = saldo;
        this.titular = titular;
        this.numeroCuenta = numeroCuenta;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public Integer getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(Integer numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }


    @Override
    public void extraer(Double monto) {
        if (getSaldo() > monto){
            setSaldo (getSaldo() - monto);
        }else {
            System.out.println("Saldo insuficiente");
        }
    }

    @Override
    public void depositar(Double monto) {
        setSaldo(getSaldo() + monto);
    }

    @Override
    public void transferir(Cuenta cuentaOrigen, Cuenta cuentaDestino, Double monto) {

        if (cuentaOrigen.getSaldo() >= monto) {
            cuentaOrigen.extraer(monto);
            cuentaDestino.depositar(monto);
        } else {
            System.out.println("No tiene suficiente saldo para realizar la transferencia.");
        }
    }
}
