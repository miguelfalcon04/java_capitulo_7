/* Ejercicio 9
Realiza un programa que pida 8 números enteros y que luego muestre esos
números junto con la palabra “par” o “impar” según proceda. */

import java.util.Scanner;
public class Ejercicio9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int [] n= new int[8];

        for(int i=0;i<8;i++){
            System.out.print("Introduzca un número: ");
            n[i]=sc.nextInt();
        }

        System.out.println("");

        for(int i=0;i<8;i++){
            if(n[i]%2!=0){
                System.out.println(n[i]+" impar");
            }else{
                System.out.println(n[i]+" par");
            }
        }

        sc.close();
    }
}
