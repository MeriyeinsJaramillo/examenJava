import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("¡Hola, Bienvenido al GYM FitLife!");
        System.out.println("Nuestro Menú: ");
        System.out.println("1. Inscripción mensual:");
        System.out.println("2. Inscripción anual: ");
        System.out.println("3. Servicios adicionales: ");
        System.out.println("Por favor seleccionar una opción de las mencionadas a continuación: ");
        int opcion = scanner.nextInt();
        scanner.nextLine();

        switch (opcion) {
            case 1:
                System.out.print("Por favor ingresar edad del usuario: ");
                int edadMensual = scanner.nextInt();
                scanner.nextLine();
                System.out.print("¿El usuario tiene algun tipo de discapacidad? (sí/no): ");
                String discapacidad = scanner.nextLine();

                System.out.println("\nInscripción mensual");
                System.out.println("Edad: " + edadMensual);
                System.out.println("Condición física: " + discapacidad);

                if (edadMensual < 25) {
                    if (discapacidad.equals("sí")) {
                        System.out.println("Tarifa reducida con 30% de descuento adicional.");

                    } else {
                        System.out.println("Resultado: Tarifa reducida.");
                    }
                } else {
                    if (discapacidad.equals("sí")) {
                        System.out.println("Resultado: Tarifa normal con 30% de descuento.");
                    } else {
                        System.out.println("Resultado: la tarifa normal.");
                    }
                }
                break;

            case 2:
                System.out.print("Ingrese su edad: ");
                int edadAnual= scanner.nextInt();

                System.out.println("\nOpción seleccionada: Inscripción anual");
                System.out.println("Edad: " + edadAnual);

                if (edadAnual < 18) {
                    System.out.println("Resultado: No puede inscribirse por ser menor de edad.");
                } else if (edadAnual > 60) {
                    System.out.println("Resultado: Elegible con 20% de descuento.");
                } else {
                    System.out.println("Resultado: Elegible sin descuento.");
                }
                break;

            case 3:
                System.out.println("Indique que tipo de servicio requiere: ");
                System.out.println("\n1. Piscina y sauna");
                System.out.println("\n2. Entrenamiento personalizado tiene costo adicional.");
                System.out.println("Seleccion: ");
                int Servicio = scanner.nextInt();

                System.out.println("Servicio adicional: ");

                if (Servicio ==1) {
                    System.out.println("El uso de estos servicios no tiene costo: ");

                } else {
                    System.out.println("El uso de estos servicios tiene un costo adicional.");
                }




















        }
    }

}
