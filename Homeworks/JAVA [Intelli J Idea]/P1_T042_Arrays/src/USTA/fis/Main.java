package USTA.fis;
/* Author: Jorge Daniel Ramírez Nieves
Date: April/23/2021
Description: The software can calculate the average of n grades with arrays and internal operations*/

import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		p_show_info_program();
		int counter; float v_average = 0; float v_grade = 0; float v_zero=0;
		System.out.println("Welcome. How many grades do you want to insert?");
		int v_n_grades = keyboard.nextInt();

		while (v_n_grades <= 0) {
			System.err.println("Remember! The numbers of grades should be greater than 0 and integers.");
			v_n_grades = keyboard.nextInt();
		}
		float[] p_array_or_vector = new float[v_n_grades];

		System.out.println("Now, enter your note values in order. Remember, the first grade is equal to 10% of your final grade; second grade is 30% and the other grades are equal to 60% of final grade:");
		for (counter = 0; counter < v_n_grades; counter++) {
			p_array_or_vector[counter] = keyboard.nextFloat();
			if (v_n_grades == 1) {
				v_zero = p_array_or_vector[counter];
			}
			if (v_n_grades == 2) {
				if (counter == 0) {
					v_average = (float) (v_average + p_array_or_vector[counter] * 0.25);
				}
				if (counter == 1) {
					v_average = (float) (v_average + p_array_or_vector[counter] * 0.75);
				}
			}
			if (v_n_grades > 2) {
				if (counter == 0) {
					v_average = (float) (v_average + (p_array_or_vector[counter] * 0.1));
				}
				if (counter == 1) {
					v_average = (float) (v_average + (p_array_or_vector[counter] * 0.3));
				}
				if (counter >= 2) {
					v_grade += p_array_or_vector[counter];
				}
			}
		}

		v_grade=v_grade/(counter-2);
		if(v_n_grades==1){
			v_average=v_zero;
		}
		else{
			v_average = (float) (v_average + (v_grade * 0.6));
		}

			System.out.println("Your grades in the Term are:");
			for (counter = 0; counter < p_array_or_vector.length; counter++) {
				if (counter == 0) {
					System.out.println("Grade 1 [10%]: " + p_array_or_vector[counter] + ".");
				}
				if (counter == 1) {
					System.out.println("Grade 2 [30%]: " + p_array_or_vector[counter] + ".");
				}
				if (counter>1) {
					System.out.println("Grade " + (counter + 1) + ": " + p_array_or_vector[counter] + ".");
				}
			}
			System.out.println("The final grade of your Term is: " +v_average+ ".");
		}

	public static void p_show_info_program(){
		System.out.println("╔══════════════════════════════╗");
		System.out.println("         SoftArrayV1.1          ");
		System.out.println(" Maker: Jorge Daniel Ramírez N. ");
		System.out.println("     Date: April / 23 / 2021    ");
		System.out.println("╚══════════════════════════════╝");
	}
}