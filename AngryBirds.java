import java.util.Scanner;
public class AngryBirds {

    public static void main(String [] args) {
        Scanner g=new Scanner(System.in);
        int opc;
        Red bird1 = new Red(115, "Ninguno","Rojo", "Red");
        Blues bird2 = new Blues(100,"Dividirse en 3","Azul","Blues");
        Chuck bird3 = new Chuck(55,"Velocidad","Amarillo","Chuck");
        Matilda bird4 = new Matilda(110,"Huevo explosivo","Blanco","Matilda");
        //Bomb pj4 = new Bomb(60," Explosión"," Grande"," Bomb");
        do {
            System.out.println(" --------------------------");
            System.out.println("| Bienvenido a Angry Birds |");
            System.out.println(" --------------------------");
            System.out.println("Seleccione un pajaro:");
            System.out.println("1 - Red");
            System.out.println("2 - Blues");
            System.out.println("3 - Chuck");
            System.out.println("4 - Matilda");
            System.out.println("5 - Salir");
            opc = g.nextInt();

            switch (opc) {
                case 1: bird1.Mostrar();
                    break;
                case 2: bird2.Mostrar();
                    break;
                case 3: bird3.Mostrar();
                    break;
                case 4: bird4.Mostrar();
                    break;
                case 5: System.out.println("Ha salido de Angry Birds");
                    break;
            }
        } while (opc!=5);
    }
}