import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Leer las coordenadas de los tres puntos
        System.out.print("Ingresa la coordenada x1: ");
        double x1 = scanner.nextDouble();
        System.out.print("Ingresa la coordenada y1: ");
        double y1 = scanner.nextDouble();
        System.out.print("Ingresa la coordenada x2: ");
        double x2 = scanner.nextDouble();
        System.out.print("Ingresa la coordenada y2: ");
        double y2 = scanner.nextDouble();
        System.out.print("Ingresa la coordenada x3: ");
        double x3 = scanner.nextDouble();
        System.out.print("Ingresa la coordenada y3: ");
        double y3 = scanner.nextDouble();

        // Calcular las longitudes de los lados del triángulo
        double a = distancia(x2, y2, x3, y3);
        double b = distancia(x1, y1, x3, y3);
        double c = distancia(x1, y1, x2, y2);

        // Calcular el perímetro
        double perimetro = a + b + c;

        // Calcular el semiperímetro
        double s = perimetro / 2;

        // Calcular el área usando la fórmula de Herón
        double area = Math.sqrt(s * (s - a) * (s - b) * (s - c));

        // Calcular la altura desde el vértice
        double altura = (2 * area) / a;

        // Calcular los ángulos usando la ley de cosenos
        double anguloA = Math.toDegrees(Math.acos((b * b + c * c - a * a) / (2 * b * c)));
        double anguloB = Math.toDegrees(Math.acos((a * a + c * c - b * b) / (2 * a * c)));
        double anguloC = Math.toDegrees(Math.acos((a * a + b * b - c * c) / (2 * a * b)));

        // Verificar si es un triángulo equilátero
        double diferencia = Math.abs(a - b) + Math.abs(b - c) + Math.abs(c - a);
        boolean equilatero = (diferencia == 0);

        // Calcular los puntos medios de los lados
        double[] puntoMedioAB = puntoMedio(x1, y1, x2, y2);
        double[] puntoMedioBC = puntoMedio(x2, y2, x3, y3);
        double[] puntoMedioCA = puntoMedio(x3, y3, x1, y1);

        // Mostrar los resultados
        System.out.println("Longitud de los lados: a = " + a + ", b = " + b + ", c = " + c);
        System.out.println("Perímetro: " + perimetro);
        System.out.println("Área: " + area);
        System.out.println("Altura desde el vértice A: " + altura);
        System.out.println("Ángulos: A = " + anguloA + "°, B = " + anguloB + "°, C = " + anguloC + "°");
        System.out.println("Equilátero: " + (equilatero ? "Sí" : "No"));
        System.out.println("Puntos medios:");
        System.out.println("Punto medio AB: (" + puntoMedioAB[0] + ", " + puntoMedioAB[1] + ")");
        System.out.println("Punto medio BC: (" + puntoMedioBC[0] + ", " + puntoMedioBC[1] + ")");
        System.out.println("Punto medio CA: (" + puntoMedioCA[0] + ", " + puntoMedioCA[1] + ")");

        scanner.close();
    }

    // Método para calcular la distancia entre dos puntos
    public static double distancia(double x1, double y1, double x2, double y2) {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }

    // Método para calcular el punto medio entre dos puntos
    public static double[] puntoMedio(double x1, double y1, double x2, double y2) {
        double[] puntoMedio = new double[2];
        puntoMedio[0] = (x1 + x2) / 2;
        puntoMedio[1] = (y1 + y2) / 2;
        return puntoMedio;
    }
}
