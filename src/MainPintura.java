public class MainPintura {
    public static void main(String[] args) {
        Pintura pintura = new Pintura(250);
        Rectangulo rectangulo = new Rectangulo(20, 30);
        Esfera esfer = new Esfera(45);
        Cilindro cilindro = new Cilindro(10, 30);

        double pinturaRectangulo = pintura.calcularPintura(rectangulo);
        double pinturaEsfera = pintura.calcularPintura(esfer);
        double pinturaCilindro = pintura.calcularPintura(cilindro);

        System.out.println("Cantidad de pintura para el rectángulo" + pinturaRectangulo);
        System.out.println("Cantidad de pintura para la Esfera" + pinturaEsfera);
        System.out.println("Cantidad de pintura para el Cilindro" + pinturaCilindro);

    }
}
