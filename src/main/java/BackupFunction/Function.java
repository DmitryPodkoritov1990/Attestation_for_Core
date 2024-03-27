package BackupFunction;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;

public class Function {
    public static void main(String[] args) throws IOException {
            Path file = Files.createDirectories(Path.of("./backup1"));
            DirectoryStream<Path> dir = Files.newDirectoryStream(Path.of("."));
            for (Path file1 : dir){
                if(Files.isDirectory(file1)) continue;
                Files.copy(file1, Path.of("./backup1/" + file1.toString()));
            }


    }

}
