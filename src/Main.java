import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int c;
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
           c = sc.nextInt();
           switch (c) {
               case 1 -> Metodos.tabla();
               case 2 -> Metodos.mayormenor();
               case 3 -> Metodos.entredos();
               case 4 -> Metodos.primo();
               case 5 -> Metodos.validarfecha();
               case 6 -> Metodos.fin();
               case 7 -> Metodos.areaTriamgulo();
               case 8 -> Metodos.dividirMayorMenor();
           }
       }while(c!=0);

        System.out.println("Programa cerrado correctamente");

    }




}