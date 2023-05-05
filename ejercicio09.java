package LecturaDatosPorTeclado;

import java.util.Scanner;

import static java.lang.Math.PI;

public class ejercicio09 {
    public static void main(String[] args) {
        //Escribe un programa que calcule el volumen de un cono según la fórmula V =
        //1/3 πr2h

        Scanner tyu = new Scanner(System.in);
        System.out.println("Volumen de un cono");
        System.out.println("------------------");
        System.out.print("Por favor, introduzca la altura (cm): ");
        double h = tyu.nextDouble();
        System.out.print("Introduzca el radio de la base (cm): ");
        double r = tyu.nextDouble();
        double v = (1.0/3.0) * PI * r * r * h;
        System.out.println("El volumen del cono es de " +  v + " cm³");
    }
}
