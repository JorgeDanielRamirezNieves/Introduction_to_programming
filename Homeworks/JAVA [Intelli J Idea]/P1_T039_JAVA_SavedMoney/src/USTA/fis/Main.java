package USTA.fis;
/* Author: Jorge Daniel Ramírez Nieves
Date: March/25/2021
Description: This software calculate the saved money if a person saves 15% of his/her salary per month*/

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        p_show_info_program();
        int v_total_saved=0;
        for (int i=1;i<=12;i=i+1) {
            System.out.println("----Month: "+i+"----");
            v_total_saved=v_total_saved+p_user_save_money();
        }
        System.out.println("The total money saved is: "+v_total_saved+" COP");
    }
    public static void p_show_info_program(){
        System.out.println("╔══════════════════════════╗");
        System.out.println("SoftSavedMoney V1.0");
        System.out.println("Maker: Jorge D. Ramírez N.");
        System.out.println("Date: March / 25 / 2021");
        System.out.println("╚══════════════════════════╝");
    }
    public static int p_user_save_money() {
        //DESCRIPTION: This method return the money saved
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Input/Type the saved money in the month: ");
        int v_saved_money = keyboard.nextInt();
        while(v_saved_money<0) {
            System.err.println("ERR: You saved money can't be less than 0");
            v_saved_money=keyboard.nextInt();
        }
        return v_saved_money;
    }
}