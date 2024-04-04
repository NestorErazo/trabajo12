package b3;

import java.util.Scanner;

public class EntradaConsola {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("escriba su nombre");
        String nombre= scanner.next();
        System.out.println("escriba su edad ");
        String edad= scanner.next();
        System.out.println("su nombres es : "+nombre);
        System.out.println("su edad es : "+edad);

    }
}
