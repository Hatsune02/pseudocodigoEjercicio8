import java.util.*;

public class Ejercicio8Java{
    static Scanner leer = new Scanner(System.in);
    public static void main (String[] args){
        Random aleatorio = new Random();
        String salir = "";
        int random = 0;
        
        do{
            random = aleatorio.nextInt(100 - 1) * 5;
            System.out.println("El número random multiplo de 5 es: " + random);
            salir = getString("Escriba << S >> para salir, si quiere más números random presione cualquier otra cosa");
            
        } while(!salir.equals("S"));

        System.out.println(" bye :3 ");
       
    }
    public static String getString(String titulo){
        String n = "";

        while(n.equals("")){
            System.out.println(titulo);
            n = leer.nextLine();
            if(!n.matches("^[A-Za-z ]*$")){
                n = "";
            }
        }
        
        return n;
    }

}