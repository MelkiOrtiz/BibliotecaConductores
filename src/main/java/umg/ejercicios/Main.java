package umg.ejercicios;

import umg.ejercicios.conductores.Conductor;
import umg.ejercicios.conductores.ConductorDeCoche;
import umg.ejercicios.conductores.ConductorDeMoto;
import umg.progra2.Vehiculos.Coche;
import umg.progra2.Vehiculos.Moto;
import umg.progra2.Vehiculos.Vehiculo;

public class Main {
    public static void main(String[] args) {

        // Crear objetos de las clases del proyecto Conductores
        ConductorDeCoche conductorCoche = new ConductorDeCoche("Juan Perez", "C12345", 5);
        ConductorDeMoto conductorMoto = new ConductorDeMoto("Maria Lopez", "M67890", true);

        // Mostrar información de los conductores
        System.out.println("Información del conductor de coche:");
        conductorCoche.mostrarInformacion();
        System.out.println();

        System.out.println("Información del conductor de moto:");
        conductorMoto.mostrarInformacion();

        Vehiculo ToyotaHilux = new Coche("Toyota","Hilux","2025",4);
        ToyotaHilux.mostrarDetalles();

        Vehiculo SuzukiGN = new Moto("Suzuki","GN125","2023",false);
        SuzukiGN.mostrarDetalles();
    }
}
