import java.util.ArrayList;
import java.util.List;


public class TaskList {

    public static WriteFile write = new WriteFile();
    public static ReadFile read = new ReadFile();


    public void listTask(){
        List<String> lines = new ArrayList<>();
        lines = read.readFile(lines);
        if(lines.size() != 0) {
            for (int i = 0; i < lines.size(); i++) {
                System.out.println(i + 1 + " - " + lines.get(i));
            }
        } else {
            System.out.println("No todos for today! :)");
        }
    }

    public void addNewTask(String newTask){
        List<String> lines = new ArrayList<>();
        lines = read.readFile(lines);
        lines.add("[ ] " + newTask);
        write.writeFile(lines);
    }

    public void removeTask(String indexString){
            try {
                int index = Integer.parseInt(indexString);
                List<String> lines = new ArrayList<>();
                lines = read.readFile(lines);
                if (lines.size() > index - 1) {
                    lines.remove(index - 1);
                    write.writeFile(lines);
                } else {
                    System.out.println("Unable to remove: index is out of bound");
                }
            } catch (Exception ex) {
                System.out.println("Unable to remove: index is not a number");
            }
    }

    public void chechkTask(String indexString){
        try {
            int index = Integer.parseInt(indexString);
            List<String> lines = new ArrayList<>();
            lines = read.readFile(lines);
            if (lines.size() > index - 1) {
                lines.set(index -1, "[X] " + lines.get(index - 1).substring(4));
                write.writeFile(lines);
            } else {
                System.out.println("Unable to check: index is out of bound");
            }
        } catch (Exception ex) {
            System.out.println("Unable to check: index is not a number");
        }
    }













}
