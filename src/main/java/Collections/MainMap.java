package Collections;

import java.util.HashMap;
import java.util.TreeMap;

public class MainMap {

    public static void main(String[] args) {
        // HashMap
        HashMap<String, String> StudentIDs = new HashMap<>();

        StudentIDs.put("ID001", "Alex Smith");
        StudentIDs.put("ID002", "Mary Jane");

        System.out.println(StudentIDs.keySet());
        System.out.println(StudentIDs.values());
        System.out.println(StudentIDs.entrySet());

        String studentName = StudentIDs.get("ID001");

        if(StudentIDs.containsKey("ID001")) {
            System.out.println("The first student is: " + studentName);
        }

        // TreeMap
        TreeMap<String, Integer> keysMap = new TreeMap<>();
        keysMap.put("K1", 30);
        keysMap.put("K3", 10);
        keysMap.put("K2", 20);

        System.out.println(keysMap);
    }
}
