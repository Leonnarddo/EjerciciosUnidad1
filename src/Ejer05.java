import java.util.Scanner;
import java.util.Random;

public class Ejer05 {
    public static void main(String[] args) throws Exception {

        // Ejercicio 05:
        // Generar un número aleatorio entre el 1 y el 100, el usuario lo tiene que
        // adivinar introduciendo el número por teclado. En el caso que el número a
        // adivinar sea mayor al ingresado, decirle al usuario “El número que busca es
        // mayor”, de lo contrario, “El número que busca es menor”. El programa
        // finalizará cuando se introduzca el número correcto. Nota: usar la clase
        // Random para generar el número aleatorio.

        int adivina;
        System.out.println(" -------------------");
        System.out.println("| Adivina el Número |");
        System.out.println(" -------------------");
        Random randy = new Random();
        int randomerio = randy.nextInt(100)+1;
        Scanner sc = new Scanner(System.in);
        do{
            System.out.print("Adivina un número entre 1 y 100: ");
            adivina = sc.nextInt();
            if (adivina > randomerio)
              System.out.println("El número que buscas es menor\n");
            else if (adivina < randomerio) 
                System.out.println("El número que buscas es mayor\n" );
            else if (adivina == randomerio)
                System.out.println("Felicidades, el número que buscabas era " + adivina);
        }while(adivina != randomerio);
        sc.close();
    }


}
