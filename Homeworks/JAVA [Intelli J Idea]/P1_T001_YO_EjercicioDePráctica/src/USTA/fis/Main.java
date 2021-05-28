package USTA.fis;

import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
    float v_average=0; float y = 0;

    System.out.println("Type/input the quantity of grades that you want to insert: ");
    int v_cant_grades = keyboard.nextInt();
    while (v_cant_grades<4){
        System.err.println("El número ingresado es incorrecto, digítelo de nuevo");
        v_cant_grades = keyboard.nextInt();
    }
    float[] grades = new float[v_cant_grades];
    System.out.println("Ingrese las notas");

    for (int i=0;i<grades.length;i++){
        grades[i]=keyboard.nextFloat();
        if(i==0){
            v_average += (float) (grades[0]*0.2);
        }
        if(i==1){
            v_average += (float)(grades[1]*0.3);
        }
        if(i==2){
            v_average += (float)(grades[2]*0.1);
        }
        if(i>2){
            y += grades[i];
        }
    }
    y = y/(v_cant_grades-3);
    v_average += (float) (0.4*y);
    System.out.println("El promedio es: "+v_average);
    }
}