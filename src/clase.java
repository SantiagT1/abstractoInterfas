
abstract class Vehiculo {
    protected String marca;

    public Vehiculo(String marca) {
        this.marca = marca;
    }


    public void arrancar() {
        System.out.println(marca + " está arrancando...");
    }


    abstract void tipoVehiculo();
}


interface Operable {
    void mover();
}


public class clase extends Vehiculo implements Operable {

    public clase(String marca) {
        super(marca);
    }


    void tipoVehiculo() {
        System.out.println("Este es un coche.");
    }


    public void mover() {
        System.out.println(marca + " está en movimiento.");
    }
}
