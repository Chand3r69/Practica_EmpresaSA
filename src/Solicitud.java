import java.util.Date;

public class Solicitud extends Responsable{
    private int nroSolicitud;
    private Date fecha;


    public Solicitud(String nombre, String primerApellido, String segundoApellido, String direccion, String nroCredencial, Double sueldo, int nroSolicitud, Date fecha) {
        super(nombre, primerApellido, segundoApellido, direccion, nroCredencial, sueldo);
        this.setNroSolicitud(nroSolicitud);
        this.setFecha(fecha);
    }


    public int getNroSolicitud() {
        return nroSolicitud;
    }

    public void setNroSolicitud(int nroSolicitud) {
        this.nroSolicitud = nroSolicitud;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    @Override
    public String toString() {
        return "Solicitud{" +
                "nombre='" + nombre + '\'' +
                ", primerApellido='" + primerApellido + '\'' +
                ", segundoApellido='" + segundoApellido + '\'' +
                ", direccion='" + direccion + '\'' +
                ", nroCredencial='" + nroCredencial + '\'' +
                ", sueldo=" + sueldo +
                ", nroSolicitud=" + nroSolicitud +
                ", fecha=" + fecha +
                '}';
    }
}
