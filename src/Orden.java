import java.util.Date;

public class Orden extends Proveedor {
    protected int nroOrden;
    protected Date fechaOrden;
    protected int montoTotal;
    protected Date fechaEntrega;

    public int getNroOrden() {
        return nroOrden;
    }

    public void setNroOrden(int nroOrden) {
        this.nroOrden = nroOrden;
    }

    public Date getFechaOrden() {
        return fechaOrden;
    }

    public void setFechaOrden(Date fechaOrden) {
        this.fechaOrden = fechaOrden;
    }

    public int getMontoTotal() {
        return montoTotal;
    }

    public void setMontoTotal(int montoTotal) {
        this.montoTotal = montoTotal;
    }

    public Date getFechaEntrega() {
        return fechaEntrega;
    }

    public void setFechaEntrega(Date fechaEntrega) {
        this.fechaEntrega = fechaEntrega;
    }

    @Override
    public String toString() {
        return "Orden{" +
                "nroOrden=" + nroOrden +
                ", fechaOrden=" + fechaOrden +
                ", montoTotal=" + montoTotal +
                ", fechaEntrega=" + fechaEntrega +
                ", nit=" + nit +
                ", nombreProv='" + nombreProv + '\'' +
                ", nroTelefono=" + nroTelefono +
                '}';
    }

}
