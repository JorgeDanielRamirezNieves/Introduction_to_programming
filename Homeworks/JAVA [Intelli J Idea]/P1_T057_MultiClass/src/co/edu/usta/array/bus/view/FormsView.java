package co.edu.usta.array.bus.view;

import co.edu.usta.array.bus.logic.multiclass;
import javax.swing.*;
public class FormsView {
    public static void main(String[] args) {
        multiclass.Vehicle myVehicle = new multiclass.Vehicle();
        String showInfo, row, row2, column;
        int valueConfirmDialog, security;

        row=JOptionPane.showInputDialog("Welcome. Please, type/input the number of rows for him bus");
        while (Integer.parseInt(row)<=0){
            row=JOptionPane.showInputDialog("Wait, that's impossible! Please, type/input the number of rows (that should be greater than 0) for him bus");
        }
        myVehicle.createPlacesArray(row);
        myVehicle.initPlaceArray();
        do{
            showInfo=myVehicle.arrayToShow();
            JOptionPane.showMessageDialog(null,showInfo);
            row2=JOptionPane.showInputDialog("Now, for your place, type the row to fill");
            security=Integer.parseInt(row2);
            while (security<0||security>(Integer.parseInt(row)-1)){
                row2=JOptionPane.showInputDialog("Wait, that row isn't exists! Please, type/input again the row to fill");
                security=Integer.parseInt(row2);
            }
            column=JOptionPane.showInputDialog("For last, type the column to fill");
            security=Integer.parseInt(column);
            while (security<0||security>3){
                column=JOptionPane.showInputDialog("Wait, that row isn't exists! Please, type/input again the row to fill");
                security=Integer.parseInt(column);
            }
            showInfo=myVehicle.fillPlace(row, column);
            JOptionPane.showMessageDialog(null, showInfo);
            valueConfirmDialog=JOptionPane.showConfirmDialog(null, "Are you want include a new passage (YES) or leave away a bus (NO)?");
        }while(valueConfirmDialog==JOptionPane.YES_OPTION);
        JOptionPane.showMessageDialog(null, myVehicle.statusOfBusPlaces());
    }
}