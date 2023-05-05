package LecturaDatosPorTeclado;

import java.util.Scanner;

public class ejercicio03 {
    public static void main(String[] args) {
        //Realiza un conversor de pesetas a euros. La cantidad de pesetas que se quiere
        //convertir debe ser introducida por teclado.
        Scanner tyu = new Scanner(System.in);
        int euros;
        int pesetas;
        System.out.println("Escribe la cantidad de pesetas: ");
        pesetas = tyu.nextInt();
        euros = (int) ( pesetas /166.386);
        System.out.println("pesetas = " + euros);
    }
}
