package umg.ejercicios.conductores;

public class ConductorDeCoche extends Conductor {
    private int experienciaAños;

    public ConductorDeCoche(String nombre, String licencia, int experienciaAños) {
        super(nombre, licencia);
        this.experienciaAños = experienciaAños;
    }

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Experiencia (años): " + experienciaAños);
    }
}
