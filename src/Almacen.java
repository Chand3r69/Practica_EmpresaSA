import java.util.Date;

public class Almacen {
    protected int nroSalida;
    protected Empleado empleado;
    protected Date fechaSalida;
    protected Date fechaEntrada;

    public Almacen(int nroSalida, Empleado empleado, Date fechaSalida, Date fechaEntrada) {
        this.nroSalida = nroSalida;
        this.empleado = empleado;
        this.fechaSalida = fechaSalida;
        this.fechaEntrada = fechaEntrada;
    }

    public int getNroSalida() {
        return nroSalida;
    }

    public void setNroSalida(int nroSalida) {
        this.nroSalida = nroSalida;
    }

    public Empleado getEmpleado() {
        return empleado;
    }

    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }

    public Date getFechaSalida() {
        return fechaSalida;
    }

    public void setFechaSalida(Date fechaSalida) {
        this.fechaSalida = fechaSalida;
    }

    public Date getFechaEntrada() {
        return fechaEntrada;
    }

    public void setFechaEntrada(Date fechaEntrada) {
        this.fechaEntrada = fechaEntrada;
    }

    @Override
    public String toString() {
        return "Almacen{" +
                "nroSalida=" + nroSalida +
                ", empleado=" + empleado +
                ", fechaSalida=" + fechaSalida +
                ", fechaEntrada=" + fechaEntrada +
                '}';
    }
}
