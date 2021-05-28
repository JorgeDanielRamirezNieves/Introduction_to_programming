package USTA.fis;
/* Author: Jorge Daniel Ramírez Nieves
Date: May/05/2021
Description: This program will calculate the basic arithmetics operations with 2 variables (numbers) and */

import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        float v_number1; float v_number2 = 0; float v_total=0; int v_operation;
        Scanner keyboard = new Scanner(System.in);
        p_show_info_program();

        System.out.println("Select an option. 0[Exit]; 1[Addition]; 2[Subtraction]; 3[Multiplication]; 4[Division]; 5[Prime Numbers]");
        v_operation=keyboard.nextInt();
        if(v_operation!=0){
            while (v_operation<0 || v_operation>5) {
                System.err.println("Remember, the number should be between 1 - 5 and be an integer");
                v_operation = keyboard.nextInt();
            }
            System.out.println("Welcome. Please, type/input the number you want to insert for this software.");
            v_number1 = keyboard.nextFloat();
            if (v_operation!=5) {
                System.out.println("Now, input the second number you want to insert for this software.");
                v_number2 = keyboard.nextFloat();
            }
            v_total=operationCalc(v_number1, v_number2, v_operation);
        }
         System.out.println("The result is: "+v_total);

    }
    public static float operationCalc(float v_number1, float v_number2, int operation){
        String v_convert;

        if (operation==1){
            return v_number1+v_number2;
        }
        if (operation==2){
            return v_number1-v_number2;
        }
        if (operation==3){
            return v_number1*v_number2;
        }
        if (operation==4&&v_number2!=0){
            return v_number1/v_number2;
        }
        if (operation==5){
            v_convert = "The result is a compound number";
            if (p_validate_prime(v_number1)){
                v_convert= "The result is a prime number";
            }
            System.out.println(v_convert);
            return v_number1;
        }
        return 0;
    }
    public static boolean p_validate_prime (float v_number1){
        int numbers_divide=0;
        for (int i=1;i<=v_number1;i++){
            if (v_number1%i==0){
                numbers_divide++;
            }
        }
        return numbers_divide == 2;
    }


    public static void p_show_info_program(){
        System.out.println("╔═════════════════════════════════╗");
        System.out.println("      SoftBasicCalculatorV1.2      ");
        System.out.println("   Maker: Jorge Daniel Ramírez N.   ");
        System.out.println("       Date: May / 10 / 2021       ");
        System.out.println("╚═════════════════════════════════╝");
    }
}