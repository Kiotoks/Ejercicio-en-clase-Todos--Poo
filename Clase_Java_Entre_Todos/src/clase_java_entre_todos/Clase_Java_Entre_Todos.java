package clase_java_entre_todos;

import java.util.Scanner;

/**
 *
 * @author ET36
 */
public class Clase_Java_Entre_Todos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int cantVentas;
        int cantProductos;
        
        System.out.println("Cuantas ventas se realizaron en el dia");
        cantVentas = teclado.nextInt();
        Venta ventas[] = new Venta[cantVentas];
        
        for (int i = 0; i < cantVentas; i++){
            ventas[i] = crearVenta();
        }
    }
    
    
    public static Venta crearVenta(){
        Scanner teclado = new Scanner(System.in);
        String fecha;
        int cantProductos;
        
        System.out.println("cuando se produjo la venta");
        fecha = teclado.next();
        
        System.out.println("cuantos productos se vendieron en la venta");
        cantProductos = teclado.nextInt();
        
        Producto productos[] = new Producto[cantProductos];
        for(int j = 0; j < cantProductos; j++){
            productos[j]=crearProducto();
        }
        Venta v = new Venta(fecha, productos);
        return v;
    }
    
    public static Producto crearProducto(){
        Scanner teclado = new Scanner(System.in);

        System.out.println("que producto es: remera, zapatilla, campera, mochila");
        String tipo = teclado.next();
        switch (tipo){
            case "remera":
                System.out.println("cuál es el talle? ");
                String talle = teclado.next();
                System.out.println("tiene manga larga o corta? ");
                String manga = teclado.next();
                System.out.println("cuello");
                String cuello = teclado.next();
                System.out.println("detalle");
                String det = teclado.next();
                
            case "zapatilla":
                System.out.println("Cual es el talle de la zapatilla");
                int talleZapa = teclado.nextInt();
                System.out.println("Tipo de zapatilla");
                
                


                
        }
        
        System.out.println("color:");
        String color = teclado.next();
        System.out.println("desc");
        String desc = teclado.next();
        System.out.println("precio");
        double precio = teclado.nextInt();
        System.out.println("marca");
        String marca = teclado.next();
        
        return p;
    }
}
