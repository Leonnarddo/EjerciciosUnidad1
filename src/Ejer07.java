import java.util.Scanner;

public class Ejer07 {
    public static void main(String[] args) {

        // Ejercicio 07:
        // Pedir un número, comprobar si es primo y preguntar si quiere introducir más
        // (S/N) y volver a pensar.

        int nume02;
        String resultado;
        char continuar;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("\033[H\033[2J");  
            System.out.flush();   
            System.out.println(" ------------------");
            System.out.println("| Es número primo? |");
            System.out.println(" ------------------");       
            System.out.print("Introduzca el número a comprobar: ");
            nume02 = sc.nextInt();
            resultado = esPrimo(nume02);
            System.out.println(resultado);
            System.out.print("Desea volver a intentarlo (S/N)? ");
            continuar = sc.next().charAt(0); 
        }while (continuar =='s' | continuar=='S');
        sc.close();
        System.out.println("Programa terminado por el usuario.");      
    }

    public static String esPrimo(int nume02){
        String resul="hmmm";
        for(int i=2; i<=nume02/2;i++) { 
            if (nume02 % i==0) {
                resul=(nume02 + " no es primo, es divisible entre " + i);
                break;
            }else{
                resul=(nume02 + " es primo");
                
            }
        }
        return(resul);
    }
}
