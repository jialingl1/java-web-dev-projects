package org.launchcode;
import java.util.Scanner;

public class AliceInWonderlandSearch {
    public static void main (String[] args) {
        String aliceQuote = "Alice was beginning to get very tired of sitting by her sister on the bank," +
                "and of having nothing to do: once or twice she had peeped into the book her sister was reading," +
                "but it had no pictures or conversations in it," +
                "‘and what is the use of a book,’ thought Alice ‘without pictures or conversation?’\n" +
                "\n";

        Scanner input = new Scanner(System.in);
        System.out.println("What word do you want to search for? ");

        String word = input.next();
        input.close();

        System.out.println(aliceQuote.toLowerCase().contains(word.toLowerCase()));
        System.out.println("Your word is at index: " + aliceQuote.toLowerCase().indexOf((word.toLowerCase())) + "and has a " +
                "length of " + word.length() + "characters");
        String modifiedQuote = aliceQuote.replace(word, "");
        System.out.println(modifiedQuote);


    }
}
