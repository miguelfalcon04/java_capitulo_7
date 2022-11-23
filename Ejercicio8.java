/* Ejercicio 8
Realiza un programa que pida la temperatura media que ha hecho en cada mes
de un determinado año y que muestre a continuación un diagrama de barras
horizontales con esos datos. Las barras del diagrama se pueden dibujar a base
de asteriscos o cualquier otro carácter. 
@author: miguelfalcon
*/

import java.util.Scanner;;
public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] temp=new int[12];

        for(int i=0; i<=11;i++){
            System.out.print("Introduzca la temperatura del mes "+(i+1)+": ");
            int temperatura=sc.nextInt();
            temp[i]=temperatura;
        }

        for(int i=0; i<=11;i++){
            System.out.print("Mes "+(i+1)+": ");
            for(int j=0;j<temp[i];j++){
                System.out.print("*");
            }
            System.out.println("");
        }




        sc.close();
    }
}
