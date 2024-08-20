import java.time.LocalDateTime;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Parqueadero parqueadero = new Parqueadero();

        while (true) {
            System.out.println("1. Registrar Entrada Vehiculo");
            System.out.println("2. Registrar Salida Vehiculo");
            System.out.println("3. Consultar Vehiculos");
            System.out.println("4. Salir");
            System.out.print("Selecciona una opción: ");
            int opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    System.out.print("Tipo de vehículo (Automovil/Motocicleta/Camion): ");
                    String tipo = scanner.nextLine();
                    System.out.print("Placa: ");
                    String placa = scanner.nextLine();
                    System.out.print("Marca: ");
                    String marca = scanner.nextLine();
                    System.out.print("Modelo: ");
                    String modelo = scanner.nextLine();
                    LocalDateTime horaEntrada = LocalDateTime.now();

                    switch (tipo.toLowerCase()) {
                        case "automovil":
                            System.out.print("Tipo de combustible: ");
                            String tipoCombustible = scanner.nextLine();
                            parqueadero.registrarEntrada(new Automovil(placa, marca, modelo, horaEntrada, tipoCombustible));
                            break;
                        case "motocicleta":
                            System.out.print("Cilindraje: ");
                            int cilindraje = scanner.nextInt();
                            scanner.nextLine(); // Limpiar buffer
                            parqueadero.registrarEntrada(new Motocicleta(placa, marca, modelo, horaEntrada, cilindraje));
                            break;
                        case "camion":
                            System.out.print("Capacidad de carga (toneladas): ");
                            double capacidadCarga = scanner.nextDouble();
                            scanner.nextLine();
                            parqueadero.registrarEntrada(new Camion(placa, marca, modelo, horaEntrada, capacidadCarga));
                            break;
                        default:
                            System.out.println("Tipo de vehículo no válido.");
                    }
                    break;

                case 2:
                    System.out.print("Ingrese la placa del vehículo: ");
                    placa = scanner.nextLine();
                    try {
                        double costo = parqueadero.registrarSalida(placa);
                        System.out.println("Costo de parqueo: $" + costo);
                    } catch (IllegalArgumentException e) {
                        System.out.println(e.getMessage());
                    }
                    break;

                case 3:
                    System.out.println("Vehículos en el parqueadero:");
                    for (Vehiculo vehiculo : parqueadero.consultarVehiculos()) {
                        System.out.println("Placa: " + vehiculo.getPlaca() + ", Marca: " + vehiculo.getMarca() + ", Modelo: " + vehiculo.getModelo());
                    }
                    break;

                case 4:
                    System.out.println("Saliendo...");
                    scanner.close();
                    return;

                default:
                    System.out.println("Opción no válida.");
            }
        }
    }
}
