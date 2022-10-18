import java.util.Scanner;

public class Utilidades {

    public static int introducirNumero(int i){
        Scanner sc=new Scanner(System.in);
        System.out.println("Introduzca un número entero");
        return sc.nextInt();
    }
    public static float introducirNumero(float i){
        Scanner sc=new Scanner(System.in);
        System.out.println("Introduzca un número, el decimal con coma");
        return sc.nextFloat();
    }
    public static double introducirNumero(double i){
        Scanner sc=new Scanner(System.in);
        System.out.println("Introduzca un número, el decimal con coma");
        return sc.nextDouble();
    }


}
