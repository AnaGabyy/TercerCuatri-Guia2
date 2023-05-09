package ejercicioDos;

public class PaqueteMediano extends Paquete implements  Fragil{

    public PaqueteMediano(Integer idPaquete, Double peso, String destino) {
        super(idPaquete, peso, destino);
    }

    @Override
    public boolean esFragil() {
        return true;
    }
}
