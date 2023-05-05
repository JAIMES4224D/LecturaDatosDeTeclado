package LecturaDatosPorTeclado;

import java.util.Scanner;

public class ejercicio04 {
    public static void main(String[] args) {
        //Escribe un programa que sume, reste, multiplique y divida dos números
        //introducidos por teclado.
        Scanner tyu = new Scanner(System.in);
        System.out.println("Ingrese un numero: ");
        int a = tyu.nextInt();
        System.out.println("Ingrese otro numero");
        int b = tyu.nextInt();
        int suma = a+b;
        int resta = a-b;
        int multiplicacion = a*b;
        int division = a/b;
        System.out.println("suma = " + suma);
        System.out.println("resta = " + resta);
        System.out.println("multiplicacion = " + multiplicacion);
        System.out.println("division = " + division);
    }
}
