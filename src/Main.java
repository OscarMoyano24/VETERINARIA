import java.util.Scanner;

void main() {

    Scanner teclado = new Scanner(System.in);
    MASCOTA mascota = new MASCOTA("Firulais", "Perro", 3, 10.5);

    int opcion;

    do {
        System.out.println("\n MENU ");
        System.out.println("1. Mostrar información");
        System.out.println("2. Alimentar");
        System.out.println("3. Vacunar");
        System.out.println("4. Cumplir años");
        System.out.println("5. Salir");
        System.out.print("Opción: ");
        opcion = teclado.nextInt();

        if (opcion == 1) {
            mascota.mostrarInformacion();
        }
        else if (opcion == 2) {
            System.out.print("Cantidad de alimento: ");
            double cantidad = teclado.nextDouble();
            mascota.alimentar(cantidad);
        }
        else if (opcion == 3) {
            mascota.vacunar();
        }
        else if (opcion == 4) {
            mascota.cumplirAnios();
        }
        else if (opcion == 5) {
            System.out.println("Saliendo...");
        }
        else {
            System.out.println("Opción inválida.");
        }

    } while (opcion != 5);
}