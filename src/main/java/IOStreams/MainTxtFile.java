package IOStreams;
import java.util.logging.*;
import java.io.*;
import java.util.logging.Logger;

public class MainTxtFile {

    private static final Logger log = Logger.getLogger("MyLog");

    public static void main(String[] args) {

        try {

            Log newLog = new Log("C:\\Users\\emanu\\IdeaProjects\\JavaModule1\\LogFile.log");
            newLog.log.setLevel(Level.WARNING);
            newLog.log.warning("Create new file and fill with content");

            BufferedWriter buffWriter = new BufferedWriter(new FileWriter("C:\\Users\\emanu\\Downloads\\NewFile.txt"));
            buffWriter.write("Entry 1\n");
            buffWriter.write("Entry 2\n");
            buffWriter.write("Entry 3");
            buffWriter.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        // Read from the created file
        try {
            BufferedReader buffRead = new BufferedReader(new FileReader("C:\\Users\\emanu\\Downloads\\NewFile.txt"));
            String entry;
            while ((entry = buffRead.readLine()) != null){
                System.out.println(entry);
            }
            buffRead.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
