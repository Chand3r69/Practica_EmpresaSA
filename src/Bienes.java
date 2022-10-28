public class Bienes {
    protected int codigoBien;
    protected String nombreBien;
    protected int cantidadSolicitud;
    protected int unidadMedida;
    protected Double valorUni;
    protected Double valorTotal;

    public Bienes(int codigoBien, String nombreBien, int cantidadSolicitud, int unidadMedida, Double valorUni, Double valorTotal) {
        this.setCodigoBien(codigoBien);
        this.setNombreBien(nombreBien);
        this.setCantidadSolicitud(cantidadSolicitud);
        this.setUnidadMedida(unidadMedida);
        this.setValorUni(valorUni);
        this.setValorTotal(valorTotal);
    }


    public int getCodigoBien() {
        return codigoBien;
    }

    public void setCodigoBien(int codigoBien) {
        this.codigoBien = codigoBien;
    }

    public String getNombreBien() {
        return nombreBien;
    }

    public void setNombreBien(String nombreBien) {
        this.nombreBien = nombreBien;
    }

    public int getCantidadSolicitud() {
        return cantidadSolicitud;
    }

    public void setCantidadSolicitud(int cantidadSolicitud) {
        this.cantidadSolicitud = cantidadSolicitud;
    }

    public int getUnidadMedida() {
        return unidadMedida;
    }

    public void setUnidadMedida(int unidadMedida) {
        this.unidadMedida = unidadMedida;
    }

    public Double getValorUni() {
        return valorUni;
    }

    public void setValorUni(Double valorUni) {
        this.valorUni = valorUni;
    }

    public Double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(Double valorTotal) {
        this.valorTotal = valorTotal;
    }

    @Override
    public String toString() {
        return "Bienes{" +
                "codigoBien=" + codigoBien +
                ", nombreBien='" + nombreBien + '\'' +
                ", cantidadSolicitud=" + cantidadSolicitud +
                ", unidadMedida=" + unidadMedida +
                ", valorUni=" + valorUni +
                ", valorTotal=" + valorTotal +
                '}';
    }
}
