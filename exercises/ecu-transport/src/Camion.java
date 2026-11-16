public class Camion extends Vehiculo {
    private double capacidadCarga;
    public Camion(String placa, String marca, double precioBase, double capacidadCarga) {
        super(placa, marca, precioBase);
        this.capacidadCarga = capacidadCarga;
    }
    @Override
    public double calcularCosto() {
        return getPrecioBase() + capacidadCarga * 100;
    }
    @Override
    public void mostrarInformacion() {
        System.out.println("Camion: " + getPlaca());
        System.out.println("Marca: " + getMarca());
        System.out.println("Carga: " + capacidadCarga);
        System.out.println("Costo: " + calcularCosto());
    }
}
