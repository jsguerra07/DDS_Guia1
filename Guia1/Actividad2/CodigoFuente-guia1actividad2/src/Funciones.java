import java.util.HashMap;
import java.util.Map;

public class Funciones {
    // Problema 1: Método estático para calcular el valor de f(x, y) = x^2 + 2xy + y^2
    public static int problemaUnoFuncionAlgebraica(int x, int y) {
        return x * x + 2 * x * y + y * y;
    }

    // Problema 2: Método estático para calcular el número de buses necesarios
    public static int calcularNumeroDeBuses(int sillasPorBus, int estudiantesGordos, int estudiantesFlacos) {
        // Cada estudiante gordo ocupa 2 sillas y cada estudiante flaco ocupa 1 silla
        int sillasNecesarias = (estudiantesGordos * 2) + estudiantesFlacos;

        // Calcular el número de buses necesarios, redondeando hacia arriba
        // (usar (sillasNecesarias + sillasPorBus - 1) / sillasPorBus es una técnica para redondear hacia arriba)
        return (sillasNecesarias + sillasPorBus - 1) / sillasPorBus;
    }

    // Problema 3: Método estático para calcular la longitud de la escalera
    public static double calcularLongitudEscalera(double altura, double anguloGrados) {


        // Convertir el ángulo de grados a radianes
        double anguloRadianes = Math.toRadians(anguloGrados);

        // Calcular la longitud de la escalera usando la fórmula y = x / sin(α)
        double longitudEscalera = altura / Math.sin(anguloRadianes);

        return longitudEscalera;
    }

    // Problema 4: Método para calcular el gasto en arriendo
    public static double calcularGastoArriendo(double sueldo) {
        return sueldo * 0.40; // 40% del sueldo
    }

    // Método para calcular el gasto en comida
    public static double calcularGastoComida(double sueldo) {
        return sueldo * 0.15; // 15% del sueldo
    }

    // Método para calcular el dinero restante
    public static double calcularDineroRestante(double sueldo, double gastoArriendo, double gastoComida) {
        return sueldo - (gastoArriendo + gastoComida);
    }

    // Problema 5: Método para calcular el área de una corona círcular
    public static double calcularAreaCirculo(double radio) {
        return Math.PI * Math.pow(radio, 2);
    }

    // Método para calcular el área de la corona circular
    public static double calcularAreaCoronaCircular(double radioGrande, double radioPequeño) {
        // Área del círculo grande
        double areaGrande = calcularAreaCirculo(radioGrande);
        // Área del círculo pequeño
        double areaPequeño = calcularAreaCirculo(radioPequeño);
        // Área de la corona circular
        return areaGrande - areaPequeño;
    }

    // Problema 6: Método para calcular el área de un terreno formado por un tringulo rectangulo mas un rectangulo
    public static double calcularAreaRectangulo(double base, double altura) {
        return base * altura;
    }

    // Método para calcular la hipotenusa de un triángulo rectángulo
    public static double calcularHipotenusa(double cateto1, double cateto2) {
        return Math.sqrt(Math.pow(cateto1, 2) + Math.pow(cateto2, 2));
    }

    // Método para calcular el área de un triángulo
    public static double calcularAreaTriangulo(double base, double altura) {
        return 0.5 * base * altura;
    }

    // Método para calcular el perímetro de un triángulo (suma de los lados)
    public static double calcularPerimetro(double lado1, double lado2, double lado3) {
        return lado1 + lado2 + lado3;
    }

    //Problema 7
    // Método para calcular la distancia entre dos puntos
    public static double calcularDistancia(double x1, double y1, double x2, double y2) {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }


    // Método para calcular la pendiente de la línea que pasa por dos puntos
    public static double calcularPendiente(double x1, double y1, double x2, double y2) {
        if (x1 == x2) {
            throw new ArithmeticException("La pendiente no está definida para una línea vertical.");
        }
        return (y2 - y1) / (x2 - x1);
    }

    //Problema 8
    // Función para calcular el número de salones necesarios
    public static int calcularNumeroSalones(int numeroEstudiantes, int capacidadSalon) {
        // Usar Math.ceil para redondear hacia arriba, ya que necesitamos al menos un salón completo para cada grupo de estudiantes.
        return (int) Math.ceil((double) numeroEstudiantes / capacidadSalon);
    }

    // Función para calcular el número de pisos
    public static int calcularNumeroPisos(int numeroSalones, int salonesPorPiso) {
        // Usar Math.ceil para redondear hacia arriba, ya que necesitamos al menos un piso completo para cada grupo de salones.
        return (int) Math.ceil((double) numeroSalones / salonesPorPiso);
    }

    //Problema 9
    // Función para encontrar el mayor de dos números enteros
    public static int encontrarMayor(int numero1, int numero2) {
        // Usar la instrucción condicional IF para determinar el mayor número
        if (numero1 > numero2) {
            return numero1;
        } else {
            return numero2;
        }
    }

    //Problema 10
    // Función que realiza la operación aritmética según el operador
    public static double aplicarOperacion(int num1, int num2, String operador) {
        double resultado = 0.0;
        switch (operador) {
            case "+":
                resultado = num1 + num2;
                break;
            case "-":
                resultado = num1 - num2;
                break;
            case "*":
                resultado = num1 * num2;
                break;
            case "/":
                if (num2 != 0) {
                    resultado = (double) num1 / num2;
                } else {
                    throw new ArithmeticException("Error: División por cero.");
                }
                break;
            case "%":
                if (num2 != 0) {
                    resultado = num1 % num2;
                } else {
                    throw new ArithmeticException("Error: División por cero.");
                }
                break;
            case "**":
                resultado = Math.pow(num1, num2);
                break;
            default:
                throw new IllegalArgumentException("Operador no válido. Usa +, -, *, /, %, **.");
        }
        return resultado;
    }


    //Problema 11
    // Función para obtener la cifra de las decenas de un número de dos cifras
    public static int obtenerDecenas(int numero) {
        return numero / 10;
    }

    // Función para obtener la cifra de las unidades de un número de dos cifras
    public static int obtenerUnidades(int numero) {
        return numero % 10;
    }

    // Función para convertir un dígito de 0 a 9 a su equivalente romano
    public static String convertirUnidadARomano(int unidad) {
        switch (unidad) {
            case 1: return "I";
            case 2: return "II";
            case 3: return "III";
            case 4: return "IV";
            case 5: return "V";
            case 6: return "VI";
            case 7: return "VII";
            case 8: return "VIII";
            case 9: return "IX";
            default: return "";
        }
    }

    // Función para convertir un dígito de 0 a 9 a su equivalente romano en decenas
    public static String convertirDecenaARomano(int decena) {
        switch (decena) {
            case 1: return "X";
            case 2: return "XX";
            case 3: return "XXX";
            case 4: return "XL";
            case 5: return "L";
            case 6: return "LX";
            case 7: return "LXX";
            case 8: return "LXXX";
            case 9: return "XC";
            default: return "";
        }
    }

    //Problema 12
    // Función para obtener el nombre del día siguiente
    public static String obtenerDiaSiguiente(String diaActual) {
        // Mapa que asocia cada día con el día siguiente
        Map<String, String> dias = new HashMap<>();
        dias.put("lunes", "martes");
        dias.put("martes", "miércoles");
        dias.put("miércoles", "jueves");
        dias.put("jueves", "viernes");
        dias.put("viernes", "sábado");
        dias.put("sábado", "domingo");
        dias.put("domingo", "lunes");

        // Retornar el día siguiente usando el mapa
        return dias.getOrDefault(diaActual.toLowerCase(), "Día inválido");
    }

    //Problema 13
    // Función para calcular el valor del aumento
    public static double calcularAumento(double sueldoActual) {
        double aumento;
        if (sueldoActual <= 800000) {
            aumento = sueldoActual * 0.10; // 10% de aumento
        } else if (sueldoActual <= 1200000) {
            aumento = sueldoActual * 0.08; // 8% de aumento
        } else {
            aumento = sueldoActual * 0.05; // 5% de aumento
        }
        return aumento;
    }

    //Problema14
    // Función para obtener el nombre del hermano mayor
    public static String obtenerHermanoMayor(String nombre1, int edad1, String nombre2, int edad2, String nombre3, int edad3) {
        // Asumimos que el primer hermano es el mayor inicialmente
        String hermanoMayor = nombre1;
        int edadMayor = edad1;

        // Comparar con el segundo hermano
        if (edad2 > edadMayor) {
            hermanoMayor = nombre2;
            edadMayor = edad2;
        }

        // Comparar con el tercer hermano
        if (edad3 > edadMayor) {
            hermanoMayor = nombre3;
            edadMayor = edad3;
        }

        return hermanoMayor;
    }


}
