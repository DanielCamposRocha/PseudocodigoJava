import java.util.Scanner;

public class Utilidades {

    public static int introducirNumero(int i){
        Scanner sc=new Scanner(System.in);
        System.out.println("Introduzca un número entero");
        int entero=sc.nextInt();
        return entero;
    }
    public static float introducirNumero(float i){
        Scanner sc=new Scanner(System.in);
        System.out.println("Introduzca un número, el decimal con coma");
        float entero=sc.nextFloat();
        return entero;
    }
    public static double introducirNumero(double i){
        Scanner sc=new Scanner(System.in);
        System.out.println("Introduzca un número, el decimal con coma");
        double entero=sc.nextDouble();
        return entero;
    }


}
