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
           System.out.println("pulse 9 método sumar n primeros numeros enteros");
           System.out.println("pulse 10 método leer por teclado numero menor que 100");
           System.out.println("pulse 11 método leer 10 numeros por teclado devuelve cantidad de positivos");
           System.out.println("pulse 12 método calcular factorial de un numero");
           System.out.println("pulse 13 método obtener el mayor de 3 numeros");
           System.out.println("pulse 14 método mostrar pares de 1 a 10");
           System.out.println("pulse 15 método comprobar contraseña");
           System.out.println("pulse 16 método mediaNotas");
           System.out.println("pulse 17 método suma y media de numeros introducidos");

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
               case 9 -> Metodos.sumaEnteros();
               case 10 ->Metodos.menorCien();
               case 11 ->Metodos.contarPositivos();
               case 12 ->Metodos.factorial();
               case 13 ->Metodos.mayorDeTres();
               case 14 ->Metodos.mostrarPares();
               case 15 ->Metodos.comprobarContrasenha();
               case 16 ->Metodos.mediaNotas();
               case 17 ->Metodos.mediaSuma();

           }
       }while(c!=0);

        System.out.println("Programa cerrado correctamente");

    }




}