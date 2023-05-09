package ejercicioDos;

public class PaquetePequenio extends Paquete implements Transportar{

    public PaquetePequenio(Integer idPaquete, Double peso, String destino) {
        super(idPaquete, peso, destino);
    }

    @Override
    public boolean listoParaTransportar() {
        return false;
    }
}
