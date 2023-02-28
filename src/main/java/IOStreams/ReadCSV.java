package IOStreams;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadCSV {

    public static void main(String[] args) {

       String path = "C:\\Users\\emanu\\Downloads\\Courses\\Software Developer\\AppDataVis\\Day4\\2015.csv";
       String row = "";

        try {
            BufferedReader bfRead = new BufferedReader(new FileReader(path));

            while ((row = bfRead.readLine()) != null){
                //System.out.println(row);
                //break;
                String[] entries = row.split(",");
                System.out.println("Country: " + entries[0] + ", GDP/Capita: " + entries[5]);
            }
            bfRead.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
