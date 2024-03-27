package tasks;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Task2 {
    public static void main(String[] args) {

        try {
            FileInputStream fs1 = new FileInputStream("tasks1.txt");
            FileOutputStream fs2 = new FileOutputStream("task2.txt");
            while (fs1.available() > 0) {
                int data = fs1.read();
                fs2.write(data);
            }
            fs1.close();
            fs2.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found");;
        } catch (IOException e) {
            System.out.println("ERR");;
        }


    }
    }