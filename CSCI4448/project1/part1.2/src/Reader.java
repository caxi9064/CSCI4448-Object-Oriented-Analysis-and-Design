import java.util.ArrayList;
import java.util.Scanner;

public class Reader {
    public ArrayList<Double> getInput(){
        ArrayList<Double> inputs = new ArrayList<Double>(); // list of inputs

        System.out.println("Enter the integer: "); // prompt user for input
        Scanner input = new Scanner(System.in);
        String line = input.nextLine();
//        inputs.add(Double.parseDouble(line)); // adding input to array of inputs
//        System.out.println("List of inputs: " + inputs);

        while (!line.isEmpty()) { // while not empty
            inputs.add(Double.parseDouble(line)); // adding input to array of inputs
            System.out.println("List of inputs: " + inputs); // print array of user input
            System.out.println("Enter the integer: "); // prompt user for input
            line = input.nextLine(); // creating scanner object
        }
        System.out.println("List of inputs: " + inputs); // print array of user input
        return inputs;
    }
}
