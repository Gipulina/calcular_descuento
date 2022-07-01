package principal;
import java.util.Scanner;


public class Facturacion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Double precio;
        Integer unidades = 0;
        String zona="";
        System.out.println("Introduce un Precio de Producto: ");
        precio = Double.parseDouble(sc.nextLine());
        System.out.println("Introduce un Unidad de Producto: ");
        unidades = Integer.parseInt(sc.nextLine());
        System.out.println("Introduce la Zona: ");
        zona = sc.nextLine();
        var descuento = switch (zona){
            case "A","B"-> 10;
            case  "C","D","E" ->5;
            case "F"-> 3;
            default -> 0;
        };
        precio = precio*unidades*(100-descuento)/100;
        System.out.println("Precio final " + precio);

    }
}
