import java.util.Scanner;

public class Ejer06 {
    public static void main(String[] args) throws Exception {

        // Ejercicio 06:
        // Realiza un programa que solicite el sexo (H/M) y la altura (cm) al usuario y
        // que calcule el peso ideal.
        //   * peso ideal mujeres = altura - 120
        //   * peso ideal hombres = altura - 110

        char sexo;
        int altu;
        System.out.print("\033[H\033[2J");  
        System.out.flush();   
        System.out.println(" ---------------");
        System.out.println("| El peso ideal |");
        System.out.println(" ---------------");
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca el sexo (H/M): ");
        sexo=sc.next().charAt(0);
        System.out.print("\nIntroduzca la altura en cm: ");
        altu=sc.nextInt();
        sc.close();
        PeIdeal(sexo,altu);
    
    }

    public static void PeIdeal(char sexo, int altu) {
        if(sexo=='H' | sexo=='h') 
            System.out.println("Su peso ideal es " + (altu-110));
        else
            System.out.println("Su peso ideal es " + (altu-120));
    }


}
