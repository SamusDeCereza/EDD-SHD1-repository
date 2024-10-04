import java.util.Scanner;


public class main {

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);

        System.out.println("Bienvenido a Boutique Elegance");

        String respuesta = "si";
        int opcion = 0;

        while (respuesta.equals("si")) {
            opcion = mostrarMenu(entrada);


            System.out.println("¿Desea realizar alguna otra operación? (si/no)");
            respuesta = entrada.nextLine().toLowerCase();
            respuesta = entrada.nextLine().toLowerCase();
            System.out.println(respuesta);
        }
    }

    public static int mostrarMenu(Scanner entrada){

        int respuesta = 0;

        System.out.println("Seleccione una opción");
        System.out.println("1 - Buscar una prenda");
        System.out.println("2 - Registrar una prenda");
        System.out.println("3 - Ordenar prendas (año de colección)");
        System.out.println("4 - Verificar el valor total del inventario");

        respuesta = entrada.nextInt();


        return respuesta;

    }

}