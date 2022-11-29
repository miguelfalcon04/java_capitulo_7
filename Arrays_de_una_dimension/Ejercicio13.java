/* Ejercicio 13
Escribe un programa que rellene un array de 100 elementos con números enteros aleatorios comprendidos entre 0 y 500 (ambos incluidos). A continuación
el programa mostrará el array y preguntará si el usuario quiere destacar el
máximo o el mínimo. Seguidamente se volverá a mostrar el array escribiendo
el número destacado entre dobles asteriscos.
*/

import java.util.Scanner;
public class Ejercicio13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] n = new int[100];
        int max=0;
        int min=501;

        for(int i=0; i<100;i++){
            n[i]=(int)(Math.random()*501);
        }

        for(int i=0; i<100; i++){
            System.out.print(n[i]+" ");
            if(n[i]>max){
                max=n[i];
            }
            if(n[i]<min){
                min=n[i];
            }
        }

        System.out.println();
        System.out.print("Quieres destacar el máximo o el mínimo: ");
        String opcion= sc.next();

        System.out.println();
        if(opcion.equals("maximo")){
            for(int i=0; i<100;i++){
                if(n[i]!=max){
                    System.out.print(n[i]+" ");
                }else{
                    System.out.print("** "+max+" ** ");
                }
            }
        }

        if(opcion.equals("minimo")){
            for(int i=0; i<100;i++){
                if(n[i]!=min){
                    System.out.print(n[i]+" ");
                }else{
                    System.out.print("** "+min+" ** ");
                }
            }
        }

        sc.close();
    }
}
