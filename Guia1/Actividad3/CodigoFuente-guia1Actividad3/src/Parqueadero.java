import java.time.Duration;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Parqueadero {
    private List<Vehiculo> vehiculos;
    private static final double TARIFA_AUTOMOVIL = 6000; // Tarifa por hora
    private static final double TARIFA_MOTOCICLETA = 3000; // Tarifa por hora
    private static final double TARIFA_CAMION = 4000; // Tarifa por hora

    public Parqueadero() {
        vehiculos = new ArrayList<>();
    }

    public void registrarEntrada(Vehiculo vehiculo) {
        vehiculos.add(vehiculo);
    }

    public double registrarSalida(String placa) {
        for (Vehiculo vehiculo : vehiculos) {
            if (vehiculo.getPlaca().equals(placa)) {
                LocalDateTime horaSalida = LocalDateTime.now();
                Duration duracion = Duration.between(vehiculo.getHoraEntrada(), horaSalida);
                long horas = (long) Math.ceil(duracion.toHours()); // Redondear hacia arriba

                double tarifa;
                if (vehiculo instanceof Automovil) {
                    tarifa = TARIFA_AUTOMOVIL;
                } else if (vehiculo instanceof Motocicleta) {
                    tarifa = TARIFA_MOTOCICLETA;
                } else if (vehiculo instanceof Camion) {
                    tarifa = TARIFA_CAMION;
                } else {
                    throw new IllegalArgumentException("Tipo de vehículo desconocido");
                }

                vehiculos.remove(vehiculo);
                return horas * tarifa;
            }
        }
        throw new IllegalArgumentException("Vehículo con placa " + placa + " no encontrado");
    }

    public List<Vehiculo> consultarVehiculos() {
        return new ArrayList<>(vehiculos);
    }
}