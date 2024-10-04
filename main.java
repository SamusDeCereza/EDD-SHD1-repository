import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;


public class main {

    public static void main(String[] args) {
        
        List<Prenda> prendas = new LinkedList<>();
        
        Prenda prenda1 = new Prenda("Vestido Floreado", "Zara", 2020, 500);
        prendas.add(prenda1);

        prenda1 = new Prenda("Blusa Azul", "Vertiche", 2022, 800);
        prendas.add(prenda1);

        prenda1 = new Prenda("Pantalón Vaquero", "Marlu", 2019, 200);
        prendas.add(prenda1);

        prenda1 = new Prenda("Vestido Satín", "Ilusion", 2022, 800);
        prendas.add(prenda1);

        prenda1 = new Prenda("Blusa Morada", "Zara", 2017,500);
        prendas.add(prenda1);

        prenda1 = new Prenda("Top", "Vertiche", 2019, 650);
        prendas.add(prenda1);

        prenda1 = new Prenda("Short Pesquero", "Marlu", 2015, 1000);
        prendas.add(prenda1);

        prenda1 = new Prenda("Chaqueta De Carretera", "Ilusion", 2020, 700);
        prendas.add(prenda1);

        prenda1 = new Prenda("Sombrero De Paja", "Zara", 2024, 1500);
        prendas.add(prenda1);

        prenda1 = new Prenda("Blusa Roja", "Vertiche", 2022, 800);
        prendas.add(prenda1);

        Scanner entrada = new Scanner(System.in);

        System.out.println("Bienvenido a Boutique Elegance");

        String respuesta = "si";
        int opcion = 0;

        while (respuesta.equals("si")) {
            opcion = mostrarMenu(entrada);


            System.out.println("¿Desea realizar alguna otra operación? (si/no)");
            respuesta = entrada.nextLine().toLowerCase();
            respuesta = entrada.nextLine().toLowerCase();
            
        }
    }

    public static int mostrarMenu(Scanner entrada){

        int respuesta = 0;

        System.out.println("Seleccione una opción");
        System.out.println("1 - Ver el inventario");
        System.out.println("2 - Registrar una prenda");
        System.out.println("3 - Buscar una prenda (diseñador)");
        System.out.println("4 - Ordenar prendas (año de colección)");
        System.out.println("5 - Verificar el valor total del inventario");

        respuesta = entrada.nextInt();

        return respuesta;
    }

    public static void buscarPrenda(String diseniador, List<Prenda> lista){
        System.out.println("Se han encontrado las siguientes prendas: ");

        for (Prenda prenda : lista) {
            if(prenda.getDiseniador().equals(diseniador)){
                System.out.println("\nNombre: " + prenda.getNombre());
                System.out.println("Diseñador: " + prenda.getDiseniador());
                System.out.println("Año de colección: " + prenda.getAnioColeccion());
                System.out.println("Precio: " + prenda.getPrecio());
            }
        }

    }

    public static Prenda registrarPrenda(Scanner entrada){
        System.out.println("Introduce los datos de la prenda");
        System.out.println("Nombre: ");
        String nombre = entrada.nextLine();

        System.out.println("Diseñador: ");
        String diseniador = entrada.nextLine();

        System.out.println("Año de colección: ");
        int anio = entrada.nextInt();

        System.out.println("Precio: ");
        float precio = entrada.nextFloat();

        Prenda prenda = new Prenda(nombre, diseniador, anio, precio);

        return prenda;
    }

    public static void mostrarInventario(List<Prenda> lista){
        for (Prenda prenda : lista) {
            System.out.println("\nNombre: " + prenda.getNombre());
            System.out.println("Diseñador: " + prenda.getDiseniador());
            System.out.println("Año de colección: " + prenda.getAnioColeccion());
            System.out.println("Precio: " + prenda.getPrecio() + "");

        }
    }

}
