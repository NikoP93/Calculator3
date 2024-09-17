public class Lommeregner {

    private double førsteTal;
    private double andetTal;

    public Lommeregner() {
    }

    public Lommeregner(double førsteTal) {
        this.førsteTal = førsteTal;
    }

    public Lommeregner(double førsteTal, double andenTal) {
        this.førsteTal = førsteTal;
        this.andetTal = andenTal;
    }


    public double getFørsteTal() {
        return førsteTal;
    }

    public void setFørsteTal(double førsteTal) {
        this.førsteTal = førsteTal;
    }

    public double getAndetTal() {
        return andetTal;
    }

    public void setAndetTal(double andetTal) {
        this.andetTal = andetTal;
    }
}
