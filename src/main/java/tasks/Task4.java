package tasks;

import java.io.File;
import java.io.IOException;

public class Task4 {
    public static void main(String[] args) {
        File direc = null;
        String[] dirAndFile;
        try {
            direc = new File(new File("./").getCanonicalPath());
            File[] dir = direc.listFiles();
            for (int i=0; i < dir.length; i++){
                if(dir[i].isDirectory()) {
                    continue;
                }
                System.out.println(dir[i]);
            }
        } catch (IOException e) {
            System.out.println("Err");;
        }
    }
}
