package USTA.fis;

import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Welcome, type/digit the total digits that you want in your number:");
        int v_capicua = keyboard.nextInt();
        while(v_capicua<=1){
            System.err.println("ERR: Please, type again the total digits of your number because that variable should be greater than 1");
            v_capicua=keyboard.nextInt();
        }
        int[] a_CapicuaNum = new int[v_capicua];
        for (int i=0;i<a_CapicuaNum.length; i++){
            System.out.println("Please type / input the digit n°"+(i+1)+":");
            a_CapicuaNum[i]=keyboard.nextInt();
            if(i==0){
                while(a_CapicuaNum[i]<=0){
                    System.err.println("ERR: Please, type again the digit because the number should be greater than zero:");
                    a_CapicuaNum[i]=keyboard.nextInt();
                }
            }
            else{
                while(a_CapicuaNum[i]<0){
                    System.err.println("ERR: Please, type again the digit because the number should be positive:");
                    a_CapicuaNum[i]=keyboard.nextInt();
                }
            }

        }
        System.out.println("The result of validation is: "+CapicuaResult(a_CapicuaNum));
        System.out.println("The result of the sum between the first and last digit is: "+(a_CapicuaNum[0]+a_CapicuaNum[(a_CapicuaNum.length-1)]));
    }
    public static String CapicuaResult(int[] a_CapicuaNum){
        if(CapicuaValidate(a_CapicuaNum)){
            return "The number is capicua";
        }
        return "The number isn't capicua";
    }
    public static boolean CapicuaValidate(int[] a_CapicuaNum){
        for(int i=0; i<a_CapicuaNum.length; i++){
            if(a_CapicuaNum[i]!=a_CapicuaNum[a_CapicuaNum.length-(1+i)]){
                return false;
            }
        }
        return true;
    }
}