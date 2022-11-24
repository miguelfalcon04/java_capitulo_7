/* Ejercicio 7
Escribe un programa que genere 100 números aleatorios del 0 al 20 y que los
muestre por pantalla separados por espacios. El programa pedirá entonces por
teclado dos valores y a continuación cambiará todas las ocurrencias del primer
valor por el segundo en la lista generada anteriormente. Los números que se
han cambiado deben aparecer entrecomillados. 
@author: miguelfalcon
*/
import java.util.Scanner;
public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] n = new int[100]; 

        for(int i=0;i<=99;i++){
            int nrandom = (int)(Math.random()*21);
            n[i]=nrandom;
        }

        for(int i=0;i<=99;i++){
            System.out.print(n[i]+" ");
        }

        System.out.println("");

        System.out.print("Introduzca su primer valor: ");
        int[] prmvalor=new int[1];
        int prvalor=sc.nextInt();
        prmvalor[0]=prvalor;
        System.out.print("Introduzca su segundo valor: ");
        int[] sgdvalor=new int[1];
        int sgvalor=sc.nextInt();
        sgdvalor[0]=sgvalor;

        for(int i=0;i<=99;i++){
            if(n[i]==prmvalor[0]){
                System.out.print("'"+sgdvalor[0]+"' ");
            }else if(n[i]==sgdvalor[0]){
                System.out.print("'"+prmvalor[0]+"' ");
            }else{
                System.out.print(n[i]+" ");
            }
        }






        sc.close();
    }
}
