public class Motocicleta extends Vehiculo {
    private int cilindrada;
    public Motocicleta(String placa, String marca, double precioBase, int cilindrada) {
        super(placa, marca, precioBase);
        this.cilindrada = cilindrada;
    }
    @Override
    public double calcularCosto() {
        return getPrecioBase() + cilindrada * 0.5;
    }
    @Override
    public void mostrarInformacion() {
        System.out.println("Motocicleta: " + getPlaca());
        System.out.println("Marca: " + getMarca());
        System.out.println("Cilindrada: " + cilindrada);
        System.out.println("Costo: " + calcularCosto());
    }
}
