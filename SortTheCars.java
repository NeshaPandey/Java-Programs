//import java.util.ArrayList;
//import java.util.Collections;
import java.util.*;

public class SortTheCars {
    public static void main(String[] args) {
        ArrayList<String> cars =new  ArrayList<String>();
        cars.add("volvo");
        cars.add("BMW");
        cars.add("Benz");
        cars.add("thar");
        Collections.sort(cars);
        for(String i: cars)
        {
            System.out.println(i);
        }

        
    }
    
}
