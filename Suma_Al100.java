package Viernes;

import java.util.Scanner;

public class Suma_Al100 {
    public static void main(String[] args) {
    	
    	 System.out.println("Tablas de multiplicación: ");
   	  
         Scanner input = new Scanner(System.in);
   	  System.out.println("¿QUe numero quieres calcular la suma de los primeros numeros dentro de este? : ");
         int limit = input.nextInt();
         
        int suma = 0;

        for (int i = 1; i <= limit; i++) {
            suma += i;
        }

        System.out.println("La suma de los primeros " + limit + " números naturales es: " + suma);
    }
}
