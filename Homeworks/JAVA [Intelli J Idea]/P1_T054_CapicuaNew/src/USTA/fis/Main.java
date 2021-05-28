package USTA.fis;

import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	Scanner keyboard = new Scanner(System.in);
	int v_cantidad_de_numeros;

	System.out.println("Digite la cantidad de digitos que tiene su numero");
    v_cantidad_de_numeros=keyboard.nextInt();

    int[] array = new int[v_cantidad_de_numeros];

        for (int i=0; i<v_cantidad_de_numeros; i++){
            System.out.println("Ingrese el digito "+(i+1));
            array[i]=keyboard.nextInt();
            while (array[i]<0){
                System.err.println("Ingrese el número de nuevo"+(i+1));
                array[i]=keyboard.nextInt();
            }
        }
        if(capicua(array, v_cantidad_de_numeros)){
            System.out.println("El número digitado es capicua");
        }
        else{
            System.out.println("El número digitado no es capicua");
        }
    }

    public static boolean capicua(int[] array, int v_cantidad_de_numeros){
        for (int i=0, j=(v_cantidad_de_numeros-1); i<j; i++,--j){
            if(array[i]!=array[j]){
                return false;
            }
        }
        return true;
    }
}