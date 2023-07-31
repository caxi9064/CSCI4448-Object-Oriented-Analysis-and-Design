import java.util.Scanner;
import java.util.Arrays;
import java.lang.*;
// resources used: https://stackoverflow.com/questions/605891/sort-a-single-string-in-java

public class Processor {
    public void run(){ // running functions to create palindrome
        String input = read();
        while(input.length() != 0){
            String input_cleaned = clean(input);
            String input_sorted = sort(input_cleaned);
            String result = palindrome(input_sorted);
            System.out.println(result);
            input = read();
        }
    }
    private String read(){ // read string input from console
        System.out.println("Enter a string: "); // prompt user for input
        Scanner input = new Scanner(System.in);
        String line = input.nextLine();
        System.out.println("You entered:" + line); // print user input
        return line;
    }
    private String clean(String input){ // convert all letters to upper case and discards spaces
        String s = input.toUpperCase();
        String s1 = s.replaceAll("\\s+","");
        return s1;
    }
    private String sort(String input){ // sorts letters into alphabetical order
        char[] ar = input.toCharArray(); // converting to char array
        Arrays.sort(ar); // sorting array
        String sortedString= String.valueOf(ar); // converting back to string
        return sortedString;
    }

    private String palindrome(String input){ // create a palindrome
        String first = input;
        String second = "";
        int index = 1;
        for (int j = 1; j < input.length(); j++){
            if (input.charAt(j) != input.charAt(0)){
                index = j;
                break;
            }
        }
        for (int i = index; i < input.length(); i++) { // getting everything except middle char
            second += input.charAt(i); // appending to str
        }

        StringBuilder sb = new StringBuilder();
        sb.append(second);
        String finalString = sb.reverse() + first; // reversing string
        return finalString;
    }

    private void print(String finalRes){
        System.out.println(finalRes); // print result
    }
}
