package IOStreams;

import java.io.*;

public class CopyTxtFile {

    public static void main(String[] args) {

        try {
            BufferedWriter buffWriter = new BufferedWriter(new FileWriter("C:\\Users\\emanu\\Downloads\\NewFile1.txt"));
            BufferedReader buffRead = new BufferedReader(new FileReader("C:\\Users\\emanu\\Downloads\\NewFile.txt"));
            String entry;
            while ((entry = buffRead.readLine()) != null){
                buffWriter.write(entry + "\n");
            }
            buffRead.close();
            buffWriter.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
