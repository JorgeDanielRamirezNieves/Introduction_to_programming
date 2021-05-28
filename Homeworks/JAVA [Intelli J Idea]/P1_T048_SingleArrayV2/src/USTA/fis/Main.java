package USTA.fis;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int [] mySingleArray;
		int size;
		int i=0;
		int grade = 0;
		float averageResult =0;
		int j=0;
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Please type the size for single array");
		size= keyboard.nextInt();
		mySingleArray = new int[size];
		System.out.println("Please type the grades that you know the average");

		while (i< mySingleArray.length){
			System.out.println("Pleasee type the "+(i+1)+"grade");// es i +1 por lo que i empieza en 0
			grade = keyboard.nextInt();
			mySingleArray[i] = grade;
			i++;
		}
		//call to calculateAverag
		averageResult=calculateAverage(mySingleArray);
		//show result with system.out.println
		for (j = 0; j<mySingleArray.length; j++ ){
			System.out.print(mySingleArray[j]+",");
		}
		System.out.println("Your average grades are: "+sumatory(mySingleArray));
		System.out.println("Your average grades is:"+averageResult);
	}
	public static int sumatory (int [] mySingleArray){
		int counter= 0, sum=0;
		while(counter<mySingleArray.length){
			sum = sum + mySingleArray[counter];
			counter++;
		}
		return sum;
	}
	public static float calculateAverage(int [] mySingleArray){

		float average = 0;
		int sum=0;
		sum = sumatory(mySingleArray);

		average=sum/mySingleArray.length;
		return average;
	}
}
/*
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	int size; int i=0; float v_grades=0;
	Scanner keyboard = new Scanner(System.in);
	p_show_info_program();
	System.out.println("Please, type the size for single array");
	size = keyboard.nextInt();
	while(size<1){
	    System.out.println("Remember! The size should be greater than 0");
        size = keyboard.nextInt();
	}
	float[] mySingleArray= new float[size];
    System.out.println("Please, type the grades that you want to average");
    while(i<mySingleArray.length){
	    System.out.println("Grade "+(i+1));
	    mySingleArray[i]=keyboard.nextFloat();
	    while(mySingleArray[i]<0){
	        System.err.println("Wow... You can't insert a negative grade, right? Please, type the grade "+(i+1)+" again.");
	        mySingleArray[i]=keyboard.nextFloat();
        }
	    v_grades+=mySingleArray[i];
        i++;
    }
    System.out.println("");
    System.out.println("The average is: "+v_grades/size);
    }

	public static void p_show_info_program(){
		System.out.println("╔═════════════════════════════════╗");
		System.out.println("        SoftSingleArrayV1.2        ");
		System.out.println("   Maker: Jorge Daniel Ramírez N.   ");
		System.out.println("       Date: May / 10 / 2021       ");
		System.out.println("╚═════════════════════════════════╝");
	}
}

        for (j = 0; j<mySingleArray.length; j++ ){
            System.out.print(mySingleArray[j]+",");
        }
        System.out.println("Your average grades are: "+sumatory(mySingleArray));
        System.out.println("Your average grades is:"+averageResult);
    */