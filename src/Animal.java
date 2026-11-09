public abstract class Animal {

    protected String nombre;
    protected int edad;
    protected String nombreDueño;

    public Animal(String nombre, int edad, String nombreDueño) {
        if(edad < 0 || edad > 200){
            throw new IllegalArgumentException("La edad no puede ser inferior a 0 ni mayor a 200");
        }
        this.nombre = nombre;
        this.edad = edad;
        this.nombreDueño = nombreDueño;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public String getNombreDueño() {
        return nombreDueño;
    }

    public abstract int costoConsulta();

    public void imprimirFicha(){
        System.out.println("El nombre del animal es: " + getNombre() +
                "\nTiene: " + getEdad() + "  de edad \nEl nombre de su dueño es: " + getNombreDueño()+
                "\nEl costo de su consulta es de: " + costoConsulta());
    }
}
