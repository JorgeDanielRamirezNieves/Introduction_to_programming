package USTA.fis;
/* Author: Luis Miguel Romero Benitez, Juan José Torres Mojica, Jorge Daniel Ramírez Nieves
Date: March/26/2021
Description: Parcial 1*/

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        p_show_info_program();
        int v_total_height=0;
        for (int i=1;i<=5;i=i+1) {
            System.out.println("----Children: "+i+"----");
            v_total_height=v_total_height+p_user_height();
        }
        float v_average_height=v_total_height / 5;
        System.out.println("The average height of 5 children is: "+v_average_height+" cm.");
    }
    public static void p_show_info_program(){
        System.out.println("╔════════════════════════════════════════════════════════════════════════╗");
        System.out.println("                 SoftAverageHeight [Parcial 1] V1.0                       ");
        System.out.println("Maker: Luis Miguel Romero B., Juan José Torres M., Jorge Daniel Ramírez N.");
        System.out.println("                       Date: March / 26 / 2021                       ");
        System.out.println("╚════════════════════════════════════════════════════════════════════════╝");
    }
    public static int p_user_height() {
        //DESCRIPTION: This method return the height
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Input/Type height (cm): ");
        int v_height = keyboard.nextInt();
        while(v_height<50||v_height>200) {
            System.err.println("ERR: The height should be greater than 50cm and can't be less 200cm");
            v_height=keyboard.nextInt();
        }
        return v_height;
    }
}
