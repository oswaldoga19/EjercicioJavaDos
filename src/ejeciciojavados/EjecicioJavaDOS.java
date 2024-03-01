/*
 * Hacer un seguimiento (prueba de escritorio) del siguiente grupo de instrucciones.
INICIO
 SUMA = 0
 X = 20
 SUMA = SUMA + X
 Y = 40
 X = X + Y ** 2
 SUMA = SUMA + X / Y
 ESCRIBA: “EL VALOR DE LA SUMA ES:”, SUMA
FIN_INICIO 
 */
package ejeciciojavados;

public class EjecicioJavaDOS {

    public static void main(String[] args) {
        double suma = 0;
        int x = 20;
        int y = 40;
        
        System.out.println("----Paso 1----");
        System.out.println("suma: "+ suma);
        System.out.println("x: "+ x);
        System.out.println("y: "+ y);
        
        System.out.println("----Paso 2----");
        suma = suma + x;
        System.out.println("suma: "+ suma);
        
        System.out.println("----Paso 3----");
        x = x + y * y;
        System.out.println("x: "+ x);
        
        System.out.println("----Paso 4----");
        suma = suma + x/y;
        System.out.println("suma: "+suma);
           
    }
    
}
