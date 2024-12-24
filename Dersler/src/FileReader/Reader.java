package FileReader;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Reader {
    public static void main(String[] args) throws IOException {
        String fileName = "salam.txt";
        FileWriter writer = new FileWriter(fileName);
        int data = 1;
        writer.write("Ilkin");
        writer.write("Mirzəyev");
        writer.close();
        FileReader reader = new FileReader(fileName);
        while ((data = reader.read()) != -1) {
            System.out.print((char) data);
        }
        reader.close();
    }
    }
