import java.util.Scanner;

public class Ejer10 {
    public static void main(String[] args) {

        // Ejercicio 10:
        // Muestra la serie de fibonacci hasta un número pedido por teclado. Por
        // ejemplo, si el número ingresado es el 100, debe imprimir los números 0, 1,
        // 1, 2, 3, 5, 8, 13, 21, 34, 55, 89.

        int numer;
        Scanner sc = new Scanner(System.in);
        System.out.print("\033[H\033[2J");  
        System.out.flush();   
        System.out.println(" ------------------------");
        System.out.println("| Serie fibonaci hasta X |");
        System.out.println(" ------------------------");   
        System.out.print("Introduzca un numero: ");
        numer = sc.nextInt();
        sc.close();
        fibon(numer);

    }
    public static void fibon(int numa){
        int fib1=0;
        int fib2=1;
        int temp;
        System.out.println("Serie fibonaci hasta " + numa);
        do{
            System.out.print(fib1 + ", ");
            temp=fib2;
            fib2=fib1+fib2;
            fib1=temp;
        }while(fib1<=numa);
    }
}
