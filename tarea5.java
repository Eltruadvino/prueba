import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar dirección
        System.out.println("Ingrese su calle:");
        String calle = scanner.nextLine();
        System.out.println("Ingrese su número de domicilio:");
        String numeroDomicilio = scanner.nextLine();
        System.out.println("Ingrese su colonia:");
        String colonia = scanner.nextLine();
        System.out.println("Ingrese su ciudad:");
        String ciudad = scanner.nextLine();
        System.out.println("Ingrese su código postal:");
        String codigoPostal = scanner.nextLine();

        // Solicitar datos escolares
        System.out.println("Ingrese el nombre de su primaria:");
        String primaria = scanner.nextLine();
        System.out.println("Ingrese el nombre de su secundaria:");
        String secundaria = scanner.nextLine();
        System.out.println("Ingrese el nombre de su preparatoria:");
        String preparatoria = scanner.nextLine();

        // Solicitar datos de deporte favorito
        System.out.println("Ingrese su deporte favorito:");
        String deporteFavorito = scanner.nextLine();
        System.out.println("¿Cuál es tu equipo favorito en este deporte?");
        String equipoFavorito = scanner.nextLine();
        System.out.println("¿Cuántos años has practicado este deporte?");
        String anosPracticando = scanner.nextLine();

        // Mostrar todos los datos ingresados
        System.out.println("\nDatos ingresados por el usuario:");
        System.out.println("Domicilio: Calle " + calle + ", No. " + numeroDomicilio + ", Colonia " + colonia + ", Ciudad " + ciudad + ", CP " + codigoPostal);
        System.out.println("Escuelas: Primaria " + primaria + ", Secundaria " + secundaria + ", Preparatoria " + preparatoria);
        System.out.println("Deporte favorito: " + deporteFavorito);
        System.out.println("Equipo favorito: " + equipoFavorito);
        System.out.println("Años practicando: " + anosPracticando);

        scanner.close();
    }
}
