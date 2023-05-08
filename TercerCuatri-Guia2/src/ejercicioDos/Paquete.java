package ejercicioDos;

public abstract class Paquete {

    private Integer idPaquete;
    private Integer ancho;
    private Integer alto;

    public Paquete(Integer idPaquete, Integer ancho, Integer alto) {
        this.idPaquete = idPaquete;
        this.ancho = ancho;
        this.alto = alto;
    }

    public Integer getIdPaquete() {
        return idPaquete;
    }

    public void setIdPaquete(Integer idPaquete) {
        this.idPaquete = idPaquete;
    }

    public Integer getAncho() {
        return ancho;
    }

    public void setAncho(Integer ancho) {
        this.ancho = ancho;
    }

    public Integer getAlto() {
        return alto;
    }

    public void setAlto(Integer alto) {
        this.alto = alto;
    }
}
