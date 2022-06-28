import java.util.Scanner;

public class Ejer02 {
    public static void main(String[] args) throws Exception {

        // Ejercicio 02:
        // Realizar un programa que realice el promedio de las notas de un alumno,
        // para ello el programa va a tener que solicitar el nombre del alumno y las
        // notas de las 3 evaluaciones. Si el alumno tiene un promedio mayor o igual a
        // 3.0 también debe imprimir “Aprobado”, si no alcanzó esa nota debe imprimir
        // “Reprobado” . Requisitos: Las notas que se ingresan pueden tener
        // decimales.

        double nota1, nota2, nota3;
        System.out.println(" ------------------------------");
        System.out.println("| Promedio de notas de Alumno  |");
        System.out.println(" ------------------------------");
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca la primera nota: ");
        nota1 = sc.nextDouble();
        System.out.print("Introduzca la segunda nota: ");
        nota2 = sc.nextDouble();
        System.out.print("Introduzca la tercera nota: ");
        nota3 = sc.nextDouble();
        prome(nota1,nota2,nota3);
        sc.close();

    
    }   

    public static void prome(double nota1, double nota2, double nota3) {
        double promedio=(nota1+nota2+nota3)/3;
        if (promedio < 3.0){
            System.out.println("El promedio del estudiante es " + promedio + " - El estudiante ha Reprobado");

        }else {
            System.out.println("El promedio del estudiante es " + promedio + " - El estudiante ha Aprobado");
        }





    }

}