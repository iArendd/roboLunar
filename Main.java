import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /* ROBO */

        Robo robo1 = new Robo();

        robo1.carga = 100;
        robo1.descarga = 10;
        robo1.descargaRotaciona = 5;
        robo1.descargaFoto = 2;


        String continuar = " ";

        System.out.println("Deseja iniciar? (s) (n)");
        System.out.println("------------------------------");

        Scanner leitorEntrada = new Scanner(System.in);

        continuar = leitorEntrada.nextLine();

        
        while(continuar.contains("s")){

            robo1.perguntar();
            robo1.perguntarRotacao();
            robo1.perguntarFoto();


            continuar = " ";
            
            System.out.println("Deseja continuar? (s) (n)");
            System.out.println("------------------------------");
            continuar = leitorEntrada.nextLine();

        }

        


    }

        

}



