package LecturaDatosPorTeclado;

import java.util.Scanner;

public class ejercicio06 {
    public static void main(String[] args) {
        Scanner tyu = new Scanner(System.in);
        System.out.println("Escriba la base del triangulo: ");
        int base = tyu.nextInt();
        System.out.println("Escribe la altura del triangulo:  ");
        int altura = tyu.nextInt();
        int resultado = (base*altura)/2;
        System.out.println("area del triangulo es = " + resultado);
    }
}
