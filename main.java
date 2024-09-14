public class main {
    public static void main(String[] args) {
        // Operación 1
        double numeradorOperacionUno = (12 + 8) * (5 - 3) - (6 / 2);
        double denominadorOperacionUno = (3 * 4) + (8 / 2);
        double resultadoOperacionUno = numeradorOperacionUno / denominadorOperacionUno;
        System.out.println("Resultado de la Operación 1: " + resultadoOperacionUno);

        // Operación 2
        double numeradorOperacionDos = (((9 * 5) - (15 + 3) + (8 * 2) - (12 / 4)) * (7 + 2) - ((6 * 3) / 2));
        numeradorOperacionDos = numeradorOperacionDos / (2 + ((3 * 2) / (4 - 2))) + (5 * ((8 / 4) + 1)) - (6 / (2 + 1));
        double denominadorOperacionDos = (((4 + 2) * (7 - 1)) / (3 + 1)) + (((3 * 2) - (5 + 1)) * (8 / 2));
        denominadorOperacionDos = denominadorOperacionDos / (3 + ((6 / 2) + (7 / 2))) + (2 * (3 + (8 / 4)));
        double resultadoOperacionDos = numeradorOperacionDos / denominadorOperacionDos;
        System.out.println("Resultado de la Operación 2: " + resultadoOperacionDos);

        // Operación 3
        double numeradorOperacionTres = ((6 + 4) * 3) - (18 / 2);
        double denominadorOperacionTres = (8 - 5) + (3 * 2);
        double resultadoOperacionTres = numeradorOperacionTres / denominadorOperacionTres;
        System.out.println("Resultado de la Operación 3: " + resultadoOperacionTres);
    }
}
