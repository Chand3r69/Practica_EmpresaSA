public class Empleado extends Persona {
    private Double sueldo;
    String categoriaEmpl;

    public Empleado(String nombre, String primerApellido, String segundoApellido, String direccion, Double sueldo, String categoriaEmpl) {
        super(nombre, primerApellido, segundoApellido, direccion);
        this.sueldo = sueldo;
        this.categoriaEmpl = categoriaEmpl;
    }


    public Double getSueldo() {
        return sueldo;
    }

    public void setSueldo(Double sueldo) {
        this.sueldo = sueldo;
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "sueldo=" + sueldo +
                ", categoriaEmpl='" + categoriaEmpl + '\'' +
                ", nombre='" + nombre + '\'' +
                ", primerApellido='" + primerApellido + '\'' +
                ", segundoApellido='" + segundoApellido + '\'' +
                ", direccion='" + direccion + '\'' +
                '}';
    }
}
