package USTA.fis;
/* Author: Jorge Daniel Ramírez Nieves
Date: May/03/2021
Description: This program will calculate with arrays the fibonacci number*/

import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int i=0;
        p_show_info_program();
        System.out.println("Welcome to Fibonacci Software. Please, insert the limit number that you want to see in Fibonacci series:");
        int v_limit = keyboard.nextInt();

        int[] v_fibonacci =p_fibonacci_series(v_limit);
        System.out.println("Fibonacci Series up to " + v_limit);
        while(v_fibonacci[i]!=-1) {
            if (v_fibonacci[i + 1] != -1) {
                System.out.print(v_fibonacci[i] + ", ");
            } else {
                System.out.print(v_fibonacci[i]);
            }
            i++;
        }
    }

    public static int[] p_fibonacci_series(int v_limit) {
        int[] v_fibonacci = new int[100];
        v_fibonacci[0] = 0; v_fibonacci[1] = 1; int i = 1; int j = 0;
        while ((v_fibonacci[i - 1] + v_fibonacci[i]) < v_limit) {
            v_fibonacci[i + 1] = v_fibonacci[i - 1] + v_fibonacci[i];
            v_fibonacci[i + 2] = -1;
            i++;
        }
        return v_fibonacci;
    }

    public static void p_show_info_program() {
        System.out.println("╔═════════════════════════════════╗");
        System.out.println("         SoftFibonacciV1.1         ");
        System.out.println("   Maker: Jorge Daniel Ramírez N.   ");
        System.out.println("       Date: May / 03 / 2021       ");
        System.out.println("╚═════════════════════════════════╝");
    }
}