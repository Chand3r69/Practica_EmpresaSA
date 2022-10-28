import java.util.Date;

public class Bienes {
    protected int nroOrden;
    protected String nit;
    protected Date fechaOrden;
    protected Double nomtoTotal;
    protected Date fechaEntrega;

    public Bienes(int nroOrden, String nit, Date fechaOrden, Double nomtoTotal, Date fechaEntrega) {
        this.nroOrden = nroOrden;
        this.nit = nit;
        this.fechaOrden = fechaOrden;
        this.nomtoTotal = nomtoTotal;
        this.fechaEntrega = fechaEntrega;
    }

    public int getNroOrden() {
        return nroOrden;
    }

    public void setNroOrden(int nroOrden) {
        this.nroOrden = nroOrden;
    }

    public String getNit() {
        return nit;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }

    public Date getFechaOrden() {
        return fechaOrden;
    }

    public void setFechaOrden(Date fechaOrden) {
        this.fechaOrden = fechaOrden;
    }

    public Double getNomtoTotal() {
        return nomtoTotal;
    }

    public void setNomtoTotal(Double nomtoTotal) {
        this.nomtoTotal = nomtoTotal;
    }

    public Date getFechaEntrega() {
        return fechaEntrega;
    }

    public void setFechaEntrega(Date fechaEntrega) {
        this.fechaEntrega = fechaEntrega;
    }

    @Override
    public String toString() {
        return "Bien{" +
                "nroOrden=" + nroOrden +
                ", nit='" + nit + '\'' +
                ", fechaOrden=" + fechaOrden +
                ", nomtoTotal=" + nomtoTotal +
                ", fechaEntrega=" + fechaEntrega +
                '}';
    }
}
