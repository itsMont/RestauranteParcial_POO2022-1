/*
Planteamiento del problema Crear un simulador de las operaciones relacionadas 
en un restaurante, diseñando e implementando las clases y conceptos vistos en clase que usted crea pertinentes

Los siguientes son los requerimientos de funcionalidad, que a su vez, hacen parte de la rubrica
de evaluación:
- La implementación de los métodos y clases asociados al ingreso como trabajador
- Un menú de opciones que permita verificar las siguientes operaciones (desde el punto
de vista del empleado)
    - Menu Disponible
    - Realización de pedidos
- Un método que permita la generación del recibo con diferentes métodos de pago.

Restricciones
*Se requiere un mínimo de 3 métodos de pago.
*Se requiere un mínimo de 3 menús disponibles
 */
package restaurante;
import java.util.Scanner;

/**
 *
 * @author Jhojan Montaña
 */
public class Restaurante {

    /**
     * @param args the command line arguments
     */
    
    
    public static void main(String[] args) {
        // Trabajadores de mi restaurante
        Trabajador Pablo = new Trabajador("Pablo Rodríguez", 1, 2345);
        Trabajador Rodrigo = new Trabajador("Rodrigo Devia", 2, 1234);
        
        Scanner entrada = new Scanner(System.in);
        int opcion = 0;
        // Menú inicial
        while(opcion != 1 && opcion != 2){
            System.out.println("1. Ingreso de Trabajador");
            System.out.println("2. Salir");
            System.out.print("\nIngrese opción: ");
            opcion = entrada.nextInt();
        }
        if (opcion == 1) {
            System.out.println("Bienvenido al Sistema de ingreso de Trabajadores");
            int opcionIngreso;
            // Comprueba que se ingrese con un id valido
            do{
                System.out.println("Ingrese su Id");
                opcionIngreso = entrada.nextInt();
            }while(opcionIngreso != Rodrigo.getId() && opcionIngreso != Pablo.getId());
            // Verificación de PIN
            int ingresoPin = 0;
            switch(opcionIngreso){
                    case 1:
                        System.out.println("Bienvenido Pablo");
                        System.out.println("Ingrese su PIN");
                        while(ingresoPin != Pablo.getPin()){
                            ingresoPin = entrada.nextInt();
                        }
                        break;
                        
                    case 2:
                        System.out.println("Bienvenido Rodrigo");
                        System.out.println("Ingrese su PIN");
                        ingresoPin = entrada.nextInt();
                        while(ingresoPin != Rodrigo.getPin()){
                            ingresoPin = entrada.nextInt();
                        }
                        break;
            }
            
            System.out.println("Ha ingresado correctamente");
            int opcionMenu = 0;
            do{
                System.out.println("Ingrese una opciòn");
                System.out.println("----------------");
                System.out.println("4. Tomar pedido");
                System.out.println("5. Salir");
                opcionMenu = entrada.nextInt();				
        }while(opcionMenu != 5 && opcionMenu != 4);
            if(opcionMenu == 4){
                // Se despliega menù de alimentos
                System.out.println("--- Menù Restaurante ---");
                System.out.println("1. Hamburguesa: $8000");
                System.out.println("2. Gaseosa: $2000");
                System.out.println("3. Papas: $3000");

                //Hamburguesas
                System.out.println("¿Cuàntas hamburguesas desea pedir?");
                int numHamburguesas = entrada.nextInt();
                double precioHamburguesas = numHamburguesas * 8000;

                //Gaseosa
                System.out.println("¿Cuàntas gaseosas desea pedir?");
                int numGaseosas = entrada.nextInt();
                double precioGaseosas = numGaseosas * 2000;

                //Papas
                System.out.println("¿Cuàntas papas desea pedir?");
                int numPapas = entrada.nextInt();
                double precioPapas = numPapas * 3000;

                //Precio total
                double precioTotal = precioHamburguesas + precioGaseosas + precioPapas;


                // Se genera menú de facturación
                System.out.println("---- Factura Generada ---");
                //Imprimo con dos cifras decimales
                System.out.printf("Valor: $%.2f\n", precioTotal);
                System.out.println("¿Mediante què método de pago?");
                System.out.println("1. Efectivo");
                System.out.println("2. Credito");
                System.out.println("3. Nequi");
                // Ingresa mètodo de pago
                int metodoPago = 0;
                while(metodoPago != 1 && metodoPago != 2 && metodoPago != 3){
                        metodoPago = entrada.nextInt();
                }
                switch(metodoPago){
                        case 1:
                                System.out.println("Ha elegido Efectivo");
                                System.out.println("Recibiendo efectivo");
                                double pagoEfectivo = entrada.nextInt();
                                while(pagoEfectivo < precioTotal){
                                        System.out.println("Recibiendo efectivo");
                                        pagoEfectivo = entrada.nextInt();
                                }
                                double devolucion = pagoEfectivo - precioTotal;
                                System.out.println("Devolución efectivo: $" + devolucion);
                                break;
                        case 2:
                                System.out.println("Ha elegido Credito");
                                System.out.println("Recibiendo Credito");
                                System.out.println("Pago Efectuado");
                                break;
                        case 3:
                                System.out.println("Ha elegido Nequi");
                                System.out.println("Ingrese numero celular");
                                long numCelular = entrada.nextLong();
                                System.out.println("pago efectuado");
                                break;
                }
            }
            
        }
        System.out.println("Hasta luego");
    }
    
}
