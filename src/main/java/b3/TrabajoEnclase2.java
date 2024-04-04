package b3;

import java.util.Scanner;

public class TrabajoEnclase2 {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.println("escriba numero 1 ");
        int num1= scanner.nextInt();
        System.out.println("escriba numero 2");
        int num2= scanner.nextInt();

        int suma = num1+num2;
        int resta = num1-num2;
        int multiplicacion = num1*num2;
        double div = num1/num2;

        System.out.println("suma =  : "+suma);
        System.out.println("resta =  : "+resta);
        System.out.println("multiplicacion =  : "+multiplicacion);
        System.out.println("divicion =  : "+div);


    }
}
