public class Cilindro extends Forma{
    private double radio;
    private double altura;

    public Cilindro(double radio, double altura){
        super();
        this.altura= altura;
        this.radio= radio;
    }

    @Override
    public double Area() {
        return Math.PI *radio*radio*altura;
    }
}
