
import java.util.Scanner;
public class Preg04 {

public static void main(String[] args){
   Scanner scanner = new Scanner(System.in);
   System.out.print("Ingrese las ganancias de Pablito: ");
   double ganancias = scanner.nextDouble();
   double porcentaje;
   if (ganancias <= 1000) {
   porcentaje = 0.05;
   } else if (ganancias <= 1500) {
   porcentaje = 0.07;
   } else if (ganancias <= 2000) {
   porcentaje = 0.08;
   } else if (ganancias <= 5000) {
   porcentaje = 0.10;
   } else {
   porcentaje = 0.15;
   }
   double donativo = ganancias * porcentaje;
   System.out.println("El donativo para el templo es: " + donativo);
   scanner.close();  
}
}