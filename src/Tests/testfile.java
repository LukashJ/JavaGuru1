package Tests;


import java.io.*;

public class testfile {

    public static void main(String[] args)throws IOException {
        File file = new File ("/Users/sergejs/IdeaProjects/JavaGuru1/src/OopWeek3/TestB.txt");
        FileReader fileReader = new FileReader(file);
        BufferedReader bufferedReader = new BufferedReader (fileReader);
        String line = null;
            while ((line = bufferedReader.readLine()) != null) System.out.println(line);
    }
}
