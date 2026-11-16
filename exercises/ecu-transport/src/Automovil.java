public class Automovil extends Vehiculo {
    private int numeroPuertas;
    public Automovil(String placa, String marca, double precioBase, int numeroPuertas) {
        super(placa, marca, precioBase);
        this.numeroPuertas = numeroPuertas;
    }
    @Override
    public double calcularCosto() {
        return getPrecioBase() + numeroPuertas * 50;
    }
    @Override
    public void mostrarInformacion() {
        System.out.println("Automovil: " + getPlaca());
        System.out.println("Marca: " + getMarca());
        System.out.println("Puertas: " + numeroPuertas);
        System.out.println("Costo: " + calcularCosto());
    }
}
