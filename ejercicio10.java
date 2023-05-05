package LecturaDatosPorTeclado;
import java.util.*;
public class ejercicio10 {
    public static void main(String[] args) {
        //Realiza un conversor de Mb a Kb.
        Scanner tyu = new Scanner(System.in);
        System.out.print("Ingrese el número de Mb: ");
        double mb = tyu.nextDouble();
        System.out.println(mb + "Mb son " +  (mb * 1024) + "Kb");
    }
}
