package LecturaDatosPorTeclado;

import java.util.Scanner;

public class ejercicio02 {
    public static void main(String[] args) {
        //Realiza un conversor de euros a pesetas. La cantidad de euros que se quiere
        //convertir debe ser introducida por teclado
        Scanner tyu = new Scanner(System.in);
        int euros;
        int pesetas;
        System.out.println("Escribe la cantidad de euros: ");
        euros = tyu.nextInt();
        pesetas = (int) (166.386 * euros);
        System.out.println("pesetas = " + pesetas);
    }
}
