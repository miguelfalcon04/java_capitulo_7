/* Ejercicio 1
Define un array de 12 números enteros con nombre num y asigna los valores
según la tabla que se muestra a continuación. Muestra el contenido de todos
los elementos del array. ¿Qué sucede con los valores de los elementos que no
han sido inicializados? */

public class Ejercicio2 {
    public static void main(String[] args) {

        char[] simbolo = new char[9];

        simbolo[0]='a';
        simbolo[1]='x';
        simbolo[4]='@';
        simbolo[6]='"';
        simbolo[7]='+';
        simbolo[8]='Q';

        for(int i=0; i<9;i++){
            System.out.print(simbolo[i]+" ");
        }
        
    }
}
//En los valores no inicializados se pinta un espacio en blanco
