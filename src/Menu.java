import java.util.Scanner;
public class Menu {
    public static void primero() {
        Scanner sc=new Scanner(System.in);
        int d;
        do {
            System.out.println("pulse 0 para volver a la pantalla anterior");
            System.out.println("pulse 1 método leer 10 numeros por teclado devuelve cantidad de positivos");
            System.out.println("pulse 2 método calcular factorial de un numero");
            System.out.println("pulse 3 método obtener el mayor de 3 numeros");
            System.out.println("pulse 4 método mostrar pares de 1 a 10");
            System.out.println("pulse 5 método comprobar contraseña");
            System.out.println("pulse 6 método mediaNotas");
            System.out.println("pulse 7 método suma y media de numeros introducidos");
            System.out.println("pulse 8 método leer por teclado numero menor que 100");
            System.out.println("pulse 9 otros metodos");

           d = sc.nextInt();
            switch (d) {
                case 1 -> Metodos.contarPositivos();
                case 2 -> Metodos.factorial();
                case 3 -> Metodos.mayorDeTres();
                case 4 -> Metodos.mostrarPares();
                case 5 -> Metodos.comprobarContrasenha();
                case 6 -> Metodos.mediaNotas();
                case 7 -> Metodos.mediaSuma();
                case 8 -> Metodos.menorCien();
                case 9 -> segundo();
            }

        }while (d != 0) ;
    }

    private static void segundo() {
        Scanner sc=new Scanner(System.in);
        int d;
        do {
            System.out.println("pulse 0 para volver a la pantalla anterior");
            System.out.println("pulse 1 método comprobarMes");
            System.out.println("pulse 2 método cuatro operaciones");
            System.out.println("pulse 3 método calculadora");
            System.out.println("pulse 4 método tabla multiplicar");
            System.out.println("pulse 5 método tratar nota");
            System.out.println("pulse 6 método Adivinar");
            System.out.println("pulse 7 método Nomina");
            System.out.println("pulse 8 método paresImpares");
            System.out.println("pulse 9 método multiplos de tres");
            System.out.println("pulse 10 otros metodos");

            d = sc.nextInt();
            switch (d) {
                case 1 -> Metodos.coprobarMes();
                case 2 -> Metodos.cuatrOperaciones ();
                case 3-> Metodos.calculadora();
                case 4 -> Metodos.tablaMultiplicar();
                case 5 -> Metodos.tratarNota();
                case 6 -> Metodos.adivinarNumeros();
                case 7 -> Metodos.nomina();
                case 8 -> Metodos.paresImpares();
                case 9 ->Metodos.multiplosTres();
                case 10-> tercero();

            }

        }while (d != 0) ;
    }

    private static void tercero() {
        Scanner sc=new Scanner(System.in);
        int d;
        do {
            System.out.println("pulse 0 para volver a la pantalla anterior");
            System.out.println("pulse 1 método mayor menor serie");
            System.out.println("pulse 2 método pares impares rango");
            System.out.println("pulse 3 método convertir horas");
            System.out.println("pulse 4 metodo calculo de sueldo");
            System.out.println("pulse 5 metodo sumadigitos");

            d = sc.nextInt();
            switch (d) {
                case 1 -> Metodos.mayorMenorSerie();
                case 2->Metodos.paresImparesRango();
                case 3-> Metodos.convertirHoras();
                case 4->Metodos.calculoSueldo();
                case 5->Metodos.sumaDigitos();

            }

        }while (d != 0) ;
    }

    public static void inicial() {
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
            System.out.println("pulse 10 otros metodos");


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
                case 10 -> Menu.primero();
            }
        }while(c!=0);

        System.out.println("Programa cerrado correctamente");

    }

}

