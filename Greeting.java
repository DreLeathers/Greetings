package edu.fcc.cmis.greetings;

import java.util.Scanner;

public class Greeting {

    /**
     * Gets a line of input from the user's console environment
     * return
     */
    private static String getUserInput() {
        try (Scanner sc = new Scanner(System.in)) {
            return sc.nextLine();
        }catch(Exception e){
            System.out.println();
        }
        return "";
    }

    public static void main(String[] args) {
        String input = getUserInput();
        System.out.println("Hello " + input );
    }
}