/* Ejercicio 5
Escribe un programa que pida 10 números por teclado y que luego muestre los
números introducidos junto con las palabras “máximo” y “mínimo” al lado del
máximo y del mínimo respectivamente.
@author: miguelfalcon
 */

import java.util.Scanner;
public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int max=0;
        int min=999999999;

        int[] n = new int[10];

        for(int i=0; i<=9;i++){
            System.out.print("Introduzca su numero: ");
            int num = sc.nextInt();
            if(num>max){
                max=num;
            }
            if(num<min){
                min=num;
            }
            n[i]=num;
        }

        for(int i=0; i<=9;i++){
            if(n[i]==max){
                System.out.println(n[i]+" máximo");
            }else if(n[i]==min){
                System.out.println(n[i]+" mínimo");
            }else{
                System.out.println(n[i]);
            }
        }
        sc.close();
    }
}
