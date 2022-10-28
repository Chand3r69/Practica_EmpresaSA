
public class Item extends Bienes{
    private String cantidadItems;

    public Item(int codigoBien, String nombreBien, int cantidadSolicitud, int unidadMedida, Double valorUni, Double valorTotal, String cantidadItems) {
        super(codigoBien, nombreBien, cantidadSolicitud, unidadMedida, valorUni, valorTotal);
        this.setCantidadItems(cantidadItems);
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
                "codigoBien=" + codigoBien +
                ", nombreBien='" + nombreBien + '\'' +
                ", cantidadSolicitud=" + cantidadSolicitud +
                ", unidadMedida=" + unidadMedida +
                ", valorUni=" + valorUni +
                ", valorTotal=" + valorTotal +
                ", cantidadItems='" + cantidadItems + '\'' +
                '}';
    }
}
