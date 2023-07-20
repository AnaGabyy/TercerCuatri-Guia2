package dos;

public class PaqueteGrande extends Paquete implements RadioActivo{

    public PaqueteGrande(Integer idPaquete, Double peso, String destino) {
        super(idPaquete, peso, destino);
    }

    @Override
    public boolean esRadioActivo() {
        return false;
    }
}
