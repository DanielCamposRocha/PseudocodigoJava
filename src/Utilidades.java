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
        float decimalcorto=sc.nextFloat();
        return decimalcorto;
    }
    public static double introducirNumero(double i){
        Scanner sc=new Scanner(System.in);
        System.out.println("Introduzca un número, el decimal con coma");
        double decimal=sc.nextDouble();
        return decimal;
    }


}
