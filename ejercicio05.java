package LecturaDatosPorTeclado;

import java.util.Scanner;

public class ejercicio05 {
    public static void main(String[] args) {
        //Escribe un programa que calcule el área de un rectángulo
        Scanner tyu = new Scanner(System.in);
        System.out.println("Escriba el ancho del rectangulo: ");
        int a = tyu.nextInt();
        System.out.println("Escriba el alto del rectangulo: ");
        int b = tyu.nextInt();
        System.out.println("■■■■■■■■■■■■■■■■■■■■■■■■■■");
        System.out.println("■                        ■");
        System.out.println("■                        ■"+b);
        System.out.println("■                        ■");
        System.out.println("■                        ■");
        System.out.println("■■■■■■■■■■■■■■■■■■■■■■■■■■");
        System.out.println("            "+a);
        int area = a*b;
        System.out.println("area del rectangulo es = " + area);
    }
}
