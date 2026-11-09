public class Perro extends Animal implements Vacunable,Asegurable{

    private String raza;
    private int nVacunas;

    public Perro(String nombre, int edad, String nombreDueño, String raza) {
        super(nombre, edad, nombreDueño);
        this.raza = raza;
    }

    @Override
    public int costoConsulta() {
        return 45000 + (3000*getEdad());
    }

    @Override
    public void registrarVacuna(String nombre) {
        System.out.println("El perro " + getNombre() + " Recibio la vacuna " + nombre);
        nVacunas ++;

    }

    @Override
    public int getVacunasAplicadas() {
        return nVacunas;
    }

    @Override
    public double calcularPrimaSeguro() {
        return 80000 * getEdad();
    }

    @Override
    public String obtenerNumeroPoliza() {
        return "POL-PERRO-" + getNombre();
    }
}
