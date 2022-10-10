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
               case 1 -> tabla();
               case 2 -> mayormenor();
               case 3 -> entredos();
               case 4 -> primo();
               case 5 -> validarfecha();
               case 6 -> fin();
               case 7 -> areaTriamgulo();
               case 8 ->dividirMayorMenor();
           }
       }while(c!=0);


    }
    private static int introducirNnumero (int i){
        Scanner sc=new Scanner(System.in);
        System.out.println("Introduzca un número entero");
        int entero=sc.nextInt();
        return entero;
    }
    private static double introducirNnumero (double i){
        Scanner sc=new Scanner(System.in);
        System.out.println("Introduzca un número, el decimal con coma");
        double entero=sc.nextDouble();
        return entero;
    }

/*se valida una fecha no se tienen en cuenta los bisiestos*/
    private static void validarfecha() {
        int dia,mes,anho;
        Scanner sc=new Scanner(System.in);
        do {
            System.out.println("Introduzca dia");
            dia = sc.nextInt();
        }while(1>dia || dia>31 );
        do {
            System.out.println("Introduzca mes");
            mes = sc.nextInt();
        }while(1>mes || mes>12);
        do {
            System.out.println("Introduzca año");
            anho = sc.nextInt();
        }while(anho<0);
        switch (mes){
            case 2:
                if (dia>28){
                    System.out.println("Febrero tiene entre 28 o 29 dias dependiendo si es bisiesto");
                    do{
                        System.out.println("Dia no valido. Introduzca un número de día.");
                        dia = sc.nextInt();
                    }while(!(dia <= 29) && !(dia>1));
                }
            case 4,6,9,11:
                if (dia>30){
                    System.out.println("dia de mes no valido, este mes tiene 30 dias");
                    do {
                        System.out.println("Dia no valido. Introduzca un número de día.");
                        dia = sc.nextInt();
                    }while(!(dia<30) && !(dia>1));
                }
        }
        System.out.println("la fecha es: "+dia+"/"+mes+ "/"+ anho);
    }

    /*dos múmeros*/
    private static void entredos() {
        //Scanner sc=new Scanner(System.in);
        int mayor,menor,pares,num1,num2,pimpares;
        pares=0;
        pimpares=1;
        /*System.out.println("Introduzca un número");
        num1=sc.nextInt();
        System.out.println("Introduzca un número");
        num2=sc.nextInt();*/
        num1 =introducirNnumero (1);
        num2=introducirNnumero (1);
        if(num1>num2){
            mayor=num1-1;
            menor=num2+1;
        }else{
            mayor=num2-1;
            menor=num1+1;
        }
        for(int i=menor;i<=mayor;i++){
            System.out.println(i);
            if(i%2==0){
                pares=pares+1;
            }else{
                pimpares=pimpares*i;
            }
        }
        System.out.println("entre los dos numeros hay: "+(mayor-menor+1)+" números");
        System.out.println("entre los dos numeros hay: "+pares+" números pares");
        System.out.println("el producto de los impares es: "+pimpares);

    }
    /*mayor menor de una serie se sale con -1*/
    private static void mayormenor() {
        int n=0;
        int mayor=0;
        int menor=999999;
        //Scanner sc=new Scanner(System.in);
        while (n!=-1){
            /*System.out.println("introduzca un número");
            n=sc.nextInt(); */
            n=introducirNnumero (2);
            if (n>=mayor){
                mayor=n;
            }
            if(n<=menor & n!=-1){
                menor=n;
            }
        }
        System.out.println("el numero menor fue: "+menor+" el numero mayor fue: "+mayor);
    }
    /*multiplos de 3 menores que*/
    private static void tabla() {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca un número");
        n = sc.nextInt();
        for (int i = 3; i <= n; i += 3) {
            System.out.println(i);
        }
    }

    /*este primer metodo obtiene los numeros primos menores que 100*/
    public static void primo() {

        System.out.println ("1");
        System.out.println ("2");
        for (int i=3;i<100;i=i+2) {
            int k=3;
            int c=0;
            while (k<i) {
                if (i%k== 0){
                    c=c+1;
                }
                k=k+2;
            }
            if (c == 0){
                System.out.println(i+" es un número primo");
            }
        }

    }
    // en el double reocrdar porner decimales con coma no con punto
    private static void dividirMayorMenor() {
        //Scanner sc= new Scanner(System.in);
        /*System.out.println("introduzca numero");
        double num1 = sc.nextDouble();
        System.out.println("introduzca otro numero");
        double num2 = sc.nextDouble();*/
        double num1= introducirNnumero(2.1);
        double num2=introducirNnumero(2.1);
        if(num2>num1) {
            System.out.println(" la división  de "+num2+" entre "+num1+" es: " + (num2 / num1));
        }else {System.out.println(" la división  de "+num1+" entre "+num2+" es: "+(num1/num2));}
    }

    //cálculo del área de un triángulo
    private static void areaTriamgulo() {

        Scanner sc= new Scanner(System.in);
        System.out.println("introduzca la altura del triangulo");
        double altura = sc.nextDouble();
        System.out.println("introduzca la base del triangulo");
        double base = sc.nextDouble();
        System.out.println("El área del triangulo es: "+(base*altura)/2);
    }

    /* Ejercicio 1 del tema 5*/
    private static void fin() {
        String teclado;
        Scanner sc= new Scanner(System.in);
        do {
            System.out.println("introduzca lo que quiera, cuando quiera salir ponga FIN");
            teclado = sc.nextLine();
            System.out.println(teclado);
        }while(!teclado.equals("FIN"));
        System.out.println("Se cerró el programa");
    }

}