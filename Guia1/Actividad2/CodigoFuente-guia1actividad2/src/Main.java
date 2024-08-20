import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("1. Registrar el numero del rpoblema que quiere consultar del 1 al 14");
            System.out.println("Presione 15 para salir");
            int opcionSeleccionada = scanner.nextInt();
            scanner.nextLine();

            switch (opcionSeleccionada) {
                case 1:
                    System.out.print("Problema 1");
                    System.out.print("Valor x");
                    int x = scanner.nextInt();
                    System.out.print("Valor y");
                    int y = scanner.nextInt();
                    // Calcular el valor de la función
                    int resultado = Funciones.problemaUnoFuncionAlgebraica(x, y);

                    // Imprimir el resultado
                    System.out.println("El valor de la función f(" + x + ", " + y + ") es: " + resultado);
                    break;
                case 2:
                    System.out.print("Problema 2");
                    System.out.print("Valor sillasPorBus");
                    int sillasPorBus = scanner.nextInt();
                    System.out.print("Valor estudiantesGordos");
                    int estudiantesGordos = scanner.nextInt();
                    System.out.print("Valor estudiantesFlacos");
                    int estudiantesFlacos = scanner.nextInt();

                    // Calcular el número de buses necesarios
                    int numeroDeBuses = Funciones.calcularNumeroDeBuses(sillasPorBus, estudiantesGordos, estudiantesFlacos);

                    // Imprimir el resultado
                    System.out.println("Número de buses necesarios: " + numeroDeBuses);
                    break;
                case 3:
                    System.out.print("Problema 3");
                    // Leer la altura alcanzada por la escalera
                    System.out.print("Introduce la altura alcanzada por la escalera (x) en metros: ");
                    double altura = scanner.nextDouble();

                    // Leer el ángulo en grados
                    System.out.print("Introduce el ángulo α en grados: ");
                    double anguloGrados = scanner.nextDouble();

                    // Calcular la longitud de la escalera
                    double longitudEscalera = Funciones.calcularLongitudEscalera(altura, anguloGrados);

                    // Imprimir el resultado
                    System.out.println("La longitud de la escalera es: " + longitudEscalera + " metros");
                    break;

                case 4:
                    System.out.print("Problema 4");
                    // Leer el sueldo de Pedro
                    System.out.print("Introduce el sueldo mensual de Pedro: ");
                    double sueldo = scanner.nextDouble();

                    // Calcular el gasto en arriendo
                    double gastoArriendo = Funciones.calcularGastoArriendo(sueldo);

                    // Calcular el gasto en comida
                    double gastoComida = Funciones.calcularGastoComida(sueldo);

                    // Calcular el dinero restante
                    double dineroRestante = Funciones.calcularDineroRestante(sueldo, gastoArriendo, gastoComida);

                    // Mostrar los resultados
                    System.out.println("Gasto en arriendo: " + gastoArriendo + " unidades monetarias");
                    System.out.println("Gasto en comida: " + gastoComida + " unidades monetarias");
                    System.out.println("Dinero restante: " + dineroRestante + " unidades monetarias");
                    break;
                case 5:
                    System.out.print("Problema 5");
                    System.out.print("Introduce el radio del círculo pequeño (r): ");
                    double radioPequeño = scanner.nextDouble();

                    // Leer el radio del círculo grande (R)
                    System.out.print("Introduce el radio del círculo grande (R): ");
                    double radioGrande = scanner.nextDouble();

                    // Calcular el área de la corona circular
                    double areaCoronaCircular = Funciones.calcularAreaCoronaCircular(radioGrande, radioPequeño);

                    // Mostrar el resultado
                    System.out.println("El área de la corona circular es: " + areaCoronaCircular + " unidades cuadradas");
                    break;
                case 6:
                    System.out.print("Problema 6");
                    // Leer los tres lados del triángulo (A, B, C)
                    System.out.print("Introduce el lado A: ");
                    double ladoA = scanner.nextDouble();

                    System.out.print("Introduce el lado B: ");
                    double ladoB = scanner.nextDouble();

                    System.out.print("Introduce el lado C: ");
                    double ladoC = scanner.nextDouble();

                    // Determinar cuál de los lados es la hipotenusa
                    double hipotenusa = 0;
                    double cateto1 = 0;
                    double cateto2 = 0;

                    if (ladoA > ladoB && ladoA > ladoC) {
                        hipotenusa = ladoA;
                        cateto1 = ladoB;
                        cateto2 = ladoC;
                    } else if (ladoB > ladoA && ladoB > ladoC) {
                        hipotenusa = ladoB;
                        cateto1 = ladoA;
                        cateto2 = ladoC;
                    } else {
                        hipotenusa = ladoC;
                        cateto1 = ladoA;
                        cateto2 = ladoB;
                    }

                    // Calcular el área del triángulo rectángulo usando la fórmula del área
                    double areaTriangulo = Funciones.calcularAreaTriangulo(cateto1, cateto2);

                    // Calcular el perímetro del triángulo
                    double perimetro = Funciones.calcularPerimetro(ladoA, ladoB, ladoC);

                    // Mostrar los resultados
                    System.out.println("Área del triángulo: " + areaTriangulo + " unidades cuadradas");
                    System.out.println("Perímetro del triángulo: " + perimetro + " unidades");
                case 7:
                    System.out.print("Problema 7");
                    // Leer las coordenadas de los dos puntos
                    System.out.print("Introduce la coordenada x1 del primer punto: ");
                    double x1 = scanner.nextDouble();

                    System.out.print("Introduce la coordenada y1 del primer punto: ");
                    double y1 = scanner.nextDouble();

                    System.out.print("Introduce la coordenada x2 del segundo punto: ");
                    double x2 = scanner.nextDouble();

                    System.out.print("Introduce la coordenada y2 del segundo punto: ");
                    double y2 = scanner.nextDouble();

                    // Calcular y mostrar la distancia entre los puntos
                    double distancia = Funciones.calcularDistancia(x1, y1, x2, y2);
                    System.out.println("Distancia entre los puntos: " + distancia);

                    // Calcular y mostrar la pendiente
                    try {
                        double pendiente = Funciones.calcularPendiente(x1, y1, x2, y2);
                        System.out.println("Pendiente de la línea: " + pendiente);
                    } catch (ArithmeticException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 8:
                    System.out.print("Problema 8");
                    // Leer el número de estudiantes
                    System.out.print("Introduce el número de estudiantes: ");
                    int numeroEstudiantes = scanner.nextInt();

                    // Leer la capacidad de un salón
                    System.out.print("Introduce la capacidad de un salón: ");
                    int capacidadSalon = scanner.nextInt();

                    // Leer el número de salones por piso
                    System.out.print("Introduce el número de salones por piso: ");
                    int salonesPorPiso = scanner.nextInt();

                    // Calcular el número de salones necesarios
                    int numeroSalones = Funciones.calcularNumeroSalones(numeroEstudiantes, capacidadSalon);

                    // Calcular el número de pisos necesarios
                    int numeroPisos = Funciones.calcularNumeroPisos(numeroSalones, salonesPorPiso);

                    // Imprimir los resultados
                    System.out.println("Número de salones necesarios: " + numeroSalones);
                    System.out.println("Número de pisos necesarios: " + numeroPisos);
                    break;
                case 9:
                    System.out.print("Problema 9");
                    // Leer los dos números enteros
                    System.out.print("Introduce el primer número entero: ");
                    int numero1 = scanner.nextInt();

                    System.out.print("Introduce el segundo número entero: ");
                    int numero2 = scanner.nextInt();

                    // Encontrar el mayor de los dos números usando la función
                    int mayor = Funciones.encontrarMayor(numero1, numero2);

                    // Imprimir el resultado
                    System.out.println("El mayor de los dos números es: " + mayor);

                    break;
                case 10:
                    System.out.print("Problema 10");
                    // Leer los dos números enteros
                    System.out.print("Introduce el primer número entero: ");
                    int num1 = scanner.nextInt();

                    System.out.print("Introduce el segundo número entero: ");
                    int num2 = scanner.nextInt();

                    // Leer el operador aritmético
                    System.out.print("Introduce el operador aritmético (+, -, *, /, %, **): ");
                    String operador = scanner.next();

                    // Aplicar la operación y mostrar el resultado
                    try {
                        double resultadoOperacion = Funciones.aplicarOperacion(num1, num2, operador);
                        System.out.println("El resultado de " + num1 + " " + operador + " " + num2 + " es: " + resultadoOperacion);
                    } catch (ArithmeticException | IllegalArgumentException e) {
                        System.out.println(e.getMessage());
                    }

                    break;
                case 11:
                    System.out.print("Problema 11");
                    System.out.print("Introduce un número entero entre 1 y 99: ");
                    int numero = scanner.nextInt();

                    // Verificar si el número es válido (entre 1 y 99)
                    if (numero < 1 || numero > 99) {
                        System.out.println("Error: El número debe estar entre 1 y 99.");
                    } else {
                        // Obtener las cifras de decenas y unidades
                        int decenas = Funciones.obtenerDecenas(numero);
                        int unidades = Funciones.obtenerUnidades(numero);

                        // Convertir las cifras a números romanos
                        String romanoDecenas = Funciones.convertirDecenaARomano(decenas);
                        String romanoUnidades = Funciones.convertirUnidadARomano(unidades);

                        // Imprimir el resultado
                        System.out.println("Número en romano: " + romanoDecenas + romanoUnidades);
                    }
                    break;
                case 12:
                    System.out.print("Problema 12");
                    // Leer el nombre del día
                    System.out.print("Introduce el nombre del día de la semana (por ejemplo, lunes): ");
                    String diaActual = scanner.nextLine();

                    // Obtener el día siguiente usando la función
                    String diaSiguiente = Funciones.obtenerDiaSiguiente(diaActual);

                    // Imprimir el resultado
                    if (diaSiguiente.equals("Día inválido")) {
                        System.out.println("Error: El nombre del día no es válido.");
                    } else {
                        System.out.println("El día siguiente a " + diaActual + " es " + diaSiguiente + ".");
                    }
                    break;
                case 13:
                    System.out.print("Problema 13");
                    // Leer el sueldo actual del empleado
                    System.out.print("Introduce el sueldo actual del empleado: ");
                    double sueldoActual = scanner.nextDouble();

                    // Calcular el aumento usando la función
                    double aumento = Funciones.calcularAumento(sueldoActual);

                    // Calcular el nuevo salario
                    double nuevoSalario = sueldoActual + aumento;

                    // Imprimir el valor del aumento y el nuevo salario
                    System.out.println("Valor del aumento: $" + aumento);
                    System.out.println("Nuevo salario: $" + nuevoSalario);
                    break;
                case 14:
                    System.out.print("Problema 14");
                    // Leer los nombres y edades de los tres hermanos
                    System.out.print("Introduce el nombre del primer hermano: ");
                    String nombre1 = scanner.nextLine();
                    System.out.print("Introduce la edad del primer hermano: ");
                    int edad1 = scanner.nextInt();
                    scanner.nextLine(); // Limpiar el buffer de entrada

                    System.out.print("Introduce el nombre del segundo hermano: ");
                    String nombre2 = scanner.nextLine();
                    System.out.print("Introduce la edad del segundo hermano: ");
                    int edad2 = scanner.nextInt();
                    scanner.nextLine(); // Limpiar el buffer de entrada

                    System.out.print("Introduce el nombre del tercer hermano: ");
                    String nombre3 = scanner.nextLine();
                    System.out.print("Introduce la edad del tercer hermano: ");
                    int edad3 = scanner.nextInt();

                    // Obtener el nombre del hermano mayor usando la función
                    String hermanoMayor = Funciones.obtenerHermanoMayor(nombre1, edad1, nombre2, edad2, nombre3, edad3);

                    // Imprimir el nombre del hermano mayor
                    System.out.println("El hermano mayor es: " + hermanoMayor);
                    break;
                case 15:
                    System.out.println("Salir");
                    scanner.close();
                    return;
                default:
                    System.out.println("Opción no válida.");
            }

        }
    }
}