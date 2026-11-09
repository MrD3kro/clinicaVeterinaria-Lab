public class Ave extends Animal{
    private double pesoGramos;

    public Ave(String nombre, int edad, String nombreDueño, double pesoGramos) {

        super(nombre, edad, nombreDueño);
        if (pesoGramos < 0 ){
            throw new IllegalArgumentException("El peso no puede ser negativo");
        }
        this.pesoGramos = pesoGramos;
    }

    public double getPesoGramos() {
        return pesoGramos;
    }

    @Override
    public int costoConsulta() {
        return (int) (28000 + (100*getPesoGramos()));
    }
}
