
package holamundo;

import Modelo.OperacionSuma;
import java.util.Scanner;


public class App {

  
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        OperacionSuma obj_suma = new OperacionSuma();
        OperacionSuma obj_suma2 = new OperacionSuma(10,20);
        System.out.println("Ingrese un numero: ");
        obj_suma.setNum1(teclado.nextInt());
        obj_suma.setNum2(teclado.nextInt());
        obj_suma.sumar();
        
        System.out.println("Objeto1:  "+obj_suma);
        System.out.println("Objeto2:  "+obj_suma2);
        /*
        int num1, num2, suma;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese el primer numero");
        num1 = teclado.nextInt();
        System.out.println("Ingrese el primer numero");
        num2 = teclado.nextInt();
       suma = num1+num2;
        System.out.println("La suma de los numeros es:" + suma);
        */
    }
    
}
