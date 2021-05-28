package USTA.fis;

import javax.swing.*;
public class Main {

    public static void main(String[] args) {
        int [][] matrixBuses,matrixBuses_value;
        int columnas=4, value, asiento=0, asientodisponible=0;
        String filas, input;
        filas= JOptionPane.showInputDialog("Por favor inserte el numero de filas");
        matrixBuses=new int[Integer.parseInt(filas)][columnas];
        matrixBuses_value=new int[Integer.parseInt(filas)][columnas];
        for (int i = 0; i < Integer.parseInt(filas); i++) {
            for (int j = 0; j < columnas; j++) {
                asiento++;
                matrixBuses_value[i][j] = asiento;
            }
        }
        JOptionPane.showMessageDialog(null, Visualicionasientos(matrixBuses_value, filas));
        JOptionPane.showMessageDialog(null, "Los valores ingresados del arreglo fueron: " + filas + " and " + columnas + ".");
        for (int i = 0; i < Integer.parseInt(filas); i++) {
            for (int j = 0; j < 4; j++) {
                if(i%2==0){
                    input = JOptionPane.showInputDialog("Please, type the value of Array [" + i + "][" + j + "].");
                    value = Integer.parseInt(input);
                    matrixBuses[i][j] = value;
                    if(value==1){
                        asientodisponible++;
                    }
                }
            }
        }
        JOptionPane.showMessageDialog(null, "Esta es la nueva grafica del bus" +
                "\n"segundaVisualizaciondeasientos(matrixBuses, matrixBuses_value, filas));
    }
    public static String Visualicionasientos(int[][] matrixBuses_value, String filas) {
        String graficavisualizacion1 = "";
        for (int j = 0; j < 4; j++){
            for (int i = 0; i < Integer.parseInt(filas); i++) {
                {
                    if (matrixBuses_value[i][j] % 2 == 0) {
                        graficavisualizacion1 += "D ";
                    } else {
                        graficavisualizacion1 += "X ";
                    }
                }
            }
            graficavisualizacion1 += "\n";
        }
        return graficavisualizacion1;
    }
    public static String segundaVisualizaciondeasientos(int[][] matrixBuses, int[][] matrixBuses_value, String filas) {
        String graficavisualizacion2 = "";
        for (int i = 0; i < Integer.parseInt(filas); i++) {
            for (int j = 0; j < 4; j++) {
                if (matrixBuses_value[i][j] % 2 != 0) {
                    graficavisualizacion2 += "X ";
                }
                if (matrixBuses_value[i][j] % 2 == 0) {
                    if (matrixBuses[i][j] == 1) {
                        graficavisualizacion2 += "D ";
                    }
                    if (matrixBuses[i][j] == 2) {
                        graficavisualizacion2 += "O ";
                    }
                }
            }
            graficavisualizacion2 += "\n";
        }
        return graficavisualizacion2;
    }
}