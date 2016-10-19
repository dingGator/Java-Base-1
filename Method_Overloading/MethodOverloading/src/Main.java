/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ki
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int newScore = calculateScore("Tim", 500);
        System.out.println("New score is " + newScore);
        calculateScore(75);
        calculateScore();

        // create a mehod calcFeetAndInchesToCentimeters
        // two paramenters:  feet , inches
        // validate feet paramenter >=0
        // validate inches parameter >=0 <=12
        // return -1 from method if either is false
        //
        // if parameters are valid calculate centimeters
        // return value
        //
        // create 2nd method of same name with only one parameter
        // inches is parameter
        // validate that it is >=0
        // return -1 if it is false
        // but if it is value
        // calculate how many feet are in the inches
        // then
        // call the other overloaded method passing 
        // the correct feet and inches calculated so that
        // it can calculate correctly
        // use double for datatypes 
        // 1 inch = 2.54cm  and one foot = 12 inches
        double inches = 300;
        double conversionInchesToCentimeters = calcFeetAndInchesToCentimeters(inches);
        System.out.println("  " + inches + " inches is  "
                + conversionInchesToCentimeters + " centimeters ");

    // call
        double centimeters = calcFeetAndInchesToCentimeters2(6, 0);
        if (centimeters < 0.0) {
            System.out.println("Invalid parameter");
        }
        calcFeetAndInchesToCentimeters2(157);
    }

    public static double calcFeetAndInchesToCentimeters2(double feet, double inches) {
        if ((feet < 0) || ((inches < 0) || (inches > 12))) {
            System.out.println("Invalid feet or inches parameters");
            return -1;
        }
        double centimeters = (feet * 12) * 2.54;
        centimeters += inches * 2.54;
        System.out.println(feet + " feet " + inches + " inches = "
                + centimeters + " cm");
        return centimeters;
    }

    public static double calcFeetAndInchesToCentimeters2(double inches) {
        if (inches < 0) {
            return -1;

        }
        double feet = (int) inches / 12;
        double remainingInches = (int) inches % 12;
        System.out.println(inches + " inches is equal to "
                + feet + " feet and " + remainingInches + " inches");
        return calcFeetAndInchesToCentimeters2(feet, remainingInches);
    }

    public static double calcFeetAndInchesToCentimeters(double feet,
            double inches) {
        if (feet >= 0) {
            if ((inches >= 0) && (inches <= 12)) {
                double totalCentimeters = (((feet * 12) + (inches)) * 2.54);
                return totalCentimeters;

            } else {
                return -1;
            }
        } else {
            return -1;
        }

    }

    public static double calcFeetAndInchesToCentimeters(double inches) {
        if (inches >= 0) {
            double feet = (int) inches / 12;
            double remainInches = (int) inches % 12;
            double conversionCentimeters
                    = calcFeetAndInchesToCentimeters(feet, remainInches);
            return conversionCentimeters;
        } else {
            return -1;
        }

    }

    public static int calculateScore(String playerName, int score) {
        System.out.println("Player " + playerName + " scored " + score + "points ");
        return score * 1000;
    }

    public static int calculateScore(int score) {
        System.out.println("Unnamed Player scored " + score + " points ");
        return score * 1000;
    }

    public static int calculateScore() {
        System.out.println("No player name, no player score ");
        return 0;
    }

}
