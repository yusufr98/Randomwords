package com.company;
import java.lang.reflect.Array;
import java.util.Scanner;
import java.util.Random;
public class Main {
    public static void main(String[] args) {
	    Scanner k = new Scanner(System.in);
	    Random r = new Random();
	    //initialize alphabet array and booleans for vowel check and repeat
        String array[] = new String[] {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
	    boolean vowel;
	    boolean repeat = false;
	    String result;
	    String rnd;
	    //variable to pick letter from array
	    int x;

	    do {
	        //reset variables
            result = ""; vowel = false;
            System.out.print("Enter a length: ");
            int length = k.nextInt();
            for (int i = 0; i < length; i++) {
                //determine random letter and if letter is a vowel
                x = r.nextInt(26);
                result += array[x];
                if (array[x].equalsIgnoreCase("a") || array[x].equalsIgnoreCase("e") || array[x].equalsIgnoreCase("i") || array[x].equalsIgnoreCase("o") || array[x].equalsIgnoreCase("u")) {
                    vowel = true;
                }
            }

            if (vowel) {
                System.out.println(result + " might be a word.");
            } else {
                System.out.println(result + " is not a word.");
            }
            System.out.print("Do you want to generate a new word(Y/N)?");
            String s = k.next();
            if(s.equalsIgnoreCase("y")){
                repeat = true;
            }
            else{
                repeat = false;
            }
        } while(repeat);
    }
}
