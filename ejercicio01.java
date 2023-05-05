package LecturaDatosPorTeclado;

import java.sql.SQLOutput;
import java.util.Scanner;

public class ejercicio01 {
    public static void main(String[] args) {
        //Realiza un programa que pida dos números y que luego muestre el resultado
        //de su multiplicación
        Scanner mult = new Scanner(System.in);
        int a;
        int b;
        System.out.println("Escribe un numero: ");
        a = mult.nextInt();
        System.out.println("Escribe otro numero: ");
        b = mult.nextInt();
        int producto = a*b;
        System.out.println(a+" * "+b+" = " + producto);
        }
}
