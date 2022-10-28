import java.util.Date;

public class Item extends Bienes{
    private String cantidadItems;

    public Item(int nroOrden, String nit, Date fechaOrden, Double nomtoTotal, Date fechaEntrega, String cantidadItems) {
        super(nroOrden, nit, fechaOrden, nomtoTotal, fechaEntrega);
        this.cantidadItems = cantidadItems;
    }

    public Item(String cantidadItems) {
        this.cantidadItems = cantidadItems;
    }

    public String getCantidadItems() {
        return cantidadItems;
    }

    public void setCantidadItems(String cantidadItems) {
        this.cantidadItems = cantidadItems;
    }

    @Override
    public String toString() {
        return "Item{" +
                "nroOrden=" + nroOrden +
                ", nit='" + nit + '\'' +
                ", fechaOrden=" + fechaOrden +
                ", nomtoTotal=" + nomtoTotal +
                ", fechaEntrega=" + fechaEntrega +
                ", cantidadItems='" + cantidadItems + '\'' +
                '}';
    }
}
