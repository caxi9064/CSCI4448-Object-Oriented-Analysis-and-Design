// Program 1:
// enter loop to ask for user input and append to ArrayList, print current list to console
// if input is not a number, loop ends
// apply statistical methods to arrayList and print each result to console
// instantiate two classes: Reader and Analyzer (method analyze)
// resources used:
// https://www.geeksforgeeks.org/how-to-read-and-print-an-integer-value-in-java/
// https://www.geeksforgeeks.org/iterating-arraylists-java/
import java.util.ArrayList;
import java.util.Scanner;

public class ProgramOne {
    public static void main() {
        Reader reader = new Reader();
        Analyzer analyzer = new Analyzer();

    }
}

public class Analyzer{
    public double median(inputs){
        for (Integer i: inputs)
            System.out.print(i + " ");
    }
//    static double mean(){
//    }
//    static double mode(){
//    }
//    static double variance(){
//    }
//    static double std(){
//    }
//    static double max(){
//    }
//    static double min(){
//    }
//    static double max_occurences(){ // returns max count for value
//    }
}

public class Reader {
//    static void boolean numericCheck(){ // check if input is real or integer value
//        numeric = true;
//        if ()
//        return
//    }
    public ArrayList<Double> getInput(){
        ArrayList<Int> inputs = new ArrayList<Int>(); // list of inputs
        while(true){
            ArrayList = [] // list of inputs that will be printed to console
            System.out.println("Enter the integer: "); // prompt user for input
            Scanner input = new Scanner(System.in); // creating scanner object
            num = input.nextInt(); // read next integer from screen
            inputs.add(num) // adding input to array of inputs
            System.out.println("Entered integer is: " + inputs); // print array of user input

            if (num == null) {
                break; // terminate condition
            }
        }
        return inputs
    }

}