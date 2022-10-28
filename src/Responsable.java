public class Responsable extends Persona {
    protected String nroCredencial;
    protected Double sueldo;

    public Responsable(String nombre, String primerApellido, String segundoApellido, String direccion, String nroCredencial, Double sueldo) {
        super(nombre, primerApellido, segundoApellido, direccion);
        this.nroCredencial = nroCredencial;
        this.sueldo = sueldo;
    }


    public String getNroCredencial() {
        return nroCredencial;
    }

    public void setNroCredencial(String nroCredencial) {
        this.nroCredencial = nroCredencial;
    }

    public Double getSueldo() {
        return sueldo;
    }

    public void setSueldo(Double sueldo) {
        this.sueldo = sueldo;
    }

    @Override
    public String toString() {
        return "Responsable{" +
                "nombre='" + nombre + '\'' +
                ", primerApellido='" + primerApellido + '\'' +
                ", segundoApellido='" + segundoApellido + '\'' +
                ", direccion='" + direccion + '\'' +
                ", nroCredencial='" + nroCredencial + '\'' +
                ", sueldo=" + sueldo +
                '}';
    }
}
