package co.edu.usta.array.bus.logic;

public class multiclass {

     public static class Vehicle {
         private String serviceType;
         private String color;
         private String brand;
         private float width;
         private float height;
         private char [][] places;
         private int doorsNumber;
         private String plates;
         private int wheelsNumber;

         //set and get
         public void setServiceType(String serviceTypeValue){
             serviceType=serviceTypeValue;
         }
         public String getServiceType(){
             return serviceType;
         }
         public void setColor(String colors){
             color=colors;
         }
         public String getColor(){
             return color;
         }
         public void setBrand(String brands){
             brand=brands;
         }
         public String getBrand(){
             return brand;
         }
         public void setWidth(float width1){
             width=width1;
         }
         public float getWidth(){
             return  width;
         }
         public void setHeight(float height1){
             height=height1;
         }
         public float getHeight(){
             return height;
         }
         public void setDoorsNumbers(int DoorsNumber1){
             doorsNumber=DoorsNumber1;
         }
         public int getDoorsNumber(){
             return doorsNumber;
         }
         public void setWheelsNumber(int WheelsNumber1){
             wheelsNumber=WheelsNumber1;
         }
         public int getWheelsNumber(){
             return wheelsNumber;
         }

         public void setPlates(String plates1) {
             plates = plates1;
         }
         public String getPlates(){
             return plates;
         }
         public void createPlacesArray(String rows){
             int rowsInt=Integer.parseInt(rows);
             places=new char [rowsInt][4];
         }
         public void initPlaceArray(){
             boolean letters=true;
             for(int i=0; i<places.length; i++) {
                 for (int j = 0; j < places[0].length; j++) {
                     if (letters == true) {
                         places[i][j] = 'D';
                     }
                     else{
                         places[i][j] = 'X';
                     }
                 }
                 if (letters == true) {
                     letters = false;
                 } else {
                     letters = true;
                 }
             }
         }
         public String arrayToShow() {
             String returnString = "";
             for (int i = 0; i < places.length; i++) {
                 for (int j = 0; j < places[0].length; j++) {
                     returnString += places[i][j] + " ";
                 }
                 returnString += "\n";
                 }
             return returnString;
         }
         public String fillPlace(String row, String column){
             int rowInt=Integer.parseInt(row);
             int columnInt=Integer.parseInt(column);
             places[rowInt][columnInt]='0';
             if(places[rowInt][columnInt]=='X'||places[rowInt][columnInt]=='0'){
                 return "The place successfully filled";
             }
             else{
                 places[rowInt][columnInt]='O';
                 return "The place is unavailable";
             }
         }

         public String statusOfBusPlaces(){
             int filledPlaces=0, emptyPlaces=0, unavailablePlaces=0;
             for(int i=0; i<places.length; i++) {
                 for (int j = 0; j < places[0].length; j++) {
                     if(places[i][j]=='D'){
                         emptyPlaces++;
                     }
                     if(places[i][j]=='O'){
                         filledPlaces++;
                     }
                     if(places[i][j]=='X'){
                         unavailablePlaces++;
                     }
                 }
             }
             return "The amount of filled places is: "+filledPlaces+", the amount of empty places is: "+emptyPlaces;
         }
     }
}