package USTA.fis;
/* Author: Jorge Daniel Ramírez Nieves
Date: April/29/2021
Description: This program will calculate with arrays the fibonacci number*/

import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        p_show_info_program();
        System.out.println("Welcome to Fibonacci Software. Please, insert the limit of dates that you want see of Fibonacci series:");
        int v_limit = keyboard.nextInt();
        int[] v_fibonacci;
        v_fibonacci= series_fibonacci(v_limit);
        System.out.println("Fibonacci Series to " + v_limit);
        for(int i=0;v_fibonacci[i]!=-1;i++){
            System.out.print(v_fibonacci[i] + ", ");
        }
    }

    public static int []series_fibonacci(int v_limit){
        int[] v_fibonacci = new int[100];
        v_fibonacci[0] = 0;
        v_fibonacci[1] = 1;
        for (int i=1; (v_fibonacci[i-1]+v_fibonacci[i]) < v_limit;i++){
            v_fibonacci[i+1] = v_fibonacci[i-1] + v_fibonacci[i];
            v_fibonacci[i+2] = -1;
        }
        return v_fibonacci;
    }

        public static void p_show_info_program() {
            System.out.println("╔═════════════════════════════════╗");
            System.out.println("         SoftFibonacciV1.0         ");
            System.out.println("   Maker: Jorge Daniel Ramírez N.   ");
            System.out.println("      Date: April / 29 / 2021      ");
            System.out.println("╚═════════════════════════════════╝");
        }
}