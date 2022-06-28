import java.util.Scanner;

public class Ejer01 {
    public static void main(String[] args) throws Exception {
        
        // Ejercicio 01:
        // Realizar la suma, la resta, la división y la multiplicación de dos números
        // leídos por teclado y mostrar en pantalla “La <operación> de <número 1>
        // y <número 2> es igual a <resultado> ”.
        
        double num1, num2;
        int opera;
        System.out.println(" ---------------------------------");
        System.out.println("| Operaciones Aritméticas Básicas |");
        System.out.println(" ---------------------------------");
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca el primer número: ");
        num1 = sc.nextDouble();
        System.out.print("Introduzca el segundo número: ");
        num2 = sc.nextDouble();
        System.out.println("Que operación quieres realizar?");
        System.out.print("1 Suma, 2 Resta, 3 Multiplicación o 4 División: ");
        opera = sc.nextInt();
        operar(num1,num2,opera);
        sc.close();
    }

    public static void operar(double num1, double num2, int opera) {
        if(num2 == 0 & opera == 4) 
        //comprobar que no se haga división entre 0                                   
            System.out.println("La división entre 0 no es posible.  Abortando programa...");
        else{  // Si la operación es válida
            switch(opera){  // Operación seleccionada
                case 1: 
                    System.out.print("La suma de " + num1 + " y " + num2 + " es igual a " + (num1+num2));
                    break;
                case 2: 
                    System.out.print("La resta de " + num1 + " y " + num2 + " es igual a " + (num1-num2));
                    break;
                case 3: 
                    System.out.print("La multiplicación de " + num1 + " y " + num2 + " es igual a " + (num1*num2));
                    break;
                case 4: 
                    System.out.print("La division de " + num1 + " entre " + num2 + " es igual a " + (num1/num2));
                    break;
                default: 
                    System.out.println("La selección de operación no es válida.  Abortando programa...");
            
            
            }




        }

    }

}
