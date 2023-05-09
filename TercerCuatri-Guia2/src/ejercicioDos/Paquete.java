package ejercicioDos;

public abstract class Paquete {

    private Integer idPaquete;
    private Double peso;
    private String destino;

    public Paquete(Integer idPaquete, Double peso, String destino) {
        this.idPaquete = idPaquete;
        this.peso = peso;
        this.destino = destino;
    }

    public Integer getIdPaquete() {
        return idPaquete;
    }

    public void setIdPaquete(Integer idPaquete) {
        this.idPaquete = idPaquete;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }
}
