package USTA.fis;
/*AUTHOR: Jorge Daniel Ramírez Nieves
Date: 16 / March / 2021
DESCRIPTION: The software show variable than input by world. I should import the util scanner [Keyboard allow] */
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("--------------------------------------------"); //System.out.println para mostrar texto
        System.out.println("InputNumber-Soft | V1.0");
        System.out.println("Maker: Jorge Daniel Ramírez Nieves");
        System.out.println("--------------------------------------------");

        Scanner keyboard = new Scanner(System.in); //Llamar teclado para aceptarlo

        int v_n1, v_n2, v_sum;
        System.out.println("Input the first number:"); v_n1 = keyboard.nextInt();
        System.out.println("Input the second number:"); v_n2 = keyboard.nextInt();
        v_sum = v_n1 + v_n2;

        System.out.println("The total sum is "+v_sum); //Se usa + para llamar una variable
    }
}
