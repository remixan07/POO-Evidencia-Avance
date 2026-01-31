import java.util.Scanner;

public class POO_Avance_Evidencia {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        public class Usuario {
            String nombre;
            int id;

            public void registrarUsuario(Scanner sc) {
                System.out.println("Ingrese el nombre del usuario ");
                nombre = sc.nextLine();

                System.out.println("Ingrese la ID correspondiente ");
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

            public void prestar() {
                disponible = false;
                System.out.println("Libro prestado");
            }

            public void devolver() {
                disponible = true;
                System.out.println("Libro devuelto");
            }
        }

        public class Prestamo {
            String fechaInicio;
            String fechaFin;

            public void registrarPrestamo(Scanner sc) {
                System.out.println("Ingrese fecha inicio:");
                fechaInicio = sc.nextLine();

                System.out.println("Ingrese fecha fin:");
                fechaFin = sc.nextLine();
            }

            public void finalizarPrestamo() {
                System.out.println("Prestamo finalizado");
            }
        }