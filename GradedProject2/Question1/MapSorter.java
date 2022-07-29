package GradedProject2.Question1;

import java.util.*;

public class MapSorter {
    static HashMap<Integer,Integer> SortMap(HashMap<Integer,Integer> hm) {
        // Create a list from elements of HashMap
        List<Map.Entry<Integer, Integer> > elementsList = new LinkedList<>(hm.entrySet());

        // Sort the list using lambda expression
        Collections.sort(elementsList, Comparator.comparing(Map.Entry::getValue));
        Collections.reverse(elementsList);

        // put data from sorted list to hashmap
        HashMap<Integer, Integer> temp = new LinkedHashMap<>();
        for (Map.Entry<Integer, Integer> aa : elementsList) {
            temp.put(aa.getKey(), aa.getValue());
        }
        return temp;
    }
}
