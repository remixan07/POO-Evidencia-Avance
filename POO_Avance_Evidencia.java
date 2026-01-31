import java.util.Scanner;

public class POO_Avance_Evidencia {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        public class Usuario {
            String nombre;
            int id;

            public void registrarUsuario(Scanner sc) {
                System.out.println("Ingrese nombre del usuario:");
                nombre = sc.nextLine();

                System.out.println("Ingrese ID:");
                id = sc.nextInt();
                sc.nextLine();
            }

            public void mostrarUsuario() {
                System.out.println("Usuario: " + nombre + " ID: " + id);
            }
        }

        public class Libro {
            String titulo;
            String autor;
            String isbn;
            boolean disponible = true;

            public void registrarLibro(Scanner sc) {
                System.out.println("Ingrese titulo del libro:");
                titulo = sc.nextLine();

                System.out.println("Ingrese autor:");
                autor = sc.nextLine();

                System.out.println("Ingrese ISBN:");
                isbn = sc.nextLine();
            }

