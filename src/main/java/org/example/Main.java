package org.example;

public class Main {
    public static void main(String[] args) {

        // პირველი დავალება

        int[] array = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9,}; // მასივი რიცხვითი მნიშვნელობებით
        int evenDigit = 0; // ლუწი რიცხვების რაოდენობა საწყისს ეტაპზე ნულის ტოლია

        for (int i = 0; i < array.length; i++) { // მასივის ელემენტების შემოწმება
            if (array[i] % 2 == 0  && array[i] != 0) { // ლუწი რიცხვის შემოწმება
                evenDigit++; // ლუწი რიცხვის შემთხვევაში იზრდება
            }
        }

        if (evenDigit > 0)
            System.out.println("გვაქვს " + evenDigit + " ლუწი რიცხვი");
         else
            System.out.println("ლუწი რიცხვი არ გვაქვს");



        //მეორე დავალება
        checkNumber(0);
        checkNumber(-150);
        checkNumber(150);

        //მეხუთე დავალება
        hasTeen(13,19,45);

    }

    //მეორე დავალება
    public static void checkNumber(int numbers){

        // ცალკეული რიცხვის შემოწმება
        if (numbers > 0){
            System.out.println("დადებითი");
        } else if (numbers < 0) {
            System.out.println("უარყოფითი");
        } else {
            System.out.println("ნოლი");
        }

    }

    // მეხუთე დავალება

    //მეთოდი ამოწმებს, არის თუ არა რომელიმე გადაცემული რიცხვი (x, y, z) 13-19 დიაპაზონში
    public static void hasTeen(int x, int y, int z) {

        if ((x >= 13 && x <= 19) || (y >= 13 && y <= 19) || (z >= 13 && z <= 19)) {
            System.out.println("True");
        } else {
            System.out.println("False");

        }
    }
    }

