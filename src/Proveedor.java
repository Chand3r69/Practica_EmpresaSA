public class Proveedor {
    protected int nit;
    protected String nombreProv;
    protected int nroTelefono;

    public int getNit() {
        return nit;
    }

    public void setNit(int nit) {
        this.nit = nit;
    }

    public String getNombreProv() {
        return nombreProv;
    }

    public void setNombreProv(String nombreProv) {
        this.nombreProv = nombreProv;
    }

    public int getNroTelefono() {
        return nroTelefono;
    }

    public void setNroTelefono(int nroTelefono) {
        this.nroTelefono = nroTelefono;
    }

    @Override
    public String toString() {
        return "Proveedor{" +
                "nit=" + nit +
                ", nombreProv='" + nombreProv + '\'' +
                ", nroTelefono=" + nroTelefono +
                '}';
    }
}
