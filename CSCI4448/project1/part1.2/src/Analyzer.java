// resources used:
// https://docs.oracle.com/javase/8/docs/api/java/util/HashMap.html
// https://medium.com/edureka/java-sqrt-method-59354a700571
import java.util.ArrayList;
import java.util.*;
public class Analyzer {
    private ArrayList<Double> inputs_list;
    private int length;
    public Analyzer(ArrayList<Double> inputs){ // constructor
        Collections.sort(inputs);
        inputs_list = inputs; // sort array, initializing inputs list
        length = inputs.size(); // getting length of inputs list
    }
    public void analyze(){ // call all statistical methods
        System.out.println("Median: " + median());
        System.out.println("Mean: " + mean());

        ArrayList<Double> mode = mode();
        System.out.println("Mode: ");
        if (mode.size() == 0){
            System.out.println("None");
        }
        else {
            for (int i = 1; i < mode.size(); i++) {
                System.out.println(mode.get(i) + " ");
            }
        }
        System.out.println("Variance: " + variance());
        System.out.println("Standard Deviation: " + std());
        System.out.println("Max Value: " + max());
        System.out.println("Min Value: " + min());

        ArrayList<Double> output = max_occurences();
        System.out.println("Max Occurence: " + output.get(0));
        System.out.println("Value: ");
        for (int i = 1; i< output.size(); i++){
            System.out.println(output.get(i) + " ");
        }
    }
    private double sum(){
        double sum = 0;
        for (Double i: inputs_list)
            sum += i;
        return sum;
    }
    private double median(){
        double median = 0;
        if (length%2 == 0){ // even length
            median = ( inputs_list.get(length / 2) + inputs_list.get(length / 2 - 1) ) / 2; // averaging middle two values
        }
        // odd length
        else median = inputs_list.get(length / 2); // integer division truncate to get index of middle value

        return median;
    }
    private double mean(){
        double sum = sum();
        double mean = sum/length;
        return mean;
    }
    private ArrayList<Double> mode(){
        if (length != max_occurences().size()-1)
        return max_occurences();
        else {
            ArrayList<Double> d= new ArrayList<>();
            return d; // empty , no mode
        }
    }
    private double variance(){
        double sum = 0;
        double mean_inputs = mean();
        for (Double value: inputs_list){
            sum += ( (value - mean_inputs) * (value - mean_inputs) );
        }
        return sum/(length - 1);
    }
    private static double sqrt(double n){ // function to compute sqrt of a number
        double temp;
        double squareroot = n / 2;
        do {
            temp = squareroot;
            squareroot = (temp + (n / temp)) / 2;
        }
        while ((temp - squareroot) != 0);
        return squareroot;
    }

    private double std(){
        double variance_inputs = variance();
        double sqrt_variance = sqrt(variance_inputs);
        return sqrt_variance;
    }
    private double max(){
        return inputs_list.get(length-1);
    }
    private double min(){
        return inputs_list.get(0);
    }
    private ArrayList<Double> max_occurences(){ // returns max count for value
        Map<Double, Integer> map = new HashMap<Double, Integer>();
        int mode = 1;
        double val = 0;
        for (Double i: inputs_list)
            if (!map.containsKey(i)){ // value not in hash map
                map.put(i, 1);
            }
            else { // value in hash map
                int new_count = map.get(i) + 1;
                map.put(i, new_count); // incrementing occurence for particular value in ArrayList
                if (new_count > mode){
                    val = i;
                    mode = new_count; // updating mode so far
                }
            }
        int temp = 0;
        ArrayList<Double> result_vals = new ArrayList<Double>();
        result_vals.add((double) mode);
        for (Map.Entry<Double, Integer> entry : map.entrySet()) {
            if (entry.getValue() == mode){
                result_vals.add(entry.getKey()); // adding all values with same max occurence
            }
        }

        return result_vals;//return mode (first index) and values
    }
}
