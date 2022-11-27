/* Ejercicio 3
Escribe un programa que lea 10 números por teclado y que luego los muestre
en orden inverso, es decir, el primero que se introduce es el último en mostrarse
y viceversa.
*/

import java.util.Scanner;
public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] n=new int[10];

        for(int i=0; i<=9;i++){
            System.out.print("Introduzca su numero: ");
            int num =sc.nextInt();
            n[i]=num;
        }
        for(int i=9; i>=0;i--){
            System.out.print(n[i]+" ");
        }

        sc.close();
    }
}
