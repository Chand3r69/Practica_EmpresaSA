public class Factura extends Orden {
    private int nroFactura;
    private Proveedor proveedor;

    public int getNroFactura() {
        return nroFactura;
    }

    public void setNroFactura(int nroFactura) {
        this.nroFactura = nroFactura;
    }

    public Proveedor getProveedor() {
        return proveedor;
    }

    public void setProveedor(Proveedor proveedor) {
        this.proveedor = proveedor;
    }

    @Override
    public String toString() {
        return "Factura{" +
                "nroFactura=" + nroFactura +
                ", proveedor=" + proveedor +
                ", nroOrden=" + nroOrden +
                ", fechaOrden=" + fechaOrden +
                ", montoTotal=" + montoTotal +
                ", fechaEntrega=" + fechaEntrega +
                ", nit=" + nit +
                ", nombreProv='" + nombreProv + '\'' +
                ", nroTelefono=" + nroTelefono +
                '}';
    }
}
