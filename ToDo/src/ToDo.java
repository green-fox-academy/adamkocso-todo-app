public class ToDo {

    public static TaskList list = new TaskList();
    public static PrintUsage print = new PrintUsage();

    public static void main(String[] args) {
        if(args.length == 0) {
            print.printUsage();
        } else if(args[0].equals("-l")){
            list.listTask();
        } else if(args[0].equals("-a")){
            if(args.length == 2) {
                list.addNewTask(args[1]);
            } else {
                System.out.println("Unable to add: no task provided");
            }
        } else if (args[0].equals("-r")){
            if(args.length ==2) {
                list.removeTask(args[1]);
            } else {
                System.out.println("Unable to remove: no index provided");
            }
        } else if (args[0].equals("-c")) {
            if (args.length == 2) {
                list.chechkTask(args[1]);
            } else {
                System.out.println("Unable to check: no index provided");
            }
        } else {
            System.out.println("Unsupported argument");
        }
    }


}
