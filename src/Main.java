import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int c,d;
        Scanner sc=new Scanner(System.in);

       do {
           System.out.println("seleccione metodo a usar:");
           System.out.println("pulse 0 para salir");
           System.out.println("pulse 1 método tabla");
           System.out.println("pulse 2 método mayormenor");
           System.out.println("pulse 3 método entredos");
           System.out.println("pulse 4 método números primos");
           System.out.println("pulse 5 método validar fecha");
           System.out.println("pulse 6 método fin");
           System.out.println("pulse 7 método área triangulo");
           System.out.println("pulse 8 método dividir mayor menor");
           System.out.println("pulse 9 método sumar n primeros numeros enteros");
           System.out.println("pulse 10 otros metodos");


           c = sc.nextInt();
           switch (c) {
               case 1:
                   Metodos.tabla();
                   break;
               case 2:
                   Metodos.mayormenor();
                   break;
               case 3:
                   Metodos.entredos();
                   break;
               case 4:
                   Metodos.primo();
                   break;
               case 5:
                   Metodos.validarfecha();
                   break;
               case 6:
                   Metodos.fin();
                   break;
               case 7:
                   Metodos.areaTriamgulo();
                   break;
               case 8:
                   Metodos.dividirMayorMenor();
                   break;
               case 9:
                   Metodos.sumaEnteros();
                   break;
               case 10:
                   Menu.primero();
                   break;

           }
       }while(c!=0);

        System.out.println("Programa cerrado correctamente");

    }




}