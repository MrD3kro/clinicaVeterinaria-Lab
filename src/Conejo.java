public class Conejo extends Animal {
    public Conejo(String nombre, int edad, String nombreDueño) {
        super(nombre, edad, nombreDueño);
    }

    @Override
    public int costoConsulta() {
        return 0;
    }
}
