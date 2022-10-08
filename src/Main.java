import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int c;
        Scanner sc=new Scanner(System.in);

       do {
           System.out.println("seleccione metodo a usar; 0 salir 1 tabla 2 mayormenor 3 entredos 4 primo");
           c = sc.nextInt();
           switch (c) {

               case 1:
                   tabla();
                   break;
               case 2:
                   mayormenor();
                   break;
               case 3:
                   entredos();
                   break;
               case 4:
                   primo();
                   break;
           }
       }while(c!=0);


    }
    /*dos múmeros*/
    private static void entredos() {
        Scanner sc=new Scanner(System.in);
        int mayor,menor,pares,num1,num2,pimpares;
        pares=0;
        pimpares=1;
        System.out.println("Introduzca un número");
        num1=sc.nextInt();
        System.out.println("Introduzca un número");
        num2=sc.nextInt();
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
        Scanner sc=new Scanner(System.in);
        while (n!=-1){
            System.out.println("introduzca un número");
            n=sc.nextInt();
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


}