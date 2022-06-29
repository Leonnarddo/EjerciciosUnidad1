import java.util.Scanner;

public class Ejer08 {
    public static void main(String[] args) {

        // Ejercicio 08:
        // Realizar un programa que permita controlar el juego de piedra, papel, tijera
        // introduciendo P para piedra, L para papel y T para tijera por cada jugador.
        // El sistema debe indicar qué jugador gana la ronda o si hay empate. Al final
        // de cada ronda preguntar si desea volver a jugar.

        char conti;
        int elec01,elec02;
        Scanner sc = new Scanner(System.in);
        do{
            System.out.print("\033[H\033[2J");  
            System.out.flush();   
            System.out.println(" ------------------------");
            System.out.println("| Piedra, Papel o Tijera |");
            System.out.println(" ------------------------");       
            System.out.print("Jugador A escoge: \n1 - Piedra \n2 - Papel \n3 - Tijera \n: ");
            elec01=sc.nextInt();
            System.out.print("Jugador B escoge: \n1 - Piedra \n2 - Papel \n3 - Tijera \n: ");
            elec02=sc.nextInt();
            PiPaTi(elec01,elec02);
            System.out.print("Desea volver a jugar (S/N)? ");
            conti = sc.next().charAt(0); 
        }while(conti=='S' || conti=='s');
        sc.close();
    }

    public static void PiPaTi(int elec01,int elec02){

        if(elec01==elec02)
            System.out.println("Empate!");
        else if(elec01==1 & elec02==2)
            System.out.println("Papel cubre a Piedra. Gana el jugador B");
        else if(elec01==1 & elec02==3)
            System.out.println("Piedra rompe a Tijera. Gana el jugador A");
        else if(elec01==2 & elec02==1)
            System.out.println("Papel cubre a Piedra. Gana el jugador A");
        else if(elec01==2 & elec02==3)
            System.out.println("Tijera corta a Papel. Gana el jugador B");
        else if(elec01==3 & elec02==1)
            System.out.println("Piedra rompe a Tijera. Gana el jugador B");
        else if(elec01==3 & elec02==2)
            System.out.println("Tijera corta a Papel. Gana el jugador A");
        else
            System.out.println("Algo no salió bien");
    }
}
