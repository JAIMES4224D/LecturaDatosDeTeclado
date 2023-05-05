package LecturaDatosPorTeclado;

import java.util.Scanner;

public class ejercicio08 {
    public static void main(String[] args) {
        //Escribe un programa que calcule el salario semanal de un empleado en base
        //a las horas trabajadas, a razón de 12 euros la hora.
        Scanner tyu = new Scanner(System.in);
        System.out.print("Ingres el número de horas trabajadas durante la semana: ");
        int horasTrabajadas = tyu.nextInt();
        System.out.println("Su salario semanal es de " + (horasTrabajadas * 12) + " euros.");
    }
}
