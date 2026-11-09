public class Main {

        public static void main(String[] args) {

            // 1 · Fichas con referencia polimórfica
            Perro perro = new Perro("Rocky", 4, "Carlos", "Labrador");
            Gato gato = new Gato("Luna", 3, "Marta", true);
            Ave ave = new Ave("Pablo", 2, "Angel", 500);

            Animal[] animales = {perro, gato, ave, new Conejo("Nieve", 1, "Sofía")};

            System.out.println("=== 1. FICHAS ===");
            for (Animal a : animales) {
                a.imprimirFicha();
                System.out.println("-----");
            }

            // 2 · Vacunar los que aplican (tipos concretos)
            System.out.println("=== 2. VACUNAS ===");
            perro.registrarVacuna("Rabia");
            perro.registrarVacuna("Parvovirus");
            gato.registrarVacuna("Triple felina");

            System.out.println(perro.getNombre() + " lleva " + perro.getVacunasAplicadas() + " vacunas");
            System.out.println(gato.getNombre() + " lleva " + gato.getVacunasAplicadas() + " vacunas");

            // Pruébalo: descomenta la línea y lee el error del compilador
            // ave.registrarVacuna("Newcastle");

            // 3 · Calcular las pólizas
            System.out.println("=== 3. PÓLIZAS ===");
            Clinica clinica = new Clinica("VetCare", "Calle 100 # 15-20");

            Asegurable[] asegurables = {perro, gato, clinica};
            for (Asegurable s : asegurables) {
                System.out.println("Póliza: " + s.obtenerNumeroPoliza()
                        + " | Prima anual: " + s.calcularPrimaSeguro());
            }

            // 4 · Verificación final: Conejo
            // Lo único que cambia fuera de Conejo: la línea del arreglo del bloque 1,
            // que pasaría a ser: Animal[] animales = {perro, gato, ave, new Conejo("Nieve", 1, "Sofía")};
        }
    }