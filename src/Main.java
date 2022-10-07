public class Main {
    public static void main(String[] args) {
   System.out.print(primo());
    }

    /*este primer metodo obtiene los numeros primos menores que 100*/
    public static String primo() {

        System.out.println ("1");
        System.out.println ("2");
        for (int i=3;i<100;i=i+2) {
            int n=3;
            int c=0;
            while (n<i) {
                if (i%n== 0){
                    c=c+1;
                }
                n=n+2;
            }
            if (c == 0){
                System.out.println(i+" es un número primo");
            }
        }
        return "estos son los números primos menores que 100";
    }

    
}