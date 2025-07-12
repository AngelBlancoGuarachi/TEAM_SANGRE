/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package gestiondeproductos;
  import java.util.Scanner;

/**
 *
 * @author WHITE
 */
public class GestionDeProductos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
        Producto producto1 = new Producto("Laptop Dell&109", 4500.00, 10);

        System.out.println("Datos del producto:");
        producto1.mostrarInfo();

        Scanner sc = new Scanner(System.in);
        System.out.print("\nIngresa el nuevo precio: ");
        double nuevoPrecio = sc.nextDouble();
        producto1.setPrecio(nuevoPrecio);

        System.out.println("\nDatos actualizados:");
        producto1.mostrarInfo();
    }
}

        // TODO code application logic here
    
    

