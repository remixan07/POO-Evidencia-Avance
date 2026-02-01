//seis dias cuatro jaquqeqas y varias horas despues, esto espero este bien o por lo menos decente (no olvidar borrar esgto, eres capas de olvidarlo jose)
//creo qu no era tan dificl, es solo que me compico yo solo, o quiza si y esto este mal hechio, ni idea, segun yo esta bien
// de algo sirve desahogarse en el codigo
//NO OLVIDAR BORRQR

import java.util.Scanner;

//libor
class Book {
    String book_title;
    String book_author;
}

//usuario
class User {
    String user_name;
    int user_id;
}

//prestamo
class Loan {
    String loan_start_date;
    String loan_end_date;
}

//main
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
