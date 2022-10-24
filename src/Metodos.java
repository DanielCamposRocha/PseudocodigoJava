

import java.util.Scanner;

public class Metodos {



    /*se valida una fecha no se tienen en cuenta los bisiestos*/
    public static void validarfecha() {
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
                    }while((dia > 29) || (dia<1));
                }
            case 4,6,9,11:
                if (dia>30){
                    System.out.println("dia de mes no valido, este mes tiene 30 dias");
                    do {
                        System.out.println("Dia no valido. Introduzca un número de día.");
                        dia = sc.nextInt();
                    }while((dia>30)|| dia<1);
                }
        }
        System.out.println("la fecha es: "+dia+"/"+mes+ "/"+ anho);
    }

    /*dos múmeros*/
    public static void entredos() {
        //Scanner sc=new Scanner(System.in);
        int mayor,menor,pares,num1,num2,pimpares;
        pares=0;
        pimpares=1;
        /*System.out.println("Introduzca un número");
        num1=sc.nextInt();
        System.out.println("Introduzca un número");
        num2=sc.nextInt();*/
        num1 = Utilidades.introducirNumero(1);
        num2= Utilidades.introducirNumero(1);
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
    public static void mayormenor() {
        int n=0;
        int mayor=0;
        int menor=999999;
        //Scanner sc=new Scanner(System.in);
        while (n!=-1){
            /*System.out.println("introduzca un número");
            n=sc.nextInt(); */
            n= Utilidades.introducirNumero(2);
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
    public static void tabla() {
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

        System.out.println ("1 es un número primo");
        System.out.println ("2 es un número primo");
        //uso paso 2 y me ahorro los pares
        for (int i=3;i<100;i=i+2) {
            int k=3;
            int c=0;
            while (k<i) {
                if (i%k== 0){
                    c=c+1;
                }
                k=k+2;//me ahorro los pares ya que solo dividen a pares
            }
            if (c == 0){
                System.out.println(i+" es un número primo");
            }
        }

    }
    // en el double recordar poner decimales con coma no con punto
    public static void dividirMayorMenor() {
        //Scanner sc= new Scanner(System.in);
        /*System.out.println("introduzca numero");
        double num1 = sc.nextDouble();
        System.out.println("introduzca otro numero");
        double num2 = sc.nextDouble();*/
        float num1= Utilidades.introducirNumero((float)2.5);
        float num2= Utilidades.introducirNumero((float)2.5);
        if(num2>num1) {
            System.out.println(" la división  de "+num2+" entre "+num1+" es: " + (num2 / num1));
        }else {System.out.println(" la división  de "+num1+" entre "+num2+" es: "+(num1/num2));}
    }

    //cálculo del área de un triángulo
    public static void areaTriamgulo() {

        Scanner sc= new Scanner(System.in);
        System.out.println("introduzca la altura del triangulo");
        double altura = sc.nextDouble();
        System.out.println("introduzca la base del triangulo");
        double base = sc.nextDouble();
        System.out.println("El área del triangulo es: "+(base*altura)/2);
    }

    /* Ejercicio 1 del tema 5*/
    public static void fin() {
        String teclado;
        Scanner sc= new Scanner(System.in);
        do {
            System.out.println("introduzca lo que quiera, cuando quiera salir ponga FIN");
            teclado = sc.nextLine();
            System.out.println(teclado);
        }while(!teclado.equals("FIN"));
        System.out.println("Se cerró el programa");
    }
//suma los numeros enteros menores que un número introducido
    public static void sumaEnteros() {
        int n = Utilidades.introducirNumero(1);
        int aux=n;
        int suma=0;

        while (aux>0){
            suma=suma+aux;
            aux--;
        }
        System.out.println("El resultado de sumar los "+n+" primeros numeros enteros es: "+suma);
    }
//lee desde teclado numeros hasta que obtiene uno menor que 100
    public static void menorCien() {
        int num=Utilidades.introducirNumero(1);
        while(num>=100){
            num=Utilidades.introducirNumero(1);
        }
        System.out.println(num+" es menor que 100");
    }

    public static void contarPositivos() {
        int total=0;
        for (int i=1; i<=10;i++){
            int num=Utilidades.introducirNumero(1);
            if(num>0){
                total++;
            }
        }
        System.out.println("Se han introducido "+total+" numeros positivos");
    }

    public static void factorial() {
        int num=Utilidades.introducirNumero(1);
        int aux=num-1;
        int factorial=num;
        do {
            factorial=factorial*aux;
            aux--;
        }while(!(aux==1));
        System.out.println("el factorial de "+num+" es: "+factorial);
    }


    public static void mayorDeTres() {
        int num1=Utilidades.introducirNumero(1);
        int num2=Utilidades.introducirNumero(1);
        int num3=Utilidades.introducirNumero(1);
        if(num1>num2 && num1>num3){
            System.out.println("El mayor es: "+num1);
        }else{
            if (num2>num1 && num2>num3){
                System.out.println("El mayor es: "+num2);
            }else{
                System.out.println("El mayor es: "+num3);
            }
        }
    }

    public static void mostrarPares() {
        for(int i=1;i<=10;i++){
            if(i % 2 == 0){
            System.out.println(i+" es un numero par");
            }
        }
    }
    //tres intentos para obtener una contraseña (la clave es 111 222 y 333)
    public static void comprobarContrasenha() {
        int numIntentos=1;
        int password;
        do{
            if(numIntentos>1){
                System.out.println("Contraseña incorrecta vuelva a intentarlo");
            }
            password=Utilidades.introducirNumero(1);
            numIntentos++;
        }while(numIntentos<4 && !(password==222)&& !(password==111)&& !(password==333));
        if (numIntentos>3){
            System.out.println("Demasiados intentos erroneos");
        }else{
            System.out.println("La contraseña es correcta");
        }
    }

    //media aritmetica de 7 notas
    public static void mediaNotas() {
        float sumanotas=0;
        float nota;
        Scanner sc= new Scanner(System.in);
        for(int i=1;i<8;i++){
            System.out.println("introduzca nota");
            nota=sc.nextFloat();
            sumanotas= sumanotas+nota;
        }
        System.out.println("La nota de la asignatura es: "+(sumanotas/7));
    }
    //pide numeros hasta introducir 0, muestra en pantalla la suma y media de los introducidos
    public static void mediaSuma() {
        int contnum=0;
        int sumanum=0;
        int num;
        do{
            num=Utilidades.introducirNumero(1);
            sumanum=sumanum+num;
            contnum++;
        }while(!(num==0));
        System.out.println("La suma de números introducidos es: "+sumanum+" y la media es: "+sumanum/(contnum-1));
    }
    //es un aritnometro
    public static void cuatrOperaciones() {
        int num1=Utilidades.introducirNumero(1);
        int num2=Utilidades.introducirNumero(1);
        System.out.println("Suma: "+(num1+num2));
        System.out.println("Resta: "+(num1-num2));
        System.out.println("Multiplicación: "+(num1*num2));
        if (num2==0) {
            System.out.println("No se puede dividir enter cero");
        }else{
            System.out.println("Division: " + (num1 / num2));
        }
    }

    public static void coprobarMes() {
        int mes=Utilidades.introducirNumero(1);
        switch (mes) {
            case 1 -> System.out.println("Enero");
            case 2 -> System.out.println("Febrero");
            case 3 -> System.out.println("Marzo");
            case 4 -> System.out.println("Abril");
            case 5 -> System.out.println("Mayo");
            case 6 -> System.out.println("Junio");
            case 7 -> System.out.println("Julio");
            case 8 -> System.out.println("Agosto");
            case 9 -> System.out.println("Septiembre");
            case 10 -> System.out.println("Octubre");
            case 11 -> System.out.println("Noviembre");
            case 12 -> System.out.println("Diciembre");
            default -> System.out.println("Mes no valido");
        }
    }

    public static void calculadora() {
        double num1=Utilidades.introducirNumero(2.1);
        double num2=Utilidades.introducirNumero(2.1);
        int c;
        Scanner sc=new Scanner(System.in);
        do {
            System.out.println("Ha introducido: " + num1 + " y " + num2 + " indique que operación desea hacer");
            System.out.println("pulse 0 para salir");
            System.out.println("pulse 1 para sumar");
            System.out.println("pulse 2 para restar");
            System.out.println("pulse 3 para multiplicar");
            System.out.println("pulse 4 para dividir");
            c=sc.nextInt();
            switch (c) {
                case 1 -> System.out.println(num1 + "+" + num2 + "=" + (num1 + num2));
                case 2 -> System.out.println(num1 + "-" + num2 + "=" + (num1 - num2));
                case 3 -> System.out.println(num1 + "*" + num2 + "=" + (num1 * num2));
                case 4 -> System.out.println(num1 + "/" + num2 + "=" + (num1 / num2));
            }
        }while(c!=0);

    }

//tablas del 1 al 10
    public static void tablaMultiplicar() {
        for (int i=1;i<=10;i++){
            System.out.println("Tabla de :"+i);
            for(int n=1;n<=10;n++){
                System.out.println(i+"x"+n+"="+(i*n));
            }
        }
    }
//crear una aplicacion para solicitar notas numericas y muestra por pantalla equivalente
   // al final debera mostar la mayor nota en numero y letra
    public static void tratarNota() {
        int nota;
        int mejorNota=0;
        String suspenso="Suspenso";
        String aprobado="Aprobado";
        String bien="Bien";
        String notable="Notable";
        String sobresaliente= "Sobresaliente";
        do {
            System.out.println("Para salir pulse -10");
            nota=Utilidades.introducirNumero(1);
            switch (nota){
                case 1,2,3,4:
                    System.out.println(suspenso);
                    break;
                case 5:
                    System.out.println(aprobado);
                    break;
                case 6:
                    System.out.println(bien);
                    break;
                case 7,8:
                    System.out.println(notable);
                    break;
                case 9,10:
                    System.out.println(sobresaliente);
                    break;
                default:
                    System.out.println("Nota no valida");
                    break;
            }
            if (nota>mejorNota){
                mejorNota=nota;
            }
        }while(nota != -10);
        if (mejorNota<5){
        System.out.println("La nota es:"+mejorNota+" es un Suspenso");
        }
        if (mejorNota==5){
            System.out.println("La nota es:"+mejorNota+" es un Aprobado");
        }
        if(mejorNota==6){
            System.out.println("La nota es:"+mejorNota+" es un Bien");
        }
        if(6<mejorNota && mejorNota<9){
            System.out.println("La nota es:"+mejorNota+" es un Notable");
        }
        if(mejorNota==9||mejorNota==10){
            System.out.println("La nota es:"+mejorNota+" es un Sobresaliente");
        }



    }
//adivinar un numero la aplicacion genra de 1 a 100 pide y dice si es menor o mayor que el introducido ademas de los
    //intentos que te quedan tienes 10 intentos, al acertar y intentos que llegan
    public static void adivinarNumeros() {
        int aleatorio= (int)(Math.random()*101);
        int n=1;
        int num=1000;
        do {
            num=Utilidades.introducirNumero(1);
            if (num>aleatorio){
                System.out.println(num+" es mayor que el numero a adivinar");
            }
            if (num<aleatorio){
                System.out.println(num+" es menor que el numero a adivinar");
            }
            n=n+1;
        }while (n<10 && !(num==aleatorio));
        if (num==aleatorio) {
            System.out.println("Felicidades has acertado el múmero era: " + num+" te quedaban "+(11-n)+" intentos");
        }
        if (n>=10){
            System.out.println("has consumido tus intentos el numero era: "+aleatorio);
        }
    }
    //salarial neta de obreros 35 primeras a 30 euros, las extras aumentan un 50%, si el sueldo menor de 1000
// es libre de impuestos si no un 20%
    public static void nomina() {
        int sueldo=30;
        double horas=Utilidades.introducirNumero(2.1);
        double bruto=0,neto=0;
        if(horas<35){ bruto=(sueldo*horas);}
        if (horas>35){ bruto=(sueldo*35)+((horas-35)*sueldo*1.5);}
        if (bruto<1000){neto=bruto;}
        if (bruto>1000 || bruto==1000){
            neto=bruto*0.8;
        }
        System.out.println("el obrero cobrara: "+neto+" euros netos");
        System.out.println(bruto+" es su base de cotizacion y se le descuenta: "+(bruto-neto));

    }


    public static void paresImpares() {
        int suma,sumapares,sumaImpares,contImpares,contPares,aux,num;
        suma= 0;
        sumaImpares=0;
        sumapares=0;
        contPares=0;
        contImpares=0;
        for (aux=1;aux<11;aux++){
            num=Utilidades.introducirNumero(1);
            suma=suma+num;
            if(num % 2==0){
                sumapares=sumapares+num;
                contPares++;
                    }else{
                sumaImpares=sumaImpares+num;
                contImpares++;
            }
        }
        System.out.println("La media de los impares es: "+sumaImpares/contImpares);
        System.out.println("La suma de los pares es: "+sumapares);
        System.out.println("Se han introducido "+contPares+" numeros pares");
        System.out.println("La suma total es: "+suma);
    }

    public static void multiplosTres() {
        int contador=1,contMult=0;
        int num=Utilidades.introducirNumero(1);
        do{
            if(contador % 3 ==0){
                System.out.println(contador);
                contMult++;
            }
            contador++;
        }while(contador<=num);
        System.out.println("Se han encontrado "+contMult+" multiplos de 3");
    }

    public static void mayorMenorSerie() {
        int mayor=0,menor=99999, num;
        do{
            num=Utilidades.introducirNumero(1);
            if(num != -1){
                if(num>mayor){
                    mayor=num;
                }else{
                    if(num<menor){
                        menor=num;
                    }
                }
            }
        }while(!(num==-1));
        System.out.println("El mayor es: "+mayor+" y el menor es: "+menor);
    }

    public static void paresImparesRango() {
        int prodImpares=1, contPares=0,cont=0;
        int num1=Utilidades.introducirNumero(1);
        int num2=Utilidades.introducirNumero(1);
        for (int aux=num1+1;aux<num2;aux++){
            cont++;
            if(aux % 2 ==0){
                contPares++;
            }else{prodImpares=prodImpares*aux;}
            System.out.println(aux);
        }
        System.out.println("El producto de los impares es: "+prodImpares);
        System.out.println("Se han encontrado "+contPares+"numeros pares en ese rango");
        System.out.println("Se han encontrado "+cont+" numeros en ese rango");
    }

    public static void convertirHoras() {
        int horas,minutos;
        int seg=Utilidades.introducirNumero(1);
        horas=(int)(seg/3600);
        int segundos= seg % 3600;
        minutos=(int)(segundos/60);
        segundos= seg % 60;
        System.out.println("Horas: "+horas+", minutos: "+minutos+", segundos: "+segundos);
    }

    public static void calculoSueldo() {
        int bruto=Utilidades.introducirNumero(1);
        double descuento;
        if(bruto<=1000){
            descuento= (bruto*0.1);
        }else{
            if(bruto>1000 && bruto<=2000){
                descuento=100+(bruto-1000)*0.05;
            }else{descuento=100+(bruto-1000)*0.03;}
        }
        System.out.println("Descuento: "+descuento);
        System.out.println("Sueldo neto: "+(bruto-descuento));
    }
//suma de los digitos de un numero
    public static void sumaDigitos() {
        int num=Utilidades.introducirNumero(1);
        int suma=0, resto, num1=num;
        String intermedio= Integer.toString(num);
        int digitos= intermedio.length();
        for (int i=1;i<=digitos;i++){
            resto=(num % 10);
            suma=suma+resto;
            num=(int)num/10;
        }
        System.out.println(suma+" es la suma de los digitos de: "+num1);
    }
}

