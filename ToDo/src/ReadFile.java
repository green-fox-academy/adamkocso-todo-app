import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class ReadFile {

    public List<String> readFile(List<String> lines){
        Path filePath = Paths.get("C:\\Users\\Hp i7 Pro\\Desktop\\greenfox\\todoapp\\ToDo\\src\\Tasks");
        try {
            lines = Files.readAllLines(filePath);
        } catch (Exception ex) {
            System.out.println("Unable to read the file");
        }
        return lines;
    }
}
