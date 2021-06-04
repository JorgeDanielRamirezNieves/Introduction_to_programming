package co.edu.usta.multiclass.matrixtriqui.view;

import co.edu.usta.multiclass.matrixtriqui.Logic.SoftTriqui;
import javax.swing.*;

public class FormsView {

    public static void main(String[] args){
        SoftTriqui mySoftTriqui = new SoftTriqui();
        String value, rows, columns;
        int table=0, availablePlaces;

        value= JOptionPane.showInputDialog("""
                Welcome to SoftTriqui, please, select an option:
                
                0- Exit
                1- Play on a 3x3 table
                2- Play on a 5x5 table""");
        while(Integer.parseInt(value)<0||Integer.parseInt(value)>2){
            value=JOptionPane.showInputDialog(null, """
                    Your option is wrong, please type/input again your answer. Remember, the number should be between 0 and 2+

                    0- Exit
                    1- Play on a 3x3 table
                    2- Play on a 5x5 table""", "Error x_x",JOptionPane.ERROR_MESSAGE);
        }
        if(Integer.parseInt(value)==1){
            table=3;
            mySoftTriqui.createPlacesArray(table);
        }
        if(Integer.parseInt(value)==2) {
            table = 5;
            mySoftTriqui.createPlacesArray(table);
        }
        availablePlaces=table*table;
        JOptionPane.showMessageDialog(null, mySoftTriqui.setTableTriqui());

        while(availablePlaces<-2||availablePlaces>0){
            if(availablePlaces>0){
                rows=JOptionPane.showInputDialog(null,"Please, type/input the row that you want insert your position", "Player 1 - X", JOptionPane.INFORMATION_MESSAGE);
                while(Integer.parseInt(rows)<0||Integer.parseInt(rows)>=table){
                    rows=JOptionPane.showInputDialog(null,"Uh, you should only input/type numbers between 0 and "+(table-1),"Player 1 -X | Error x_x",JOptionPane.INFORMATION_MESSAGE);
                }
                columns=JOptionPane.showInputDialog(null,"Please, type/input the column that you want insert your position", "Player 1 - X",JOptionPane.INFORMATION_MESSAGE);
                while(Integer.parseInt(columns)<0||Integer.parseInt(columns)>=table){
                    columns=JOptionPane.showInputDialog(null,"Uh, you should only input/type numbers between 0 and "+(table-1),"Player 1 -X | Error x_x",JOptionPane.INFORMATION_MESSAGE);
                }
                while(!mySoftTriqui.verificationPlay(rows, columns)) {
                    JOptionPane.showMessageDialog(null, "The place isn't available!", "Hey! We've an error x_x", JOptionPane.INFORMATION_MESSAGE);
                    rows = JOptionPane.showInputDialog(null, "Please, type/input the row that you want insert your position", "Player 1 - X",JOptionPane.INFORMATION_MESSAGE);
                    while (Integer.parseInt(rows) < 0 || Integer.parseInt(rows) >= table) {
                        rows = JOptionPane.showInputDialog(null, "Uh, you should only input/type numbers between 0 and " + (table - 1), "Player 1 -X | Error x_x",JOptionPane.INFORMATION_MESSAGE);
                    }
                    columns = JOptionPane.showInputDialog(null, "Please, type/input the column that you want insert your position", "Player 1 - X",JOptionPane.INFORMATION_MESSAGE);
                    while (Integer.parseInt(columns) < 0 || Integer.parseInt(columns) >= table) {
                        columns = JOptionPane.showInputDialog(null, "Uh, you should only input/type numbers between 0 and " + (table - 1), "Player 1 -X | Error x_x",JOptionPane.INFORMATION_MESSAGE);
                    }
                }
                mySoftTriqui.fillXPlay(rows, columns);
                availablePlaces=mySoftTriqui.verificationTriqui();
                //System.out.println(availablePlaces);
                JOptionPane.showMessageDialog(null, mySoftTriqui.showTriqui());
            }
            availablePlaces=mySoftTriqui.goalTriquiOp1(availablePlaces, value);
            //System.out.println(availablePlaces);
            if(availablePlaces>0){
                rows=JOptionPane.showInputDialog(null,"Please, type/input the row that you want insert your position", "Player 1 - O",JOptionPane.INFORMATION_MESSAGE);
                while(Integer.parseInt(rows)<0||Integer.parseInt(rows)>=table){
                    rows=JOptionPane.showInputDialog(null,"Uh, you should only input/type numbers between 0 and "+(table-1),"Player 1 -O | Error x_x",JOptionPane.INFORMATION_MESSAGE);
                }
                columns=JOptionPane.showInputDialog(null,"Please, type/input the column that you want insert your position", "Player 1 - O",JOptionPane.INFORMATION_MESSAGE);
                while(Integer.parseInt(columns)<0||Integer.parseInt(columns)>=table){
                    columns=JOptionPane.showInputDialog(null,"Uh, you should only input/type numbers between 0 and "+(table-1),"Player 1 -O | Error x_x",JOptionPane.INFORMATION_MESSAGE);
                }
                while(!mySoftTriqui.verificationPlay(rows, columns)){
                    JOptionPane.showMessageDialog(null, "The place isn't available!", "Hey! We've an error x_x",JOptionPane.INFORMATION_MESSAGE);
                    rows=JOptionPane.showInputDialog(null,"Please, type/input the row that you want insert your position","Player 1 - O", JOptionPane.INFORMATION_MESSAGE);
                    while(Integer.parseInt(rows)<0||Integer.parseInt(rows)>=table){
                        rows=JOptionPane.showInputDialog(null,"Uh, you should only input/type numbers between 0 and "+(table-1),"Player 1 -O | Error x_x",JOptionPane.INFORMATION_MESSAGE);
                    }
                    columns=JOptionPane.showInputDialog(null,"Please, type/input the column that you want insert your position", "Player 1 - O",JOptionPane.INFORMATION_MESSAGE);
                    while(Integer.parseInt(columns)<0||Integer.parseInt(columns)>=table){
                        columns=JOptionPane.showInputDialog(null,"Uh, you should only input/type numbers between 0 and "+(table-1),"Player 1 -O | Error x_x",JOptionPane.INFORMATION_MESSAGE);
                    }
                }
                mySoftTriqui.fillOPlay(rows, columns);
                availablePlaces=mySoftTriqui.verificationTriqui();
                JOptionPane.showMessageDialog(null, mySoftTriqui.showTriqui());
            }
        }
        if(availablePlaces==0){
            JOptionPane.showMessageDialog(null,"What a pity :(. Nobody wins!" +
                    "\n" +
                    "\nAvailable places: "+mySoftTriqui.verificationTriqui()+
                    "\nQuantity of X: "+mySoftTriqui.verificationX() +
                    "\nQuantity of O: "+mySoftTriqui.verificationO()+
                    "\nGame mode: "+table+"x"+table );
        }
        if(availablePlaces==-1){
            JOptionPane.showMessageDialog(null,"Player 1 - X wins! Congratulations! :D" +
                    "\n" +
                    "\nAvailable places: "+mySoftTriqui.verificationTriqui()+
                    "\nQuantity of X: "+mySoftTriqui.verificationX() +
                    "\nQuantity of O: "+mySoftTriqui.verificationO()+
                    "\nGame mode: "+table+"x"+table );
        }
        if(availablePlaces==-2){
            JOptionPane.showMessageDialog(null,"Player 2 - O wins! Congratulations! :D" +
                    "\n" +
                    "\nAvailable places: "+mySoftTriqui.verificationTriqui()+
                    "\nQuantity of X: "+mySoftTriqui.verificationO() +
                    "\nQuantity of O: "+mySoftTriqui.verificationX()+
                    "\nGame mode: "+table+"x"+table );
        }
    }
}