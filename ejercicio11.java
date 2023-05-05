package LecturaDatosPorTeclado;

import java.util.Scanner;

public class ejercicio11 {
    public static void main(String[] args) {
        //Realiza un conversor de Kb a Mb
        Scanner tyu = new Scanner(System.in);
        System.out.print("Ingrese el número de Kb: ");
        double kb = tyu.nextDouble();
        System.out.println(kb + "kb son " +  (kb / 1024) + "Mb");
    }
}
