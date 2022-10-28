public class Compras {
    String jefeArea;

    public Compras(String jefeArea) {
        this.jefeArea = jefeArea;
    }

    public String getJefeArea() {
        return jefeArea;
    }

    public void setJefeArea(String jefeArea) {
        this.jefeArea = jefeArea;
    }

    @Override
    public String toString() {
        return "Compras{" +
                "jefeArea='" + jefeArea + '\'' +
                '}';
    }
}
