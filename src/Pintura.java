public class Pintura {
    private double cobertura;

    public Pintura(double cobertura){
        this.cobertura=cobertura;
    }
    public double calcularPintura(Forma forma){
        double areaForma = forma.Area();
        return areaForma / cobertura;
    }
}
