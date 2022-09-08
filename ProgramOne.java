import java.util.ArrayList;

public class ProgramOne {
    public static void main(String[] args){
        // instantiate objects
        Reader r = new Reader();

        ArrayList<Double> inputs = r.getInput(); // getting input

        Analyzer a = new Analyzer(inputs);
        a.analyze(); // calling method analyze to compute statistics
    }
    static void callMain(){
        main(null);
    }
}
