package co.edu.usta.array.bus.view;

import co.edu.usta.array.bus.logic.multiclass;

import javax.swing.*;

public class FormsArrays {
    /*private static multiclass.Vehicle myVehicle;

    public static void main(String[] args){
        myVehicle = new multiclass.Vehicle();*/
    public static void main(String[] args){
        multiclass.Vehicle myVehicle = new multiclass.Vehicle();
        String value, v_Info;
        int  v_valueInt, v_showInt;
        float v_showFloat, v_valueFloat;

        value=JOptionPane.showInputDialog("Welcome! Please, type the service of your vehicle");
        myVehicle.setServiceType(value);
        v_Info= myVehicle.getServiceType();
        JOptionPane.showMessageDialog(null, "Saving... The service of your vehicle is: "+v_Info);

        value=JOptionPane.showInputDialog("Please, type the color of your vehicle");
        myVehicle.setColor(value);
        v_Info= myVehicle.getColor();
        JOptionPane.showMessageDialog(null, "Saving... The color of your vehicle is: "+v_Info);

        value=JOptionPane.showInputDialog("Please, type the brand of your vehicle");
        myVehicle.setBrand(value);
        v_Info= myVehicle.getBrand();
        JOptionPane.showMessageDialog(null, "Saving... The brand for your vehicle is: "+v_Info);

        value=JOptionPane.showInputDialog("Now, type the width of your vehicle, remember" +
                "\nthe minimum is 1.5m (Please, use pot [.], not coma [,])");
        while(Float.parseFloat(value)<1.5){
            value=JOptionPane.showInputDialog("The minimum width for a vehicle is 1.5m. Please, type/input again the width of your vehicle");
        }
        v_valueFloat = Float.parseFloat(value);
        myVehicle.setWidth(v_valueFloat);
        v_showFloat= myVehicle.getWidth();
        JOptionPane.showMessageDialog(null, "Saving... The width of your vehicle is: "+v_showFloat+"m.");

        value=JOptionPane.showInputDialog("Type/input the height of your vehicle, remember" +
                "\nthe minimum is 1m (Please, use pot [.], not coma [,])");
        while(Float.parseFloat(value)<1){
            value=JOptionPane.showInputDialog("The minimum height for a vehicle is 1.5m. Please, type/input again the height of your vehicle");
        }
        v_valueFloat = Float.parseFloat(value);
        myVehicle.setHeight(v_valueFloat);
        v_showFloat= myVehicle.getHeight();
        JOptionPane.showMessageDialog(null, "Saving... The height of this vehicle is: "+v_showFloat);

        value=JOptionPane.showInputDialog("Type/input the quantity of doors that has your vehicle, remember" +
                "\nthe minimum are 2 doors (Please, use pot [.], not coma [,])");
        while(Integer.parseInt(value)<2){
            value=JOptionPane.showInputDialog("The minimum quantity of doors for a vehicle is 2. Please, type/input again the quantity of doors that has your vehicle");
        }
        v_valueInt=Integer.parseInt(value);
        myVehicle.setDoorsNumbers(v_valueInt);
        v_showInt= myVehicle.getDoorsNumber();
        JOptionPane.showMessageDialog(null, "Saving... The quantity of doors for this vehicle are: "+v_showInt);

        value=JOptionPane.showInputDialog("Type/input the quantity of wheels that has your vehicle, remember" +
                "\nthe minimum are 4 (Please, use pot [.], not coma [,])");
        while(Float.parseFloat(value)<4){
            value=JOptionPane.showInputDialog("The minimum quantity of wheels for a vehicle is 4. Please, type/input again the quantity of wheels that have your vehicle");
        }
        v_valueInt=Integer.parseInt(value);
        myVehicle.setWheelsNumber(v_valueInt);
        v_showInt= myVehicle.getWheelsNumber();
        JOptionPane.showMessageDialog(null, "Saving... The quantity of wheels for this vehicle are: "+v_showInt);

        value=JOptionPane.showInputDialog("Please type the kind of plates of your vehicle");
        myVehicle.setPlates(value);
        v_Info= myVehicle.getPlates();
        JOptionPane.showMessageDialog(null, "Saving... The plates of your vehicle is: "+v_Info);
    }
}