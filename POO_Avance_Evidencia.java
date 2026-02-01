import java.util.Scanner;

//LIBRO
class Book {
    String book_title;
    String book_author;
}

//USUARIO
class User {
    String user_name;
    int user_id;
}

//PRESTAMO
class Loan {
    String loan_start_date;
    String loan_end_date;
}

//MAIN
public class POO_Avance_Evidencia {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int option;

        do {
            System.out.println("\n=== MAIN MENU ===");
            System.out.println("1. Libro");
            System.out.println("2. Usuario");
            System.out.println("3. Préstamo");
            System.out.println("0. Salir");
            System.out.print("Usted ha seleccionado ");

            option = sc.nextInt();

            if (option == 1) {
                System.out.println("Libro");

            } else if (option == 2) {
                System.out.println("Usuario");

            } else if (option == 3) {
                System.out.println("Préstamo");

            } else if (option == 0) {
                System.out.println("Salir");

            } else {
                System.out.println("Eta opción es inválida, limítese a seleccionar alguna de las disponibles");
            }

        } while (option != 0);

        sc.close();
    }
}
