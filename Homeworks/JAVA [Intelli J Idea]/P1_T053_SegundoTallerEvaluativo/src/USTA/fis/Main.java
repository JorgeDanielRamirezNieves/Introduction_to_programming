package USTA.fis;
/* Author: Jorge Daniel Ramírez Nieves
Date: May/21/2021
Description: Taller E-2*/

import javax.swing.*;
public class Main {

    public static void main(String[] args) {
        int[][] seat, seat_value;
        String row, input;
        int value, seat_value2 = 0, available=0, occupied=0;
        row = JOptionPane.showInputDialog("Good day sir! As you know, we need to know the number of rows your bus brings" +
                "\nPlease, type/input the size of rows:");
        while (Integer.parseInt(row) <= 0) {
            row = JOptionPane.showInputDialog("The size should be greater than 0! Please, type/input again the size of rows:");
        }
        seat = new int[Integer.parseInt(row)][4];
        seat_value = new int[Integer.parseInt(row)][4];
        for (int i = 0; i < Integer.parseInt(row); i++) {
            for (int j = 0; j < 4; j++) {
                seat_value2++;
                seat_value[i][j] = seat_value2;
            }
        }
        JOptionPane.showMessageDialog(null, firstVisualization(seat_value, row));
        for (int i = 0; i < Integer.parseInt(row); i++) {
            for (int j = 0; j < 4; j++) {
                if (seat_value[i][j] % 2 != 0) {
                    JOptionPane.showMessageDialog(null, "The seat [" + (i + 1) + "]-[" + (j + 1) + "] should be free.");
                } else {
                    input = JOptionPane.showInputDialog("Please, type/input the status of seat [" + (i + 1) + "]-[" + (j + 1) + "]." +
                            "\n 1-if the seat is available, 2-if the seat is occupied");
                    value = Integer.parseInt(input);
                    while (value < 1 || value > 2) {
                        input = JOptionPane.showInputDialog("The status of seat [" + (i + 1) + "]-[" + (j + 1) + "] is wrong! Please, only type:" +
                                "\n 1-if the seat is available, 2-if the seat is occupied");
                        value = Integer.parseInt(input);
                    }
                    if(value==1){
                        available++;
                    }
                    if(value==2){
                        occupied++;
                    }
                    seat[i][j] = value;
                }
            }
        }
        JOptionPane.showMessageDialog(null, secondVisualization(seat, seat_value, row));
        JOptionPane.showMessageDialog(null, "Well then! This is the new inform of your bus (next)");
        JOptionPane.showMessageDialog(null,"The bus have "+(Integer.parseInt(row)*4)+" seats"+
            "\nDue for pandemic, we only have the half (namely, "+(Integer.parseInt(row)*2)+") of seats"+
            "\nWe've "+available+" available seats"+
            "\nWe've "+occupied+" occupied seats");
    }

    public static String firstVisualization(int[][] seat_value, String row) {
        String graphic1 = "";
        for (int j = 0; j < 4; j++){
            for (int i = 0; i < Integer.parseInt(row); i++) {
                if (seat_value[i][j] % 2 == 0) {
                    graphic1 += "D ";
                }
                else {
                    graphic1 += "X ";
                }
            }
            graphic1 += "\n";
        }
        return graphic1;
    }

    public static String secondVisualization(int[][] seat, int[][] seat_value, String row) {
        String graphic1 = "";
        for (int i = 0; i < Integer.parseInt(row); i++) {
            for (int j = 0; j < 4; j++) {
                if (seat_value[i][j] % 2 != 0) {
                    graphic1 += "X ";
                }
                if (seat_value[i][j] % 2 == 0) {
                    if (seat[i][j] == 1) {
                        graphic1 += "D ";
                    }
                    if (seat[i][j] == 2) {
                        graphic1 += "O ";
                    }
                }
            }
            graphic1 += "\n";
        }
        return graphic1;
    }
}