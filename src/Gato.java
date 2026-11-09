public class Gato extends Animal implements Vacunable,Asegurable{

    private  boolean esEsterilizado;
    private int nVacunas;

    public Gato(String nombre, int edad, String nombreDueño, boolean esEsterilizado) {
        super(nombre, edad, nombreDueño);
        this.esEsterilizado = esEsterilizado;
    }


    public boolean isEsEsterilizado() {
        return esEsterilizado;
    }

    @Override
    public int costoConsulta() {
        return 38000;
    }

    @Override
    public void registrarVacuna(String nombre) {
        System.out.println("El gato " + getNombre() + " Recibio la vacuna " + nombre);
        nVacunas ++;

    }

    @Override
    public int getVacunasAplicadas() {
        return nVacunas;
    }

    @Override
    public double calcularPrimaSeguro() {
        return isEsEsterilizado() ? 120000 : 200000;
    }

    @Override
    public String obtenerNumeroPoliza() {
        return "POL-GATO-" + getNombre();
    }


}
