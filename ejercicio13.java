package LecturaDatosPorTeclado;

import java.util.Scanner;

public class ejercicio13 {
    public static void main(String[] args) {
        //Realiza un programa que calcule la nota que hace falta sacar en el segundo
        //examen de la asignatura Programación para obtener la media deseada. Hay
        //que tener en cuenta que la nota del primer examen cuenta el 40% y la del
        //segundo examen un 60%.
        Scanner tyu = new Scanner(System.in);
        System.out.println("Introduce la nota del primer examen: ");
        double not1 = tyu.nextInt();
        System.out.println("¿Que nota quieres sacar en el parcial?");
        double notd = tyu.nextInt();
        double x= (2* notd)-not1;
        System.out.println("Para obtener "+notd+" necesitas sacar un "+ x);
    }
}
