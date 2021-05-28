package USTA.fis;
/* Author: Jorge Daniel Ramírez Nieves
Date: March / 25 / 2021
Description: This software calculate the time (t = d/v) between two cities */

import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        p_show_info_program();
        //calculate TIME = Distance / Velocity
        float v_time=0; //Será decimal [float / double], cada variable usa un espacio en RAM, float menor a double
        int v_distance=p_user_distance();   int v_velocity=p_user_velocity();
        v_time = v_distance/v_velocity;
        System.out.println("The time between two cities is: "+v_time+" hours");
    }
    public static void p_show_info_program(){
        System.out.println("╔══════════════════════════╗");
        System.out.println("SoftCalculateTime V1.0");
        System.out.println("Maker: Jorge D. Ramírez N.");
        System.out.println("Date: March / 25 / 2021");
        System.out.println("╚══════════════════════════╝");
        }
        public static int p_user_distance() {
        //DESCRIPTION: This method return the distance than user input
            Scanner keyboard = new Scanner(System.in); //Instanciamos la librería
            System.out.println("Input/type the distance (km) between two cities");
            int v_distance = keyboard.nextInt();
            while(v_distance<0){
                System.err.println("ERR: The distance should be greater than zero. Please, input again the distance");
                v_distance = keyboard.nextInt();
            }
            return v_distance;
        }
        public static int p_user_velocity() {
        //DESCRIPTION: This method return the distance than user input
            Scanner keyboard = new Scanner(System.in); //Instanciamos la librería
            System.out.println("Input/type the velocity (km/h) between two cities");
            int v_velocity = keyboard.nextInt();
            while(v_velocity<=0){
                System.err.println("ERR: The velocity should be greater than zero. Please, input again the distance");
                v_velocity = keyboard.nextInt();
        }
        return v_velocity;
    }
}