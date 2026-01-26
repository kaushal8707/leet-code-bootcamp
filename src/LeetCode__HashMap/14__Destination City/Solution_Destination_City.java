import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Solution_Destination_City {
    public static void main(String[] args) {
        List<String> trip1 = new ArrayList<>();
        trip1.add("London");
        trip1.add("New York");

        List<String> trip2 = new ArrayList<>();
        trip2.add("New York");
        trip2.add("Lima");

        List<String> trip3 = new ArrayList<>();
        trip3.add("Lima");
        trip3.add("Sao Paulo");

        List<List<String >> paths = new ArrayList<>();

        paths.add(trip1); paths.add(trip2); paths.add(trip3);

        String destCity = destCity(paths);
        System.out.println(destCity);
    }

    private static String destCity(List<List<String>> paths){
        Set<String> set = new HashSet<>();
        for(List<String> path : paths){
            set.add(path.get(0));
        }
        for(List<String> path : paths){
           if(!set.contains(path.get(1))){
               return path.get(1);
           }
        }
        return null;
    }
}
