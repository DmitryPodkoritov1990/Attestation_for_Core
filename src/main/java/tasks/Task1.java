package tasks;

import java.io.*;

public class Task1 {
    public static void main(String[] args) {
        int[] arr = {8, 7, 5, 7, 4, 9, 10, 8, 5};
        try (FileWriter fs = new FileWriter("tasks1.txt", true)) {
            for (int el : arr) fs.append(String.valueOf(el))
                    .append(" ");
                    fs.flush();
            } catch (IOException ex) {
            System.out.println("Error");;
        }


    }


}
