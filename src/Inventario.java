import java.util.Date;

public class Inventario {
    private int codAlmacen;
    private String responsableInv;
    private Date fechaEntrega;
    private String direccion;

    public int getCodAlmacen() {
        return codAlmacen;
    }

    public void setCodAlmacen(int codAlmacen) {
        this.codAlmacen = codAlmacen;
    }

    public String getResponsableInv() {
        return responsableInv;
    }

    public void setResponsableInv(String responsableInv) {
        this.responsableInv = responsableInv;
    }

    public Date getFechaEntrega() {
        return fechaEntrega;
    }

    public void setFechaEntrega(Date fechaEntrega) {
        this.fechaEntrega = fechaEntrega;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        return "Inventario{" +
                "codAlmacen=" + codAlmacen +
                ", responsableInv='" + responsableInv + '\'' +
                ", fechaEntrega=" + fechaEntrega +
                ", direccion='" + direccion + '\'' +
                '}';
    }
}
