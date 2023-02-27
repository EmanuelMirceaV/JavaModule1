package Collections;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class MainSet {

    public static void main(String[] args) {
        // HashSet
        Set<Integer> hset = new HashSet<>();
        hset.add(25);
        hset.add(5);
        hset.add(5);
        hset.add(5);
        hset.add(12);
        System.out.println(hset);

        //TreSet
        Set<Integer> tSet = new TreeSet<>();
        tSet.add(25);
        tSet.add(5);
        tSet.add(5);
        tSet.add(5);
        tSet.add(12);
        System.out.println(tSet);
    }
}
