import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        // Paso 1: Genera una lista de 10 números aleatorios entre 1 y 100
        List<Integer> numeros = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < 10; i++) {
            numeros.add(random.nextInt(100) + 1);
        }

        // Paso 2: Calcula la raíz cuadrada de cada número
        List<Double> raicesCuadradas = new ArrayList<>();
        for (int num : numeros) {
            raicesCuadradas.add(Math.sqrt(num));
        }

        // Paso 3: Eleva cada número al cuadrado
        List<Double> cuadrados = new ArrayList<>();
        for (int num : numeros) {
            cuadrados.add(Math.pow(num, 2));
        }

        // Paso 4: Calcula la media
        double suma = 0;
        for (int num : numeros) {
            suma += num;
        }
        double media = suma / numeros.size();

        // Paso 5: Calcula la desviación estándar
        double sumatoriaDesviacion = 0;
        for (int num : numeros) {
            sumatoriaDesviacion += Math.pow(num - media, 2);
        }
        double desviacionEstandar = Math.sqrt(sumatoriaDesviacion / numeros.size());

        // Paso 6: Muestra los resultados
        System.out.println("Lista de números originales: " + numeros);
        System.out.println("Raíz cuadrada de los números: " + raicesCuadradas);
        System.out.println("Números elevados al cuadrado: " + cuadrados);
        System.out.println("Media de los números: " + media);
        System.out.println("Desviación estándar de los números: " + desviacionEstandar);
    }
}
