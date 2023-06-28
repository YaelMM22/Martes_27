package Viernes;

import java.util.Scanner;

public class Tabla_7 {
    public static void main(String[] args) {
	  System.out.println("Tablas de multiplicación: ");
	  
      Scanner input = new Scanner(System.in);
	  System.out.println("¿Que numero quieres obtener la tabla de multiplicación? : ");
      int num = input.nextInt();

      
      for (int i = 0; i <= 10; i += 1) {
    	  int multi = (i * num);
          System.out.println(+num + " * " +i+ " = " +multi);
      }
}
}