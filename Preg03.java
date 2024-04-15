

import java.util.Scanner;

public class Preg03 {

public static void main(String[] args){
 Scanner teclado = new Scanner(System.in);
        int numero_horas, resultado;
        System.out.println("Ejercicio");
        System.out.println("Numero de horas que estará estacionado: ");
        numero_horas = teclado.nextInt();
        if (numero_horas <= 4) {
            System.out.println("El importe a pagar es = S/ 6.00");

        } else {
            resultado = ((numero_horas - 4) * 2) + 6;
            System.out.println("Total a pagar es = S/ " + resultado);
        }
        // Cerrar el Scanner después de su uso
        teclado.close();
    }
}
