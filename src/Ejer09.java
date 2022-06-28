import java.util.Scanner;

public class Ejer09 {
    
    public static void main(String[] args) {

        // Ejercicio 09:
        //  Pide por teclado el nombre, edad y salario y muestra el salario
        //      * Si es menor de 16 no tiene edad para trabajar
        //      * Entre 19 y 50 años el salario es un 5 por ciento más
        //      * Entre 51 y 60 años el salario es un 10 por ciento más
        //      * Si es mayor de 60 el salario es un 15 por ciento más

        String nombre;
        int edad;
        float salario;
        Scanner sc = new Scanner(System.in);
        System.out.print("\033[H\033[2J");  
        System.out.flush();   
        System.out.println(" --------------------");
        System.out.println("| Cálculo de Salario |");
        System.out.println(" --------------------");       
        System.out.print("Nombre del trabajador: ");
        nombre = sc.nextLine();
        System.out.print("Edad del trabajador: ");
        edad = sc.nextInt(); 
        if(edad<16)
            System.out.println(nombre + " es demasiado joven para trabajar.");
            else{
                System.out.print("Salario del trabajador: ");
                salario = sc.nextFloat();
                calcSal(nombre,edad,salario); 
            }       
        sc.close();
    }

    public static void calcSal(String nombre, int edad, float salario){
        float porcent=0;
       if(edad>=19 & edad <51 )
            porcent=(salario*5)/100;
            else if(edad<61)
                porcent=(salario*10)/100;
                else 
                    porcent=(salario*15)/100;        
        System.out.println(nombre + " se ganaría " + (salario+porcent));  
    }

}
