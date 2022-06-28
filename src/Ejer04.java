import java.util.Scanner;

public class Ejer04 {
    public static void main(String[] args) throws Exception {

        // Ejercicio 04:
        // Solicitar un número al usuario y mostrar la tabla de multiplicar de ese
        // número, desde el 0 hasta el 10. Truco: Usa un bucle for para recorrer la
        // tabla y mostrar los datos.

        int num01;
        System.out.print("\033[H\033[2J");  
        System.out.flush();   
        System.out.println(" -----------------------");
        System.out.println("| Tabla de Multiplicar  |");
        System.out.println(" -----------------------");
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca el número para hacer su tabla: ");
        num01 = sc.nextInt();
        tabla(num01);
        sc.close();
    }

    public static void tabla(int num01)  {
        System.out.println(" -------------------");
        System.out.println("| La tabla del " + num01 + "  |");
        System.out.println(" -------------------");
        for(int i=0; i<=10;i++) 
            System.out.println(num01 + " * " + i + " = " + num01*i );
    }


}

