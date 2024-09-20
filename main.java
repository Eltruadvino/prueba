import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario las coordenadas del primer punto
        System.out.print("Ingresa la coordenada x del primer punto: ");
        double x1 = scanner.nextDouble();
        System.out.print("Ingresa la coordenada y del primer punto: ");
        double y1 = scanner.nextDouble();

        // Solicitar al usuario las coordenadas del segundo punto
        System.out.print("Ingresa la coordenada x del segundo punto: ");
        double x2 = scanner.nextDouble();
        System.out.print("Ingresa la coordenada y del segundo punto: ");
        double y2 = scanner.nextDouble();

        // Calcular la distancia entre los dos puntos usando la fórmula de la distancia euclidiana
        double distancia = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));

        // Calcular el ángulo en radianes usando Math.atan2
        double anguloRadianes = Math.atan2(y2 - y1, x2 - x1);

        // Convertir el ángulo de radianes a grados usando Math.toDegrees
        double anguloGrados = Math.toDegrees(anguloRadianes);

        // Mostrar los resultados
        System.out.println("La distancia entre los puntos es: " + distancia);
        System.out.println("El ángulo entre la línea y el eje x (en radianes) es: " + anguloRadianes);
        System.out.println("El ángulo entre la línea y el eje x (en grados) es: " + anguloGrados);

        // Cerrar el escáner
        scanner.close();
    }
}
