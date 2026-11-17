import java.util.Scanner;

public class Optional {
    public static void main(String[] args) throws Exception {
    
    
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Enter Enter the name of your character:" );
        String characterName = keyboard.nextLine();
        System.out.print("if case at least one characteristic is not in the admitted range defualt value of 5 will be assigned.");
        System.out.print("Enter strength (1-10):  ");
        int strength = keyboard.nextInt();

        System.out.print("Enter intelligence (1-10): ");
        int intelligence = keyboard.nextInt();

        System.out.print("Enter  luck  (1-10):  ");
        int luck = keyboard.nextInt();

        int totalPoints = strength + intelligence + luck;

        if (totalPoints > 15) {
            System.out.println("You have given your character too many points! Default values have been assigned:");
            strength = 5;
            intelligence = 5;
            luck = 5;
            System.out.println("[Strength: " + strength + ", Intelligence: " + intelligence + ", Luck: " + luck + "]");
        }
        else {
            System.out.println("Character created successfully!");
            System.out.println("Character Name: " + characterName);
            System.out.println("[Strength: " + strength + ", Intelligence: " + intelligence + ", Luck: " + luck + "]");
        }
        if (strength > 10 || strength < 1 || intelligence > 10 || intelligence < 1 || luck > 10 || luck < 1) {
            System.out.println("One or more characteristics are out of the admitted range! Default values have been assigned:");
            strength = 5;
            intelligence = 5;
            luck = 5;
            System.out.println("[Strength: " + strength + ", Intelligence: " + intelligence + ", Luck: " + luck + "]");
        }


    
    }
}
/*
I tried my best not to use If else  statement, but i just could not figure aout any other way
I was suprised that it works almost the same way as it wroks in python exceot for curly braces
it was very easy to use it
i also had sneak peak into chapter 3 to see how ot write "or" in java
I hope its okay
*/

