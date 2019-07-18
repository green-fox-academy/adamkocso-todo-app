import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class WriteFile {

    public void writeFile(List<String> list){
        Path filePath = Paths.get("C:\\Users\\Hp i7 Pro\\Desktop\\greenfox\\todoapp\\ToDo\\src\\Tasks");
        try {
            if (Files.exists(filePath)) {
                Files.write(filePath,list);
            } else {
                throw new Exception();
            }
        } catch (Exception ex) {
            System.out.println("Unable to write file: my-file.txt");
        }
    }
}
