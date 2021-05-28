package USTA.fis;
/* Author: Jorge Daniel Ramírez Nieves
Date: May/18/2021
Description: This program declare a size of bi-dimensional array designed by user*/

import javax.swing.*;

public class Main {

	public static void main(String[] args) {
		int[][] matrix;
		int value;
		String columns, rows, input;
		columns = JOptionPane.showInputDialog("This program creates dynamic bi-dimensional arrays, " +
				"\nPlease, type/input the size of columns:");
		while (Integer.parseInt(columns)<=0) {
			columns = JOptionPane.showInputDialog("The size should be greater than 0! Please, type/input again the size of columns");
		}
		rows = JOptionPane.showInputDialog("Now, type/input the size of rows:");
		while (Integer.parseInt(rows) < 1) {
			rows = JOptionPane.showInputDialog("The size should be greater than 0! Please, type/input again the size of rows");
		}
		matrix = new int[Integer.parseInt(rows)][Integer.parseInt(columns)];
		JOptionPane.showMessageDialog(null, "Please, type the values for the bi-dimensional array of: " + rows + " and " + columns + ".");
		for (int i = 0; i < Integer.parseInt(rows); i++) {
			for (int j = 0; j < Integer.parseInt(columns); j++) {
				input = JOptionPane.showInputDialog("Please, type the value of Array [" + i + "][" + j + "].");
				value = Integer.parseInt(input);
				matrix[i][j] = value;
			}
		}
		int biggest=findBiggestValueImMatrix(matrix);
		JOptionPane.showMessageDialog(null,stringMatrix(matrix, rows, columns, biggest));
	}

	public static String stringMatrix(int[][] matrix, String rows, String columns, int biggest) {
		String finalAnswer="";
		for (int i = 0; i < Integer.parseInt(rows); i++) {
			for (int j = 0; j < Integer.parseInt(columns); j++) {
				finalAnswer += matrix[i][j] + " ";
				for (int k=0;k<countDigitsNumber(biggest);k++){
					finalAnswer+=" ";
				}
			}
			finalAnswer+="\n";
		}
		return finalAnswer;
	}
	public static int findBiggestValueImMatrix(int [][] matrix){
		int biggest=matrix[0][0];
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				if (biggest<matrix[i][j]){
					biggest=matrix[i][j];
				}
			}
		}
		return biggest;
	}
	public static int countDigitsNumber(int biggest){
		String value = String.valueOf(biggest);
		return value.length();
	}
}