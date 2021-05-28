package USTA.fis;

import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	    Scanner keyboard=new Scanner(System.in);
		p_show_info_program();
	    System.out.println("Welcome. Please, type / input the quantity of values that you want");
		int n_sub_var=keyboard.nextInt();
	    while(n_sub_var<1){
	        System.out.println("Oh... We've a problem. The number should be greater than 0. Please, type again");
            n_sub_var=keyboard.nextInt();
	    }
        int[] array =new int[n_sub_var];
	    for (int i=0; i<array.length; i++){
	        System.out.println("Type/input the value n°"+(i+1)+". Remember, the number should be an odd number");
	        array[i]=keyboard.nextInt();
	        while(array[i]%2!=1){
	            System.err.println("ERR: The number is a even. Please, type/input the value n°"+(i+1)+" again.");
	            array[i]=keyboard.nextInt();
            }
        }
	    for (int i=0; i<array.length; i++){
	        System.out.println("The value of number "+(i+1)+" is: "+array[i]);
        }
    }

	public static void p_show_info_program(){
		System.out.println("╔═════════════════════════════════╗");
		System.out.println("           SoftArrayV1.2           ");
		System.out.println("   Maker: Jorge Daniel Ramírez N.   ");
		System.out.println("       Date: May / 10 / 2021       ");
		System.out.println("╚═════════════════════════════════╝");
	}
}
