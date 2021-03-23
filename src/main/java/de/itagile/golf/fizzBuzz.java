package de.itagile.golf;

public class fizzBuzz {

    public static String calculate(Integer input) {
        String output = "";
        if (input % 3 == 0){
            output += "fizz";
        }
        if (input % 5 == 0){
            output += "buzz";
        }
        if (output == ""){
            output = String.valueOf(input);
        }
        return output;
        /*
        if (input % 3 == 0){
            if (input % 5 == 0){
                return "fizzbuzz";
            } else {
                return "fizz";
            }
        } else if (input % 5 == 0) {
            return "buzz";
        }
        return String.valueOf(input);
        */

    }

}
