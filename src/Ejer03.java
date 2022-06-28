import java.util.Scanner;

public class Ejer03 {
    public static void main(String[] args) throws Exception {

        // Ejercicio 03:
        // Realizar un programa que calcule el sueldo de un trabajador, el programa
        // solicita el número de horas que has trabajado en un mes, las horas se
        // pagan a $30.000.

        int horas;
        System.out.print("\033[H\033[2J");  
        System.out.flush();   
        System.out.println(" ---------------------");
        System.out.println("| Calcular el Sueldo  |");
        System.out.println(" ---------------------");
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca el número de horas trabajadas: ");
        horas = sc.nextInt();
        System.out.print("El sueldo del trabajador es $" + horas*30000 + " pesos");
        sc.close();
    }
}
