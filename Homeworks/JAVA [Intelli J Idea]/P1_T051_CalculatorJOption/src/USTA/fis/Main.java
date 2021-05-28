package USTA.fis;
/* Author: Jorge Daniel Ramírez Nieves
Date: May/18/2021
Description: The software simulates a calculator with n numbers*/

import javax.swing.*;
public class Main {

    public static void main(String[] args) {
        String v_answer;
        int amount, operation; int[] array;
        v_answer = JOptionPane.showInputDialog("""
                Welcome. This software simulates a calculator.\s
                Please, type/input the amount of number that you want use.""");
        amount = Integer.parseInt(v_answer);
        while(amount<=0){
            v_answer=JOptionPane.showInputDialog("Wait, the number should be greater than 0!");
            amount = Integer.parseInt(v_answer);
        }
        //System.out.println(amount);
        array = new int[amount];
        //System.out.println(Arrays.toString(array));
        v_answer = JOptionPane.showInputDialog("Please type: \n1- Sum \n2- Subtract \n3- Multiply \n4- Divide \n0- Exit.");
        operation = Integer.parseInt(v_answer);
        //System.out.println(operation);
        while(operation<0||operation>4){
                v_answer=JOptionPane.showInputDialog("Wait, you should type a number between 0 - 4. Remember:\n1- Sum \n2- Subtract \n3-Multiply \n4- Divide \n0- Exit");
                operation = Integer.parseInt(v_answer);
        }
        if(operation==0){
                JOptionPane.showMessageDialog(null,"Well, see you later!");
        }
        else{
            for (int i = 0; i < amount; i++) {
                v_answer = JOptionPane.showInputDialog("Please type the " + (i + 1) + " number");
                array[i] = Integer.parseInt(v_answer);
                //System.out.println(array[i]);
                if (operation == 4) {
                    if (i > 0) {
                        while (array[i] == 0) {
                            v_answer = JOptionPane.showInputDialog(null, "Please, type/input again your number. You can't divide a number by 0!", "Error! x_x", JOptionPane.ERROR_MESSAGE);
                            array[i] = Integer.parseInt(v_answer);
                        }
                    }
                }
            }
            JOptionPane.showMessageDialog(null, "Your result is: "+calculator(array, operation, amount));
        }
    }


    public static int calculator(int[] array, int operation, int amount) {
        int result = array[0];
        switch (operation) {
            case 1 -> {
                for (int i = 1; i < amount; i++) {
                    result += array[i];
                }
            }
            case 2 -> {
                for (int i = 1; i < amount; i++) {
                    result -= array[i];
                }
            }
            case 3 -> {
                for (int i = 1; i < amount; i++) {
                    result *= array[i];
                }
            }
            case 4 -> {
                for (int i = 1; i < amount; i++) {
                    result /= array[i];
                }
            }
        }
        return result;
    }
}