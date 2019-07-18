public class PrintUsage {

    public void printUsage(){
        System.out.println(
                "Command Line Todo application" + '\n' +
                "=============================" + '\n' +
                '\n' +
                "Command line arguments:" + '\n' +
                        '\t' + "-l   Lists all the tasks" + '\n' +
                        '\t' + "-a   Adds a new task" + '\n' +
                        '\t' + "-r   Removes an task" + '\n' +
                        '\t' + "-c   Completes an task");
    }
}
