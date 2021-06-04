package co.edu.usta.multiclass.matrixtriqui.Logic;

public class SoftTriqui {
    private char[][] tableTriqui;

    public void createPlacesArray(int table) {
        tableTriqui = new char[table][table];
    }

    public String setTableTriqui() {
        StringBuilder graphicTable = new StringBuilder();
        for (int i = 0; i < tableTriqui.length; i++) {
            for (int j = 0; j < tableTriqui[0].length; j++) {
                tableTriqui[i][j] = '▢';
                graphicTable.append(tableTriqui[i][j]).append(" ");
            }
            graphicTable.append("\n");
        }
        return graphicTable.toString();
    }

    public int verificationTriqui() {
        int availablePlaces=0;
        for (int i=0; i<tableTriqui.length; i++) {
            for (int j = 0; j < tableTriqui[0].length; j++) {
                if (tableTriqui[i][j] == '▢') {
                    availablePlaces++;
                }
            }
        }
        return availablePlaces;
    }

    public boolean verificationPlay(String rows, String columns) {
        return tableTriqui[Integer.parseInt(rows)][Integer.parseInt(columns)] == '▢';
    }

    public void fillXPlay(String rows, String columns) {
        if (verificationPlay(rows, columns)) {
            tableTriqui[Integer.parseInt(rows)][Integer.parseInt(columns)] = 'X';
        }
    }

    public void fillOPlay(String rows, String columns) {
        if (verificationPlay(rows, columns)) {
            tableTriqui[Integer.parseInt(rows)][Integer.parseInt(columns)] = 'O';
        }
    }

    public String showTriqui() {
        StringBuilder gameBoard= new StringBuilder();
        for (int i = 0; i < tableTriqui.length; i++) {
            for (int j = 0; j < tableTriqui[0].length; j++) {
                gameBoard.append(tableTriqui[i][j]).append(" ");
            }
            gameBoard.append("\n");
        }
        return gameBoard.toString();
    }

    public int goalTriquiOp1(int availablePlaces, String value){ //Change if to for
        int system=Integer.parseInt(value);
        if(tableTriqui[0][0]=='X'){
            if(tableTriqui[0][1]=='X'){
                if(tableTriqui[0][2]=='X'){
                    if(system==1){
                        availablePlaces=-1;
                    }
                    if(system==2){
                        if(tableTriqui[0][3]=='X'){
                            if(tableTriqui[0][4]=='X'){
                                availablePlaces=-1;
                            }
                        }
                    }
                }
            }
            if (tableTriqui[1][0]=='X'){
                if(tableTriqui[2][0]=='X'){
                    if(system==1){
                        availablePlaces=-1;
                    }
                    if(system==2){
                        if(tableTriqui[3][0]=='X'){
                            if(tableTriqui[4][0]=='X'){
                                availablePlaces=-1;
                            }
                        }
                    }
                }
            }
            if (tableTriqui[1][1]=='X'){
                if(tableTriqui[2][2]=='X'){
                    if(system==1){
                        availablePlaces=-1;
                    }
                    if(system==2){
                        if(tableTriqui[3][3]=='X'){
                            if(tableTriqui[4][4]=='X'){
                                availablePlaces=-1;
                            }
                        }
                    }
                }
            }
        }
        if(tableTriqui[0][2]=='X'){
            if(tableTriqui[1][2]=='X'){
                if(tableTriqui[2][2]=='X'){
                    if(system==1){
                        availablePlaces=-1;
                    }
                    if(system==2){
                        if(tableTriqui[3][2]=='X'){
                            if(tableTriqui[4][2]=='X'){
                                availablePlaces=-1;
                            }
                        }
                    }
                }
            }
            if(system==1){
                if(tableTriqui[1][1]=='X'){
                    if(tableTriqui[2][0]=='X'){
                        availablePlaces=-1;
                    }
                }
            }
        }
        if(tableTriqui[0][1]=='X'){
            if(tableTriqui[1][1]=='X'){
                if(tableTriqui[2][1]=='X'){
                    if(system==1){
                        availablePlaces=-1;
                    }
                    if(system==2){
                        if(tableTriqui[3][1]=='X'){
                            if(tableTriqui[4][1]=='X'){
                                availablePlaces=-1;
                            }
                        }
                    }
                }
            }
        }
        if(tableTriqui[1][0]=='X'){
            if(tableTriqui[1][1]=='X'){
                if(tableTriqui[1][2]=='X'){
                    if(system==1){
                        availablePlaces=-1;
                    }
                    if(system==2){
                        if(tableTriqui[1][3]=='X'){
                            if(tableTriqui[1][4]=='X'){
                                availablePlaces=-1;
                            }
                        }
                    }
                }
            }
        }
        if(tableTriqui[2][0]=='X'){
            if(tableTriqui[2][1]=='X'){
                if(tableTriqui[2][2]=='X'){
                    if(system==1){
                        availablePlaces=-1;
                    }
                    if(system==2){
                        if(tableTriqui[2][3]=='X'){
                            if(tableTriqui[2][4]=='X'){
                                availablePlaces=-1;
                            }
                        }
                    }
                }
            }
        }
        if(system==2){
            if(tableTriqui[0][4]=='X'){
                if(tableTriqui[1][4]=='X'){
                    if(tableTriqui[2][4]=='X'){
                        if(tableTriqui[3][4]=='X'){
                            if(tableTriqui[4][4]=='X'){
                                availablePlaces=-1;
                            }
                        }
                    }
                }
                if(tableTriqui[1][3]=='X'){
                    if(tableTriqui[2][2]=='X'){
                        if(tableTriqui[3][1]=='X'){
                            if(tableTriqui[4][0]=='X'){
                                availablePlaces=-1;
                            }
                        }
                    }
                }
            }
            if(tableTriqui[0][3]=='X'){
                if(tableTriqui[1][3]=='X'){
                    if(tableTriqui[2][3]=='X'){
                        if(tableTriqui[3][3]=='X'){
                            if(tableTriqui[4][3]=='X'){
                                availablePlaces=-1;
                            }
                        }
                    }
                }
            }
            if(tableTriqui[3][0]=='X'){
                if(tableTriqui[3][1]=='X'){
                    if(tableTriqui[3][2]=='X'){
                        if(tableTriqui[3][3]=='X'){
                            if(tableTriqui[3][4]=='X'){
                                availablePlaces=-1;
                            }
                        }
                    }
                }
            }
            if(tableTriqui[4][0]=='X'){
                if(tableTriqui[4][1]=='X'){
                    if(tableTriqui[4][2]=='X'){
                        if(tableTriqui[4][3]=='X'){
                            if(tableTriqui[4][4]=='X'){
                                availablePlaces=-1;
                            }
                        }
                    }
                }
            }
        }
        if(tableTriqui[0][0]=='O'){
            if(tableTriqui[0][1]=='O'){
                if(tableTriqui[0][2]=='O'){
                    if(system==1){
                        availablePlaces=-2;
                    }
                    if(system==2){
                        if(tableTriqui[0][3]=='O'){
                            if(tableTriqui[0][4]=='O'){
                                availablePlaces=-2;
                            }
                        }
                    }
                }
            }
            if (tableTriqui[1][0]=='O'){
                if(tableTriqui[2][0]=='O'){
                    if(system==1){
                        availablePlaces=-2;
                    }
                    if(system==2){
                        if(tableTriqui[3][0]=='O'){
                            if(tableTriqui[4][0]=='O'){
                                availablePlaces=-2;
                            }
                        }
                    }
                }
            }
            if (tableTriqui[1][1]=='O'){
                if(tableTriqui[2][2]=='O'){
                    if(system==1){
                        availablePlaces=-2;
                    }
                    if(system==2){
                        if(tableTriqui[3][3]=='O'){
                            if(tableTriqui[4][4]=='O'){
                                availablePlaces=-2;
                            }
                        }
                    }
                }
            }
        }
        if(tableTriqui[0][2]=='O'){
            if(tableTriqui[1][2]=='O'){
                if(tableTriqui[2][2]=='O'){
                    if(system==1){
                        availablePlaces=-2;
                    }
                    if(system==2){
                        if(tableTriqui[3][2]=='O'){
                            if(tableTriqui[4][2]=='O'){
                                availablePlaces=-2;
                            }
                        }
                    }
                }
            }
            if(system==1){
                if(tableTriqui[1][1]=='O'){
                    if(tableTriqui[2][0]=='O'){
                        availablePlaces=-2;
                    }
                }
            }
        }
        if(tableTriqui[0][1]=='O'){
            if(tableTriqui[1][1]=='O'){
                if(tableTriqui[2][1]=='O'){
                    if(system==1){
                        availablePlaces=-2;
                    }
                    if(system==2){
                        if(tableTriqui[3][1]=='O'){
                            if(tableTriqui[4][1]=='O'){
                                availablePlaces=-2;
                            }
                        }
                    }
                }
            }
        }
        if(tableTriqui[1][0]=='O'){
            if(tableTriqui[1][1]=='O'){
                if(tableTriqui[1][2]=='O'){
                    if(system==1){
                        availablePlaces=-2;
                    }
                    if(system==2){
                        if(tableTriqui[1][3]=='O'){
                            if(tableTriqui[1][4]=='O'){
                                availablePlaces=-2;
                            }
                        }
                    }
                }
            }
        }
        if(tableTriqui[2][0]=='O'){
            if(tableTriqui[2][1]=='O'){
                if(tableTriqui[2][2]=='O'){
                    if(system==1){
                        availablePlaces=-2;
                    }
                    if(system==2){
                        if(tableTriqui[2][3]=='O'){
                            if(tableTriqui[2][4]=='O'){
                                availablePlaces=-2;
                            }
                        }
                    }
                }
            }
        }
        if(system==2){
            if(tableTriqui[0][4]=='O'){
                if(tableTriqui[1][4]=='O'){
                    if(tableTriqui[2][4]=='O'){
                        if(tableTriqui[3][4]=='O'){
                            if(tableTriqui[4][4]=='O'){
                                availablePlaces=-2;
                            }
                        }
                    }
                }
                if(tableTriqui[1][3]=='O'){
                    if(tableTriqui[2][2]=='O'){
                        if(tableTriqui[3][1]=='O'){
                            if(tableTriqui[4][0]=='O'){
                                availablePlaces=-2;
                            }
                        }
                    }
                }
            }
            if(tableTriqui[0][3]=='O'){
                if(tableTriqui[1][3]=='O'){
                    if(tableTriqui[2][3]=='O'){
                        if(tableTriqui[3][3]=='O'){
                            if(tableTriqui[4][3]=='O'){
                                availablePlaces=-2;
                            }
                        }
                    }
                }
            }
            if(tableTriqui[3][0]=='O'){
                if(tableTriqui[3][1]=='O'){
                    if(tableTriqui[3][2]=='O'){
                        if(tableTriqui[3][3]=='O'){
                            if(tableTriqui[3][4]=='O'){
                                availablePlaces=-2;
                            }
                        }
                    }
                }
            }
            if(tableTriqui[4][0]=='O'){
                if(tableTriqui[4][1]=='O'){
                    if(tableTriqui[4][2]=='O'){
                        if(tableTriqui[4][3]=='O'){
                            if(tableTriqui[4][4]=='O'){
                                availablePlaces=-2;
                            }
                        }
                    }
                }
            }
        }
        return availablePlaces;
    }

    public int verificationX() {
        int quantityX=0;
        for (char[] chars : tableTriqui) {
            for (int j = 0; j < tableTriqui[0].length; j++) {
                if (chars[j] == 'X') {
                    quantityX++;
                }
            }
        }
        return quantityX;
    }
    public int verificationO() {
        int quantityO=0;
        for (char[] chars : tableTriqui) {
            for (int j = 0; j < tableTriqui[0].length; j++) {
                if (chars[j] == 'O') {
                    quantityO++;
                }
            }
        }
        return quantityO;
    }
}