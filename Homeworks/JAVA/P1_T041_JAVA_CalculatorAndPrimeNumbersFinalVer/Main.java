package USTA.fis;
/* Author: Jorge Daniel Ramírez Nieves
Date: April/15/2021
Description: This program will calculate the basic arithmetics operations with 2 variables (numbers)*/

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        p_show_info_program();
        p_user_number();
    }
    public static void p_show_info_program() {
        System.out.println("╔═════════════════════════════════╗");
        System.out.println("      SoftBasicCalculatorV1.0      ");
        System.out.println("   Maker: Jorge Daniel Ramírez N.   ");
        System.out.println("      Date: April / 15 / 2021      ");
        System.out.println("╚═════════════════════════════════╝");
    }
    public static void p_user_number() {
        //DESCRIPTION: This method returns the numbers that the user chooses
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Welcome. Please, type/input the first number that you want to insert for this software.");
        float v_number1 = keyboard.nextFloat();
        System.out.println("Now the second number that you want to insert for this software.");
        float v_number2 = keyboard.nextFloat();
        System.out.println("Now, choose the arithmetic operation you want to perform; your selection should be an integer");
        System.out.println("1- Addition");
        System.out.println("2- Subtraction");
        System.out.println("3- Multiplication");
        System.out.println("4- Divison");
        int v_system = keyboard.nextInt();
        float v_total = 0;
             while (v_system<1 || v_system>4) {
                 System.err.println("Remember, the number should be between 1 - 4 and be an integer");
                 v_system = keyboard.nextInt();
        }
        switch (v_system) {
            Scanner keyboard = new Scanner(System.in);
            case 1 -> v_total = v_number1 + v_number2;
            case 2 -> v_total = v_number1 - v_number2;
            case 3 -> v_total = v_number1 * v_number2;
            case 4 -> while (v_number_two == 0) {
                System.err.println("Error the numbers entered are incorrect please type it again "); v_number2 = keyboard.nextFloat();
            } v_total = v_number1 / v_number2;
            default -> System.out.println("Oh no, we've a problem. Please, insert again the number. Remember, your selection should be an integer");
        }
        System.out.println("The answer is: "+v_total+".");
    }
}